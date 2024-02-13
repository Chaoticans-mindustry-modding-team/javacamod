package javacamod;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

import javacamod.content.*;

public class JavacamodJavaMod extends Mod{

    public JavacamodJavaMod(){
        Log.info("Loaded JavacamodJavaMod constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("Java Camod");
                dialog.cont.add("JCamod").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("icon")).pad(20f).row();
                dialog.cont.button("I hope you enjoy this mod", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        JavacamodBlocks.load();
        JavacamodItems.load();
        JavacamodLiquids.load();
        Log.info("Loadin");
    }

}
