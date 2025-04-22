package javacamod.world.blocks.distribution;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.scene.ui.layout.*;
import arc.util.*;
import arc.util.io.*;
import mindustry.entities.units.*;
import mindustry.gen.*;
import mindustry.logic.*;
import mindustry.type.*;
import mindustry.ui.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;

public class HexSorter extends Block{
    public boolean invert;

    public HexSorter(String name){
        super(name);
        update = false;
        destructible = true;
        underBullets = true;
        instantTransfer = true;
        group = BlockGroup.transportation;
        configurable = true;
        unloadable = false;
        saveConfig = true;
        clearOnDoubleTap = true;

        config(Integer.class, (HexSorterBuild tile, Integer colorI) -> {
		Log.info("config")
            tile.colorI = colorI;
            tile.color = Tmp.c1.set(colorI);
        });
    }

    @Override
    public void drawPlanConfig(BuildPlan plan, Eachable<BuildPlan> list){
		Log.info("drawplan")
        Draw.color(plan.config == null ? Color.white : (plan.config instanceof Integer i ? Tmp.c1.set(i) : Color.white));
        Draw.rect("center", plan.drawx(), plan.drawy());
        Draw.color();
    }

    @Override
    public boolean outputsItems(){
        return true;
    }
	
    @Override
    public int minimapColor(Tile tile){
		var build = (HexSorterBuild)tile.build;
		return build != null ? build.colorI : 0;
    }
	
    public class HexSorterBuild extends Building{
        public int colorI = 0xffffff_ff;
        public Color color = Color.white;

        @Override
        public void configured(Unit player, Object value){
            super.configured(player, value);

            if(!headless){
                renderer.minimap.update(tile);
            }
        }

        @Override
        public void draw(){

            {
                Draw.color(color);
                Fill.square(x, y, tilesize/2f - 0.00001f);
                Draw.color();
            }

            super.draw();
        }

        @Override
        public boolean acceptItem(Building source, Item item){
            Building to = getTileTarget(item, source, false);

            return to != null && to.acceptItem(this, item) && to.team == team;
        }

        @Override
        public void handleItem(Building source, Item item){
            getTileTarget(item, source, true).handleItem(this, item);
        }

        public boolean isSame(Building other){
            return other != null && other.block.instantTransfer;
        }

        public Building getTileTarget(Item item, Building source, boolean flip){
            int dir = source.relativeTo(tile.x, tile.y);
            if(dir == -1) return null;
            Building to;

            if(((item.color.equals(color)) != invert) == enabled){
                //prevent 3-chains
                if(isSame(source) && isSame(nearby(dir))){
                    return null;
                }
                to = nearby(dir);
            }else{
                Building a = nearby(Mathf.mod(dir - 1, 4));
                Building b = nearby(Mathf.mod(dir + 1, 4));
                boolean ac = a != null && !(a.block.instantTransfer && source.block.instantTransfer) &&
                a.acceptItem(this, item);
                boolean bc = b != null && !(b.block.instantTransfer && source.block.instantTransfer) &&
                b.acceptItem(this, item);

                if(ac && !bc){
                    to = a;
                }else if(bc && !ac){
                    to = b;
                }else if(!bc){
                    return null;
                }else{
                    to = (rotation & (1 << dir)) == 0 ? a : b;
                    if(flip) rotation ^= (1 << dir);
                }
            }

            return to;
        }

        @Override
        public void buildConfiguration(Table table){
			table.button(Icon.pencil, Styles.cleari, () -> {
				ui.picker.show(color, true, res -> configure(res.rgba()));
				deselect();
			}).size(40f);
        }

        
		@Override
		public void control(LAccess type, double p1, double p2, double p3, double p4){
		Log.info("logiccontrol")
			if(type == LAccess.color){
				color = Tmp.c1.fromDouble(p1);
                colorI = color.rgba();
			}

            if(!headless){
                renderer.minimap.update(tile);
            }
			
			super.control(type, p1, p2, p3, p4);
		}
	    
		@Override
		public double sense(LAccess sensor){
			if(sensor == LAccess.color) return color.toDoubleBits();
			return super.sense(sensor);
		}
        
        @Override
        public Integer config(){
            return colorI;
        }

        @Override
        public byte version(){
            return 1;
        }

        @Override
        public void write(Writes write){
            super.write(write);
            write.i(colorI);
        }

        @Override
        public void read(Reads read, byte revision){
		Log.info("worldload")
            super.read(read, revision);
            colorI = read.i();
            color = Tmp.c1.set(colorI);
        }
    }
}
