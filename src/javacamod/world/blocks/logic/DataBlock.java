package javacamod.world.blocks.logic;

import arc.util.io.*;
import mindustry.gen.*;
import mindustry.world.*;
import mindustry.world.meta.*;
import mindustry.world.blocks.logic.*;

public class DataBlock extends MemoryBlock{

	public DataBlock(String name){
		super(name);

		config(double[].class, (DataBuild entity, double[] Ds) -> entity.memory = Ds);
	}
	public class DataBuild extends MemoryBuild{
		@Override
		public double[] config(){
			return memory;
		}
	}
}
