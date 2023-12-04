package javacamod.content;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

@SuppressWarnings("deprecation")
public class JavacamodBlocks{
    //walls
    public static block redWall, largeRedWall, colossalRedWall, ;


    public static void load() {
        redWall = new Wall("Red Wall"){{
            health = 300;
            size = 1;
            requirements(Category.defense, with(Items.copper, 6));
        }};
  
        largeRedWall = new Wall("Large Red Wall"){{
            health = 300;
            size = 2;
            requirements(Category.defense, with(Items.copper, 24));
        }};

         colossalRedWall = new Wall("Colossal Red Wall"){{
             health = 300;
             size = 3;
             requirements(Category.defense, with(Items.copper, 54));
         }};

    }
}
