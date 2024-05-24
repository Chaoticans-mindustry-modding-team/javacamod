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

		//@Override
		public void drawPlanConfig(BuildPlan plan, Eachable<BuildPlan> list){
			//super.drawPlanConfig(plan, list);
			float drawOffsetX = plan.drawx() - size*4;
			float drawOffsetY = plan.drawy() - size*4;
			float drawSize = size*8;
			TextureRegion tileRegion = Core.atlas.find(plan.config instanceof String s ? s : "copper-wall");
            for (float i = 0; i < drawSize; i += tileRegion.width/4) {
                for (float j = 0; j < drawSize; j += tileRegion.height/4) {
                    Draw.rect(tileRegion, i + tileRegion.width/8 + drawOffsetX, j + tileRegion.height/8 + drawOffsetY, plan.rotation*90);
                };
            };
		}

		@Override
		public void draw(){
			super.draw();
			float drawOffsetX = x - size*4;
			float drawOffsetY = y - size*4;
			float drawSize = size*8;
            TextureRegion tileRegion = Core.atlas.find(regionName);
            for (float i = 0; i < drawSize; i += tileRegion.width/4) {
                for (float j = 0; j < drawSize; j += tileRegion.height/4) {
                    Draw.rect(tileRegion, i + tileRegion.width/8 + drawOffsetX, j + tileRegion.height/8 + drawOffsetY, rotation*90);
                };
            };
		}

        @Override
        public void buildConfiguration(Table table){
            table.table(Styles.black5, t -> {
                t.margin(6f);
                t.field(regionName, text -> {
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
