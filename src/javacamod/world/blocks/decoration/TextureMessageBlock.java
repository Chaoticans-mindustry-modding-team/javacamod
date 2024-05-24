package javacamod.world.blocks.decoration;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import arc.util.io.*;
import arc.*;
import arc.func.*;
import arc.input.*;
import arc.scene.*;
import arc.scene.event.*;
import arc.scene.ui.*;
import arc.scene.style.*;
import arc.scene.ui.layout.*;
import arc.Graphics.*;
import arc.Graphics.Cursor.*;
import arc.Input.*;
import arc.util.pooling.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.input.*;
import mindustry.logic.*;
import mindustry.world.meta.*;
import mindustry.entities.units.*;
import mindustry.ctype.*;
import mindustry.type.*;
import mindustry.ui.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.logic.*;
import mindustry.ui.dialogs.*;

import static mindustry.Vars.*;

public class TextureMessageBlock extends MessageBlock {
    
    public TextureMessageBlock(String name){
		super(name);
		update = true;
		configurable = true;
		saveConfig = true;
		envEnabled |= Env.space;
		swapDiagonalPlacement = true;

		config(String.class, (TextureBuild tile, String value) -> tile.regionName = value);
	};

	public class TextureBuild extends Building{
		public String regionName = "copper-wall";

		//@Override
		public void drawPlanConfig(BuildPlan plan, Eachable<BuildPlan> list){
			//super.drawPlanConfig(plan, list);
			float drawOffsetX = plan.drawx() - size*4;
			float drawOffsetY = plan.drawy() - size*4;
			float drawSize = size*8;
			TextureRegion tileRegion = Core.atlas.find(plan.config instanceof String s ? s : "copper-wall");
            for (float i = 0; i < drawSize; i += tileRegion.width/4) {
                for (float j = 0; j < drawSize; j += tileRegion.height/4) {
                    Draw.rect(tileRegion, i + tileRegion.width/8 + drawOffsetX, j + tileRegion.height/8 + drawOffsetY, plan.rotation*90);
                };
            };
		}

		@Override
		public void draw(){
			super.draw();
			float drawOffsetX = x - size*4;
			float drawOffsetY = y - size*4;
			float drawSize = size*8;
            TextureRegion tileRegion = Core.atlas.find(regionName);
            for (float i = 0; i < drawSize; i += tileRegion.width/4) {
                for (float j = 0; j < drawSize; j += tileRegion.height/4) {
                    Draw.rect(tileRegion, i + tileRegion.width/8 + drawOffsetX, j + tileRegion.height/8 + drawOffsetY, rotation*90);
                };
            };
		}

        @Override
        public void buildConfiguration(Table table){
            table.button(Icon.pencil, Styles.cleari, () -> {
                if(mobile){
                    var contents = this.message.toString();
                    Core.input.getTextInput(new TextInput(){{
                        text = contents;
                        multiline = true;
                        maxLength = maxTextLength;
                        accepted = str -> {
                            if(!str.equals(text)) configure(str);
                        };
                    }});
                }else{
                    BaseDialog dialog = new BaseDialog("@editmessage");
                    dialog.setFillParent(false);
                    TextArea a = dialog.cont.add(new TextArea(message.toString().replace("\r", "\n"))).size(380f, 160f).get();
                    a.setFilter((textField, c) -> {
                        if(c == '\n'){
                            int count = 0;
                            for(int i = 0; i < textField.getText().length(); i++){
                                if(textField.getText().charAt(i) == '\n'){
                                    count++;
                                }
                            }
                            return count < maxNewlines;
                        }
                        return true;
                    });
                    a.setMaxLength(maxTextLength);
                    dialog.cont.row();
                    dialog.cont.label(() -> a.getText().length() + " / " + maxTextLength).color(Color.lightGray);
                    dialog.buttons.button("@ok", () -> {
                        if(!a.getText().equals(message.toString())) configure(a.getText());
                        dialog.hide();
                    }).size(130f, 60f);
                    dialog.update(() -> {
                        if(tile.build != this){
                            dialog.hide();
                        }
                    });
                    dialog.closeOnBack();
                    dialog.show();
                }
                deselect();
            }).size(40f);
		table.table(Styles.black5, t -> {
                t.margin(6f);
                t.field(regionName, text -> {
                    configure(text);
                }).width(240).get();
            });
        }

		@Override
		public boolean onConfigureBuildTapped(Building other){
			if(this == other){
				deselect();
				return false;
			}

			return true;
		}

		@Override
		public String config(){
			return regionName;
		}

		@Override
		public void write(Writes write){
			super.write(write);
			write.str(regionName);
		}

		@Override
		public void read(Reads read, byte revision){
			super.read(read, revision);
			regionName = read.str();
		}
	}
}
