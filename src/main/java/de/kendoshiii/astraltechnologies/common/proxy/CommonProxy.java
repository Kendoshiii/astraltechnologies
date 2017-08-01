package de.kendoshiii.astraltechnologies.common.proxy;

import de.kendoshiii.astraltechnologies.common.config.Config;
import de.kendoshiii.astraltechnologies.common.handler.events.PlayerEvents;
import de.kendoshiii.astraltechnologies.common.network.PacketHandler;
import de.kendoshiii.astraltechnologies.common.world.worldgen.ATWorldGenerator;
import de.kendoshiii.astraltechnologies.core.Core;
import de.kendoshiii.astraltechnologies.core.InitRecipes;
import net.minecraft.world.World;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.io.File;

@Mod.EventBusSubscriber
public class CommonProxy {

	public static Configuration config;
	
	public void preInit(FMLPreInitializationEvent e) {
		
		File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "standard.cfg"));
        Config.readConfig();
		MinecraftForge.EVENT_BUS.register(new PlayerEvents());


		
	}

	public void init(FMLInitializationEvent e) {

        PacketHandler.initPackets();
		NetworkRegistry.INSTANCE.registerGuiHandler(Core.instance, new GuiProxy());
		GameRegistry.registerWorldGenerator(new ATWorldGenerator(), 0);
		
	}

	public void postInit(FMLPostInitializationEvent e) {
		
		if (config.hasChanged()) {
			config.save();
		}

        InitRecipes.initSmelting();
		
	}

	public World getWorld(int dim) {
		return DimensionManager.getWorld(dim);
	}

}
