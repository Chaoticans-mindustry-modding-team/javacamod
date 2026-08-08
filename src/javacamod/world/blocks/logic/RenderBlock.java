
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
import arc.audio.*;
import arc.files.*;
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
import mindustry.core.*;

import javacamod.*;


import static mindustry.Vars.*;

public class RenderBlock extends Block {
    
    public RenderBlock(String name){
		super(name);
		update = true;
		configurable = true;
		saveConfig = true;
		envEnabled = Env.any;

		config(String.class, (RenderBuild tile, String value) -> {
			int split = value.indexOf(';');
			tile.configColor = Integer.parseInt(value.substring(0, split));
			tile.codeInput = value.substring(split + 1);
			tile.exec.configColor = tile.configColor;
		});
	}

	public class RenderBuild extends Building{
		public String codeInput = "";
		public int configColor = 0xffffff_ff;
		
		public RBInstruction[] instructions = new RBInstruction[0];
		public RBDrawBuffer buffer = new RBDrawBuffer(4096);
		public RBExecutor exec = new RBExecutor(buffer, 16384, this);

		public String error = "";

		public Sound tmpSound = new Sound();

		public void updateTile(){
			error = exec.run(instructions);
		}
		
		@Override
		public void draw(){
			if (!error.isEmpty()) {
				super.draw();
				Draw.color();
				WorldLabel.drawAt(error,x,y-6, Layer.blockOver-1, WorldLabel.flagOutline, 0.8f, Align.center, Align.center);
				return;
			}
			Draw.color();
			Object[] args;
			TextureRegion region = Core.atlas.find("blank");
			float color = Color.white.toFloatBits();
			Draw.z(Layer.blockProp + 1);
			boolean cleared = false;
			for (int i = 0; i < buffer.currentSize; i++) {
				args = buffer.drawArgs[i];
				switch (buffer.drawType[i]) {
					case "clear":
						cleared = true;
						break;
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
							Draw.quad(region, x + a.x, y + a.y, color, x + b.x, y + b.y, color, x + c.x, y + c.y, color, x + c.x, y + c.y, color);
						}
						break;
					case "quad":
						if (args[0] instanceof Vec2 a && args[1] instanceof Vec2 b && args[2] instanceof Vec2 c && args[3] instanceof Vec2 d) {
							Draw.quad(region, x + a.x, y + a.y, color, x + b.x, y + b.y, color, x + c.x, y + c.y, color, x + d.x, y + d.y, color);
						}
						break;
					case "print":
						if (
								args[0] instanceof String t &&
								args[1] instanceof Vec2 p &&
								args[2] instanceof Float s
						) {
							WorldLabel.drawAt(t, x + p.x, y + p.y + 2*s, Layer.blockProp + 1, 0, s, Align.center, Align.center);
						}
						break;
					case "setregion":
						if (args[0] instanceof String c) {
							if (c.isEmpty()) {
								region = Core.atlas.find("blank");
								break;
							}
							region = Core.atlas.find(c);
							break;
						}
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
					case "sound":
						if (args[0] instanceof String n && args[1] instanceof Float p && args[2] instanceof Float v) {
							Fi f = tree.get("sounds/" + n);
							if (!f.exists()) {
								f = tree.get("sounds/" + n + ".ogg");
								if (!f.exists()) {
									f = tree.get("sounds/" + n + ".mp3");
									if (!f.exists()) break;
								}
							}
							tmpSound.load(f);
							tmpSound.at(x,y,p,v);
						}
						break;
				}
			}
			if (cleared) buffer.currentSize = 0;
		}

        @Override
        public void buildConfiguration(Table table){
            table.table(Styles.black5, t -> {
                t.margin(6f);
                t.field(codeInput, text -> {
                    configure(configColor + ";" + text);
			instructions = RBInstruction.parse(text);
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
			instructions = RBInstruction.parse(codeInput);
			configColor = read.i();
			exec.configColor = configColor;
		}
	}
}
