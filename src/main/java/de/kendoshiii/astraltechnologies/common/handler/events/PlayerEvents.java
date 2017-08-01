package de.kendoshiii.astraltechnologies.common.handler.events;

import de.kendoshiii.astraltechnologies.common.config.ConfigValues;
import de.kendoshiii.astraltechnologies.common.lib.Reference;
import de.kendoshiii.astraltechnologies.common.util.VersionChecker;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class PlayerEvents {

    @SubscribeEvent
    public static void onPlayerJoinEvent(PlayerLoggedInEvent e){
        VersionChecker.checkForUpdate(ConfigValues.updateURL, Reference.MODID, Reference.VERSION, e.player);
    }

}
