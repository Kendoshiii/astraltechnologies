package de.kendoshiii.astraltechnologies.core;

import de.kendoshiii.astraltechnologies.common.blocks.minerals.BlockOre;
import de.kendoshiii.astraltechnologies.common.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@Mod.EventBusSubscriber
@GameRegistry.ObjectHolder(Reference.MODID)
public class InitBlocks {

	@ObjectHolder("oreastralium")
	public static BlockOre oreAstralium;
	
	@ObjectHolder("orelunarium")
	public static BlockOre oreLunarium;
	
	@ObjectHolder("oresolarium")
	public static BlockOre oreSolarium;
	
	@ObjectHolder("orepyrium")
	public static BlockOre orePyrium;
	
	@ObjectHolder("orevoidium")
	public static BlockOre oreVoidium;

	@SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
		
		event.getRegistry().registerAll(
				new BlockOre("oreastralium"), 
				new BlockOre("orelunarium"), 
				new BlockOre("oresolarium"), 
				new BlockOre("orepyrium"), 
				new BlockOre("orevoidium")
				);
		
		registerTileEntities();
		
    }
	
	@SubscribeEvent
	public static void registerItem(RegistryEvent.Register<Item> event){
		
		event.getRegistry().registerAll(
				new ItemBlock(oreAstralium).setRegistryName(oreAstralium.getRegistryName()),
				new ItemBlock(oreLunarium).setRegistryName(oreLunarium.getRegistryName()),
				new ItemBlock(orePyrium).setRegistryName(orePyrium.getRegistryName()),
				new ItemBlock(oreSolarium).setRegistryName(oreSolarium.getRegistryName()),
				new ItemBlock(oreVoidium).setRegistryName(oreVoidium.getRegistryName())
				);
	}
		
	public static void registerTileEntities(){

	}
	
}
