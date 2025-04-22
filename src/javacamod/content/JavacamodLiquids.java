package javacamod.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class JavacamodLiquids{
    public static String[] liquidNames = {"liquid-red", "liquid-darkred", "blood", "liquid-green", "liquid-darkgreen", "liquid-poison", "liquid-blue", "liquid-darkblue", "liquid-navy", "liquid-black", "liquid-white", "liquid-lightgray", "liquid-gray", "liquid-darkgray", "ectoplasm-one", "ectoplasm-two", "ectoplasm-three", "liquid-clear", "liquid-yellow", "liquid-dark-yellow", "liquid-runic", "liquid-cyan", "liquid-dark-cyan", "liquid-deep-ocean", "liquid-pink", "liquid-dark-pink", "liquid-deep-pink", "liquid-orange", "liquid-dark-orange", "liquid-burnt-orange", "liquid-lime", "liquid-dark-lime", "liquid-fruit", "liquid-emerald", "liquid-dark-emerald", "liquid-deep-emerald", "liquid-sapphire", "liquid-dark-sapphire", "liquid-deep-sapphire", "venom", "dark-venom", "liquid-death", "liquid-hot-pink", "liquid-dark-hot-pink", "liquid-deep-hot-pink", "liquid-femboy", "liquid-crab", "liquid-urog", "liquid-canvas-black", "liquid-canvas-red", "liquid-canvas-orange", "liquid-canvas-yellow", "liquid-canvas-blue", "liquid-canvas-teal", "liquid-canvas-green", "liquid-canvas-white"};
    public static String[] liquidColors = {"ff0000", "770000", "300000", "00ff00", "007700", "003000", "0000ff", "000077", "000030", "000000", "ffffff", "bbbbbb", "777777", "303030", "aaaaaabb", "aaaaaa88", "aaaaaa44", "aaaaaa00", "ffff00", "777700", "303000", "00ffff", "007777", "003030", "ff00ff", "770077", "300030", "ff6600", "774400", "302200", "66ff00", "447700", "223000", "00ff66", "007744", "003022", "0066ff", "004477", "002230", "6600ff", "440077", "220030", "ff0066", "770044", "300022", "0050ff", "ff0050", "4400ff", "362944", "c45d9f", "e39aac", "f0dab1", "6461c2", "2ba9b4", "93d4b5", "f0f6e8"};
    public static Liquid[] liquids = new Liquid[liquidColors.length];

    public static void load(){
      for (int i = 0; i < liquidColors.length; i++) {
        liquids[i] = new Liquid(liquidNames[i], Color.valueOf(liquidColors[i])){{
          alwaysUnlocked = true;
        }};
      }
   }
      
}
