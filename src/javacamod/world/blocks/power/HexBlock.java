package javacamod.world.blocks.power;

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
	public boolean showMinimapColor = true;

	@Override
	public int minimapColor(Tile tile){
		var build = (HexBuild)tile.build;
		return build != null && showMinimapColor ? 0 : build.color;
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
	
	public void load(){
		super.load();
	
		top = Core.atlas.find(name + "-top"); 
        }

    public class HexBuild extends Building{
        public int color = 0x000000_00;
        public float smoothTime = 1f;

        @Override
        public void control(LAccess type, double p1, double p2, double p3, double p4){
            if(type == LAccess.color){
                color = Tmp.c1.fromDouble(p1).rgba();
            }

            super.control(type, p1, p2, p3, p4);
        }

        @Override
        public double sense(LAccess sensor){
            if(sensor == LAccess.color) return Tmp.c1.set(color).toDoubleBits();
            return super.sense(sensor);
        }

        @Override
        public void draw(){
            super.draw();
            Draw.color(Tmp.c1.set(color));
            Draw.rect(top, x, y);
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
        }
    }
}
