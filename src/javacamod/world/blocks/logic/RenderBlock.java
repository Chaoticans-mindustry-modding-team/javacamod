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

import javacamod.RBDrawBuffer;
import javacamod.RBInstruction;

import static mindustry.Vars.*;

public class RenderBlock extends Block {
    
    public RenderBlock(String name){
		super(name);
		update = true;
		configurable = true;
		saveConfig = true;
		envEnabled |= Env.space;
		swapDiagonalPlacement = true;

		config(String.class, (RenderBuild tile, String value) -> tile.codeInput = value);
	};

	public class RenderBuild extends Building{
		public String codeInput = "";
		public RBInstruction[] instructions;
		public RBDrawBuffer buffer = new RBDrawBuffer(4096);
		public RBExecutor exec = new RBExecutor(buffer);

		@Override
		public void draw(){
			super.draw();
			instructions = RBInstruction.parse(codeInput);
			String error = exec.run(instructions);
			//waiting on the rendering part
		}

        @Override
        public void buildConfiguration(Table table){
            table.table(Styles.black5, t -> {
                t.margin(6f);
                t.field(codeInput, text -> {
                    configure(text);
                }).width(240).get();
            });
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
			return codeInput;
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
