//*whistling noises* nothing to see here
package javacamod.world.blocks.logic;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import arc.util.io.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.input.*;
import mindustry.logic.*;
import mindustry.world.meta.*;
import arc.*;
import arc.func.*;
import arc.input.*;
import arc.scene.*;
import arc.scene.event.*;
import arc.scene.ui.*;
import arc.scene.style.*;
import arc.scene.ui.layout.*;
import mindustry.entities.units.*;
import mindustry.ctype.*;
import mindustry.type.*;
import mindustry.ui.*;
import mindustry.world.*;
import mindustry.world.blocks.*;

import javacamod.*;


import static mindustry.Vars.*;

public class RenderBlock extends Block {
    
    public RenderBlock(String name){
		super(name);
		update = true;
		configurable = true;
		saveConfig = true;
		envEnabled |= Env.space;
		swapDiagonalPlacement = true;

		config(String.class, (RenderBuild tile, String value) -> {
			int split = value.indexOf(';');
			tile.configColor = Integer.parseInt(value.substring(0, split));
			tile.codeInput = value.substring(split + 1);
			tile.exec.configColor = tile.configColor;
		});
	};

	public class RenderBuild extends Building{
		public String codeInput = "";
		public int configColor = 0xffffff_ff;
		
		public RBInstruction[] instructions;
		public RBDrawBuffer buffer = new RBDrawBuffer(4096);
		public RBExecutor exec = new RBExecutor(buffer, 16384);
		
		@Override
		public void draw(){
			super.draw();
			instructions = RBInstruction.parse(codeInput);
			String error = exec.run(instructions);
			if (!error.equals("")) {
				Draw.color();
				WorldLabel.drawAt(error,x,y-6, Layer.blockOver-1, WorldLabel.flagOutline, 0.8f);
				return;
			}
			Draw.color();
			Object[] args;
			TextureRegion region = Core.atlas.find("blank");
			float color = Color.white.toFloatBits();
			for (int i = 0; i < buffer.currentSize; i++) {
				args = buffer.drawArgs[i];
				switch (buffer.drawType[i]) {
					case "line":
						if (args[0] instanceof Vec2 a && args[1] instanceof Vec2 b) Lines.line(region, x + a.x, y + a.y, x + b.x, y + b.y, true);
						break;
					case "rect":
						if (args[0] instanceof Vec2 p && args[1] instanceof Vec2 s) Draw.rect(region, x + p.x, y + p.y, s.x, s.y);
						break;
					case "linerect":
						if (args[0] instanceof Vec2 p && args[1] instanceof Vec2 s) Draw.rect(region, x + p.x, y + p.y, s.x, s.y);
						break;
					case "circle":
						if (args[0] instanceof Vec2 p && args[1] instanceof Float r) Fill.circle(x + p.x, y + p.y, r);
						break;
					case "linecircle":
						if (args[0] instanceof Vec2 p && args[1] instanceof Float r) Lines.circle(x + p.x, y + p.y, r);
						break;
					case "regpoly":
						if (args[0] instanceof Vec2 p && args[1] instanceof Integer s && args[2] instanceof Float r) Fill.poly(x + p.x, y + p.y, s, r);
						break;
					case "reglinepoly":
						if (args[0] instanceof Vec2 p && args[1] instanceof Integer s && args[2] instanceof Float r) Lines.poly(x + p.x, y + p.y, s, r);
						break;
					case "regpolyR":
						if (args[0] instanceof Vec2 p && args[1] instanceof Integer s && args[2] instanceof Float r && args[3] instanceof Float a) Fill.poly(x + p.x, y + p.y, s, r, a);
						break;
					case "reglinepolyR":
						if (args[0] instanceof Vec2 p && args[1] instanceof Integer s && args[2] instanceof Float r && args[3] instanceof Float a) Lines.poly(x + p.x, y + p.y, s, r, a);
						break;
					case "rectR":
						if (args[0] instanceof Vec2 p && args[1] instanceof Vec2 s && args[2] instanceof Float r) Draw.rect(region, x + p.x, y + p.y, s.x, s.y, r);
						break;
					case "tri":
						if (args[0] instanceof Vec2 a && args[1] instanceof Vec2 b && args[2] instanceof Vec2 c) {
        						quad(region, x + a.x, y + a.y, color, x + b.x, y + b.y, color, x + c.x, y + c.y, color, x + c.x, y + c.y, color);
						}
						break;
					case "quad":
						if (args[0] instanceof Vec2 a && args[1] instanceof Vec2 b && args[2] instanceof Vec2 c && args[3] instanceof Vec2 d) {
        						quad(region, x + a.x, y + a.y, color, x + b.x, y + b.y, color, x + c.x, y + c.y, color, x + d.x, y + d.y, color);
						}
						break;
					case "print":
						if (args[0] instanceof String t && args[1] instanceof Vec2 p && args[2] instanceof Float s) WorldLabel.drawAt(t, x + p.x, y + p.y + 2*s, Layer.block, 0, s);
						break;
					case "setregion":
						if (args[0] instanceof String c) {
							if (c.equals("")) {
								region = Core.atlas.find("blank");
								break;
							}
							region = Core.atlas.find(c);
							break;
						};
						break;
					case "color":
						if (args[0] instanceof Color c) {
							Draw.color(c);
							color = c.toFloatBits();
						}
						break;
					case "stroke":
						if (args[0] instanceof Float f) Lines.stroke(f);
						break;
				}
			}
			//waiting on the rendering part
		}

		// method taken from arc.graphics.g2d.Draw because it's too recent
		public void quad(TextureRegion region, float x1, float y1, float c1, float x2, float y2, float c2, float x3, float y3, float c3, float x4, float y4, float c4){
		float[] vertices = new float[24];
	        float mcolor = Draw.getMixColor().toFloatBits();
        	float u = region.u;
        	float v = region.v2;
       		float u2 = region.u2;
        	float v2 = region.v;
       	 	vertices[0] = x1;
        	vertices[1] = y1;
        	vertices[2] = c1;
        	vertices[3] = u;
        	vertices[4] = v;
        	vertices[5] = mcolor;

        	vertices[6] = x2;
        	vertices[7] = y2;
        	vertices[8] = c2;
        	vertices[9] = u;
        	vertices[10] = v2;
        	vertices[11] = mcolor;
	
        	vertices[12] = x3;
        	vertices[13] = y3;
        	vertices[14] = c3;
        	vertices[15] = u2;
        	vertices[16] = v2;
        	vertices[17] = mcolor;

        	vertices[18] = x4;
        	vertices[19] = y4;
        	vertices[20] = c4;
        	vertices[21] = u2;
        	vertices[22] = v;
        	vertices[23] = mcolor;

        	Draw.vert(region.texture, vertices, 0, vertices.length);
    		}

        @Override
        public void buildConfiguration(Table table){
            table.table(Styles.black5, t -> {
                t.margin(6f);
                t.field(codeInput, text -> {
                    configure(configColor + ";" + text);
                }).width(960).get();
            });
		table.button(Icon.pencil, Styles.cleari, () -> {
			ui.picker.show(Tmp.c1.set(configColor), true, res -> {
				configure(res.rgba() + ";" + codeInput);
				exec.configColor = res.rgba();
			});
			deselect();
		}).size(40f);
        }

		@Override
		public void control(LAccess type, double p1, double p2, double p3, double p4){
			if(type == LAccess.color){
				configColor = Tmp.c1.fromDouble(p1).rgba();
				exec.configColor = configColor;
			}

			renderer.minimap.update(tile);

			super.control(type, p1, p2, p3, p4);
		}

		@Override
		public double sense(LAccess sensor){
			if(sensor == LAccess.color) return Tmp.c1.set(configColor).toDoubleBits();
			return super.sense(sensor);
		}

		@Override
		public boolean onConfigureBuildTapped(Building other){
			if(this == other){
				deselect();
				return false;
			}

			return true;
		}

		@Override
		public String config(){
			return configColor + ";" + codeInput;
		}

		@Override
		public void write(Writes write){
			super.write(write);
			write.str(codeInput);
			write.i(configColor);
		}

		@Override
		public void read(Reads read, byte revision){
			super.read(read, revision);
			codeInput = read.str();
			configColor = read.i();
			exec.configColor = configColor;
		}
	}
}
