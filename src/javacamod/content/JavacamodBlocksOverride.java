package javacamod.content;

import mindustry.world.blocks.logic.*;

import static mindustry.Vars.*;

public class JavacamodBlocksOverride{
  public static void init(){
    ((MessageBlock)Blocks.message).maxTextLength = 22000;
    ((MessageBlock)Blocks.reinforcedMessage).maxTextLength = 22000;
  }
}
