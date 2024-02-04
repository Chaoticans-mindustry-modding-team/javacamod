package javacamod.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class JavacamodItems{
    public static Item
    red, darkred, crimson, green, darkgreen, poison, blue, darkblue, navy, black, white, lightgray, gray, darkgray, 
    spectra1, spectra2, spectra3, clear, yellow, cyan, pink, orange, lime, emerald, sapphire, purple, hotpink, cortexian, 
    crab, urog, canblack, canred, canorange, canyellow, canblue, canteal, cangreen, canwhite; 


    public static void load(){
      red = new Item("red", Color.valueOf("ff0000")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      darkred = new Item("darkred", Color.valueOf("770000")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      crimson = new Item("crimson", Color.valueOf("300000")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};
      
      green = new Item("green", Color.valueOf("00ff00")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      darkgreen = new Item("darkgreen", Color.valueOf("007700")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      poison = new Item("poison", Color.valueOf("003000")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      blue = new Item("blue", Color.valueOf("0000ff")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      darkblue = new Item("darkblue", Color.valueOf("000077")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      navy = new Item("navy", Color.valueOf("000030")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      black = new Item("black", Color.valueOf("000000")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      white = new Item("white", Color.valueOf("ffffff")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      lightgray = new Item("lightgray", Color.valueOf("bbbbbb")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      gray = new Item("gray", Color.valueOf("777777")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      darkgray = new Item("darkgray", Color.valueOf("303030")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      spectra1 = new Item("spectra-one", Color.valueOf("aaaaaabb")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      spectra2 = new Item("spectra-two", Color.valueOf("aaaaaa88")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      spectra3 = new Item("spectra-three", Color.valueOf("aaaaaa44")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      clear = new Item("clear", Color.valueOf("aaaaaa00")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      yellow = new Item("yellow", Color.valueOf("ffff00")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      darkYellow = new Item("dark-yellow", Color.valueOf("777700")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      runic = new Item("runic", Color.valueOf("303000")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      cyan = new Item("cyan", Color.valueOf("00ffff")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      darkCyan = new Item("dark-cyan", Color.valueOf("007777")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      deepOcean = new Item("deep-ocean", Color.valueOf("003030")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      pink = new Item("pink", Color.valueOf("ff00ff")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      darkPink = new Item("dark-pink", Color.valueOf("770077")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      deepPink = new Item("deep-pink", Color.valueOf("300030")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      orange = new Item("orange", Color.valueOf("ff6600")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      darkOrange = new Item("dark-orange", Color.valueOf("774400")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      burntOrange = new Item("burnt-orange", Color.valueOf("302200")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};
      
      lime = new Item("lime", Color.valueOf("66ff00")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      darkLime = new Item("dark-lime", Color.valueOf("447700")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      fruit = new Item("fruit", Color.valueOf("223000")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      emerald = new Item("emerald", Color.valueOf("00ff66")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      darkEmerald = new Item("dark-emerald", Color.valueOf("007744")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      deepEmerald = new Item("deep-emerald", Color.valueOf("003022")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      sapphire = new Item("sapphire", Color.valueOf("0066ff")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      darkSapphire = new Item("dark-sapphire", Color.valueOf("004477")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      deepSapphire = new Item("deep-sapphire", Color.valueOf("002230")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      purple = new Item("purple", Color.valueOf("6600ff")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      darkPurple = new Item("dark-purple", Color.valueOf("440077")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      violet = new Item("violet", Color.valueOf("220030")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      hotpink = new Item("hot-pink", Color.valueOf("ff0066")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      darkHotpink = new Item("dark-hot-pink", Color.valueOf("770044")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      deepHotpink = new Item("deep-hot-pink", Color.valueOf("300022")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      cortexian = new Item("cortexian", Color.valueOf("0050ff")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      crab = new Item("crab", Color.valueOf("ff0050")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      urog = new Item("urog", Color.valueOf("4400ff")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      canblack = new Item("canvas-black", Color.valueOf("362944")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      canred = new Item("canvas-red", Color.valueOf("c45d9f")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      canorange = new Item("canvas-orange", Color.valueOf("e39aac")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      canyellow = new Item("canvas-yellow", Color.valueOf("f0dab1")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      canblue = new Item("canvas-blue", Color.valueOf("6461c2")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      canteal = new Item("canvas-teal", Color.valueOf("2ba9b4")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      cangreen = new Item("canvas-green", Color.valueOf("93d4b5")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

      canwhite = new Item("canvas-white", Color.valueOf("f0f6e8")){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
      }};

   }
      
}
