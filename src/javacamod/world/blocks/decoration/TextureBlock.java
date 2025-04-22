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

	public String defaultRegionName = "copper-wall";

	public TextureRegion defaultRegion;
	
  public TextureBlock(String name){
		super(name);
		update = true;
		configurable = true;
		saveConfig = true;
		envEnabled |= Env.space;

		config(String.class, (TextureBuild tile, String value) -> tile.regionName = value);
	};
	
	public void load() {
		defaultRegion = Core.atlas.find(defaultRegionName);
	}
	
	public class TextureBuild extends Building{
		public String regionName = defaultRegionName;
		public TextureRegion region = defaultRegion;

		//@Override
		public void drawPlanConfig(BuildPlan plan, Eachable<BuildPlan> list){
			//super.drawPlanConfig(plan, list);
			float drawOffsetX = plan.drawx() - size*4;
			float drawOffsetY = plan.drawy() - size*4;
			float drawSize = size*8;
			TextureRegion tileRegion = plan.config instanceof String s ? Core.atlas.find(s) : defaultRegion;
            for (float i = 0; i < drawSize; i += tileRegion.width/4) {
                for (float j = 0; j < drawSize; j += tileRegion.height/4) {
										if ((plan.rotation & 1) == 0) {
											float x = i + tileRegion.width/8 + drawOffsetX;
											float y = j + tileRegion.height/8 + drawOffsetY;
										} else {
											float x = i + tileRegion.height/8 + drawOffsetX;
											float y = j + tileRegion.width/8 + drawOffsetY;
										}
                    Draw.rect(tileRegion, x, y, plan.rotation*90);
                };
            };
		}

		@Override
		public void draw(){
			super.draw();
			float drawOffsetX = x - size*4;
			float drawOffsetY = y - size*4;
			float drawSize = size*8;
            for (float i = 0; i < drawSize; i += region.width/4) {
                for (float j = 0; j < drawSize; j += region.height/4) {
										if ((rotation & 1) == 0) {
											float x = i + region.width/8 + drawOffsetX;
											float y = j + region.height/8 + drawOffsetY;
										} else {
											float x = i + region.height/8 + drawOffsetX;
											float y = j + region.width/8 + drawOffsetY;
										}
                    Draw.rect(region, x, y, rotation*90);
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
			region = Core.atlas.find(regionName);
		}
	}
}
