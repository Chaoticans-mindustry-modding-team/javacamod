package javacamod.world.blocks.logic;

import arc.util.io.*;
import mindustry.gen.*;
import mindustry.world.*;
import mindustry.world.meta.*;
import mindustry.world.blocks.logic.*;

import static mindustry.Vars.*;

public class DataBlock extends MemoryBlock{
  
    public DataBlock(String name){
        super(name);
        destructible = true;
        solid = true;
        group = BlockGroup.logic;
        drawDisabled = false;
        envEnabled = Env.any;
        canOverdrive = false;

        config(Double[].class, (DataBuild entity, double[] Ds) -> entity.memory = Ds);
    }
   public class DataBuild extends MemoryBuild{
        @Override
        public double[] config(){
            return memory;
        }
   }
}
