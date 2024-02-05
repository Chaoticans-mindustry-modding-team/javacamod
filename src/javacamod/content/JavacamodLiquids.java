package javacamod.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class JavacamodLiquids{
    public static Liquid
    liquidRed, liquidDarkred, blood, liquidGreen, liquidDarkgreen, liquidPoison, liquidBlue, liquidDarkblue, liquidNavy, liquidBlack, liquidWhite, liquidLightgray, liquidGray, liquidDarkgray, ectoplasm1, ectoplasm2, ectoplasm3, liquidClear, liquidYellow, liquidDarkYellow, liquidRunic, liquidCyan, liquidDarkCyan, liquidDeepOcean, liquidPink, liquidDarkPink, liquidDeepPink, liquidOrange, liquidDarkOrange, liquidBurntOrange, liquidLime, liquidDarkLime, liquidFruit, liquidEmerald, liquidDarkEmerald, liquidDeepEmerald, liquidSapphire, liquidDarkSapphire, liquidDeepSapphire, venom, darkVenom, liquidDeath, liquidHotpink, liquidDarkHotpink, liquidDeepHotpink, liquidFemboy, liquidCrab, liquidUrog, liquidCanblack, liquidCanred, liquidCanorange, liquidCanyellow, liquidCanblue, liquidCanteal, liquidCangreen, liquidCanwhite; 


    public static void load(){
      liquidRed = new Liquid("liquid-red", Color.valueOf("ff0000")){{
          alwaysUnlocked = true;
      }};

      liquidDarkred = new Liquid("liquid-darkred", Color.valueOf("770000")){{
          alwaysUnlocked = true;
      }};

      blood = new Liquid("blood", Color.valueOf("300000")){{
          alwaysUnlocked = true;
      }};
      
      liquidGreen = new Liquid("liquid-green", Color.valueOf("00ff00")){{
          alwaysUnlocked = true;
      }};

      liquidDarkgreen = new Liquid("liquid-darkgreen", Color.valueOf("007700")){{
          alwaysUnlocked = true;
      }};

      liquidPoison = new Liquid("liquid-poison", Color.valueOf("003000")){{
          alwaysUnlocked = true;
      }};

      liquidBlue = new Liquid("liquid-blue", Color.valueOf("0000ff")){{
          alwaysUnlocked = true;
      }};

      liquidDarkblue = new Liquid("liquid-darkblue", Color.valueOf("000077")){{
          alwaysUnlocked = true;
      }};

      liquidNavy = new Liquid("liquid-navy", Color.valueOf("000030")){{
          alwaysUnlocked = true;
      }};

      liquidBlack = new Liquid("liquid-black", Color.valueOf("000000")){{
          alwaysUnlocked = true;
      }};

      liquidWhite = new Liquid("liquid-white", Color.valueOf("ffffff")){{
          alwaysUnlocked = true;
      }};

      liquidLightgray = new Liquid("liquid-lightgray", Color.valueOf("bbbbbb")){{
          alwaysUnlocked = true;
      }};

      liquidGray = new Liquid("liquid-gray", Color.valueOf("777777")){{
          alwaysUnlocked = true;
      }};

      liquidDarkgray = new Liquid("liquid-darkgray", Color.valueOf("303030")){{
          alwaysUnlocked = true;
      }};

      ectoplasm1 = new Liquid("ectoplasm-one", Color.valueOf("aaaaaabb")){{
          alwaysUnlocked = true;
      }};

      ectoplasm2 = new Liquid("ectoplasm-two", Color.valueOf("aaaaaa88")){{
          alwaysUnlocked = true;
      }};

      ectoplasm3 = new Liquid("ectoplasm-three", Color.valueOf("aaaaaa44")){{
          alwaysUnlocked = true;
      }};

      liquidClear = new Liquid("liquid-clear", Color.valueOf("aaaaaa00")){{
          alwaysUnlocked = true;
      }};

      liquidYellow = new Liquid("liquid-yellow", Color.valueOf("ffff00")){{
          alwaysUnlocked = true;
      }};

      liquidDarkYellow = new Liquid("liquid-dark-yellow", Color.valueOf("777700")){{
          alwaysUnlocked = true;
      }};

      liquidRunic = new Liquid("liquid-runic", Color.valueOf("303000")){{
          alwaysUnlocked = true;
      }};

      liquidCyan = new Liquid("liquid-cyan", Color.valueOf("00ffff")){{
          alwaysUnlocked = true;
      }};

      liquidDarkCyan = new Liquid("liquid-dark-cyan", Color.valueOf("007777")){{
          alwaysUnlocked = true;
      }};

      liquidDeepOcean = new Liquid("liquid-deep-ocean", Color.valueOf("003030")){{
          alwaysUnlocked = true;
      }};

      liquidPink = new Liquid("liquid-pink", Color.valueOf("ff00ff")){{
          alwaysUnlocked = true;
      }};

      liquidDarkPink = new Liquid("liquid-dark-pink", Color.valueOf("770077")){{
          alwaysUnlocked = true;
      }};

      liquidDeepPink = new Liquid("liquid-deep-pink", Color.valueOf("300030")){{
          alwaysUnlocked = true;
      }};

      liquidOrange = new Liquid("liquid-orange", Color.valueOf("ff6600")){{
          alwaysUnlocked = true;
      }};

      liquidDarkOrange = new Liquid("liquid-dark-orange", Color.valueOf("774400")){{
          alwaysUnlocked = true;
      }};

      liquidBurntOrange = new Liquid("liquid-burnt-orange", Color.valueOf("302200")){{
          alwaysUnlocked = true;
      }};

      liquidLime = new Liquid("liquid-lime", Color.valueOf("66ff00")){{
          alwaysUnlocked = true;
      }};

      liquidDarkLime = new Liquid("liquid-dark-lime", Color.valueOf("447700")){{
          alwaysUnlocked = true;
      }};

      liquidFruit = new Liquid("liquid-fruit", Color.valueOf("223000")){{
          alwaysUnlocked = true;
      }};

      liquidEmerald = new Liquid("liquid-emerald", Color.valueOf("00ff66")){{
          alwaysUnlocked = true;
      }};

      liquidDarkEmerald = new Liquid("liquid-dark-emerald", Color.valueOf("007744")){{
          alwaysUnlocked = true;
      }};

      liquidDeepEmerald = new Liquid("liquid-deep-emerald", Color.valueOf("003022")){{
          alwaysUnlocked = true;
      }};

      liquidSapphire = new Liquid("liquid-sapphire", Color.valueOf("0066ff")){{
          alwaysUnlocked = true;
      }};

      liquidDarkSapphire = new Liquid("liquid-dark-sapphire", Color.valueOf("004477")){{
          alwaysUnlocked = true;
      }};

      liquidDeepSapphire = new Liquid("liquid-deep-sapphire", Color.valueOf("002230")){{
          alwaysUnlocked = true;
      }};

      venom = new Liquid("venom", Color.valueOf("6600ff")){{
          alwaysUnlocked = true;
      }};

      darkVenom = new Liquid("dark-venom", Color.valueOf("440077")){{
          alwaysUnlocked = true;
      }};

      liquidDeath = new Liquid("liquid-death", Color.valueOf("220030")){{
          alwaysUnlocked = true;
      }};

      liquidHotpink = new Liquid("liquid-hot-pink", Color.valueOf("ff0066")){{
          alwaysUnlocked = true;
      }};

      liquidDarkHotpink = new Liquid("liquid-dark-hot-pink", Color.valueOf("770044")){{
          alwaysUnlocked = true;
      }};

      liquidDeepHotpink = new Liquid("liquid-deep-hot-pink", Color.valueOf("300022")){{
          alwaysUnlocked = true;
      }};

      liquidFemboy = new Liquid("liquid-femboy", Color.valueOf("0050ff")){{
          alwaysUnlocked = true;
      }};

      liquidCrab = new Liquid("liquid-crab", Color.valueOf("ff0050")){{
          alwaysUnlocked = true;
      }};

      liquidUrog = new Liquid("liquid-urog", Color.valueOf("4400ff")){{
          alwaysUnlocked = true;
      }};

      liquidCanblack = new Liquid("liquid-canvas-black", Color.valueOf("362944")){{
          alwaysUnlocked = true;
      }};

      liquidCanred = new Liquid("liquid-canvas-red", Color.valueOf("c45d9f")){{
          alwaysUnlocked = true;
      }};

      liquidCanorange = new Liquid("liquid-canvas-orange", Color.valueOf("e39aac")){{
          alwaysUnlocked = true;
      }};

      liquidCanyellow = new Liquid("liquid-canvas-yellow", Color.valueOf("f0dab1")){{
          alwaysUnlocked = true;
      }};

      liquidCanblue = new Liquid("liquid-canvas-blue", Color.valueOf("6461c2")){{

          alwaysUnlocked = true;
      }};

      liquidCanteal = new Liquid("liquid-canvas-teal", Color.valueOf("2ba9b4")){{
          alwaysUnlocked = true;
      }};

      liquidCangreen = new Liquid("liquid-canvas-green", Color.valueOf("93d4b5")){{
          alwaysUnlocked = true;
      }};

      liquidCanwhite = new Liquid("liquid-canvas-white", Color.valueOf("f0f6e8")){{
          alwaysUnlocked = true;
      }};

   }
      
}
