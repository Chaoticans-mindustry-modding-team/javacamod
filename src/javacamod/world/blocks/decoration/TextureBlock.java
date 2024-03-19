package javacamod.world.blocks.decoration;

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


import static mindustry.Vars.*;

public class TextureBlock extends Block {
    
    public TextureBlock(String name){
		super(name);
		update = true;
		configurable = true;
		saveConfig = true;
		envEnabled |= Env.space;
		swapDiagonalPlacement = true;

		config(String.class, (TextureBuild tile, String value) -> tile.regionName = value);
	};

	public class TextureBuild extends Building{
		public String regionName = "copper-wall";
        public TextureRegion region = Core.atlas.find(regionName);
		private float drawOffsetX = x - size*4;
		private float drawOffsetY = y - size*4;
		private float drawSize = size*8;

		@Override
		public void draw(){
			super.draw();
            for (float i = 0; i < drawSize; i += region.width/4) {
                for (float j = 0; j < drawSize; j += region.height/4) {
                    Draw.rect(region, i + region.width/8 + drawOffsetX, j + region.height/8 + drawOffsetY, rotation*90);
                };
            };
		}

        @Override
        public void buildConfiguration(Table table){
            table.table(Styles.black5, t -> {
                t.margin(6f);
                t.field(regionName, text -> {
                    configure(text);
                    region = Core.atlas.find(regionName);
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
			return regionName;
		}

		@Override
		public void write(Writes write){
			super.write(write);
			write.str(regionName);
		}

		@Override
		public void read(Reads read, byte revision){
			super.read(read, revision);
			regionName = read.str();
		}
	}
}