package de.kendoshiii.astraltechnologies.core;

import de.kendoshiii.astraltechnologies.common.items.ItemHandWorkbench;
import de.kendoshiii.astraltechnologies.common.items.minerals.ItemIngot;
import de.kendoshiii.astraltechnologies.common.lib.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@Mod.EventBusSubscriber
@GameRegistry.ObjectHolder(Reference.MODID)
public class InitItems {
	
	@ObjectHolder("ingotastralium")
	public static ItemIngot ingotAstralium;

	@ObjectHolder("ingotlunarium")
	public static ItemIngot ingotLunarium;

	@ObjectHolder("ingotpyrium")
	public static ItemIngot ingotPyrium;

	@ObjectHolder("ingotsolarium")
	public static ItemIngot ingotSolarium;

	@ObjectHolder("ingotvoidium")
	public static ItemIngot ingotVoidium;

	@ObjectHolder("handheldcrafter")
	public static ItemHandWorkbench handheldcrafter;

	@SubscribeEvent
	public static void registerItem(RegistryEvent.Register<Item> event){
		
		event.getRegistry().registerAll(
				new ItemIngot("ingotastralium"),
                new ItemIngot("ingotlunarium"),
                new ItemIngot("ingotpyrium"),
                new ItemIngot("ingotsolarium"),
                new ItemIngot("ingotvoidium"),
				new ItemHandWorkbench("handheldcrafter")
				
					);
		
	}
	
}
