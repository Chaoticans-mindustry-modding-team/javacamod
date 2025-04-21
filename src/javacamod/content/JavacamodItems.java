package javacamod.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class JavacamodItems{
    public static Item[] itemNames = {"red", "darkred", "crimson", "green", "darkgreen", "poison", "blue", "darkblue", "navy", "black", "white", "lightgray", "gray", "darkgray", "spectra-1", "spectra-2", "spectra-3", "clear", "yellow", "dark-yellow", "runic", "cyan", "dark-cyan", "deep-ocean", "pink", "dark-pink", "deep-pink", "orange", "dark-orange", "burnt-orange", "lime", "dark-lime", "fruit", "emerald", "dark-emerald", "deep-emerald", "sapphire", "dark-sapphire", "deep-sapphire", "purple", "dark-purple", "violet", "hot-pink", "dark-hot-pink", "deep-hot-pink", "cortexian", "crab", "urog", "canvas-black", "canvas-red", "canvas-orange", "canvas-yellow", "canvas-blue", "canvas-teal", "canvas-green", "canvas-white"};
    public static String[] colors = {"ff0000", "770000", "300000", "00ff00", "007700", "003000", "0000ff", "000077", "000030", "000000", "ffffff", "bbbbbb", "777777", "303030", "aaaaaabb", "aaaaaa88", "aaaaaa44", "aaaaaa00", "ffff00", "777700", "303000", "00ffff", "007777", "003030", "ff00ff", "770077", "300030", "ff6600", "774400", "302200", "66ff00", "447700", "223000", "00ff66", "007744", "003022", "0066ff", "004477", "002230", "6600ff", "440077", "220030", "ff0066", "770044", "300022", "0050ff", "ff0050", "4400ff", "362944", "c45d9f", "e39aac", "f0dab1", "6461c2", "2ba9b4", "93d4b5", "f0f6e8"};
    public static Item[] items = new Item[itemNames.length];
  
    public static void load(){
      for (int i = 0, i < items.length, i++) {
        items[i] = new Item(itemNames[i], Color.valueOf(colors[i])){{
          hardness = 1;
          cost = 0.5f;
          alwaysUnlocked = true;
        }};
      }
    }
}
