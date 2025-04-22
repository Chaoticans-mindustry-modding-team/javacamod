package javacamod.content;

import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;

import javacamod.world.blocks.logic.*;
import javacamod.world.blocks.decoration.*;
//import javacamod.world.blocks.distribution.*;

import static mindustry.type.ItemStack.*;

@SuppressWarnings("deprecation")
public class JavacamodBlocks{
    //namesets
    public static String[]
    //color names
    //walls
    wallColors = {"red", "darkred", "crimson", "green", "darkgreen", "poison", "blue", "darkblue", "navy", "white", "lightgray", "blackishwhite", "darkgray", "black", "yellow", "dark-yellow", "runic", "cyan", "dark-cyan", "deep-ocean", "pink", "dark-pink", "deep-pink", "orange", "dark-orange", "burnt-orange", "lime", "dark-lime", "fruit", "emerald", "dark-emerald", "deep-emerald", "sapphire", "dark-sapphire", "deep-sapphire", "purple", "dark-purple", "violet", "hotpink", "dark-hotpink", "deep-hotpink"},
    //doors
    doorColors = {"red", "darkred", "crimson", "green", "darkgreen", "poison", "blue", "darkblue", "navy", "white", "black", "yellow", "darkyellow", "runic", "cyan", "darkcyan", "deep-ocean", "pink", "darkpink", "deeppink", "orange", "darkorange", "burntorange", "lime", "darklime", "fruit", "emerald", "darkemerald", "deepemerald", "sapphire", "darksapphire", "deepsapphire", "purple", "darkpurple", "violet", "hotpink", "darkhotpink", "deephotpink"},
    //messages
    messageColors = {"red", "darkred", "blood", "green", "darkgreen", "poison", "blue", "darkblue", "navy", "white", "blank", "black", "yellow", "darkyellow", "runic", "cyan", "darkcyan", "deep-ocean", "pink", "darkpink", "deeppink", "orange", "darkorange", "burntorange", "lime", "darklime", "fruit", "emerald", "darkemerald", "deepemerald", "sapphire", "darksapphire", "deepsapphire", "purple", "darkpurple", "violet", "hotpink", "darkhotpink", "deephotpink"},
    
    //terrain types
    terrains = {"dark-metal", "dirt-wall", "dune-wall", "plant-wall", "grass-wall", "ice-wall", "snow-wall", "stone-wall", "wood-wall", "sand-wall", "coal-wall"},
    
    //chiseled message forms
    messageChisels = {"square", "circle", "rhombus", "diamond", "bar", "plant", "factory", "admin", "drill", "turret", "logic", "unit", "power", "wall", "liquid", "distribution", "skull", "void", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "house", "rules", "core", "techtree", "image", "list", "waves", "trashcan", "landscape", "floors", "pause", "play", "pencil", "eraser", "cross", "cross-diagonal", "hammer", "map", "box", "gear", "arrow-up", "arrow-down", "arrow-left", "arrow-right"}
    ;

    //block groups
    public static Block[]
    //walls
    smallWalls = new Block[wallColors.length],
    largeWalls = new Block[wallColors.length],
    hugeWalls = new Block[wallColors.length],
    //doors
    smallDoors = new Block[doorColors.length],
    largeDoors = new Block[doorColors.length],
    //messages
    smallMessages = new Block[messageColors.length],
    largeMessages = new Block[messageColors.length],
    hugeMessages = new Block[messageColors.length],
    
    chiseledMessages = new Block[messageChisels.length],
    //terrain
    smallTerrains = new Block[terrains.length],
    largeTerrains = new Block[terrains.length],
    //distribution
    chiseledSorters = new Block[18],
    shadowlessChiseledSorters = new Block[18],
    chiseledInvertedSorters = new Block[18],
    chiseledSources = new Block[18],
    hexChiseledSorters = new Block[18],
    bezeledChiseledSorters = new Block[18],
    chiseledSpectralSorters = new Block[18],
    chiseledDuctRouters = new Block[18],
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

//piles
sandPile, smallSandPile1, smallSandPile2, coalPile, thoriumPile, scrapPile1, scrapPile2, scrapPile3, scrapPile4, phasePile, sporePodPile, berylliumPile, tungstenPile, oxidePile, carbidePile,

//distribution
borderlessSorter, darkBorderlessSorter, largeSorter, colossalSorter, largeInvertedSorter, colossalInvertedSorter, largeSource, colossalSource, hexSorter, largeHexSorter, colossalHexSorter, shadowlessSorter, shadowlessLargeSorter, shadowlessColossalSorter, bezeledSorter, bezeledLargeSorter, bezeledColossalSorter, spectralSorter, spectralLargeSorter, spectralColossalSorter, swappedSource, swappedVoid,

//liquid
liquidBlock, borderlessLiquidSource, swappedLiquidSource, swappedLiquidVoid,

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
    
    public static Block createInert(String name, Category categoryI, int sizeI) {
        return new Block(name){{
            requirements(categoryI, with());
            category = categoryI;
		    destructible = true;
            health = 80 * sizeI * sizeI;
            size = sizeI;
        }};
    }
    
    public static Block createRotatable(String name, Category categoryI, int sizeI) {
        return new Block(name){{
            requirements(categoryI, with());
            category = categoryI;
		    destructible = true;
            health = 80 * sizeI * sizeI;
            size = sizeI;
            rotate = true;
        }};
    }
    
    public static Block[] createStacks(String name) {
        Block[] blocks = new Block[5];
        blocks[0] = createRotatable(name, Category.production, 1);
        blocks[1] = createRotatable(name + "s", Category.production, 1);
        blocks[2] = createRotatable(name + "stacktop", Category.production, 1);
        blocks[3] = createRotatable(name + "stackmid", Category.production, 1);
        blocks[4] = createRotatable(name + "stackbottom", Category.production, 1);
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

        sandPile = createRotatable("sand-pile", Category.production, 1);
        smallSandPile1 = createRotatable("small-sand-pile1", Category.production, 1);
        smallSandPile2 = createRotatable("small-sand-pile2", Category.production, 1);
        coalPile = createRotatable("coal-pile", Category.production, 1);
        
        titaniumStacks = createStacks("titanium-bar");
        
        thoriumPile = createRotatable("thorium-pile", Category.production, 1);
        scrapPile1 = createRotatable("scrap1", Category.production, 1);
        scrapPile2 = createRotatable("scrap2", Category.production, 1);
        scrapPile3 = createRotatable("scrap3", Category.production, 1);
        scrapPile4 = createRotatable("scrap4", Category.production, 1);

        siliconStacks = createStacks("silicon-block");
        plastaniumStacks = createStacks("plastanium-block");

        phasePile = createRotatable("phase-fabric-pile", Category.production, 1);

        surgeAlloyStacks = createStacks("surge-alloy-bar");

        sporePodPile = createRotatable("spore-pod-pile", Category.production, 1);

        pyratiteStacks = createStacks("pyratite-block");
        blastCompoundStacks = createStacks("blast-compound-block");
        
        berylliumPile = createRotatable("beryllium-pile", Category.production, 1);
        tungstenPile = createRotatable("tungsten-pile", Category.production, 1);
        oxidePile = createRotatable("oxide-pile", Category.production, 1);
        carbidePile = createRotatable("carbide-pile", Category.production, 1);
        
        for (int i = 0; i < terrains.length; i++) {
            smallTerrains[i] = new Block(terrains[i]){{
                requirements(Category.production, with());
                health = 80;
                variants = 2;
            }};
            largeTerrains[i] = createInert(terrains[i] + "-large", Category.production, 2);
        }
        
        for (int i = 0; i < doorColors.length; i++) {
            smallDoors[i] = new Door(doorColors[i] + "-door"){{
                requirements(Category.defense, with());
                health = 100;
            }};
            largeDoors[i] = new Door("large-" + doorColors[i] + "-door"){{
                requirements(Category.defense, with());
                health = 400;
                size = 2;
            }};
        }
        
        hexStair = new HexBlock("hex-stair"){{
            requirements(Category.defense, with());
            health = 100; 
            rotate = true;
        }};

        hexSlope = new HexBlock("hex-slope"){{
            requirements(Category.defense, with());
            health = 100; 
            rotate = true;
        }};

        hexLongSlope1 = new HexBlock("hex-long-slope1"){{
            requirements(Category.defense, with());
            health = 100; 
            rotate = true;
        }};

        hexLongSlope2 = new HexBlock("hex-long-slope2"){{
            requirements(Category.defense, with());
            health = 100; 
            rotate = true;
        }};

        hexLongSlope3 = new HexBlock("hex-long-slope3"){{
            requirements(Category.defense, with());
            health = 100; 
            rotate = true;
        }};

        hexLongSlope4 = new HexBlock("hex-long-slope4"){{
            requirements(Category.defense, with());
            health = 100; 
            rotate = true;
        }};

        hexSlab = new HexBlock("hex-slab"){{
            requirements(Category.defense, with());
            health = 100;
            rotate = true;
        }};

        hexPillar = new HexBlock("hex-pillar"){{
            requirements(Category.defense, with());
            health = 100;
            rotate = true;
        }};

        hexChunk = new HexBlock("hex-chunk"){{
            requirements(Category.defense, with());
            health = 100;
            rotate = true;
        }};

        hexCenterChunk = new HexBlock("hex-center-chunk"){{
            requirements(Category.defense, with());
            health = 100;
            rotate = true;
        }};

        hexMiddleChunk = new HexBlock("hex-middle-chunk"){{
            requirements(Category.defense, with());
            health = 100;
        }};

        hexSpike = new HexBlock("hex-spike"){{
            requirements(Category.defense, with());
            health = 100;
            rotate = true;
        }};

        largeSorter = new Sorter("large-sorter"){{
            requirements(Category.distribution, with());
            health = 320;
            size = 2;
        }};

        colossalSorter = new Sorter("colossal-sorter"){{
            requirements(Category.distribution, with());
            health = 720;
            size = 3;
        }};

        largeInvertedSorter = new Sorter("large-inverted-sorter"){{
            requirements(Category.distribution, with());
            health = 80;
            invert = true;
            size = 2;
        }};

        colossalInvertedSorter = new Sorter("colossal-inverted-sorter"){{
            requirements(Category.distribution, with());
            health = 80;
            invert = true;
            size = 3;
        }};

        largeSource = new ItemSource("large-source"){{
            requirements(Category.distribution, with());
            health = 320;
            size = 2;
        }};

        colossalSource = new ItemSource("colossal-source"){{
            requirements(Category.distribution, with());
            health = 720;
            size = 3;
        }};

        borderlessSorter = new Sorter("borderless-sorter"){{
            requirements(Category.distribution, with());
            health = 80;
        }};

        darkBorderlessSorter = new Unloader("dark-borderless-sorter"){{
            requirements(Category.distribution, with());
            health = 80;
        }};

        hexSorter = new HexBlock("hex-sorter"){{
            requirements(Category.distribution, with());
            health = 80;
        }};

        largeHexSorter = new HexBlock("large-hex-sorter"){{
            requirements(Category.distribution, with());
            health = 320;
            size = 2;
        }};

        colossalHexSorter = new HexBlock("colossal-hex-sorter"){{
            requirements(Category.distribution, with());
            health = 720;
            size = 3;
        }};

        shadowlessSorter = new Sorter("shadowless-sorter"){{
            requirements(Category.distribution, with());
            health = 80; 
            hasShadow = false;
        }};

        shadowlessLargeSorter = new Sorter("shadowless-large-sorter"){{
            requirements(Category.distribution, with());
            health = 320;
            size = 2; 
            hasShadow = false;
        }};

        shadowlessColossalSorter = new Sorter("shadowless-colossal-sorter"){{
            requirements(Category.distribution, with());
            health = 720;
            size = 3; 
            hasShadow = false;
        }};

        bezeledSorter = new Sorter("bezeled-sorter"){{
            requirements(Category.distribution, with());
            health = 80;
        }};

        bezeledLargeSorter = new Sorter("bezeled-large-sorter"){{
            requirements(Category.distribution, with());
            health = 320;
            size = 2;
        }};

        bezeledColossalSorter = new Sorter("bezeled-colossal-sorter"){{
            requirements(Category.distribution, with());
            health = 720;
            size = 3;
        }};

        spectralSorter = new Sorter("spectral-sorter"){{
            requirements(Category.distribution, with());
            health = 80;
        }};

        spectralLargeSorter = new Sorter("spectral-large-sorter"){{
            requirements(Category.distribution, with());
            health = 320;
            size = 2;
        }};

        spectralColossalSorter = new Sorter("spectral-colossal-sorter"){{
            requirements(Category.distribution, with());
            health = 720;
            size = 3;
        }};

        swappedSource = new ItemVoid("swapped-source"){{
            requirements(Category.distribution, with());
            health = 80;
        }};

        swappedVoid = new ItemSource("swapped-void"){{
            requirements(Category.distribution, with());
            health = 80;
        }};

        swappedLiquidSource = new LiquidVoid("swapped-liquid-source"){{
            requirements(Category.liquid, with());
            health = 80;
        }};

        swappedLiquidVoid = new LiquidSource("swapped-liquid-void"){{
            requirements(Category.liquid, with());
            health = 80;
        }};

        for (int i = 0; i < chiseledSorters.length; i++) {
            chiseledSorters[i] = new Sorter("chiseled-sorter" + (i + 1)){{
                requirements(Category.distribution, with());
                health = 80;
                rotate = true;
            }};
        }

        for (int i = 0; i < shadowlessChiseledSorters.length; i++) {
            shadowlessChiseledSorters[i] = new Sorter("shadowless-chiseled-sorter-" + (i + 1)){{
                requirements(Category.distribution, with());
                health = 80;
                rotate = true;
                
                hasShadow = false;
            }};
        }

        for (int i = 0; i < chiseledInvertedSorters.length; i++) {
            chiseledInvertedSorters[i] = new Sorter("chiseled-inverted-sorter" + (i + 1)){{
                requirements(Category.distribution, with());
                health = 80;
                rotate = true;
                
                invert = true;
            }};
        }

        for (int i = 0; i < chiseledSources.length; i++) {
            chiseledSources[i] = new ItemSource("chiseled-source" + (i + 1)){{
                requirements(Category.distribution, with());
                health = 80;
                rotate = true;
            }};
        }

        for (int i = 0; i < hexChiseledSorters.length; i++) {
            hexChiseledSorters[i] = new HexBlock("hex-chiseled-sorter" + (i + 1)){{
                requirements(Category.distribution, with());
                health = 80;
                rotate = true;
            }};
        }

        for (int i = 0; i < bezeledChiseledSorters.length; i++) {
            bezeledChiseledSorters[i] = new Sorter("bezeled-chiseled-sorter-" + (i + 1)){{
                requirements(Category.distribution, with());
                health = 80;
                rotate = true;
            }};
        }

        for (int i = 0; i < chiseledSpectralSorters.length; i++) {
            chiseledSpectralSorters[i] = new Sorter("chiseled-spectral-sorter-" + (i + 1)){{
                requirements(Category.distribution, with());
                health = 80;
                rotate = true;
            }};
        }

        for (int i = 0; i < chiseledDuctRouters.length; i++) {
            chiseledDuctRouters[i] = new Sorter("chiseled-duct-router-" + (i + 1)){{
                requirements(Category.distribution, with());
                health = 80;
                rotate = true;
            }};
        }
        
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

        for (int i = 0; i < messageChisels.length; i++) {
            chiseledMessages[i] = new MessageBlock("chiseled-message-" + messageChisels[i]){{
                requirements(Category.logic, with());
                maxTextLength = 22000;
            }};
        }

        screenSmall = new ScreenBlock("screen-small"){{
            requirements(Category.logic, with());
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
            range = 2000;
            instructionsPerTick = 500;
        }};

        cyanMicroProcessor = new LogicBlock("cyan-micro-processor"){{
            requirements(Category.logic, with());
            range = 2000;
            instructionsPerTick = 500;
        }};

        snailInvisProcessor = new LogicBlock("snail-invis-processor"){{
            requirements(Category.logic, with());
            range = 2000;
            instructionsPerTick = 25;
        }};

        slowInvisProcessor = new LogicBlock("slow-invis-processor"){{
            requirements(Category.logic, with());
            range = 2000;
            instructionsPerTick = 50;
        }};

        normalInvisProcessor = new LogicBlock("normal-invis-processor"){{
            requirements(Category.logic, with());
            range = 2000;
            instructionsPerTick = 100;
        }};

        fastInvisProcessor = new LogicBlock("fast-invis-processor"){{
            requirements(Category.logic, with());
            range = 2000;
            instructionsPerTick = 250;
        }};

        hyperInvisProcessor = new LogicBlock("hyper-invis-processor"){{
            requirements(Category.logic, with());
            range = 2000;
            instructionsPerTick = 500;
        }};

        yellowMemoryCell = new MemoryBlock("yellow-memory-cell"){{
            requirements(Category.logic, with());
            memoryCapacity = 2048;
        }};

        cyanMemoryCell = new MemoryBlock("cyan-memory-cell"){{
            requirements(Category.logic, with());
            memoryCapacity = 2048;
        }};

        smallHologramDisplay = new LogicDisplay("small-hologram-display"){{
            requirements(Category.logic, with());
            displaySize = 96;
        }};

        hologramDisplay = new LogicDisplay("hologram-display"){{
            requirements(Category.logic, with());
            displaySize = 160;
        }};

        largeHologramDisplay = new LogicDisplay("large-hologram-display"){{
            requirements(Category.logic, with());
            displaySize = 224;
        }};

        massiveHologramDisplay = new LogicDisplay("massive-hologram-display"){{
            requirements(Category.logic, with());
            displaySize = 288;
        }};
        
        colossalHologramDisplay = new LogicDisplay("colossal-hologram-display"){{
            requirements(Category.logic, with());
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
            radius = 50;
            brightness = 100;
        }};

        lightSourceSmall = new LightBlock("small-light-source"){{
            requirements(Category.power, with());
            radius = 100;
            brightness = 100;
        }};

        lightSource = new LightBlock("light-source"){{
            requirements(Category.power, with());
            radius = 200;
            brightness = 100;
        }};

        lightSourceLarge = new LightBlock("large-light-source"){{
            requirements(Category.power, with());
            radius = 300;
            brightness = 100;
        }};

        lightSourceHuge = new LightBlock("huge-light-source"){{
            requirements(Category.power, with());
            radius = 400;
            brightness = 100;
        }};

        darkerUnloader = new Unloader("darker-unloader"){{
            requirements(Category.effect, with());
        }};

        vial = new Sorter("vial"){{
            requirements(Category.effect, with());
            rotate = true;
        }};

        hexVial = new HexBlock("hex-vial"){{
            requirements(Category.effect, with());
            rotate = true;
        }};

        chain = new HexBlock("chain"){{
            requirements(Category.effect, with());
            rotate = true;
        }};

        chainTurn = new HexBlock("chain-turn"){{
            requirements(Category.effect, with());
            rotate = true;
        }};

        chainT = new HexBlock("chain-t"){{
            requirements(Category.effect, with());
            rotate = true;
        }};

        chainX = new HexBlock("chain-x"){{
            requirements(Category.effect, with());
            rotate = true;
        }};

        chainD = new HexBlock("chain-d"){{
            requirements(Category.effect, with());
            rotate = true;
        }};

        chainDl = new HexBlock("chain-dl"){{
            requirements(Category.effect, with());
            rotate = true;
        }};

        chainDt = new HexBlock("chain-dt"){{
            requirements(Category.effect, with());
            rotate = true;
        }};

        chainDx = new HexBlock("chain-dx"){{
            requirements(Category.effect, with());
            rotate = true;
        }};

        deChain = createRotatable("de-chain", Category.effect, 1);
        deChainL = createRotatable("de-chain-l", Category.effect, 1);
        deChainT = createRotatable("de-chain-t", Category.effect, 1);
        deChainX = createRotatable("de-chain-x", Category.effect, 1);
        deChainD = createRotatable("de-chain-d", Category.effect, 1);
        deChainDl = createRotatable("de-chain-dl", Category.effect, 1);
        deChainDt = createRotatable("de-chain-dt", Category.effect, 1);
        deChainDx = createRotatable("de-chain-dx", Category.effect, 1);

        jointOne = createRotatable("joint-one", Category.effect, 1);
        jointTwo = createRotatable("joint-two", Category.effect, 1);
        jointThree = createRotatable("joint-three", Category.effect, 1);
        jointFour = createRotatable("joint-four", Category.effect, 1);
        jointFive = createRotatable("joint-five", Category.effect, 1);
        jointSix = createRotatable("joint-six", Category.effect, 1);
        jointSeven = createRotatable("joint-seven", Category.effect, 1);

        jointAOne = createRotatable("joint-a-one", Category.effect, 1);
        jointATwo = createRotatable("joint-a-two", Category.effect, 1);
        jointAThree = createRotatable("joint-a-three", Category.effect, 1);
        jointAFour = createRotatable("joint-a-four", Category.effect, 1);
        jointAFive = createRotatable("joint-a-five", Category.effect, 1);

        jointSOne = createRotatable("joint-s-one", Category.effect, 1);
        jointSTwo = createRotatable("joint-s-two", Category.effect, 1);
        jointSThree = createRotatable("joint-s-three", Category.effect, 1);
        jointSFour = createRotatable("joint-s-four", Category.effect, 1);

        permanentMemoryCell = new DataBlock("permanent-memory-cell"){{
            requirements(Category.logic, with());
            memoryCapacity = 64;
        }};

        permanentMemoryBank = new DataBlock("permanent-memory-bank"){{
            requirements(Category.logic, with());
            size = 2;
            memoryCapacity = 512;
        }};

        renderBlock = new RenderBlock("render-block"){{
            requirements(Category.logic, with());
        }};


    }
}
