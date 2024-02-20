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

public class HexBlock extends Block{
	public TextureRegion top;
	public TextureRegion top0;
	public TextureRegion top1;
	public TextureRegion top2;
	public TextureRegion top3;
	public boolean showMinimapColor = true;

	public boolean diagonalSymmetryAxis = false;

	public static boolean rotateBUTSTATIC = false;

	@Override
	public int minimapColor(Tile tile){
		var build = (HexBuild)tile.build;
		return build != null && showMinimapColor ? build.color : 0;
	}

	@Override
    public void flipRotation(BuildPlan req, boolean x){
		if (diagonalSymmetryAxis) {
        	req.rotation = planRotation(req.rotation ^ ((x ^ invertFlip) ? 3 : 1));
		} else if ((x == (req.rotation % 2 == 0)) != invertFlip) {
            req.rotation = planRotation(Mathf.mod(req.rotation + 2, 4));
        }
    }

	public HexBlock(String name){
		super(name);
		update = true;
		configurable = true;
		saveConfig = true;
		envEnabled |= Env.space;
		swapDiagonalPlacement = true;

		config(Integer.class, (HexBuild tile, Integer value) -> tile.color = value);
	}
	
	@Override
	public void drawPlanConfig(BuildPlan plan, Eachable<BuildPlan> list){
		super.drawPlanConfig(plan, list);
		Draw.color(plan.config == null ? new Color(0xffffff_ff) : (plan.config instanceof Color c ? c : new Color(0xffffff_ff)));

		if (HexBlock.rotateBUTSTATIC) {
			switch(plan.rotation){
				case 0: TextureRegion top0 = Core.atlas.find(name + "-top0"); Draw.rect(top0, plan.drawx(), plan.drawy()); break;
				case 1: TextureRegion top1 = Core.atlas.find(name + "-top1"); Draw.rect(top1, plan.drawx(), plan.drawy()); break;
				case 2: TextureRegion top2 = Core.atlas.find(name + "-top2"); Draw.rect(top2, plan.drawx(), plan.drawy()); break;
				case 3: TextureRegion top3 = Core.atlas.find(name + "-top3"); Draw.rect(top3, plan.drawx(), plan.drawy()); break;
			}
        } else {
            top = Core.atlas.find(name + "-top"); 
            Draw.rect(top, plan.drawx(), plan.drawy());
        }
		Draw.color();
    }

	@Override
	
	public void load(){
		super.load();
        top = Core.atlas.find(name + "-top");
		top0 = Core.atlas.find(name + "-top0");
		top1 = Core.atlas.find(name + "-top1");
		top2 = Core.atlas.find(name + "-top2");
		top3 = Core.atlas.find(name + "-top3");
    }

	public class HexBuild extends Building{
		public int color = 0xffffff_ff;
		public Color colorButColor = new Color(0xffffff_ff);
		public float smoothTime = 1f;

		@Override
		public void control(LAccess type, double p1, double p2, double p3, double p4){
			if(type == LAccess.color){
				color = Tmp.c1.fromDouble(p1).rgba();
				colorButColor.rgba8888(color);
			}

			renderer.minimap.update(tile);

			super.control(type, p1, p2, p3, p4);
		}

        @Override
        public void configured(Unit player, Object value){
            super.configured(player, value);

            if(!headless){
                renderer.minimap.update(tile);
            }
        }

		@Override
		public double sense(LAccess sensor){
			if(sensor == LAccess.color) return Tmp.c1.set(color).toDoubleBits();
			return super.sense(sensor);
		}

		@Override
		public void draw(){
			super.draw();
			if (top == null || top0 == null || top1 == null || top2 == null || top3 == null) {load();};
			Draw.color(Tmp.c1.set(color));
			if (HexBlock.rotateBUTSTATIC) {
				switch(rotation){
					case 0: Draw.rect(top0, x, y); break;
					case 1: Draw.rect(top1, x, y); break;
					case 2: Draw.rect(top2, x, y); break;
					case 3: Draw.rect(top3, x, y); break;
				}
        	} else {
                Draw.rect(top, x, y);
            }
			Draw.color();
		}

		@Override
		public void updateTile(){
			smoothTime = Mathf.lerpDelta(smoothTime, timeScale, 0.1f);
		}

		@Override
		public void buildConfiguration(Table table){
			table.button(Icon.pencil, Styles.cleari, () -> {
				ui.picker.show(Tmp.c1.set(color), true, res -> configure(res.rgba()));
				deselect();
			}).size(40f);
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
		public Integer config(){
			return color;
		}

		@Override
		public void write(Writes write){
			super.write(write);
			write.i(color);
		}

		@Override
		public void read(Reads read, byte revision){
			super.read(read, revision);
			color = read.i();
			colorButColor.rgba8888(color);
		}
	}
}
