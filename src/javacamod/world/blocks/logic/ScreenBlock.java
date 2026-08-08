package javacamod.world.blocks.logic;

import arc.*;
import arc.func.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.input.*;
import arc.math.*;
import arc.math.geom.*;
import arc.scene.*;
import arc.scene.event.*;
import arc.scene.ui.*;
import arc.scene.style.*;
import arc.scene.ui.layout.*;
import arc.struct.*;
import arc.util.*;
import arc.util.io.*;
import mindustry.entities.units.*;
import mindustry.gen.*;
import mindustry.ctype.*;
import mindustry.type.*;
import mindustry.ui.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.logic.*;
import mindustry.world.blocks.logic.*;

import javacamod.*;

public class ScreenBlock extends CanvasBlock {

	public ScreenBlock(String name){
		super(name);
	}

	public class ScreenBuild extends CanvasBuild{

		@Override
		public void control(LAccess type, double p1, double p2, double p3, double p4){
			if(type == LAccess.color){
				int in = (int)(Double.doubleToRawLongBits(p1));
				setByte(data, ((((in >> 24) & 0xff) % canvasSize) + (((in >> 16) & 0xff) % canvasSize) * canvasSize) * bitsPerPixel, (((in >> 8) & 0xff) % palette.length));
			}

			updateTexture();

			super.control(type, p1, p2, p3, p4);
		}

		@Override
		public void buildConfiguration(Table table){
			table.button(Icon.pencil, Styles.cleari, () -> new ScreenEditDialog(this).show()).size(40f);
		}
		/*
		@Override
		public void buildConfiguration(Table table){
			table.button(Icon.pencil, Styles.cleari, () -> {
				Dialog dialog = new Dialog();

				Pixmap pix = makePixmap(data);
				Texture texture = new Texture(pix);
				int[] curColor = {palette[0]};
				boolean[] modified = {false};

				dialog.resized(dialog::hide);

				dialog.cont.table(Tex.pane, body -> {
					body.stack(new Element(){
						int lastX, lastY;

						{
							addListener(new InputListener(){
								int convertX(float ex){
									return (int)((ex - x) / width * canvasSize);
								}

								int convertY(float ey){
									return pix.height - 1 - (int)((ey - y) / height * canvasSize);
								}

								@Override
								public boolean touchDown(InputEvent event, float ex, float ey, int pointer, KeyCode button){
									int cx = convertX(ex), cy = convertY(ey);
									draw(cx, cy);
									lastX = cx;
									lastY = cy;
									return true;
								}

								@Override
								public void touchDragged(InputEvent event, float ex, float ey, int pointer){
									int cx = convertX(ex), cy = convertY(ey);
									Bresenham2.line(lastX, lastY, cx, cy, (x, y) -> draw(x, y));
									lastX = cx;
									lastY = cy;
								}
							});
						}

						void draw(int x, int y){
							if(pix.get(x, y) != curColor[0]){
								pix.set(x, y, curColor[0]);
								Pixmaps.drawPixel(texture, x, y, curColor[0]);
								modified[0] = true;
							}
						}

						@Override
						public void draw(){
							Tmp.tr1.set(texture);
							Draw.alpha(parentAlpha);
							Draw.rect(Tmp.tr1, x + width/2f, y + height/2f, width, height);
						}
					}, new GridImage(canvasSize, canvasSize){{
						touchable = Touchable.disabled;
					}}).size(mobile && !Core.graphics.isPortrait() ? Math.min(290f, Core.graphics.getHeight() / Scl.scl(1f) - 75f / Scl.scl(1f)) : 480f);
				});

				dialog.cont.row();

				dialog.cont.table(Tex.button, p -> {
					for(int i = 0; i < palette.length; i++){
						int fi = i;

						var button = p.button(Tex.whiteui, Styles.squareTogglei, 40, () -> {
							curColor[0] = palette[fi];
						}).size(20).checked(b -> curColor[0] == palette[fi]).get();
						button.getStyle().imageUpColor = new Color(palette[i]);
					}
				});

				dialog.closeOnBack();

				dialog.buttons.defaults().size(150f, 64f);
				dialog.buttons.button("@cancel", Icon.cancel, dialog::hide);
				dialog.buttons.button("@ok", Icon.ok, () -> {
					if(modified[0]){
						configure(packPixmap(pix));
						texture.dispose();
					}
					dialog.hide();
				});

				dialog.show();
			}).size(40f);
		}*/

	}
}
