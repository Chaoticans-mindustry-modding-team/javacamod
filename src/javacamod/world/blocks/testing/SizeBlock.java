package javacamod.world.blocks.testing;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import arc.util.io.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.input.*;
import mindustry.logic.*;
import mindustry.world.meta.*;
import arc.*;
import arc.func.*;
import arc.input.*;
import arc.scene.*;
import arc.scene.event.*;
import arc.scene.ui.*;
import arc.scene.style.*;
import arc.scene.ui.layout.*;
import mindustry.entities.units.*;
import mindustry.ctype.*;
import mindustry.type.*;
import mindustry.ui.*;
import mindustry.world.*;
import mindustry.world.blocks.*;


import static mindustry.Vars.*;

public class SizeBlock extends Block{
	
	public SizeBlock(String name){
		super(name);
		envEnabled |= Env.space;
	}
	
	@Override
	public void flipRotation(BuildPlan req, boolean x){
	        if (x) {
			this.size = ((this.size + 14) & 15) + 1;
		} else {
			this.size = (this.size & 15) + 1;
		};
		this.offset = 4 - this.offset;
	}
}
