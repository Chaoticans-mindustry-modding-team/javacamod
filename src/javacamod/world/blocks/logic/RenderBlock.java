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
				Draw.color(0xff0000_ff);
				WorldLabel.drawAt(error,x,y-6, Layer.overlayUI+1, WorldLabel.flagOutline, 0.8f);
				Draw.color();
				return;
			}
			//waiting on the rendering part
		}

        @Override
        public void buildConfiguration(Table table){
            table.table(Styles.black5, t -> {
                t.margin(6f);
                t.field(codeInput, text -> {
                    configure(configColor + ";" + text);
                }).width(240).get();
            });
		table.button(Icon.pencil, Styles.cleari, () -> {
			ui.picker.show(Tmp.c1.set(configColor), true, res -> configure(res.rgba() + ";" + codeInput));
			deselect();
		}).size(40f);
        }

		@Override
		public void control(LAccess type, double p1, double p2, double p3, double p4){
			if(type == LAccess.color){
				configColor = Tmp.c1.fromDouble(p1).rgba();
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
		}

		@Override
		public void read(Reads read, byte revision){
			super.read(read, revision);
			codeInput = read.str();
		}
	}
}
