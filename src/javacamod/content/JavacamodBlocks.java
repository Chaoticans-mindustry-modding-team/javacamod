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


import static mindustry.type.ItemStack.*;

@SuppressWarnings("deprecation")
public class JavacamodBlocks{
    //walls
    public static Block redWall, largeRedWall, colossalRedWall, blueWall, largeBlueWall, colossalBlueWall, whiteWall, largeWhiteWall, colossalWhiteWall,
    lightgrayWall, largeLightgrayWall, colossalLightgrayWall, grayWall, largeGrayWall, colossalGrayWall, darkgrayWall, largeDarkgrayWall, colossalDarkgrayWall,
    blackWall, largeBlackWall, colossalBlackWall, orangeWall, largeOrangeWall, colossalOrangeWall


    ;
    
    public static void load() {
        redWall = new Wall("red-wall"){{
            requirements(Category.defense, with(JavacamodItems.red, 6));
            health = 80;
            envDisabled |= Env.scorching;
        }};
    
     
        largeRedWall = new Wall("large-red-wall"){{
            requirements(Category.defense, with(JavacamodItems.red, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalRedWall = new Wall("colossal-red-wall"){{
            requirements(Category.defense, with(JavacamodItems.red, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        blueWall = new Wall("blue-wall"){{
            requirements(Category.defense, with(JavacamodItems.blue, 6));
            health = 80;
            envDisabled |= Env.scorching;
        }};

        largeBlueWall = new Wall("large-blue-wall"){{
            requirements(Category.defense, with(JavacamodItems.blue, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalBlueWall = new Wall("colossal-blue-wall"){{
            requirements(Category.defense, with(JavacamodItems.blue, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        whiteWall = new Wall("white-wall"){{
            requirements(Category.defense, with(JavacamodItems.white, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeWhiteWall = new Wall("large-white-wall"){{
            requirements(Category.defense, with(JavacamodItems.white, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalWhiteWall = new Wall("colossal-white-wall"){{
            requirements(Category.defense, with(JavacamodItems.white, 54));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        lightgrayWall = new Wall("lightgray-wall"){{
            requirements(Category.defense, with(JavacamodItems.lightgray, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeLightgrayWall = new Wall("large-lightgray-wall"){{
            requirements(Category.defense, with(JavacamodItems.lightgray, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalLightgrayWall = new Wall("colossal-lightgray-wall"){{
            requirements(Category.defense, with(JavacamodItems.lightgray, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        grayWall = new Wall("blackishwhite-wall"){{
            requirements(Category.defense, with(JavacamodItems.gray, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeGrayWall = new Wall("large-blackishwhite-wall"){{
            requirements(Category.defense, with(JavacamodItems.gray, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalGrayWall = new Wall("colossal-blackishwhite-wall"){{
            requirements(Category.defense, with(JavacamodItems.lightgray, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        darkgrayWall = new Wall("darkgray-wall"){{
            requirements(Category.defense, with(JavacamodItems.darkgray, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeDarkgrayWall = new Wall("large-darkgray-wall"){{
            requirements(Category.defense, with(JavacamodItems.darkgray, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalDarkgrayWall = new Wall("colossal-darkgray-wall"){{
            requirements(Category.defense, with(JavacamodItems.darkgray, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        blackWall = new Wall("black-wall"){{
            requirements(Category.defense, with(JavacamodItems.black, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeBlackWall = new Wall("large-black-wall"){{
            requirements(Category.defense, with(JavacamodItems.black, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalBlackWall = new Wall("colossal-black-wall"){{
            requirements(Category.defense, with(JavacamodItems.black, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        orangeWall = new Wall("orange-wall"){{
            requirements(Category.defense, with(JavacamodItems.orange, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeOrangeWall = new Wall("large-orange-wall"){{
            requirements(Category.defense, with(JavacamodItems.orange, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalOrangeWall = new Wall("colossal-orange-wall"){{
            requirements(Category.defense, with(JavacamodItems.orange, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

    }
}
