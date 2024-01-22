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
    public static Block redWall, largeRedWall, colossalRedWall, darkredWall, largeDarkredWall, colossalDarkredWall, crimsonWall, largeCrimsonWall, colossalCrimsonWall, greenWall, largeGreenWall, colossalGreenWall, darkgreenWall, largeDarkgreenWall, colossalDarkgreenWall, poisonWall, largePoisonWall, colossalPoisonWall, blueWall, largeBlueWall, colossalBlueWall, darkblueWall, largeDarkblueWall, colossalDarkblueWall, navyWall, largeNavyWall,colossalNavyWall, whiteWall, largeWhiteWall, colossalWhiteWall, lightgrayWall, largeLightgrayWall, colossalLightgrayWall, blackishwhiteWall, largeBlackishwhiteWall, colossalBlackishwhiteWall, darkgrayWall, largeDarkgrayWall, colossalDarkgrayWall, blackWall, largeBlackWall, colossalBlackWall, yellowWall, largeYellowWall, colossalYellowWall, cyanWall, largeCyanWall, colossalCyanWall, pinkWall, largePinkWall, colossalPinkWall, orangeWall, largeOrangeWall, colossalOrangeWall, limeWall, largeLimeWall, colossalLimeWall, emeraldWall, largeEmeraldWall, colossalEmeraldWall, sapphireWall, largeSapphireWall, colossalSapphireWall, purpleWall, largePurpleWall, colossalPurpleWall, hotpinkWall, largeHotpinkWall, colossalHotpinkWall


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

        darkredWall = new Wall("darkred-wall"){{
            requirements(Category.defense, with(JavacamodItems.darkred, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeDarkredWall = new Wall("large-darkred-wall"){{
            requirements(Category.defense, with(JavacamodItems.darkred, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalDarkredWall = new Wall("colossal-darkred-wall"){{
            requirements(Category.defense, with(JavacamodItems.darkred, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        crimsonWall = new Wall("crimson-wall"){{
            requirements(Category.defense, with(JavacamodItems.crimson, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeCrimsonWall = new Wall("large-crimson-wall"){{
            requirements(Category.defense, with(JavacamodItems.crimson, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalCrimsonWall = new Wall("colossal-crimson-wall"){{
            requirements(Category.defense, with(JavacamodItems.crimson, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        greenWall = new Wall("green-wall"){{
            requirements(Category.defense, with(JavacamodItems.green, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeGreenWall = new Wall("large-green-wall"){{
            requirements(Category.defense, with(JavacamodItems.green, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalGreenWall = new Wall("colossal-green-wall"){{
            requirements(Category.defense, with(JavacamodItems.green, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        darkgreenWall = new Wall("darkgreen-wall"){{
            requirements(Category.defense, with(JavacamodItems.darkgreen, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeDarkgreenWall = new Wall("large-darkgreen-wall"){{
            requirements(Category.defense, with(JavacamodItems.darkgreen, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalDarkgreenWall = new Wall("colossal-darkgreen-wall"){{
            requirements(Category.defense, with(JavacamodItems.darkgreen, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        poisonWall = new Wall("poison-wall"){{
            requirements(Category.defense, with(JavacamodItems.poison, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largePoisonWall = new Wall("large-poison-wall"){{
            requirements(Category.defense, with(JavacamodItems.poison, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalPoisonWall = new Wall("colossal-poison-wall"){{
            requirements(Category.defense, with(JavacamodItems.poison, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        blueWall = new Wall("blue-wall"){{
            requirements(Category.defense, with(JavacamodItems.blue, 6));
            health = 80;
            size = 1;
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

        darkblueWall = new Wall("darkblue-wall"){{
            requirements(Category.defense, with(JavacamodItems.darkblue, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeDarkblueWall = new Wall("large-darkblue-wall"){{
            requirements(Category.defense, with(JavacamodItems.darkblue, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalDarkblueWall = new Wall("colossal-darkblue-wall"){{
            requirements(Category.defense, with(JavacamodItems.darkblue, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        navyWall = new Wall("navy-wall"){{
            requirements(Category.defense, with(JavacamodItems.navy, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeNavyWall = new Wall("large-navy-wall"){{
            requirements(Category.defense, with(JavacamodItems.navy, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalNavyWall = new Wall("colossal-navy-wall"){{
            requirements(Category.defense, with(JavacamodItems.navy, 54));
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

        blackishwhiteWall = new Wall("blackishwhite-wall"){{
            requirements(Category.defense, with(JavacamodItems.gray, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeBlackishwhiteWall = new Wall("large-blackishwhite-wall"){{
            requirements(Category.defense, with(JavacamodItems.gray, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalBlackishwhiteWall = new Wall("colossal-blackishwhite-wall"){{
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

        yellowWall = new Wall("yellow-wall"){{
            requirements(Category.defense, with(JavacamodItems.yellow, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeYellowWall = new Wall("large-yellow-wall"){{
            requirements(Category.defense, with(JavacamodItems.yellow, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalYellowWall = new Wall("colossal-yellow-wall"){{
            requirements(Category.defense, with(JavacamodItems.yellow, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        cyanWall = new Wall("cyan-wall"){{
            requirements(Category.defense, with(JavacamodItems.cyan, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeCyanWall = new Wall("large-cyan-wall"){{
            requirements(Category.defense, with(JavacamodItems.cyan, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalCyanWall = new Wall("colossal-cyan-wall"){{
            requirements(Category.defense, with(JavacamodItems.cyan, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        pinkWall = new Wall("pink-wall"){{
            requirements(Category.defense, with(JavacamodItems.pink, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largePinkWall = new Wall("large-pink-wall"){{
            requirements(Category.defense, with(JavacamodItems.pink, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalPinkWall = new Wall("colossal-pink-wall"){{
            requirements(Category.defense, with(JavacamodItems.pink, 54));
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

        limeWall = new Wall("lime-wall"){{
            requirements(Category.defense, with(JavacamodItems.lime, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeLimeWall = new Wall("large-lime-wall"){{
            requirements(Category.defense, with(JavacamodItems.lime, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalLimeWall = new Wall("colossal-lime-wall"){{
            requirements(Category.defense, with(JavacamodItems.lime, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        emeraldWall = new Wall("emerald-wall"){{
            requirements(Category.defense, with(JavacamodItems.emerald, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeEmeraldWall = new Wall("large-emerald-wall"){{
            requirements(Category.defense, with(JavacamodItems.emerald, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalEmeraldWall = new Wall("colossal-emerald-wall"){{
            requirements(Category.defense, with(JavacamodItems.emerald, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        sapphireWall = new Wall("sapphire-wall"){{
            requirements(Category.defense, with(JavacamodItems.sapphire, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeSapphireWall = new Wall("large-sapphire-wall"){{
            requirements(Category.defense, with(JavacamodItems.sapphire, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalSapphireWall = new Wall("colossal-sapphire-wall"){{
            requirements(Category.defense, with(JavacamodItems.sapphire, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        purpleWall = new Wall("purple-wall"){{
            requirements(Category.defense, with(JavacamodItems.purple, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largePurpleWall = new Wall("large-purple-wall"){{
            requirements(Category.defense, with(JavacamodItems.purple, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalPurpleWall = new Wall("colossal-purple-wall"){{
            requirements(Category.defense, with(JavacamodItems.purple, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        hotpinkWall = new Wall("hotpink-wall"){{
            requirements(Category.defense, with(JavacamodItems.hotpink, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeHotpinkWall = new Wall("large-hotpink-wall"){{
            requirements(Category.defense, with(JavacamodItems.hotpink, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalHotpinkWall = new Wall("colossal-hotpink-wall"){{
            requirements(Category.defense, with(JavacamodItems.hotpink, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

    }
}
