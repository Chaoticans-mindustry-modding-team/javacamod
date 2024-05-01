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
import javacamod.world.blocks.logic.*;
import javacamod.world.blocks.decoration.*;
//import javacamod.world.blocks.distribution.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

@SuppressWarnings("deprecation")
public class JavacamodBlocks{
    //walls
    public static Block 

redWall, largeRedWall, colossalRedWall, darkredWall, largeDarkredWall, colossalDarkredWall, crimsonWall, largeCrimsonWall, colossalCrimsonWall, greenWall, largeGreenWall, colossalGreenWall, darkgreenWall, largeDarkgreenWall, colossalDarkgreenWall, poisonWall, largePoisonWall, colossalPoisonWall, blueWall, largeBlueWall, colossalBlueWall, darkblueWall, largeDarkblueWall, colossalDarkblueWall, navyWall, largeNavyWall,colossalNavyWall, whiteWall, largeWhiteWall, colossalWhiteWall, lightgrayWall, largeLightgrayWall, colossalLightgrayWall, blackishwhiteWall, largeBlackishwhiteWall, colossalBlackishwhiteWall, darkgrayWall, largeDarkgrayWall, colossalDarkgrayWall, blackWall, largeBlackWall, colossalBlackWall, yellowWall, largeYellowWall, colossalYellowWall, darkYellowWall, largeDarkYellowWall, colossalDarkYellowWall, runicWall, largeRunicWall, colossalRunicWall, cyanWall, largeCyanWall, colossalCyanWall, darkCyanWall, largeDarkCyanWall, colossalDarkCyanWall, deepOceanWall, largeDeepOceanWall, colossalDeepOceanWall, pinkWall, largePinkWall, colossalPinkWall, darkPinkWall, largeDarkPinkWall, colossalDarkPinkWall, deepPinkWall, largeDeepPinkWall, colossalDeepPinkWall, orangeWall, largeOrangeWall, colossalOrangeWall, darkOrangeWall, largeDarkOrangeWall, colossalDarkOrangeWall, burntOrangeWall, largeBurntOrangeWall, colossalBurntOrangeWall, limeWall, largeLimeWall, colossalLimeWall, darkLimeWall, largeDarkLimeWall, colossalDarkLimeWall, fruitWall, largeFruitWall, colossalFruitWall, emeraldWall, largeEmeraldWall, colossalEmeraldWall, darkEmeraldWall, largeDarkEmeraldWall, colossalDarkEmeraldWall, deepEmeraldWall, largeDeepEmeraldWall, colossalDeepEmeraldWall, sapphireWall, largeSapphireWall, colossalSapphireWall, darkSapphireWall, largeDarkSapphireWall, colossalDarkSapphireWall, deepSapphireWall, largeDeepSapphireWall, colossalDeepSapphireWall, purpleWall, largePurpleWall, colossalPurpleWall, darkPurpleWall, largeDarkPurpleWall, colossalDarkPurpleWall, violetWall, largeVioletWall, colossalVioletWall, hotpinkWall, largeHotpinkWall, colossalHotpinkWall, darkHotpinkWall, largeDarkHotpinkWall, colossalDarkHotpinkWall, deepHotpinkWall, largeDeepHotpinkWall, colossalDeepHotpinkWall,
hexWall, hexWallLarge, hexWallColossal,
//doors
redDoor, largeRedDoor, darkredDoor, largeDarkredDoor, crimsonDoor, largeCrimsonDoor, greenDoor, largeGreenDoor, darkgreenDoor, largeDarkgreenDoor, poisonDoor, largePoisonDoor, blueDoor, largeBlueDoor, darkblueDoor, largeDarkblueDoor, navyDoor, largeNavyDoor, whiteDoor, largeWhiteDoor, blackDoor, largeBlackDoor, yellowDoor, largeYellowDoor, darkyellowDoor, largeDarkyellowDoor, runicDoor, largeRunicDoor, cyanDoor, largeCyanDoor, darkcyanDoor, largeDarkcyanDoor, deepOceanDoor, largeDeepOceanDoor, pinkDoor, largePinkDoor, darkpinkDoor, largeDarkpinkDoor, deeppinkDoor, largeDeeppinkDoor, orangeDoor, largeOrangeDoor, darkorangeDoor, largeDarkorangeDoor, burntorangeDoor, largeBurntorangeDoor, limeDoor, largeLimeDoor, darklimeDoor, largeDarklimeDoor, fruitDoor, largeFruitDoor, emeraldDoor, largeEmeraldDoor, darkemeraldDoor, largeDarkemeraldDoor, deepemeraldDoor, largeDeepemeraldDoor, sapphireDoor, largeSapphireDoor, darksapphireDoor, largeDarksapphireDoor, deepsapphireDoor, largeDeepsapphireDoor, purpleDoor, largePurpleDoor, darkpurpleDoor, largeDarkpurpleDoor, violetDoor, largeVioletDoor, hotpinkDoor, largeHotpinkDoor, darkhotpinkDoor, largeDarkhotpinkDoor, deephotpinkDoor, largeDeephotpinkDoor,
//Slope Slab Stair
hexStair, hexSlope, hexLongSlope1, hexLongSlope2, hexLongSlope3, hexLongSlope4, hexSlab, hexPillar, hexChunk, hexCenterChunk, hexMiddleChunk, hexSpike,

//Oreblocks
copperBar, copperBars, copperBarstackTop, copperBarstackMid, copperBarstackBottom, leadBar, leadBars, leadBarstackTop, leadBarstackMid, leadBarstackBottom, metaglassBlock, metaglassBlocks, metaglassBlockstackTop, metaglassBlockstackMid, metaglassBlockstackBottom, graphiteBlock, graphiteBlocks, graphiteBlockstackTop, graphiteBlockstackMid, graphiteBlockstackBottom, sandPile, smallSandPile0, smallSandPile2, coalPile, titaniumBar, titaniumBars, titaniumBarstackTop, titaniumBarstackMid, titaniumBarstackBottom, thoriumPile, scrapPile0, scrapPile2, scrapPile3, scrapPile4, siliconBlock, siliconBlocks, siliconBlockstackTop, siliconBlockstackMid, siliconBlockstackBottom, plastaniumBlock, plastaniumBlocks, plastaniumBlockstackTop, plastaniumBlockstackMid, plastaniumBlockstackBottom, phasePile, surgeAlloyBar, surgeAlloyBars, surgeAlloyBarstackTop, surgeAlloyBarstackMid, surgeAlloyBarstackBottom, sporePodPile, pyratiteBlock, pyratiteBlocks, pyratiteBlockstackTop, pyratiteBlockstackMid, pyratiteBlockstackBottom, blastCompoundBlock, blastCompoundBlocks, blastCompoundBlockstackTop, blastCompoundBlockstackMid, blastCompoundBlockstackBottom, berylliumPile, tungstenPile, oxidePile, carbidePile,

//Imitation terrain walls
darkMetal, darkMetalLarge, dirtWall, dirtWallLarge, duneWall, duneWallLarge, plantWall, plantWallLarge, grassWall, grassWallLarge, iceWall, iceWallLarge, snowWall, snowWallLarge, stoneWall, stoneWallLarge, woodWall, woodWallLarge, sandWall, sandWallLarge, coalWall, coalWallLarge,
    
//distribution
borderlessSorter, largeSorter, colossalSorter, largeInvertedSorter, colossalInvertedSorter, largeSource, colossalSource, hexSorter, largeHexSorter, colossalHexSorter, shadowlessSorter, shadowlessLargeSorter, shadowlessColossalSorter, chiseledSorter1, chiseledSorter2, chiseledSorter3, chiseledSorter4, chiseledSorter5, chiseledSorter6, chiseledSorter7, chiseledSorter8, chiseledSorter9, chiseledSorter10, chiseledSorter11, chiseledSorter12, chiseledSorter13, chiseledSorter14, shadowlessChiseledSorter1, shadowlessChiseledSorter2, shadowlessChiseledSorter3, shadowlessChiseledSorter4, shadowlessChiseledSorter5, shadowlessChiseledSorter6, shadowlessChiseledSorter7, shadowlessChiseledSorter8, shadowlessChiseledSorter9, shadowlessChiseledSorter10, shadowlessChiseledSorter11, shadowlessChiseledSorter12, shadowlessChiseledSorter13, shadowlessChiseledSorter14, chiseledInvertedSorter1, chiseledInvertedSorter2, chiseledInvertedSorter3, chiseledInvertedSorter4, chiseledInvertedSorter5, chiseledInvertedSorter6, chiseledInvertedSorter7, chiseledInvertedSorter8, chiseledInvertedSorter9, chiseledInvertedSorter10, chiseledInvertedSorter11, chiseledInvertedSorter12, chiseledInvertedSorter13, chiseledInvertedSorter14, chiseledSource1, chiseledSource2, chiseledSource3, chiseledSource4, chiseledSource5, chiseledSource6, chiseledSource7, chiseledSource8, chiseledSource9, chiseledSource10, chiseledSource11, chiseledSource12, chiseledSource13, chiseledSource14, hexChiseledSorter1, hexChiseledSorter2, hexChiseledSorter3, hexChiseledSorter4, hexChiseledSorter5, hexChiseledSorter6, hexChiseledSorter7, hexChiseledSorter8, hexChiseledSorter9, hexChiseledSorter10, hexChiseledSorter11, hexChiseledSorter12, hexChiseledSorter13, hexChiseledSorter14,

//liquid
liquidBlock, borderlessLiquidSource,

//MSGs
redMessage, largeRedMessage, colossalRedMessage, darkredMessage, largeDarkredMessage, colossalDarkredMessage, bloodMessage, largeBloodMessage, colossalBloodMessage, greenMessage, largeGreenMessage, colossalGreenMessage, darkgreenMessage, largeDarkgreenMessage, colossalDarkgreenMessage, poisonMessage, largePoisonMessage, colossalPoisonMessage, blueMessage, largeBlueMessage, colossalBlueMessage, darkblueMessage, largeDarkblueMessage, colossalDarkblueMessage, navyMessage, largeNavyMessage, colossalNavyMessage, whiteMessage, largeWhiteMessage, colossalWhiteMessage, blankMessage, largeBlankMessage, colossalBlankMessage, blackMessage, largeBlackMessage, colossalBlackMessage, yellowMessage, largeYellowMessage, colossalYellowMessage, darkyellowMessage, largeDarkyellowMessage, colossalDarkyellowMessage, runicMessage, largeRunicMessage, colossalRunicMessage, cyanMessage, largeCyanMessage, colossalCyanMessage, darkcyanMessage, largeDarkcyanMessage, colossalDarkcyanMessage, deepOceanMessage, largeDeepOceanMessage, colossalDeepOceanMessage, pinkMessage, largePinkMessage, colossalPinkMessage, darkpinkMessage, largeDarkpinkMessage, colossalDarkpinkMessage, deeppinkMessage, largeDeeppinkMessage, colossalDeeppinkMessage, orangeMessage, largeOrangeMessage, colossalOrangeMessage, darkorangeMessage, largeDarkorangeMessage, colossalDarkorangeMessage, burntorangeMessage, largeBurntorangeMessage, colossalBurntorangeMessage, limeMessage, largeLimeMessage, colossalLimeMessage, darklimeMessage, largeDarklimeMessage, colossalDarklimeMessage, fruitMessage, largeFruitMessage, colossalFruitMessage, emeraldMessage, largeEmeraldMessage, colossalEmeraldMessage, darkemeraldMessage, largeDarkemeraldMessage, colossalDarkemeraldMessage, deepemeraldMessage, largeDeepemeraldMessage, colossalDeepemeraldMessage, sapphireMessage, largeSapphireMessage, colossalSapphireMessage, darksapphireMessage, largeDarksapphireMessage, colossalDarksapphireMessage, deepsapphireMessage, largeDeepsapphireMessage, colossalDeepsapphireMessage, purpleMessage, largePurpleMessage, colossalPurpleMessage, darkpurpleMessage, largeDarkpurpleMessage, colossalDarkpurpleMessage, violetMessage, largeVioletMessage, colossalVioletMessage, hotpinkMessage, largeHotpinkMessage, colossalHotpinkMessage, darkhotpinkMessage, largeDarkhotpinkMessage, colossalDarkhotpinkMessage, deephotpinkMessage, largeDeephotpinkMessage, colossalDeephotpinkMessage,

//Chiseled MSGs
chiseledMessageSquare, chiseledMessageCircle, chiseledMessageRhombus, chiseledMessageDiamond, chiseledMessageBar, chiseledMessagePlant, chiseledMessageFactory, chiseledMessageAdmin, chiseledMessageDrill, chiseledMessageTurret, chiseledMessageLogic, chiseledMessageUnit, chiseledMessagePower, chiseledMessageWall, chiseledMessageLiquid, chiseledMessageDistribution, chiseledMessageSkull, chiseledMessageVoid, chiseledMessage0, chiseledMessage1, chiseledMessage2, chiseledMessage3, chiseledMessage4, chiseledMessage5, chiseledMessage6, chiseledMessage7, chiseledMessage8, chiseledMessage9, chiseledMessageHouse, chiseledMessageRules, chiseledMessageCore, chiseledMessageTechtree, chiseledMessageImage, chiseledMessageList, chiseledMessageWaves, chiseledMessageTrashcan, chiseledMessageLandscape, chiseledMessageFloors, chiseledMessagePause, chiseledMessagePlay, chiseledMessagePencil, chiseledMessageEraser, chiseledMessageCross, chiseledMessageCrossDiagonal, chiseledMessageHammer, chiseledMessageMap, chiseledMessageBox, chiseledMessageGear, chiseledMessageArrowUp, chiseledMessageArrowDown, chiseledMessageArrowLeft, chiseledMessageArrowRight,

//Screens
screenSmall, screen, screenLarge, borderlessScreenSmall, borderlessScreen, borderlessScreenLarge,

//Processors
yellowMicroProcessor, cyanMicroProcessor,

//Memory
yellowMemoryCell, cyanMemoryCell,

//Texture blocks
textureBlock, textureImitator, textureGrid,

//Lightsource
lightSourceTiny, lightSourceSmall, lightSource, lightSourceLarge, lightSourceHuge,

//Decor
vial, hexVial, chain, chainTurn, chainT, chainX, chainD, chainDl, chainDt, chainDx, deChain, deChainL, deChainT, deChainX, deChainD, deChainDl, deChainDt, deChainDx, jointOne, jointTwo, jointThree, jointFour, jointFive, jointSix, jointSeven, jointAOne, jointATwo, jointAThree, jointAFour, jointAFive, jointSOne, jointSTwo, jointSThree, jointSFour

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
    
        hexWall = new HexBlock("hex-wall"){{
            requirements(Category.defense, with());
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};
        
        hexWallLarge = new HexBlock("large-hex-wall"){{
            requirements(Category.defense, with());
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};
        
        hexWallColossal = new HexBlock("colossal-hex-wall"){{
            requirements(Category.defense, with());
           health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        copperBar = new Wall("copper-bar"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        copperBars = new Wall("copper-bars"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        copperBarstackTop = new Wall("copper-barstacktop"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        copperBarstackMid = new Wall("copper-barstackmid"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        copperBarstackBottom = new Wall("copper-barstackbottom"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        leadBar = new Wall("lead-bar"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        leadBars = new Wall("lead-bars"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        leadBarstackTop = new Wall("lead-barstacktop"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        leadBarstackMid = new Wall("lead-barstackmid"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};


        leadBarstackBottom = new Wall("lead-barstackbottom"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        metaglassBlock = new Wall("metaglass-block"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        metaglassBlocks = new Wall("metaglass-blocks"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        metaglassBlockstackTop = new Wall("metaglass-blockstacktop"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        metaglassBlockstackMid = new Wall("metaglass-blockstackmid"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        metaglassBlockstackBottom = new Wall("metaglass-blockstackbottom"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        graphiteBlock = new Wall("graphite-block"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        graphiteBlocks = new Wall("graphite-blocks"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        graphiteBlockstackTop = new Wall("graphite-blockstacktop"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        graphiteBlockstackMid = new Wall("graphite-blockstackmid"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        graphiteBlockstackBottom = new Wall("graphite-blockstackbottom"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        sandPile = new Wall("sand-pile"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        smallSandPile0 = new Wall("small-sand-pile1"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        smallSandPile2 = new Wall("small-sand-pile2"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        coalPile = new Wall("coal-pile"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        titaniumBar = new Wall("titanium-bar"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        titaniumBars = new Wall("titanium-bars"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        titaniumBarstackTop = new Wall("titanium-barstacktop"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        titaniumBarstackMid = new Wall("titanium-barstackmid"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        titaniumBarstackBottom = new Wall("titanium-barstackbottom"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        thoriumPile = new Wall("thorium-pile"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        scrapPile0 = new Wall("scrap1"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        scrapPile2 = new Wall("scrap2"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        scrapPile3 = new Wall("scrap3"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        scrapPile4 = new Wall("scrap4"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        siliconBlock = new Wall("silicon-block"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        siliconBlocks = new Wall("silicon-blocks"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        siliconBlockstackTop = new Wall("silicon-blockstacktop"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        siliconBlockstackMid = new Wall("silicon-blockstackmid"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        siliconBlockstackBottom = new Wall("silicon-blockstackbottom"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        plastaniumBlock = new Wall("plastanium-block"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        plastaniumBlocks = new Wall("plastanium-blocks"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        plastaniumBlockstackTop = new Wall("plastanium-blockstacktop"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        plastaniumBlockstackMid = new Wall("plastanium-blockstackmid"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        plastaniumBlockstackBottom = new Wall("plastanium-blockstackbottom"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        phasePile = new Wall("phase-fabric-pile"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        surgeAlloyBar = new Wall("surge-alloy-bar"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        surgeAlloyBars = new Wall("surge-alloy-bars"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        surgeAlloyBarstackTop = new Wall("surge-alloy-barstacktop"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        surgeAlloyBarstackMid = new Wall("surge-alloy-barstackmid"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        surgeAlloyBarstackBottom = new Wall("surge-alloy-barstackbottom"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        sporePodPile = new Wall("spore-pod-pile"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        pyratiteBlock = new Wall("pyratite-block"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        pyratiteBlocks = new Wall("pyratite-blocks"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        pyratiteBlockstackTop = new Wall("pyratite-blockstacktop"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        pyratiteBlockstackMid = new Wall("pyratite-blockstackmid"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        pyratiteBlockstackBottom = new Wall("pyratite-blockstackbottom"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        blastCompoundBlock = new Wall("blast-compound-block"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        blastCompoundBlocks = new Wall("blast-compound-blocks"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        blastCompoundBlockstackTop = new Wall("blast-compound-blockstacktop"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        blastCompoundBlockstackMid = new Wall("blast-compound-blockstackmid"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        blastCompoundBlockstackBottom = new Wall("blast-compound-blockstackbottom"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        berylliumPile = new Wall("beryllium-pile"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        tungstenPile = new Wall("tungsten-pile"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        oxidePile = new Wall("oxide-pile"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        carbidePile = new Wall("carbide-pile"){{
            requirements(Category.production, with());
            health = 80;
            envDisabled |= Env.scorching;
        }};

        darkMetal = new Wall("dark-metal"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
            envDisabled |= Env.scorching;
        }};

        darkMetalLarge = new Wall("dark-metal-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

         dirtWall = new Wall("dirt-wall"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
            envDisabled |= Env.scorching;
        }};

        dirtWallLarge = new Wall("dirt-wall-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        duneWall = new Wall("dune-wall"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
            envDisabled |= Env.scorching;
        }};

        duneWallLarge = new Wall("dune-wall-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        plantWall = new Wall("plant-wall"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
            envDisabled |= Env.scorching;
        }};

        plantWallLarge = new Wall("plant-wall-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        grassWall = new Wall("grass-wall"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
            envDisabled |= Env.scorching;
        }};

        grassWallLarge = new Wall("grass-wall-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        iceWall = new Wall("ice-wall"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
            envDisabled |= Env.scorching;
        }};

        iceWallLarge = new Wall("ice-wall-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        snowWall = new Wall("snow-wall"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
            envDisabled |= Env.scorching;
        }};

        snowWallLarge = new Wall("snow-wall-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        stoneWall = new Wall("stone-wall"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
            envDisabled |= Env.scorching;
        }};

        stoneWallLarge = new Wall("stone-wall-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        woodWall = new Wall("wood-wall"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
            envDisabled |= Env.scorching;
        }};

        woodWallLarge = new Wall("wood-wall-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        sandWall = new Wall("sand-wall"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
            envDisabled |= Env.scorching;
        }};

        sandWallLarge = new Wall("sand-wall-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        coalWall = new Wall("coal-wall"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
            envDisabled |= Env.scorching;
        }};

        coalWallLarge = new Wall("coal-wall-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        redDoor = new Door("red-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeRedDoor = new Door("large-red-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        darkredDoor = new Door("darkred-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeDarkredDoor = new Door("large-darkred-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        crimsonDoor = new Door("crimson-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeCrimsonDoor = new Door("large-crimson-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        greenDoor = new Door("green-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeGreenDoor = new Door("large-green-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        darkgreenDoor = new Door("darkgreen-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeDarkgreenDoor = new Door("large-darkgreen-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        poisonDoor = new Door("poison-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largePoisonDoor = new Door("large-poison-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        blueDoor = new Door("blue-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeBlueDoor = new Door("large-blue-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        darkblueDoor = new Door("darkblue-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeDarkblueDoor = new Door("large-darkblue-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        navyDoor = new Door("navy-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeNavyDoor = new Door("large-navy-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        whiteDoor = new Door("white-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeWhiteDoor = new Door("large-white-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        blackDoor = new Door("black-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeBlackDoor = new Door("large-black-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        yellowDoor = new Door("yellow-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeYellowDoor = new Door("large-yellow-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        darkyellowDoor = new Door("darkyellow-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeDarkyellowDoor = new Door("large-darkyellow-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        runicDoor = new Door("runic-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeRunicDoor = new Door("large-runic-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        cyanDoor = new Door("cyan-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeCyanDoor = new Door("large-cyan-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        darkcyanDoor = new Door("darkcyan-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeDarkcyanDoor = new Door("large-darkcyan-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};
        
        deepOceanDoor = new Door("deep-ocean-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeDeepOceanDoor = new Door("large-deep-ocean-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        pinkDoor = new Door("pink-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largePinkDoor = new Door("large-pink-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        darkpinkDoor = new Door("darkpink-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeDarkpinkDoor = new Door("large-darkpink-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        deeppinkDoor = new Door("deeppink-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeDeeppinkDoor = new Door("large-deeppink-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        orangeDoor = new Door("orange-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeOrangeDoor = new Door("large-orange-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        darkorangeDoor = new Door("darkorange-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeDarkorangeDoor = new Door("large-darkorange-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        burntorangeDoor = new Door("burntorange-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeBurntorangeDoor = new Door("large-burntorange-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        limeDoor = new Door("lime-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeLimeDoor = new Door("large-lime-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        darklimeDoor = new Door("darklime-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeDarklimeDoor = new Door("large-darklime-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        fruitDoor = new Door("fruit-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeFruitDoor = new Door("large-fruit-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        emeraldDoor = new Door("emerald-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeEmeraldDoor = new Door("large-emerald-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        darkemeraldDoor = new Door("darkemerald-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeDarkemeraldDoor = new Door("large-darkemerald-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        deepemeraldDoor = new Door("deepemerald-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeDeepemeraldDoor = new Door("large-deepemerald-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        sapphireDoor = new Door("sapphire-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeSapphireDoor = new Door("large-sapphire-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        darksapphireDoor = new Door("darksapphire-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeDarksapphireDoor = new Door("large-darksapphire-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        deepsapphireDoor = new Door("deepsapphire-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeDeepsapphireDoor = new Door("large-deepsapphire-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        purpleDoor = new Door("purple-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largePurpleDoor = new Door("large-purple-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        darkpurpleDoor = new Door("darkpurple-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeDarkpurpleDoor = new Door("large-darkpurple-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        violetDoor = new Door("violet-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeVioletDoor = new Door("large-violet-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        hotpinkDoor = new Door("hotpink-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeHotpinkDoor = new Door("large-hotpink-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        darkhotpinkDoor = new Door("darkhotpink-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeDarkhotpinkDoor = new Door("large-darkhotpink-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        deephotpinkDoor = new Door("deephotpink-door"){{
            requirements(Category.defense, with());
            health = 100;
            envDisabled |= Env.scorching;
        }};

        largeDeephotpinkDoor = new Door("large-deephotpink-door"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 2;
            envDisabled |= Env.scorching;
        }};

        hexStair = new HexBlock("hex-stair"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexSlope = new HexBlock("hex-slope"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexLongSlope1 = new HexBlock("hex-long-slope1"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexLongSlope2 = new HexBlock("hex-long-slope2"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexLongSlope3 = new HexBlock("hex-long-slope3"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexLongSlope4 = new HexBlock("hex-long-slope4"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexSlab = new HexBlock("hex-slab"){{
            requirements(Category.defense, with());
            health = 100;
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexPillar = new HexBlock("hex-pillar"){{
            requirements(Category.defense, with());
            health = 100;
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexChunk = new HexBlock("hex-chunk"){{
            requirements(Category.defense, with());
            health = 100;
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexCenterChunk = new HexBlock("hex-center-chunk"){{
            requirements(Category.defense, with());
            health = 100;
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexMiddleChunk = new HexBlock("hex-middle-chunk"){{
            requirements(Category.defense, with());
            health = 100;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        hexSpike = new HexBlock("hex-spike"){{
            requirements(Category.defense, with());
            health = 100;
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
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

        hexSorter = new HexBlock("hex-sorter"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        largeHexSorter = new HexBlock("large-hex-sorter"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 2;
            envDisabled |= Env.scorching;
        }};

        colossalHexSorter = new HexBlock("colossal-hex-sorter"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 3;
            envDisabled |= Env.scorching;
        }};

        shadowlessSorter = new Sorter("shadowless-sorter"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 2; 
            hasShadow = false;
            envDisabled |= Env.scorching;
        }};

        shadowlessLargeSorter = new Sorter("shadowless-large-sorter"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 2; 
            hasShadow = false;
            envDisabled |= Env.scorching;
        }};

        shadowlessColossalSorter = new Sorter("shadowless-colossal-sorter"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 3; 
            hasShadow = false;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter1 = new Sorter("chiseled-sorter1"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter2 = new Sorter("chiseled-sorter2"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter3 = new Sorter("chiseled-sorter3"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter4 = new Sorter("chiseled-sorter4"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter5 = new Sorter("chiseled-sorter5"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter6 = new Sorter("chiseled-sorter6"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter7 = new Sorter("chiseled-sorter7"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter8 = new Sorter("chiseled-sorter8"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter9 = new Sorter("chiseled-sorter9"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter10 = new Sorter("chiseled-sorter10"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter11 = new Sorter("chiseled-sorter11"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter12 = new Sorter("chiseled-sorter12"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter13 = new Sorter("chiseled-sorter13"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSorter14 = new Sorter("chiseled-sorter14"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        shadowlessChiseledSorter1 = new Sorter("shadowless-chiseled-sorter1"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        shadowlessChiseledSorter2 = new Sorter("shadowless-chiseled-sorter2"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        shadowlessChiseledSorter3 = new Sorter("shadowless-chiseled-sorter3"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        shadowlessChiseledSorter4 = new Sorter("shadowless-chiseled-sorter4"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            envDisabled |= Env.scorching;
        }};

        shadowlessChiseledSorter5 = new Sorter("shadowless-chiseled-sorter5"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        shadowlessChiseledSorter6 = new Sorter("shadowless-chiseled-sorter6"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        shadowlessChiseledSorter7 = new Sorter("shadowless-chiseled-sorter7"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        shadowlessChiseledSorter8 = new Sorter("shadowless-chiseled-sorter8"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        shadowlessChiseledSorter9 = new Sorter("shadowless-chiseled-sorter9"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        shadowlessChiseledSorter10 = new Sorter("shadowless-chiseled-sorter10"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        shadowlessChiseledSorter11 = new Sorter("shadowless-chiseled-sorter11"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        shadowlessChiseledSorter12 = new Sorter("shadowless-chiseled-sorter12"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        shadowlessChiseledSorter13 = new Sorter("shadowless-chiseled-sorter13"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        shadowlessChiseledSorter14 = new Sorter("shadowless-chiseled-sorter14"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter1 = new Sorter("chiseled-inverted-sorter1"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            invert = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter2 = new Sorter("chiseled-inverted-sorter2"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            invert = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter3 = new Sorter("chiseled-inverted-sorter3"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            invert = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter4 = new Sorter("chiseled-inverted-sorter4"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter5 = new Sorter("chiseled-inverted-sorter5"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter6 = new Sorter("chiseled-inverted-sorter6"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter7 = new Sorter("chiseled-inverted-sorter7"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter8 = new Sorter("chiseled-inverted-sorter8"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter9 = new Sorter("chiseled-inverted-sorter9"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter10 = new Sorter("chiseled-inverted-sorter10"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter11 = new Sorter("chiseled-inverted-sorter11"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter12 = new Sorter("chiseled-inverted-sorter12"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter13 = new Sorter("chiseled-inverted-sorter13"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledInvertedSorter14 = new Sorter("chiseled-inverted-sorter14"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource1 = new ItemSource("chiseled-source1"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource2 = new ItemSource("chiseled-source2"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource3 = new ItemSource("chiseled-source3"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource4 = new ItemSource("chiseled-source4"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            envDisabled |= Env.scorching;
        }};

        chiseledSource5 = new ItemSource("chiseled-source5"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource6 = new ItemSource("chiseled-source6"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource7 = new ItemSource("chiseled-source7"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource8 = new ItemSource("chiseled-source8"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource9 = new ItemSource("chiseled-source9"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource10 = new ItemSource("chiseled-source10"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource11 = new ItemSource("chiseled-source11"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource12 = new ItemSource("chiseled-source12"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource13 = new ItemSource("chiseled-source13"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        chiseledSource14 = new ItemSource("chiseled-source14"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            envDisabled |= Env.scorching;
        }};

        hexChiseledSorter1 = new HexBlock("hex-chiseled-sorter1"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexChiseledSorter2 = new HexBlock("hex-chiseled-sorter2"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexChiseledSorter3 = new HexBlock("hex-chiseled-sorter3"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexChiseledSorter4 = new HexBlock("hex-chiseled-sorter4"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexChiseledSorter5 = new HexBlock("hex-chiseled-sorter5"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexChiseledSorter6 = new HexBlock("hex-chiseled-sorter6"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexChiseledSorter7 = new HexBlock("hex-chiseled-sorter7"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexChiseledSorter8 = new HexBlock("hex-chiseled-sorter8"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexChiseledSorter9 = new HexBlock("hex-chiseled-sorter9"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexChiseledSorter10 = new HexBlock("hex-chiseled-sorter10"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexChiseledSorter11 = new HexBlock("hex-chiseled-sorter11"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexChiseledSorter12 = new HexBlock("hex-chiseled-sorter12"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexChiseledSorter13 = new HexBlock("hex-chiseled-sorter13"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        hexChiseledSorter14 = new HexBlock("hex-chiseled-sorter14"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
            envDisabled |= Env.scorching;
        }};

        liquidBlock = new LiquidRouter("liquid-block"){{
            requirements(Category.liquid, with());
            liquidCapacity = 20f;
            underBullets = true;
            solid = false;
        }};

        borderlessLiquidSource = new LiquidSource("borderless-liquid-source"){{
            requirements(Category.liquid, with());
        }};

        redMessage = new MessageBlock("red-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeRedMessage = new MessageBlock("large-red-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};


        colossalRedMessage = new MessageBlock("colossal-red-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};


        darkredMessage = new MessageBlock("darkred-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarkredMessage = new MessageBlock("large-darkred-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalDarkredMessage = new MessageBlock("colossal-darkred-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        bloodMessage = new MessageBlock("blood-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeBloodMessage = new MessageBlock("large-blood-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalBloodMessage = new MessageBlock("colossal-blood-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        greenMessage = new MessageBlock("green-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeGreenMessage = new MessageBlock("large-green-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalGreenMessage = new MessageBlock("colossal-green-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        darkgreenMessage = new MessageBlock("darkgreen-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarkgreenMessage = new MessageBlock("large-darkgreen-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalDarkgreenMessage = new MessageBlock("colossal-darkgreen-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        poisonMessage = new MessageBlock("poison-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largePoisonMessage = new MessageBlock("large-poison-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalPoisonMessage = new MessageBlock("colossal-poison-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        blueMessage = new MessageBlock("blue-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeBlueMessage = new MessageBlock("large-blue-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalBlueMessage = new MessageBlock("colossal-blue-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        darkblueMessage = new MessageBlock("darkblue-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarkblueMessage = new MessageBlock("large-darkblue-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalDarkblueMessage = new MessageBlock("colossal-darkblue-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        navyMessage = new MessageBlock("navy-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeNavyMessage = new MessageBlock("large-navy-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalNavyMessage = new MessageBlock("colossal-navy-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        whiteMessage = new MessageBlock("white-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeWhiteMessage = new MessageBlock("large-white-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalWhiteMessage = new MessageBlock("colossal-white-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        blankMessage = new MessageBlock("blank-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeBlankMessage = new MessageBlock("large-blank-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalBlankMessage = new MessageBlock("colossal-blank-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        blackMessage = new MessageBlock("black-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeBlackMessage = new MessageBlock("large-black-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalBlackMessage = new MessageBlock("colossal-black-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        yellowMessage = new MessageBlock("yellow-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeYellowMessage = new MessageBlock("large-yellow-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalYellowMessage = new MessageBlock("colossal-yellow-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        darkyellowMessage = new MessageBlock("darkyellow-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarkyellowMessage = new MessageBlock("large-darkyellow-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalDarkyellowMessage = new MessageBlock("colossal-darkyellow-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        runicMessage = new MessageBlock("runic-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeRunicMessage = new MessageBlock("large-runic-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalRunicMessage = new MessageBlock("colossal-runic-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        cyanMessage = new MessageBlock("cyan-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};
        
        largeCyanMessage = new MessageBlock("large-cyan-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalCyanMessage = new MessageBlock("colossal-cyan-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        darkcyanMessage = new MessageBlock("darkcyan-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarkcyanMessage = new MessageBlock("large-darkcyan-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalDarkcyanMessage = new MessageBlock("colossal-darkcyan-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        deepOceanMessage = new MessageBlock("deep-ocean-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDeepOceanMessage = new MessageBlock("large-deep-ocean-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalDeepOceanMessage = new MessageBlock("colossal-deep-ocean-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        pinkMessage = new MessageBlock("pink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largePinkMessage = new MessageBlock("large-pink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalPinkMessage = new MessageBlock("colossal-pink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};
        
        darkpinkMessage = new MessageBlock("darkpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarkpinkMessage = new MessageBlock("large-darkpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalDarkpinkMessage = new MessageBlock("colossal-darkpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        deeppinkMessage = new MessageBlock("deeppink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDeeppinkMessage = new MessageBlock("large-deeppink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalDeeppinkMessage = new MessageBlock("colossal-deeppink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        orangeMessage = new MessageBlock("orange-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeOrangeMessage = new MessageBlock("large-orange-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalOrangeMessage = new MessageBlock("colossal-orange-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        darkorangeMessage = new MessageBlock("darkorange-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarkorangeMessage = new MessageBlock("large-darkorange-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalDarkorangeMessage = new MessageBlock("colossal-darkorange-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        burntorangeMessage = new MessageBlock("burntorange-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeBurntorangeMessage = new MessageBlock("large-burntorange-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalBurntorangeMessage = new MessageBlock("colossal-burntorange-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        limeMessage = new MessageBlock("lime-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeLimeMessage = new MessageBlock("large-lime-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalLimeMessage = new MessageBlock("colossal-lime-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};
        
        darklimeMessage = new MessageBlock("darklime-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarklimeMessage = new MessageBlock("large-darklime-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalDarklimeMessage = new MessageBlock("colossal-darklime-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        fruitMessage = new MessageBlock("fruit-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeFruitMessage = new MessageBlock("large-fruit-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalFruitMessage = new MessageBlock("colossal-fruit-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        emeraldMessage = new MessageBlock("emerald-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeEmeraldMessage = new MessageBlock("large-emerald-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalEmeraldMessage = new MessageBlock("colossal-emerald-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        darkemeraldMessage = new MessageBlock("darkemerald-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarkemeraldMessage = new MessageBlock("large-darkemerald-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalDarkemeraldMessage = new MessageBlock("colossal-darkemerald-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        deepemeraldMessage = new MessageBlock("deepemerald-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDeepemeraldMessage = new MessageBlock("large-deepemerald-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalDeepemeraldMessage = new MessageBlock("colossal-deepemerald-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        sapphireMessage = new MessageBlock("sapphire-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeSapphireMessage = new MessageBlock("large-sapphire-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalSapphireMessage = new MessageBlock("colossal-sapphire-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        darksapphireMessage = new MessageBlock("darksapphire-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarksapphireMessage = new MessageBlock("large-darksapphire-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalDarksapphireMessage = new MessageBlock("colossal-darksapphire-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        deepsapphireMessage = new MessageBlock("deepsapphire-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDeepsapphireMessage = new MessageBlock("large-deepsapphire-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalDeepsapphireMessage = new MessageBlock("colossal-deepsapphire-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        purpleMessage = new MessageBlock("purple-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largePurpleMessage = new MessageBlock("large-purple-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalPurpleMessage = new MessageBlock("colossal-purple-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        darkpurpleMessage = new MessageBlock("darkpurple-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarkpurpleMessage = new MessageBlock("large-darkpurple-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalDarkpurpleMessage = new MessageBlock("colossal-darkpurple-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        violetMessage = new MessageBlock("violet-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeVioletMessage = new MessageBlock("large-violet-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalVioletMessage = new MessageBlock("colossal-violet-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        hotpinkMessage = new MessageBlock("hotpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeHotpinkMessage = new MessageBlock("large-hotpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalHotpinkMessage = new MessageBlock("colossal-hotpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        darkhotpinkMessage = new MessageBlock("darkhotpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDarkhotpinkMessage = new MessageBlock("large-darkhotpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalDarkhotpinkMessage = new MessageBlock("colossal-darkhotpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        deephotpinkMessage = new MessageBlock("deephotpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        largeDeephotpinkMessage = new MessageBlock("large-deephotpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 2;
        }};

        colossalDeephotpinkMessage = new MessageBlock("colossal-deephotpink-message"){{
            requirements(Category.logic, with());
            maxTextLength = 22000; 
            size = 3;
        }};

        chiseledMessageSquare = new MessageBlock("chiseled-message-square"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageCircle = new MessageBlock("chiseled-message-circle"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageRhombus = new MessageBlock("chiseled-message-rhombus"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageDiamond = new MessageBlock("chiseled-message-diamond"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageBar = new MessageBlock("chiseled-message-bar"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessagePlant = new MessageBlock("chiseled-message-plant"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageFactory = new MessageBlock("chiseled-message-factory"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageAdmin = new MessageBlock("chiseled-message-drill"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageDrill = new MessageBlock("chiseled-message-admin"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageTurret = new MessageBlock("chiseled-message-turret"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageLogic = new MessageBlock("chiseled-message-logic"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageUnit = new MessageBlock("chiseled-message-unit"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessagePower = new MessageBlock("chiseled-message-power"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageWall = new MessageBlock("chiseled-message-wall"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageLiquid = new MessageBlock("chiseled-message-liquid"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageDistribution = new MessageBlock("chiseled-message-distribution"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageSkull = new MessageBlock("chiseled-message-skull"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageVoid = new MessageBlock("chiseled-message-void"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessage0 = new MessageBlock("chiseled-message0"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessage1 = new MessageBlock("chiseled-message1"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessage2 = new MessageBlock("chiseled-message2"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessage3 = new MessageBlock("chiseled-message3"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessage4 = new MessageBlock("chiseled-message4"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessage5 = new MessageBlock("chiseled-message5"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessage6 = new MessageBlock("chiseled-message6"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessage7 = new MessageBlock("chiseled-message7"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessage8 = new MessageBlock("chiseled-message8"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessage9 = new MessageBlock("chiseled-message9"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageHouse = new MessageBlock("chiseled-message-house"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageRules = new MessageBlock("chiseled-message-rules"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageCore = new MessageBlock("chiseled-message-core"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageTechtree = new MessageBlock("chiseled-message-techtree"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageImage = new MessageBlock("chiseled-message-image"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageList = new MessageBlock("chiseled-message-list"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageWaves = new MessageBlock("chiseled-message-waves"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageTrashcan = new MessageBlock("chiseled-message-trashcan"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageLandscape = new MessageBlock("chiseled-message-landscape"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageFloors = new MessageBlock("chiseled-message-floors"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessagePause = new MessageBlock("chiseled-message-pause"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessagePlay = new MessageBlock("chiseled-message-play"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessagePencil = new MessageBlock("chiseled-message-pencil"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageEraser = new MessageBlock("chiseled-message-eraser"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageCross = new MessageBlock("chiseled-message-cross"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageCrossDiagonal = new MessageBlock("chiseled-message-cross-diagonal"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageHammer = new MessageBlock("chiseled-message-hammer"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageMap = new MessageBlock("chiseled-message-map"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageBox = new MessageBlock("chiseled-message-box"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageGear = new MessageBlock("chiseled-message-gear"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageArrowUp = new MessageBlock("chiseled-message-arrow-up"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageArrowDown = new MessageBlock("chiseled-message-arrow-down"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageArrowLeft = new MessageBlock("chiseled-message-arrow-left"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        chiseledMessageArrowRight = new MessageBlock("chiseled-message-arrow-right"){{
            requirements(Category.logic, with());
            maxTextLength = 22000;
        }};

        screenSmall = new ScreenBlock("screen-small"){{
            requirements(Category.logic, with());
            size = 1;
            hasShadow = false;
            screenSize = 8;
        }};

        screen = new ScreenBlock("screen"){{
            requirements(Category.logic, with());
            size = 2;
            hasShadow = false;
            screenSize = 16;
        }};

        screenLarge = new ScreenBlock("screen-large"){{
            requirements(Category.logic, with());
            size = 3;
            hasShadow = false;
            screenSize = 24;
        }};

        borderlessScreenSmall = new ScreenBlock("borderless-screen-small"){{
            requirements(Category.logic, with());
            size = 1;
            hasShadow = false;
            screenSize = 8;
        }};

        borderlessScreen = new ScreenBlock("borderless-screen"){{
            requirements(Category.logic, with());
            size = 2;
            hasShadow = false;
            screenSize = 16;
        }};

        borderlessScreenLarge = new ScreenBlock("borderless-screen-large"){{
            requirements(Category.logic, with());
            size = 3;
            hasShadow = false;
            screenSize = 24;
        }};

        yellowMicroProcessor = new LogicBlock("yellow-micro-processor"){{
            requirements(Category.logic, with());
            size = 1;
            range = 2000;
            instructionsPerTick = 500;
        }};

        cyanMicroProcessor = new LogicBlock("cyan-micro-processor"){{
            requirements(Category.logic, with());
            size = 1;
            range = 2000;
            instructionsPerTick = 500;
        }};

        yellowMemoryCell = new MemoryBlock("yellow-memory-cell"){{
            requirements(Category.logic, with());
            size = 1;
            memoryCapacity = 2048;
        }};

        cyanMemoryCell = new MemoryBlock("cyan-memory-cell"){{
            requirements(Category.logic, with());
            size = 1;
            memoryCapacity = 2048;
        }};

        textureBlock = new TextureBlock("texture-block"){{
            requirements(Category.defense, with());
            rotate = true;
        }};

        textureImitator = new TextureBlock("texture-imitator"){{
            requirements(Category.defense, with());
            rotate = true;
            size = 4;
        }};

        textureGrid = new TextureBlock("texture-grid"){{
            requirements(Category.defense, with());
            rotate = true;
            size = 16;
        }};
        
        lightSourceTiny = new LightBlock("tiny-light-source"){{
            requirements(Category.power, with());
            size = 1;
            radius = 50;
            brightness = 100;
        }};

        lightSourceSmall = new LightBlock("small-light-source"){{
            requirements(Category.power, with());
            size = 1;
            radius = 100;
            brightness = 100;
        }};

        lightSource = new LightBlock("light-source"){{
            requirements(Category.power, with());
            size = 1;
            radius = 200;
            brightness = 100;
        }};

        lightSourceLarge = new LightBlock("large-light-source"){{
            requirements(Category.power, with());
            size = 1;
            radius = 300;
            brightness = 100;
        }};

        lightSourceHuge = new LightBlock("huge-light-source"){{
            requirements(Category.power, with());
            size = 1;
            radius = 400;
            brightness = 100;
        }};

        vial = new Sorter("vial"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        hexVial = new HexBlock("hex-vial"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
        }};

        chain = new HexBlock("chain"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
        }};

        chainTurn = new HexBlock("chain-turn"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
        }};

        chainT = new HexBlock("chain-t"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
        }};

        chainX = new HexBlock("chain-x"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
        }};

        chainD = new HexBlock("chain-d"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
        }};

        chainDl = new HexBlock("chain-dl"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
        }};

        chainDt = new HexBlock("chain-dt"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
        }};

        chainDx = new HexBlock("chain-dx"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
            rotateBUTSTATIC = true;
        }};

        deChain = new Wall("de-chain"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        deChainL = new Wall("de-chain-l"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        deChainT = new Wall("de-chain-t"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        deChainX = new Wall("de-chain-x"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        deChainD = new Wall("de-chain-d"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        deChainDl = new Wall("de-chain-dl"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        deChainDt = new Wall("de-chain-dt"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        deChainDx = new Wall("de-chain-dx"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        jointOne = new Wall("joint-one"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        jointTwo = new Wall("joint-two"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};
        
        jointThree = new Wall("joint-three"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};
        
        jointFour = new Wall("joint-four"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        jointFive = new Wall("joint-five"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        jointSix = new Wall("joint-six"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        jointSeven = new Wall("joint-seven"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        jointAOne = new Wall("joint-a-one"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        jointATwo = new Wall("joint-a-two"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        jointAThree = new Wall("joint-a-three"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        jointAFour = new Wall("joint-a-four"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        jointAFive = new Wall("joint-a-five"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        jointSOne = new Wall("joint-s-one"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        jointSTwo = new Wall("joint-s-two"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        jointSThree = new Wall("joint-s-three"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        jointSFour = new Wall("joint-s-four"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

    }
}
