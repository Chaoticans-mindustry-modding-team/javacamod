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
    public float brightness = 0.9f;
    public float radius = 200f;
    public TextureRegion top;
    public HexBlock(String name){
        super(name);
        hasPower = true;
        update = true;
        configurable = true;
        saveConfig = true;
        envEnabled |= Env.space;
        swapDiagonalPlacement = true;

        config(Integer.class, (HexBuild tile, Integer value) -> tile.color = value);
    }

    @Override
    public void init(){
        lightRadius = radius*2.5f;
        clipSize = Math.max(clipSize, lightRadius * 3f);
        emitLight = false;

        super.init();
    }
		@Override
		public void load(){
			        super.load();
			
			        top = Core.atlas.find(name + "-top"); 
                }

            @Override
    public void drawPlace(int x, int y, int rotation, boolean valid){
        super.drawPlace(x, y, rotation, valid);

        Drawf.dashCircle(x * tilesize + offset, y * tilesize + offset, radius * 0.75f, Pal.placing);
    }

    @Override
    public void changePlacementPath(Seq<Point2> points, int rotation){
        var placeRadius2 = Mathf.pow(radius * 0.7f / tilesize, 2f) * 3;
        Placement.calculateNodes(points, this, rotation, (point, other) -> point.dst2(other) <= placeRadius2);
    }

    public class HexBuild extends Building{
        public int color = Pal.accent.rgba();
        public float smoothTime = 1f;

        @Override
        public void control(LAccess type, double p1, double p2, double p3, double p4){
            if(type == LAccess.color){
                color = Tmp.c1.fromDouble(p1).rgba8888();
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
            Draw.blend(Blending.additive);
            Draw.color(Tmp.c1.set(color), efficiency * 0.3f);
            Draw.rect(top, x, y);
            Draw.color();
            Draw.blend();
        }

        @Override
        public void updateTile(){
            smoothTime = Mathf.lerpDelta(smoothTime, timeScale, 0.1f);
        }

        @Override
        public void buildConfiguration(Table table){
            table.button(Icon.pencil, Styles.cleari, () -> {
                ui.picker.show(Tmp.c1.set(color).a(1.0f), false, res -> configure(res.rgba()));
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
