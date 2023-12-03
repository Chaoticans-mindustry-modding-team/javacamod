package javacamod.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.entities.effect.*;
import mindustry.entities.pattern.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

public class JavacamodBlocks{
    //anchor
    public static
    //walls
    redWall, largeRedWall, colossalRedWall,


    public static void load() {
        redWall = new Wall("Red Wall"){{
            health = 300;
            size = 1;
            requirements(Category.defense, with(Items.copper, 6));
        }};
  
    public static void load() {
        largeRedWall = new Wall("Large Red Wall"){{
            health = 300;
            size = 2;
            requirements(Category.defense, with(Items.copper, 24));
        }};

     public static void load() {
         colossalRedWall = new Wall("Colossal Red Wall"){{
             health = 300;
             size = 3;
             requirements(Category.defense, with(Items.copper, 54));
         }};

    }
}
