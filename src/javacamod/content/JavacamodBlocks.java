package javacamod.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import arc.util.*;
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
    public static Block 

redWall, largeRedWall, colossalRedWall, darkredWall, largeDarkredWall, colossalDarkredWall, crimsonWall, largeCrimsonWall, colossalCrimsonWall, greenWall, largeGreenWall, colossalGreenWall, darkgreenWall, largeDarkgreenWall, colossalDarkgreenWall, poisonWall, largePoisonWall, colossalPoisonWall, blueWall, largeBlueWall, colossalBlueWall, darkblueWall, largeDarkblueWall, colossalDarkblueWall, navyWall, largeNavyWall,colossalNavyWall, whiteWall, largeWhiteWall, colossalWhiteWall, lightgrayWall, largeLightgrayWall, colossalLightgrayWall, blackishwhiteWall, largeBlackishwhiteWall, colossalBlackishwhiteWall, darkgrayWall, largeDarkgrayWall, colossalDarkgrayWall, blackWall, largeBlackWall, colossalBlackWall, yellowWall, largeYellowWall, colossalYellowWall, darkYellowWall, largeDarkYellowWall, colossalDarkYellowWall, runicWall, largeRunicWall, colossalRunicWall, cyanWall, largeCyanWall, colossalCyanWall, darkCyanWall, largeDarkCyanWall, colossalDarkCyanWall, deepOceanWall, largeDeepOceanWall, colossalDeepOceanWall, pinkWall, largePinkWall, colossalPinkWall, darkPinkWall, largeDarkPinkWall, colossalDarkPinkWall, deepPinkWall, largeDeepPinkWall, colossalDeepPinkWall, orangeWall, largeOrangeWall, colossalOrangeWall, darkOrangeWall, largeDarkOrangeWall, colossalDarkOrangeWall, burntOrangeWall, largeBurntOrangeWall, colossalBurntOrangeWall, limeWall, largeLimeWall, colossalLimeWall, darkLimeWall, largeDarkLimeWall, colossalDarkLimeWall, fruitWall, largeFruitWall, colossalFruitWall, emeraldWall, largeEmeraldWall, colossalEmeraldWall, darkEmeraldWall, largeDarkEmeraldWall, colossalDarkEmeraldWall, deepEmeraldWall, largeDeepEmeraldWall, colossalDeepEmeraldWall, sapphireWall, largeSapphireWall, colossalSapphireWall, darkSapphireWall, largeDarkSapphireWall, colossalDarkSapphireWall, deepSapphireWall, largeDeepSapphireWall, colossalDeepSapphireWall, purpleWall, largePurpleWall, colossalPurpleWall, darkPurpleWall, largeDarkPurpleWall, colossalDarkPurpleWall, violetWall, largeVioletWall, colossalVioletWall, hotpinkWall, largeHotpinkWall, colossalHotpinkWall, darkHotpinkWall, largeDarkHotpinkWall, colossalDarkHotpinkWall, deepHotpinkWall, largeDeepHotpinkWall, colossalDeepHotpinkWall,

//distribution
borderlessSorter, largeSorter, colossalSorter, largeInvertedSorter, colossalInvertedSorter, largeSource, colossalSource, chiseledSorter1, chiseledSorter2, chiseledSorter3, chiseledSorter4, chiseledSorter5, chiseledSorter6, chiseledSorter7, chiseledSorter8, chiseledSorter9, chiseledSorter10, chiseledSorter11, chiseledSorter12, chiseledSorter13, chiseledSorter14, chiseledInvertedSorter1, chiseledInvertedSorter2, chiseledInvertedSorter3, chiseledInvertedSorter4, chiseledInvertedSorter5, chiseledInvertedSorter6, chiseledInvertedSorter7, chiseledInvertedSorter8, chiseledInvertedSorter9, chiseledInvertedSorter10, chiseledInvertedSorter11, chiseledInvertedSorter12, chiseledInvertedSorter13, chiseledInvertedSorter14, chiseledSource1, chiseledSource2, chiseledSource3, chiseledSource4, chiseledSource5, chiseledSource6, chiseledSource7, chiseledSource8, chiseledSource9, chiseledSource10, chiseledSource11, chiseledSource12, chiseledSource13, chiseledSource14,

//MSGs
redMessage, largeRedMessage, colossalRedMessage, darkredMessage, largeDarkredMessage, colossalDarkredMessage, bloodMessage, largeBloodMessage, colossalBloodMessage, greenMessage, largeGreenMessage, colossalGreenMessage, darkgreenMessage, largeDarkgreenMessage, colossalDarkgreenMessage, poisonMessage, largePoisonMessage, colossalPoisonMessage, blueMessage, largeBlueMessage, colossalBlueMessage, darkblueMessage, largeDarkblueMessage, colossalDarkblueMessage, navyMessage, largeNavyMessage, colossalNavyMessage, whiteMessage, largeWhiteMessage, colossalWhiteMessage, blankMessage, largeBlankMessage, colossalBlankMessage, blackMessage, largeBlackMessage, colossalBlackMessage, yellowMessage, largeYellowMessage, colossalYellowMessage, darkyellowMessage, largeDarkyellowMessage, colossalDarkyellowMessage, runicMessage, largeRunicMessage, colossalRunicMessage, cyanMessage, largeCyanMessage, colossalCyanMessage, darkcyanMessage, largeDarkcyanMessage, colossalDarkcyanMessage, deepOceanMessage, largeDeepOceanMessage, colossalDeepOceanMessage, pinkMessage, largePinkMessage, colossalPinkMessage, darkpinkMessage, largeDarkpinkMessage, colossalDarkpinkMessage, deeppinkMessage, largeDeeppinkMessage, colossalDeeppinkMessage, orangeMessage, largeOrangeMessage, colossalOrangeMessage, darkorangeMessage, largeDarkorangeMessage, colossalDarkorangeMessage, burntorangeMessage, largeBurntorangeMessage, colossalBurntorangeMessage, limeMessage, largeLimeMessage, colossalLimeMessage, darklimeMessage, largeDarklimeMessage, colossalDarklimeMessage, fruitMessage, largeFruitMessage, colossalFruitMessage, emeraldMessage, largeEmeraldMessage, colossalEmeraldMessage, darkemeraldMessage, largeDarkemeraldMessage, colossalDarkemeraldMessage, deepEmeraldMessage, largeDeepemeraldMessage, colossalDeepemeraldMessage, sapphireMessage, largeSapphireMessage, colossalSapphireMessage, darksapphireMessage, largeDarksapphireMessage, colossalDarksapphireMessage, deepsapphireMessage, largeDeepsapphireMessage, colossalDeepsapphireMessage, purpleMessage, largePurpleMessage, colossalPurpleMessage, darkpurpleMessage, largeDarkpurpleMessage, colossalDarkpurpleMessage, violetMessage, largeVioletMessage, colossalVioletMessage, hotpinkMessage, largeHotpinkMessage, colossalHotpinkMessage, darkhotpinkMessage, largeDarkhotpinkMessage, colossalDarkhotpinkMessage, deephotpinkMessage, largeDeephotpinkMessage, colossalDeephotpinkMessage


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
            size = 3;
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

        darkYellowWall = new Wall("dark-yellow-wall"){{
            requirements(Category.defense, with(JavacamodItems.yellow, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeDarkYellowWall = new Wall("large-dark-yellow-wall"){{
            requirements(Category.defense, with(JavacamodItems.yellow, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalDarkYellowWall = new Wall("colossal-dark-yellow-wall"){{
            requirements(Category.defense, with(JavacamodItems.yellow, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        runicWall = new Wall("runic-wall"){{
            requirements(Category.defense, with(JavacamodItems.yellow, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeRunicWall = new Wall("large-runic-wall"){{
            requirements(Category.defense, with(JavacamodItems.yellow, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalRunicWall = new Wall("colossal-runic-wall"){{
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

        darkCyanWall = new Wall("dark-cyan-wall"){{
            requirements(Category.defense, with(JavacamodItems.cyan, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeDarkCyanWall = new Wall("large-dark-cyan-wall"){{
            requirements(Category.defense, with(JavacamodItems.cyan, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalDarkCyanWall = new Wall("colossal-dark-cyan-wall"){{
            requirements(Category.defense, with(JavacamodItems.cyan, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        deepOceanWall = new Wall("deep-ocean-wall"){{
            requirements(Category.defense, with(JavacamodItems.cyan, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

       largeDeepOceanWall = new Wall("large-deep-ocean-wall"){{
            requirements(Category.defense, with(JavacamodItems.cyan, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalDeepOceanWall = new Wall("colossal-deep-ocean-wall"){{
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

        darkPinkWall = new Wall("dark-pink-wall"){{
            requirements(Category.defense, with(JavacamodItems.pink, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeDarkPinkWall = new Wall("large-dark-pink-wall"){{
            requirements(Category.defense, with(JavacamodItems.pink, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalDarkPinkWall = new Wall("colossal-dark-pink-wall"){{
            requirements(Category.defense, with(JavacamodItems.pink, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        deepPinkWall = new Wall("deep-pink-wall"){{
            requirements(Category.defense, with(JavacamodItems.pink, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeDeepPinkWall = new Wall("large-deep-pink-wall"){{
            requirements(Category.defense, with(JavacamodItems.pink, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalDeepPinkWall = new Wall("colossal-deep-pink-wall"){{
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

        darkOrangeWall = new Wall("dark-orange-wall"){{
            requirements(Category.defense, with(JavacamodItems.orange, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeDarkOrangeWall = new Wall("large-dark-orange-wall"){{
            requirements(Category.defense, with(JavacamodItems.orange, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalDarkOrangeWall = new Wall("colossal-dark-orange-wall"){{
            requirements(Category.defense, with(JavacamodItems.orange, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        burntOrangeWall = new Wall("burnt-orange-wall"){{
            requirements(Category.defense, with(JavacamodItems.orange, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeBurntOrangeWall = new Wall("large-burnt-orange-wall"){{
            requirements(Category.defense, with(JavacamodItems.orange, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalBurntOrangeWall = new Wall("colossal-burnt-orange-wall"){{
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

        darkLimeWall = new Wall("dark-lime-wall"){{
            requirements(Category.defense, with(JavacamodItems.lime, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeDarkLimeWall = new Wall("large-dark-lime-wall"){{
            requirements(Category.defense, with(JavacamodItems.lime, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};
        
        colossalDarkLimeWall = new Wall("colossal-dark-lime-wall"){{
            requirements(Category.defense, with(JavacamodItems.lime, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        fruitWall = new Wall("fruit-wall"){{
            requirements(Category.defense, with(JavacamodItems.lime, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeFruitWall = new Wall("large-fruit-wall"){{
            requirements(Category.defense, with(JavacamodItems.lime, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalFruitWall = new Wall("colossal-fruit-wall"){{
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

        darkEmeraldWall = new Wall("dark-emerald-wall"){{
            requirements(Category.defense, with(JavacamodItems.emerald, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeDarkEmeraldWall = new Wall("large-dark-emerald-wall"){{
            requirements(Category.defense, with(JavacamodItems.emerald, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalDarkEmeraldWall = new Wall("colossal-dark-emerald-wall"){{
            requirements(Category.defense, with(JavacamodItems.emerald, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        deepEmeraldWall = new Wall("deep-emerald-wall"){{
            requirements(Category.defense, with(JavacamodItems.emerald, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeDeepEmeraldWall = new Wall("large-deep-emerald-wall"){{
            requirements(Category.defense, with(JavacamodItems.emerald, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalDeepEmeraldWall = new Wall("colossal-deep-emerald-wall"){{
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

        darkSapphireWall = new Wall("dark-sapphire-wall"){{
            requirements(Category.defense, with(JavacamodItems.sapphire, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeDarkSapphireWall = new Wall("large-dark-sapphire-wall"){{
            requirements(Category.defense, with(JavacamodItems.sapphire, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalDarkSapphireWall = new Wall("colossal-dark-sapphire-wall"){{
            requirements(Category.defense, with(JavacamodItems.sapphire, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        deepSapphireWall = new Wall("deep-sapphire-wall"){{
            requirements(Category.defense, with(JavacamodItems.sapphire, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeDeepSapphireWall = new Wall("large-deep-sapphire-wall"){{
            requirements(Category.defense, with(JavacamodItems.sapphire, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalDeepSapphireWall = new Wall("colossal-deep-sapphire-wall"){{
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

        darkPurpleWall = new Wall("dark-purple-wall"){{
            requirements(Category.defense, with(JavacamodItems.purple, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeDarkPurpleWall = new Wall("large-dark-purple-wall"){{
            requirements(Category.defense, with(JavacamodItems.purple, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalDarkPurpleWall = new Wall("colossal-dark-purple-wall"){{
            requirements(Category.defense, with(JavacamodItems.purple, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        violetWall = new Wall("violet-wall"){{
            requirements(Category.defense, with(JavacamodItems.purple, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeVioletWall = new Wall("large-violet-wall"){{
            requirements(Category.defense, with(JavacamodItems.purple, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalVioletWall = new Wall("colossal-violet-wall"){{
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

        darkHotpinkWall = new Wall("dark-hotpink-wall"){{
            requirements(Category.defense, with(JavacamodItems.hotpink, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeDarkHotpinkWall = new Wall("large-dark-hotpink-wall"){{
            requirements(Category.defense, with(JavacamodItems.hotpink, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalDarkHotpinkWall = new Wall("colossal-dark-hotpink-wall"){{
            requirements(Category.defense, with(JavacamodItems.hotpink, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        deepHotpinkWall = new Wall("deep-hotpink-wall"){{
            requirements(Category.defense, with(JavacamodItems.hotpink, 6));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeDeepHotpinkWall = new Wall("large-deep-hotpink-wall"){{
            requirements(Category.defense, with(JavacamodItems.hotpink, 24));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalDeepHotpinkWall = new Wall("colossal-deep-hotpink-wall"){{
            requirements(Category.defense, with(JavacamodItems.hotpink, 54));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        largeSorter = new Sorter("large-sorter"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalSorter = new Sorter("colossal-sorter"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        largeInvertedSorter = new Sorter("large-inverted-sorter"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            invert = true;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalInvertedSorter = new Sorter("colossal-inverted-sorter"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            invert = true;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        largeSource = new ItemSource("large-source"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalSource = new ItemSource("colossal-source"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        borderlessSorter = new Sorter("borderless-sorter"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter1 = new Sorter("chiseled-sorter-one"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter2 = new Sorter("chiseled-sorter-two"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter3 = new Sorter("chiseled-sorter-three"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter4 = new Sorter("chiseled-sorter-four"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter5 = new Sorter("chiseled-sorter-five"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter6 = new Sorter("chiseled-sorter-six"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter7 = new Sorter("chiseled-sorter-seven"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter8 = new Sorter("chiseled-sorter-eight"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter9 = new Sorter("chiseled-sorter-nine"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter10 = new Sorter("chiseled-sorter-ten"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter11 = new Sorter("chiseled-sorter-eleven"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter13 = new Sorter("chiseled-sorter-thirteen"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter14 = new Sorter("chiseled-sorter-fourteen"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter1 = new Sorter("chiseled-inverted-sorter-one"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            invert = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter2 = new Sorter("chiseled-inverted-sorter-two"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            invert = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter3 = new Sorter("chiseled-inverted-sorter-three"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            invert = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter4 = new Sorter("chiseled-inverted-sorter-four"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter5 = new Sorter("chiseled-inverted-sorter-five"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter6 = new Sorter("chiseled-inverted-sorter-six"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter7 = new Sorter("chiseled-inverted-sorter-seven"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter8 = new Sorter("chiseled-inverted-sorter-eight"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter9 = new Sorter("chiseled-inverted-sorter-nine"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter10 = new Sorter("chiseled-inverted-sorter-ten"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter11 = new Sorter("chiseled-inverted-sorter-eleven"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter12 = new Sorter("chiseled-inverted-sorter-twelve"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter13 = new Sorter("chiseled-inverted-sorter-thirteen"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter14 = new Sorter("chiseled-inverted-sorter-fourteen"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource1 = new ItemSource("chiseled-source-one"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource2 = new ItemSource("chiseled-source-two"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource3 = new ItemSource("chiseled-source-three"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource4 = new ItemSource("chiseled-source-four"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        chiseledSource5 = new ItemSource("chiseled-source-five"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource6 = new ItemSource("chiseled-source-six"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource7 = new ItemSource("chiseled-source-seven"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource8 = new ItemSource("chiseled-source-eight"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource9 = new ItemSource("chiseled-source-nine"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource10 = new ItemSource("chiseled-source-ten"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource11 = new ItemSource("chiseled-source-eleven"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource12 = new ItemSource("chiseled-source-twelve"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource13 = new ItemSource("chiseled-source-thirteen"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource14 = new ItemSource("chiseled-source-fourteen"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        redMessage = new MessageBlock("red-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeRedMessage = new MessageBlock("large-red-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};


        colossalRedMessage = new MessageBlock("colossal-red-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};


        darkredMessage = new MessageBlock("darkred-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarkredMessage = new MessageBlock("large-darkred-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalDarkredMessage = new MessageBlock("colossal-darkred-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        bloodMessage = new MessageBlock("blood-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeBloodMessage = new MessageBlock("large-blood-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalBloodMessage = new MessageBlock("colossal-blood-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        greenMessage = new MessageBlock("green-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeGreenMessage = new MessageBlock("large-green-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalGreenMessage = new MessageBlock("colossal-green-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        darkgreenMessage = new MessageBlock("darkgreen-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarkgreenMessage = new MessageBlock("large-darkgreen-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalDarkgreenMessage = new MessageBlock("colossal-darkgreen-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        poisonMessage = new MessageBlock("poison-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largePoisonMessage = new MessageBlock("large-poison-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalPoisonMessage = new MessageBlock("colossal-poison-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        blueMessage = new MessageBlock("blue-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeBlueMessage = new MessageBlock("large-blue-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalBlueMessage = new MessageBlock("colossal-blue-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        darkblueMessage = new MessageBlock("darkblue-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarkblueMessage = new MessageBlock("large-darkblue-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalDarkblueMessage = new MessageBlock("colossal-darkblue-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        navyMessage = new MessageBlock("navy-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeNavyMessage = new MessageBlock("large-navy-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalNavyMessage = new MessageBlock("colossal-navy-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        whiteMessage = new MessageBlock("white-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeWhiteMessage = new MessageBlock("large-white-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalWhiteMessage = new MessageBlock("colossal-white-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        blankMessage = new MessageBlock("blank-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeBlankMessage = new MessageBlock("large-blank-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalBlankMessage = new MessageBlock("colossal-blank-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        blackMessage = new MessageBlock("black-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeBlackMessage = new MessageBlock("large-black-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalBlackMessage = new MessageBlock("colossal-black-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        yellowMessage = new MessageBlock("yellow-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeYellowMessage = new MessageBlock("large-yellow-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalYellowMessage = new MessageBlock("colossal-yellow-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        darkyellowMessage = new MessageBlock("darkyellow-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarkyellowMessage = new MessageBlock("large-darkyellow-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalDarkyellowMessage = new MessageBlock("colossal-darkyellow-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        runicMessage = new MessageBlock("runic-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeRunicMessage = new MessageBlock("large-runic-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalRunicMessage = new MessageBlock("colossal-runic-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        cyanMessage = new MessageBlock("cyan-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};
        
        largeCyanMessage = new MessageBlock("large-cyan-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalCyanMessage = new MessageBlock("colossal-cyan-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        darkcyanMessage = new MessageBlock("darkcyan-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarkcyanMessage = new MessageBlock("large-darkcyan-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalDarkcyanMessage = new MessageBlock("colossal-darkcyan-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        deepOceanMessage = new MessageBlock("deep-ocean-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDeepOceanMessage = new MessageBlock("large-deep-ocean-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalDeepOceanMessage = new MessageBlock("colossal-deep-ocean-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        pinkMessage = new MessageBlock("pink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largePinkMessage = new MessageBlock("large-pink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalPinkMessage = new MessageBlock("colossal-pink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};
        
        darkpinkMessage = new MessageBlock("darkpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarkpinkMessage = new MessageBlock("large-darkpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalDarkpinkMessage = new MessageBlock("colossal-darkpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        deeppinkMessage = new MessageBlock("deeppink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDeeppinkMessage = new MessageBlock("large-deeppink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalDeeppinkMessage = new MessageBlock("colossal-+deeppink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        orangeMessage = new MessageBlock("orange-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeOrangeMessage = new MessageBlock("large-orange-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalOrangeMessage = new MessageBlock("colossal-orange-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        darkorangeMessage = new MessageBlock("darkorange-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarkorangeMessage = new MessageBlock("large-darkorange-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalDarkorangeMessage = new MessageBlock("colossal-darkorange-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        burntorangeMessage = new MessageBlock("burntorange-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeBurntorangeMessage = new MessageBlock("large-burntorange-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalBurntorangeMessage = new MessageBlock("colossal-burntorange-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        limeMessage = new MessageBlock("lime-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeLimeMessage = new MessageBlock("large-lime-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalLimeMessage = new MessageBlock("colossal-lime-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};
        
        darklimeMessage = new MessageBlock("darklime-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarklimeMessage = new MessageBlock("large-darklime-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalDarklimeMessage = new MessageBlock("colossal-darklime-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        fruitMessage = new MessageBlock("fruit-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeFruitMessage = new MessageBlock("large-fruit-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalFruitMessage = new MessageBlock("colossal-fruit-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        emeraldMessage = new MessageBlock("emerald-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeEmeraldMessage = new MessageBlock("large-emerald-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalEmeraldMessage = new MessageBlock("colossal-emerald-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        darkemeraldMessage = new MessageBlock("darkemerald-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarkemeraldMessage = new MessageBlock("large-darkemerald-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalDarkemeraldMessage = new MessageBlock("colossal-darkemerald-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        deepemeraldMessage = new MessageBlock("deepemerald-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDeepemeraldMessage = new MessageBlock("large-deepemerald-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalDeepemeraldMessage = new MessageBlock("colossal-deepemerald-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        sapphireMessage = new MessageBlock("sapphire-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeSapphireMessage = new MessageBlock("large-sapphire-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalSapphireMessage = new MessageBlock("colossal-sapphire-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        darksapphireMessage = new MessageBlock("darksapphire-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarksapphireMessage = new MessageBlock("large-darksapphire-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalDarksapphireMessage = new MessageBlock("colossal-darksapphire-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        deepsapphireMessage = new MessageBlock("deepsapphire-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDeepsapphireMessage = new MessageBlock("large-deepsapphire-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalDeepsapphireMessage = new MessageBlock("colossal-deepsapphire-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        purpleMessage = new MessageBlock("purple-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largePurpleMessage = new MessageBlock("large-purple-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalPurpleMessage = new MessageBlock("colossal-purple-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        darkpurpleMessage = new MessageBlock("darkpurple-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarkpurpleMessage = new MessageBlock("large-darkpurple-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalDarkpurpleMessage = new MessageBlock("colossal-darkpurple-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        violetMessage = new MessageBlock("violet-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeVioletMessage = new MessageBlock("large-violet-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalVioletMessage = new MessageBlock("colossal-violet-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        hotpinkMessage = new MessageBlock("hotpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeHotpinkMessage = new MessageBlock("large-hotpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalHotpinkMessage = new MessageBlock("colossal-hotpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        darkhotpinkMessage = new MessageBlock("darkhotpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarkhotpinkMessage = new MessageBlock("large-darkhotpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalDarkhotpinkMessage = new MessageBlock("colossal-darkhotpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        deephotpinkMessage = new MessageBlock("deephotpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDeephotpinkMessage = new MessageBlock("large-deephotpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        colossalDeephotpinkMessage = new MessageBlock("colossal-deephotpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};
    }
}
