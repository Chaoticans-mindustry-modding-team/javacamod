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
    //color names
    public static String[]
    //walls
    wallColors = {"red", "darkred", "crimson", "green", "darkgreen", "poison", "blue", "darkblue", "navy", "white", "lightgray", "blackishwhite", "darkgray", "black", "yellow", "darkyellow", "runic", "cyan", "darkcyan", "deep-ocean", "pink", "darkpink", "deeppink", "orange", "darkorange", "burntorange", "lime", "darklime", "fruit", "emerald", "darkemerald", "deepemerald", "sapphire", "darksapphire", "deepsapphire", "purple", "darkpurple", "violet", "hotpink", "darkhotpink", "deephotpink"},
    //doors
    doorColors = {"red", "darkred", "crimson", "green", "darkgreen", "poison", "blue", "darkblue", "navy", "white", "black", "yellow", "darkyellow", "runic", "cyan", "darkcyan", "deep-ocean", "pink", "darkpink", "deeppink", "orange", "darkorange", "burntorange", "lime", "darklime", "fruit", "emerald", "darkemerald", "deepemerald", "sapphire", "darksapphire", "deepsapphire", "purple", "darkpurple", "violet", "hotpink", "darkhotpink", "deephotpink"},
    //messages
    messageColors = {"red", "darkred", "blood", "green", "darkgreen", "poison", "blue", "darkblue", "navy", "white", "blank", "black", "yellow", "darkyellow", "runic", "cyan", "darkcyan", "deep-ocean", "pink", "darkpink", "deeppink", "orange", "darkorange", "burntorange", "lime", "darklime", "fruit", "emerald", "darkemerald", "deepemerald", "sapphire", "darksapphire", "deepsapphire", "purple", "darkpurple", "violet", "hotpink", "darkhotpink", "deephotpink"}
    ;

    //block groups
    public static Block[]
    //walls
    smallWalls = new Block[wallColors.length],
    largeWalls = new Block[wallColors.length],
    hugeWalls = new Block[wallColors.length],
    //doors
    smallDoors = new Block[wallColors.length],
    largeDoors = new Block[wallColors.length],
    //messages
    smallMessages = new Block[messageColors.length],
    largeMessages = new Block[messageColors.length],
    hugeMessages = new Block[messageColors.length],
    //stacks
    copperStacks,
    leadStacks,
    metaglassStacks,
    graphiteStacks,
    titaniumStacks,
    siliconStacks,
    plastaniumStacks,
    surgeAlloyStacks,
    pyratiteStacks,
    blastCompoundStacks
    ;
    
    //single blocks
    public static Block
//hex walls
hexWall, hexWallLarge, hexWallColossal,
    
//Slope Slab Stair
hexStair, hexSlope, hexLongSlope1, hexLongSlope2, hexLongSlope3, hexLongSlope4, hexSlab, hexPillar, hexChunk, hexCenterChunk, hexMiddleChunk, hexSpike,

//Oreblocks
sandPile, smallSandPile1, smallSandPile2, coalPile, thoriumPile, scrapPile1, scrapPile2, scrapPile3, scrapPile4, phasePile, sporePodPile, berylliumPile, tungstenPile, oxidePile, carbidePile,

//Imitation terrain walls
darkMetal, darkMetalLarge, dirtWall, dirtWallLarge, duneWall, duneWallLarge, plantWall, plantWallLarge, grassWall, grassWallLarge, iceWall, iceWallLarge, snowWall, snowWallLarge, stoneWall, stoneWallLarge, woodWall, woodWallLarge, sandWall, sandWallLarge, coalWall, coalWallLarge,
    
//distribution
borderlessSorter, darkBorderlessSorter, largeSorter, colossalSorter, largeInvertedSorter, colossalInvertedSorter, largeSource, colossalSource, hexSorter, largeHexSorter, colossalHexSorter, shadowlessSorter, shadowlessLargeSorter, shadowlessColossalSorter, bezeledSorter, bezeledLargeSorter, bezeledColossalSorter, spectralSorter, spectralLargeSorter, spectralColossalSorter, swappedSource, swappedVoid, chiseledSorter1, chiseledSorter2, chiseledSorter3, chiseledSorter4, chiseledSorter5, chiseledSorter6, chiseledSorter7, chiseledSorter8, chiseledSorter9, chiseledSorter10, chiseledSorter11, chiseledSorter12, chiseledSorter13, chiseledSorter14, chiseledSorter15, chiseledSorter16, chiseledSorter17, chiseledSorter18, shadowlessChiseledSorter1, shadowlessChiseledSorter2, shadowlessChiseledSorter3, shadowlessChiseledSorter4, shadowlessChiseledSorter5, shadowlessChiseledSorter6, shadowlessChiseledSorter7, shadowlessChiseledSorter8, shadowlessChiseledSorter9, shadowlessChiseledSorter10, shadowlessChiseledSorter11, shadowlessChiseledSorter12, shadowlessChiseledSorter13, shadowlessChiseledSorter14, shadowlessChiseledSorter15, shadowlessChiseledSorter16, shadowlessChiseledSorter17, shadowlessChiseledSorter18, chiseledInvertedSorter1, chiseledInvertedSorter2, chiseledInvertedSorter3, chiseledInvertedSorter4, chiseledInvertedSorter5, chiseledInvertedSorter6, chiseledInvertedSorter7, chiseledInvertedSorter8, chiseledInvertedSorter9, chiseledInvertedSorter10, chiseledInvertedSorter11, chiseledInvertedSorter12, chiseledInvertedSorter13, chiseledInvertedSorter14, chiseledInvertedSorter15, chiseledInvertedSorter16, chiseledInvertedSorter17, chiseledInvertedSorter18, chiseledSource1, chiseledSource2, chiseledSource3, chiseledSource4, chiseledSource5, chiseledSource6, chiseledSource7, chiseledSource8, chiseledSource9, chiseledSource10, chiseledSource11, chiseledSource12, chiseledSource13, chiseledSource14, chiseledSource15, chiseledSource16, chiseledSource17, chiseledSource18, hexChiseledSorter1, hexChiseledSorter2, hexChiseledSorter3, hexChiseledSorter4, hexChiseledSorter5, hexChiseledSorter6, hexChiseledSorter7, hexChiseledSorter8, hexChiseledSorter9, hexChiseledSorter10, hexChiseledSorter11, hexChiseledSorter12, hexChiseledSorter13, hexChiseledSorter14, hexChiseledSorter15, hexChiseledSorter16, hexChiseledSorter17, hexChiseledSorter18, bezeledChiseledSorter1, bezeledChiseledSorter2, bezeledChiseledSorter3, bezeledChiseledSorter4, bezeledChiseledSorter5, bezeledChiseledSorter6, bezeledChiseledSorter7, bezeledChiseledSorter8, bezeledChiseledSorter9, bezeledChiseledSorter10, bezeledChiseledSorter11, bezeledChiseledSorter12, bezeledChiseledSorter13, bezeledChiseledSorter14, bezeledChiseledSorter15, bezeledChiseledSorter16, bezeledChiseledSorter17, bezeledChiseledSorter18, chiseledSpectralSorter1, chiseledSpectralSorter2, chiseledSpectralSorter3, chiseledSpectralSorter4, chiseledSpectralSorter5, chiseledSpectralSorter6, chiseledSpectralSorter7, chiseledSpectralSorter8, chiseledSpectralSorter9, chiseledSpectralSorter10, chiseledSpectralSorter11, chiseledSpectralSorter12, chiseledSpectralSorter13, chiseledSpectralSorter14, chiseledSpectralSorter15, chiseledSpectralSorter16, chiseledSpectralSorter17, chiseledSpectralSorter18, chiseledDuctRouter1, chiseledDuctRouter2, chiseledDuctRouter3, chiseledDuctRouter4, chiseledDuctRouter5, chiseledDuctRouter6, chiseledDuctRouter7, chiseledDuctRouter8, chiseledDuctRouter9, chiseledDuctRouter10, chiseledDuctRouter11, chiseledDuctRouter12, chiseledDuctRouter13, chiseledDuctRouter14, chiseledDuctRouter15, chiseledDuctRouter16, chiseledDuctRouter17, chiseledDuctRouter18,

//liquid
liquidBlock, borderlessLiquidSource, swappedLiquidSource, swappedLiquidVoid,

//Chiseled MSGs
chiseledMessageSquare, chiseledMessageCircle, chiseledMessageRhombus, chiseledMessageDiamond, chiseledMessageBar, chiseledMessagePlant, chiseledMessageFactory, chiseledMessageAdmin, chiseledMessageDrill, chiseledMessageTurret, chiseledMessageLogic, chiseledMessageUnit, chiseledMessagePower, chiseledMessageWall, chiseledMessageLiquid, chiseledMessageDistribution, chiseledMessageSkull, chiseledMessageVoid, chiseledMessage0, chiseledMessage1, chiseledMessage2, chiseledMessage3, chiseledMessage4, chiseledMessage5, chiseledMessage6, chiseledMessage7, chiseledMessage8, chiseledMessage9, chiseledMessageHouse, chiseledMessageRules, chiseledMessageCore, chiseledMessageTechtree, chiseledMessageImage, chiseledMessageList, chiseledMessageWaves, chiseledMessageTrashcan, chiseledMessageLandscape, chiseledMessageFloors, chiseledMessagePause, chiseledMessagePlay, chiseledMessagePencil, chiseledMessageEraser, chiseledMessageCross, chiseledMessageCrossDiagonal, chiseledMessageHammer, chiseledMessageMap, chiseledMessageBox, chiseledMessageGear, chiseledMessageArrowUp, chiseledMessageArrowDown, chiseledMessageArrowLeft, chiseledMessageArrowRight,

//Screens
screenSmall, screen, screenLarge, borderlessScreenSmall, borderlessScreen, borderlessScreenLarge, hDScreenSmall, hDScreen, hDScreenLarge, hDBorderlessScreenSmall, hDBorderlessScreen, hDBorderlessScreenLarge,

//Switches
invisSwitch,

//Processors
yellowMicroProcessor, cyanMicroProcessor, snailInvisProcessor, slowInvisProcessor, normalInvisProcessor, fastInvisProcessor, hyperInvisProcessor,

//Memory
yellowMemoryCell, cyanMemoryCell,

//Permanent memory
permanentMemoryCell, permanentMemoryBank,

//Hologram displays
smallHologramDisplay, hologramDisplay, largeHologramDisplay, massiveHologramDisplay, colossalHologramDisplay,

//Texture blocks
textureBlock, textureImitator, textureGrid, textureBlockShadowless, textureImitatorShadowless, textureGridShadowless, textureMessageBlock, textureMessageBlockShadowless,

//Lightsource
lightSourceTiny, lightSourceSmall, lightSource, lightSourceLarge, lightSourceHuge,

//Decor
darkerUnloader, vial, hexVial, chain, chainTurn, chainT, chainX, chainD, chainDl, chainDt, chainDx, deChain, deChainL, deChainT, deChainX, deChainD, deChainDl, deChainDt, deChainDx, jointOne, jointTwo, jointThree, jointFour, jointFive, jointSix, jointSeven, jointAOne, jointATwo, jointAThree, jointAFour, jointAFive, jointSOne, jointSTwo, jointSThree, jointSFour,

//Render block
renderBlock
;
    
    public static Block createInert(String name, Category category, int sizeI) {
        return new Block(name){{
            requirements(category, with());
            health = 80 * sizeI * sizeI;
            size = sizeI;
        }};
    }
    
    public static Block[] createStacks(String name) {
        Block[] blocks = new Block[5];
        blocks[0] = createInert(name, Category.production, 1);
        blocks[1] = createInert(name + "s", Category.production, 1);
        blocks[2] = createInert(name + "stacktop", Category.production, 1);
        blocks[3] = createInert(name + "stackmid", Category.production, 1);
        blocks[4] = createInert(name + "stackbottom", Category.production, 1);
        return blocks;
    }
    
    public static void load() {

        for (int i = 0; i < wallColors.length; i++) {
            smallWalls[i] = createInert(wallColors[i] + "-wall", Category.defense, 1);
            largeWalls[i] = createInert("large-" + wallColors[i] + "-wall", Category.defense, 2);
            hugeWalls[i] = createInert("colossal-" + wallColors[i] + "-wall", Category.defense, 3);
        }
        
        hexWall = new HexBlock("hex-wall"){{
            requirements(Category.defense, with());
            health = 80;
            size = 1;
        }};
        
        hexWallLarge = new HexBlock("large-hex-wall"){{
            requirements(Category.defense, with());
            health = 320;
            size = 2;
        }};
        
        hexWallColossal = new HexBlock("colossal-hex-wall"){{
            requirements(Category.defense, with());
           health = 720;
            size = 3;
        }};

        copperStacks = createStacks("copper-bar");
        leadStacks = createStacks("lead-bar");
        metaglassStacks = createStacks("metaglass-block");
        graphiteStacks = createStacks("graphite-block");

        sandPile = createInert("sand-pile", Category.production, 1);
        smallSandPile1 = createInert("small-sand-pile1", Category.production, 1);
        smallSandPile2 = createInert("small-sand-pile2", Category.production, 1);
        coalPile = createInert("coal-pile", Category.production, 1);
        
        titaniumStacks = createStacks("titanium-bar");
        
        thoriumPile = createInert("thorium-pile", Category.production, 1);
        scrapPile1 = createInert("scrap1", Category.production, 1);
        scrapPile2 = createInert("scrap2", Category.production, 1);
        scrapPile3 = createInert("scrap3", Category.production, 1);
        scrapPile4 = createInert("scrap4", Category.production, 1);

        siliconStacks = createStacks("silicon-block");
        plastaniumStacks = createStacks("plastanium-block");

        phasePile = createInert("phase-fabric-pile", Category.production, 1);

        surgeAlloyStacks = createStacks("surge-alloy-bar");

        sporePodPile = createInert("spore-pod-pile", Category.production, 1);

        pyratiteStacks = createStacks("pyratite-block");
        blastCompoundStacks = createStacks("blast-compound-block");
        
        berylliumPile = createInert("beryllium-pile", Category.production, 1);
        tungstenPile = createInert("tungsten-pile", Category.production, 1);
        oxidePile = createInert("oxide-pile", Category.production, 1);
        carbidePile = createInert("carbide-pile", Category.production, 1);
        
        darkMetal = new Wall("dark-metal"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
        }};

        darkMetalLarge = new Wall("dark-metal-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
        }};

        dirtWall = new Wall("dirt-wall"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
        }};

        dirtWallLarge = new Wall("dirt-wall-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
        }};

        duneWall = new Wall("dune-wall"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
        }};

        duneWallLarge = new Wall("dune-wall-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
        }};

        plantWall = new Wall("plant-wall"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
        }};

        plantWallLarge = new Wall("plant-wall-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
        }};

        grassWall = new Wall("grass-wall"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
        }};

        grassWallLarge = new Wall("grass-wall-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
        }};

        iceWall = new Wall("ice-wall"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
        }};

        iceWallLarge = new Wall("ice-wall-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
        }};

        snowWall = new Wall("snow-wall"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
        }};

        snowWallLarge = new Wall("snow-wall-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
        }};

        stoneWall = new Wall("stone-wall"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
        }};

        stoneWallLarge = new Wall("stone-wall-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
        }};

        woodWall = new Wall("wood-wall"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
        }};

        woodWallLarge = new Wall("wood-wall-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
        }};

        sandWall = new Wall("sand-wall"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
        }};

        sandWallLarge = new Wall("sand-wall-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
        }};

        coalWall = new Wall("coal-wall"){{
            requirements(Category.production, with());
            health = 80;
            variants = 2;
        }};

        coalWallLarge = new Wall("coal-wall-large"){{
            requirements(Category.production, with());
            health = 80; 
            size = 2;
        }};

        for (int i = 0; i < doorColors.length; i++) {
            smallDoors[i] = new Door(doorColors[i] + "-door"){{
                requirements(Category.defense, with());
                health = 100;
            }};
            largeDoors[i] = new Door("large-" + doorColors[i] + "-door"){{
                requirements(Category.defense, with());
                health = 400;
            }};
        }

        hexStair = new HexBlock("hex-stair"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 1;
            rotate = true;
        }};

        hexSlope = new HexBlock("hex-slope"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 1;
            rotate = true;
        }};

        hexLongSlope1 = new HexBlock("hex-long-slope1"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 1;
            rotate = true;
        }};

        hexLongSlope2 = new HexBlock("hex-long-slope2"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 1;
            rotate = true;
        }};

        hexLongSlope3 = new HexBlock("hex-long-slope3"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 1;
            rotate = true;
        }};

        hexLongSlope4 = new HexBlock("hex-long-slope4"){{
            requirements(Category.defense, with());
            health = 100; 
            size = 1;
            rotate = true;
        }};

        hexSlab = new HexBlock("hex-slab"){{
            requirements(Category.defense, with());
            health = 100;
            size = 1;
            rotate = true;
        }};

        hexPillar = new HexBlock("hex-pillar"){{
            requirements(Category.defense, with());
            health = 100;
            size = 1;
            rotate = true;
        }};

        hexChunk = new HexBlock("hex-chunk"){{
            requirements(Category.defense, with());
            health = 100;
            size = 1;
            rotate = true;
        }};

        hexCenterChunk = new HexBlock("hex-center-chunk"){{
            requirements(Category.defense, with());
            health = 100;
            size = 1;
            rotate = true;
        }};

        hexMiddleChunk = new HexBlock("hex-middle-chunk"){{
            requirements(Category.defense, with());
            health = 100;
            size = 1;
        }};

        hexSpike = new HexBlock("hex-spike"){{
            requirements(Category.defense, with());
            health = 100;
            size = 1;
            rotate = true;
        }};

        largeSorter = new Sorter("large-sorter"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 2;
        }};

        colossalSorter = new Sorter("colossal-sorter"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 3;
        }};

        largeInvertedSorter = new Sorter("large-inverted-sorter"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            invert = true;
            size = 2;
        }};

        colossalInvertedSorter = new Sorter("colossal-inverted-sorter"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            invert = true;
            size = 3;
        }};

        largeSource = new ItemSource("large-source"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 2;
        }};

        colossalSource = new ItemSource("colossal-source"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 3;
        }};

        borderlessSorter = new Sorter("borderless-sorter"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
        }};

        darkBorderlessSorter = new Unloader("dark-borderless-sorter"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
        }};

        hexSorter = new HexBlock("hex-sorter"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
        }};

        largeHexSorter = new HexBlock("large-hex-sorter"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 2;
        }};

        colossalHexSorter = new HexBlock("colossal-hex-sorter"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 3;
        }};

        shadowlessSorter = new Sorter("shadowless-sorter"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
        }};

        shadowlessLargeSorter = new Sorter("shadowless-large-sorter"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 2; 
            hasShadow = false;
        }};

        shadowlessColossalSorter = new Sorter("shadowless-colossal-sorter"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 3; 
            hasShadow = false;
        }};

        bezeledSorter = new Sorter("bezeled-sorter"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
        }};

        bezeledLargeSorter = new Sorter("bezeled-large-sorter"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 2;
        }};

        bezeledColossalSorter = new Sorter("bezeled-colossal-sorter"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 3;
        }};

        spectralSorter = new Sorter("spectral-sorter"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
        }};

        spectralLargeSorter = new Sorter("spectral-large-sorter"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 2;
        }};

        spectralColossalSorter = new Sorter("spectral-colossal-sorter"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 3;
        }};

        swappedSource = new ItemVoid("swapped-source"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
        }};

        swappedVoid = new ItemSource("swapped-void"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
        }};

        swappedLiquidSource = new LiquidVoid("swapped-liquid-source"){{
            requirements(Category.liquid, with());
            health = 80;
            size = 1;
        }};

        swappedLiquidVoid = new LiquidSource("swapped-liquid-void"){{
            requirements(Category.liquid, with());
            health = 80;
            size = 1;
        }};

        chiseledSorter1 = new Sorter("chiseled-sorter1"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSorter2 = new Sorter("chiseled-sorter2"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSorter3 = new Sorter("chiseled-sorter3"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSorter4 = new Sorter("chiseled-sorter4"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
        }};

        chiseledSorter5 = new Sorter("chiseled-sorter5"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSorter6 = new Sorter("chiseled-sorter6"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSorter7 = new Sorter("chiseled-sorter7"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSorter8 = new Sorter("chiseled-sorter8"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSorter9 = new Sorter("chiseled-sorter9"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSorter10 = new Sorter("chiseled-sorter10"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSorter11 = new Sorter("chiseled-sorter11"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSorter12 = new Sorter("chiseled-sorter12"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSorter13 = new Sorter("chiseled-sorter13"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSorter14 = new Sorter("chiseled-sorter14"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSorter15 = new Sorter("chiseled-sorter15"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSorter16 = new Sorter("chiseled-sorter16"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSorter17 = new Sorter("chiseled-sorter17"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSorter18 = new Sorter("chiseled-sorter18"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
        }};

        shadowlessChiseledSorter1 = new Sorter("shadowless-chiseled-sorter-one"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
        }};

        shadowlessChiseledSorter2 = new Sorter("shadowless-chiseled-sorter-two"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
        }};

        shadowlessChiseledSorter3 = new Sorter("shadowless-chiseled-sorter-three"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
        }};

        shadowlessChiseledSorter4 = new Sorter("shadowless-chiseled-sorter-four"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
        }};

        shadowlessChiseledSorter5 = new Sorter("shadowless-chiseled-sorter-five"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
        }};

        shadowlessChiseledSorter6 = new Sorter("shadowless-chiseled-sorter-six"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
        }};

        shadowlessChiseledSorter7 = new Sorter("shadowless-chiseled-sorter-seven"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
        }};

        shadowlessChiseledSorter8 = new Sorter("shadowless-chiseled-sorter-eight"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
        }};

        shadowlessChiseledSorter9 = new Sorter("shadowless-chiseled-sorter-nine"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
        }};

        shadowlessChiseledSorter10 = new Sorter("shadowless-chiseled-sorter-ten"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
        }};

        shadowlessChiseledSorter11 = new Sorter("shadowless-chiseled-sorter-eleven"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
        }};

        shadowlessChiseledSorter12 = new Sorter("shadowless-chiseled-sorter-twelve"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
        }};

        shadowlessChiseledSorter13 = new Sorter("shadowless-chiseled-sorter-thirteen"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
        }};

        shadowlessChiseledSorter14 = new Sorter("shadowless-chiseled-sorter-fourteen"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
        }};

        shadowlessChiseledSorter15 = new Sorter("shadowless-chiseled-sorter-fifteen"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
        }};

        shadowlessChiseledSorter16 = new Sorter("shadowless-chiseled-sorter-sixteen"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
        }};

        shadowlessChiseledSorter17 = new Sorter("shadowless-chiseled-sorter-seventeen"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
        }};

        shadowlessChiseledSorter18 = new Sorter("shadowless-chiseled-sorter-eightteen"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1; 
            hasShadow = false;
            rotate = true;
        }};

        chiseledInvertedSorter1 = new Sorter("chiseled-inverted-sorter1"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            invert = true;
        }};

        chiseledInvertedSorter2 = new Sorter("chiseled-inverted-sorter2"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            invert = true;
        }};

        chiseledInvertedSorter3 = new Sorter("chiseled-inverted-sorter3"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            rotate = true;
            invert = true;
        }};

        chiseledInvertedSorter4 = new Sorter("chiseled-inverted-sorter4"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
        }};

        chiseledInvertedSorter5 = new Sorter("chiseled-inverted-sorter5"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
        }};

        chiseledInvertedSorter6 = new Sorter("chiseled-inverted-sorter6"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
        }};

        chiseledInvertedSorter7 = new Sorter("chiseled-inverted-sorter7"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
        }};

        chiseledInvertedSorter8 = new Sorter("chiseled-inverted-sorter8"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
        }};

        chiseledInvertedSorter9 = new Sorter("chiseled-inverted-sorter9"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
        }};

        chiseledInvertedSorter10 = new Sorter("chiseled-inverted-sorter10"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
        }};

        chiseledInvertedSorter11 = new Sorter("chiseled-inverted-sorter11"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
        }};

        chiseledInvertedSorter12 = new Sorter("chiseled-inverted-sorter12"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
        }};

        chiseledInvertedSorter13 = new Sorter("chiseled-inverted-sorter13"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
        }};

        chiseledInvertedSorter14 = new Sorter("chiseled-inverted-sorter14"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
        }};

        chiseledInvertedSorter15 = new Sorter("chiseled-inverted-sorter15"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
        }};

        chiseledInvertedSorter16 = new Sorter("chiseled-inverted-sorter16"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
        }};

        chiseledInvertedSorter17 = new Sorter("chiseled-inverted-sorter17"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
        }};

        chiseledInvertedSorter18 = new Sorter("chiseled-inverted-sorter18"){{
            requirements(Category.distribution, with(JavacamodItems.orange, 12));
            health = 80;
            size = 1;
            invert = true;
            rotate = true;
        }};

        chiseledSource1 = new ItemSource("chiseled-source1"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSource2 = new ItemSource("chiseled-source2"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSource3 = new ItemSource("chiseled-source3"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSource4 = new ItemSource("chiseled-source4"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
        }};

        chiseledSource5 = new ItemSource("chiseled-source5"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSource6 = new ItemSource("chiseled-source6"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSource7 = new ItemSource("chiseled-source7"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSource8 = new ItemSource("chiseled-source8"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSource9 = new ItemSource("chiseled-source9"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSource10 = new ItemSource("chiseled-source10"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSource11 = new ItemSource("chiseled-source11"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSource12 = new ItemSource("chiseled-source12"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSource13 = new ItemSource("chiseled-source13"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSource14 = new ItemSource("chiseled-source14"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSource15 = new ItemSource("chiseled-source15"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSource16 = new ItemSource("chiseled-source16"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSource17 = new ItemSource("chiseled-source17"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};
        
        chiseledSource18 = new ItemSource("chiseled-source18"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        hexChiseledSorter1 = new HexBlock("hex-chiseled-sorter1"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        hexChiseledSorter2 = new HexBlock("hex-chiseled-sorter2"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        hexChiseledSorter3 = new HexBlock("hex-chiseled-sorter3"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        hexChiseledSorter4 = new HexBlock("hex-chiseled-sorter4"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        hexChiseledSorter5 = new HexBlock("hex-chiseled-sorter5"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        hexChiseledSorter6 = new HexBlock("hex-chiseled-sorter6"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        hexChiseledSorter7 = new HexBlock("hex-chiseled-sorter7"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        hexChiseledSorter8 = new HexBlock("hex-chiseled-sorter8"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        hexChiseledSorter9 = new HexBlock("hex-chiseled-sorter9"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        hexChiseledSorter10 = new HexBlock("hex-chiseled-sorter10"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        hexChiseledSorter11 = new HexBlock("hex-chiseled-sorter11"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        hexChiseledSorter12 = new HexBlock("hex-chiseled-sorter12"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        hexChiseledSorter13 = new HexBlock("hex-chiseled-sorter13"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        hexChiseledSorter14 = new HexBlock("hex-chiseled-sorter14"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        hexChiseledSorter15 = new HexBlock("hex-chiseled-sorter15"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        hexChiseledSorter16 = new HexBlock("hex-chiseled-sorter16"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        hexChiseledSorter17 = new HexBlock("hex-chiseled-sorter17"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        hexChiseledSorter18 = new HexBlock("hex-chiseled-sorter18"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        bezeledChiseledSorter1 = new Sorter("bezeled-chiseled-sorter-1"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        bezeledChiseledSorter2 = new Sorter("bezeled-chiseled-sorter-2"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        bezeledChiseledSorter3 = new Sorter("bezeled-chiseled-sorter-3"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        bezeledChiseledSorter4 = new Sorter("bezeled-chiseled-sorter-4"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        bezeledChiseledSorter5 = new Sorter("bezeled-chiseled-sorter-5"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        bezeledChiseledSorter6 = new Sorter("bezeled-chiseled-sorter-6"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        bezeledChiseledSorter7 = new Sorter("bezeled-chiseled-sorter-7"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        bezeledChiseledSorter8 = new Sorter("bezeled-chiseled-sorter-8"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        bezeledChiseledSorter9 = new Sorter("bezeled-chiseled-sorter-9"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        bezeledChiseledSorter10 = new Sorter("bezeled-chiseled-sorter-10"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        bezeledChiseledSorter11 = new Sorter("bezeled-chiseled-sorter-11"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        bezeledChiseledSorter12 = new Sorter("bezeled-chiseled-sorter-12"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        bezeledChiseledSorter13 = new Sorter("bezeled-chiseled-sorter-13"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        bezeledChiseledSorter14 = new Sorter("bezeled-chiseled-sorter-14"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        bezeledChiseledSorter15 = new Sorter("bezeled-chiseled-sorter-15"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        bezeledChiseledSorter16 = new Sorter("bezeled-chiseled-sorter-16"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        bezeledChiseledSorter17 = new Sorter("bezeled-chiseled-sorter-17"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSpectralSorter1 = new Sorter("chiseled-spectral-sorter-1"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSpectralSorter2 = new Sorter("chiseled-spectral-sorter-2"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSpectralSorter3 = new Sorter("chiseled-spectral-sorter-3"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSpectralSorter4 = new Sorter("chiseled-spectral-sorter-4"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSpectralSorter5 = new Sorter("chiseled-spectral-sorter-5"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSpectralSorter6 = new Sorter("chiseled-spectral-sorter-6"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSpectralSorter7 = new Sorter("chiseled-spectral-sorter-7"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSpectralSorter8 = new Sorter("chiseled-spectral-sorter-8"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSpectralSorter9 = new Sorter("chiseled-spectral-sorter-9"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSpectralSorter10 = new Sorter("chiseled-spectral-sorter-10"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSpectralSorter11 = new Sorter("chiseled-spectral-sorter-11"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSpectralSorter12 = new Sorter("chiseled-spectral-sorter-12"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSpectralSorter13 = new Sorter("chiseled-spectral-sorter-13"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSpectralSorter14 = new Sorter("chiseled-spectral-sorter-14"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSpectralSorter15 = new Sorter("chiseled-spectral-sorter-15"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSpectralSorter16 = new Sorter("chiseled-spectral-sorter-16"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSpectralSorter17 = new Sorter("chiseled-spectral-sorter-17"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledSpectralSorter18 = new Sorter("chiseled-spectral-sorter-18"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledDuctRouter1 = new Sorter("chiseled-duct-router-1"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledDuctRouter2 = new Sorter("chiseled-duct-router-2"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledDuctRouter3 = new Sorter("chiseled-duct-router-3"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledDuctRouter4 = new Sorter("chiseled-duct-router-4"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledDuctRouter5 = new Sorter("chiseled-duct-router-5"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledDuctRouter6 = new Sorter("chiseled-duct-router-6"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledDuctRouter7 = new Sorter("chiseled-duct-router-7"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledDuctRouter8 = new Sorter("chiseled-duct-router-8"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledDuctRouter9 = new Sorter("chiseled-duct-router-9"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledDuctRouter10 = new Sorter("chiseled-duct-router-10"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledDuctRouter11 = new Sorter("chiseled-duct-router-11"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledDuctRouter12 = new Sorter("chiseled-duct-router-12"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledDuctRouter13 = new Sorter("chiseled-duct-router-13"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledDuctRouter14 = new Sorter("chiseled-duct-router-14"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledDuctRouter15 = new Sorter("chiseled-duct-router-15"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledDuctRouter16 = new Sorter("chiseled-duct-router-16"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledDuctRouter17 = new Sorter("chiseled-duct-router-17"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
        }};

        chiseledDuctRouter18 = new Sorter("chiseled-duct-router-18"){{
            requirements(Category.distribution, with());
            health = 80;
            size = 1;
            rotate = true;
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

        for (int i = 0; i < messageColors.length; i++) {
            smallMessages[i] = new MessageBlock(messageColors[i] + "-message"){{
                requirements(Category.logic, with());
                maxTextLength = 22000;
            }};
            largeMessages[i] = new MessageBlock("large-" + messageColors[i] + "-message"){{
                requirements(Category.logic, with());
                maxTextLength = 22000;
                size = 2;
            }};
            hugeMessages[i] = new MessageBlock("colossal-" + messageColors[i] + "-message"){{
                requirements(Category.logic, with());
                maxTextLength = 22000;
                size = 3;
            }};
        }

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

        hDScreenSmall = new ScreenBlock("hd-screen-small"){{
            requirements(Category.logic, with());
            size = 1;
            hasShadow = false;
            screenSize = 16;
        }};

        hDScreen = new ScreenBlock("hd-screen"){{
            requirements(Category.logic, with());
            size = 2;
            hasShadow = false;
            screenSize = 32;
        }};

        hDScreenLarge = new ScreenBlock("hd-screen-large"){{
            requirements(Category.logic, with());
            size = 3;
            hasShadow = false;
            screenSize = 48;
        }};

        hDBorderlessScreenSmall = new ScreenBlock("hd-borderless-screen-small"){{
            requirements(Category.logic, with());
            size = 1;
            hasShadow = false;
            screenSize = 16;
        }};

        hDBorderlessScreen = new ScreenBlock("hd-borderless-screen"){{
            requirements(Category.logic, with());
            size = 2;
            hasShadow = false;
            screenSize = 32;
        }};

        hDBorderlessScreenLarge = new ScreenBlock("hd-borderless-screen-large"){{
            requirements(Category.logic, with());
            size = 3;
            hasShadow = false;
            screenSize = 48;
        }};

        invisSwitch = new SwitchBlock("invis-switch"){{
            requirements(Category.logic, with());
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

        snailInvisProcessor = new LogicBlock("snail-invis-processor"){{
            requirements(Category.logic, with());
            size = 1;
            range = 2000;
            instructionsPerTick = 25;
        }};

        slowInvisProcessor = new LogicBlock("slow-invis-processor"){{
            requirements(Category.logic, with());
            size = 1;
            range = 2000;
            instructionsPerTick = 50;
        }};

        normalInvisProcessor = new LogicBlock("normal-invis-processor"){{
            requirements(Category.logic, with());
            size = 1;
            range = 2000;
            instructionsPerTick = 100;
        }};

        fastInvisProcessor = new LogicBlock("fast-invis-processor"){{
            requirements(Category.logic, with());
            size = 1;
            range = 2000;
            instructionsPerTick = 250;
        }};

        hyperInvisProcessor = new LogicBlock("hyper-invis-processor"){{
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

        smallHologramDisplay = new LogicDisplay("small-hologram-display"){{
            requirements(Category.logic, with());
            size = 1;
            displaySize = 96;
        }};

        hologramDisplay = new LogicDisplay("hologram-display"){{
            requirements(Category.logic, with());
            size = 1;
            displaySize = 160;
        }};

        largeHologramDisplay = new LogicDisplay("large-hologram-display"){{
            requirements(Category.logic, with());
            size = 1;
            displaySize = 224;
        }};

        massiveHologramDisplay = new LogicDisplay("massive-hologram-display"){{
            requirements(Category.logic, with());
            size = 1;
            displaySize = 288;
        }};
        
        colossalHologramDisplay = new LogicDisplay("colossal-hologram-display"){{
            requirements(Category.logic, with());
            size = 1;
            displaySize = 352;
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

        textureBlockShadowless = new TextureBlock("texture-block-shadowless"){{
            requirements(Category.defense, with());
            rotate = true;
            hasShadow = false;
        }};

        textureImitatorShadowless = new TextureBlock("texture-imitator-shadowless"){{
            requirements(Category.defense, with());
            rotate = true;
            hasShadow = false;
            size = 4;
        }};

        textureGridShadowless = new TextureBlock("texture-grid-shadowless"){{
            requirements(Category.defense, with());
            rotate = true;
            hasShadow = false;
            size = 16;
        }};

        textureMessageBlock = new TextureMessageBlock("texture-message-block"){{
            requirements(Category.logic, with());
            rotate = true;
        }};

        textureMessageBlockShadowless = new TextureMessageBlock("texture-message-block-shadowless"){{
            requirements(Category.logic, with());
            rotate = true;
            hasShadow = false;
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

        darkerUnloader = new Unloader("darker-unloader"){{
            requirements(Category.effect, with());
            size = 1;
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
        }};

        chain = new HexBlock("chain"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        chainTurn = new HexBlock("chain-turn"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        chainT = new HexBlock("chain-t"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        chainX = new HexBlock("chain-x"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        chainD = new HexBlock("chain-d"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        chainDl = new HexBlock("chain-dl"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        chainDt = new HexBlock("chain-dt"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
        }};

        chainDx = new HexBlock("chain-dx"){{
            requirements(Category.effect, with());
            size = 1;
            rotate = true;
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

        permanentMemoryCell = new DataBlock("permanent-memory-cell"){{
            requirements(Category.logic, with());
            size = 1;
            memoryCapacity = 64;
        }};

        permanentMemoryBank = new DataBlock("permanent-memory-bank"){{
            requirements(Category.logic, with());
            size = 2;
            memoryCapacity = 512;
        }};

        renderBlock = new RenderBlock("render-block"){{
            requirements(Category.logic, with());
            size = 1;
        }};


    }
}
