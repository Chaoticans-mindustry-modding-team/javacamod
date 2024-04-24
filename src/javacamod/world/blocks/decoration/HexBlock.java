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
import javacamod.IntBoolCombination;


import static mindustry.Vars.*;

public class HexBlock extends Block{
	public TextureRegion top;
	public TextureRegion top0;
	public TextureRegion top1;
	public TextureRegion top2;
	public TextureRegion top3;
	public boolean showMinimapColor = true;

	public boolean diagonalSymmetry = false;
	public boolean asymmetrical = false;

	public static boolean rotateBUTSTATIC = false;

	@Override
	public int minimapColor(Tile tile){
		var build = (HexBuild)tile.build;
		return build != null && showMinimapColor ? build.color_flipped.intComponent : 0;
	}

    public void flipRotation(BuildPlan req, boolean flipHorizontally){
		if (diagonalSymmetry) {
        	req.rotation = planRotation(req.rotation ^ ((flipHorizontally ^ invertFlip) ? 1 : 3));
		} else if (asymmetrical) {
			if (req.config instanceof IntBoolCombination ibc) {
				req.rotation = planRotation(req.rotation ^ ((flipHorizontally ^ invertFlip) ? 0 : 2));
				ibc.booleanComponent = !ibc.booleanComponent;
				req.config = ibc;
			}
		} else if ((flipHorizontally ^ invertFlip) == ((req.rotation & 1) == 0)) {
            req.rotation = planRotation(req.rotation ^ 2);
        }
    }

	public HexBlock(String name){
		super(name);
		update = true;
		configurable = true;
		saveConfig = true;
		envEnabled |= Env.space;
		swapDiagonalPlacement = true;

		config(IntBoolCombination.class, (HexBuild tile, IntBoolCombination value) -> tile.color_flipped = value);
	}
	
	@Override
	public void drawPlanConfig(BuildPlan plan, Eachable<BuildPlan> list){
		super.drawPlanConfig(plan, list);
		Draw.color(plan.config == null ? new Color(0xffffff_ff) : (plan.config instanceof IntBoolCombination ibc ? new Color(ibc.intComponent) : new Color(0xffffff_ff)));
		
		boolean flipped = false;

		if (plan.config != null) {
			flipped = (plan.config instanceof IntBoolCombination ibc ? ibc.booleanComponent : false);
		}
		
		if (HexBlock.rotateBUTSTATIC) {
			switch((plan.rotation + (flipped ? 3 : 0)) & 3){
				case 0: TextureRegion top0 = Core.atlas.find(name + "-top0"); Draw.rect(top0, plan.drawx(), plan.drawy(), top0.width/4, flipped ? -top0.height : top0.height/4, flipped ? 90 : 0); break;
				case 1: TextureRegion top1 = Core.atlas.find(name + "-top1"); Draw.rect(top1, plan.drawx(), plan.drawy(), top1.width/4, flipped ? -top1.height : top1.height/4, flipped ? 90 : 0); break;
				case 2: TextureRegion top2 = Core.atlas.find(name + "-top2"); Draw.rect(top2, plan.drawx(), plan.drawy(), top2.width/4, flipped ? -top2.height : top2.height/4, flipped ? 90 : 0); break;
				case 3: TextureRegion top3 = Core.atlas.find(name + "-top3"); Draw.rect(top3, plan.drawx(), plan.drawy(), top3.width/4, flipped ? -top3.height : top3.height/4, flipped ? 90 : 0); break;
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
		public IntBoolCombination color_flipped = new IntBoolCombination(0xffffff_ff,false);

		@Override
		public void control(LAccess type, double p1, double p2, double p3, double p4){
			if(type == LAccess.color){
				color_flipped.intComponent = Tmp.c1.fromDouble(p1).rgba();
			}

		if(!headless){
                    renderer.minimap.update(tile);
                }

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
			if(sensor == LAccess.color) return Tmp.c1.set(color_flipped.intComponent).toDoubleBits();
			return super.sense(sensor);
		}

		@Override
		public void draw(){
			super.draw();
			if (top == null || top0 == null || top1 == null || top2 == null || top3 == null) {load();};
			Draw.color(Tmp.c1.set(color_flipped.intComponent));
			if (HexBlock.rotateBUTSTATIC) {
				boolean flipped = color_flipped.booleanComponent;
				switch((rotation + (flipped ? -1 : 0)) & 3){
					case 0: Draw.rect(top0, x, y, top0.width/4, flipped ? -top0.height : top0.height/4, flipped ? 90 : 0); break;
					case 1: Draw.rect(top1, x, y, top1.width/4, flipped ? -top2.height : top2.height/4, flipped ? 90 : 0); break;
					case 2: Draw.rect(top2, x, y, top2.width/4, flipped ? -top1.height : top1.height/4, flipped ? 90 : 0); break;
					case 3: Draw.rect(top3, x, y, top3.width/4, flipped ? -top3.height : top3.height/4, flipped ? 90 : 0); break;
				}
        	} else {
                Draw.rect(top, x, y);
            }
			Draw.color();
		}

		@Override
		public void buildConfiguration(Table table){
			table.button(Icon.pencil, Styles.cleari, () -> {
				ui.picker.show(Tmp.c1.set(color_flipped.intComponent), true, res -> configure(new IntBoolCombination(res.rgba(), color_flipped.booleanComponent)));
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
			return color_flipped.intComponent;
		}

		@Override
		public void write(Writes write){
			super.write(write);
			write.i(color_flipped.intComponent);
			write.bool(color_flipped.booleanComponent);
		}

		@Override
		public void read(Reads read, byte revision){
			super.read(read, revision);
			color_flipped.intComponent = read.i();
			color_flipped.booleanComponent = read.bool();
		}

		public boolean isSame(Building other){
            return other != null && other.block.instantTransfer;
        }
	}
}
