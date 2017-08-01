package de.kendoshiii.astraltechnologies.common.proxy;

import de.kendoshiii.astraltechnologies.core.InitBlocks;
import de.kendoshiii.astraltechnologies.core.InitItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
	public static void registerModels(ModelRegistryEvent reg) {

    	ModelLoader.setCustomModelResourceLocation(InitItems.ingotAstralium, 0, new ModelResourceLocation(InitItems.ingotAstralium.getRegistryName().toString(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(InitItems.ingotLunarium, 0, new ModelResourceLocation(InitItems.ingotLunarium.getRegistryName().toString(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(InitItems.ingotPyrium, 0, new ModelResourceLocation(InitItems.ingotPyrium.getRegistryName().toString(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(InitItems.ingotSolarium, 0, new ModelResourceLocation(InitItems.ingotSolarium.getRegistryName().toString(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(InitItems.ingotVoidium, 0, new ModelResourceLocation(InitItems.ingotVoidium.getRegistryName().toString(), "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(InitBlocks.oreAstralium), 0, new ModelResourceLocation(InitBlocks.oreAstralium.getRegistryName().toString(), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(InitBlocks.oreLunarium), 0, new ModelResourceLocation(InitBlocks.oreLunarium.getRegistryName().toString(), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(InitBlocks.orePyrium), 0, new ModelResourceLocation(InitBlocks.orePyrium.getRegistryName().toString(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(InitBlocks.oreSolarium), 0, new ModelResourceLocation(InitBlocks.oreSolarium.getRegistryName().toString(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(InitBlocks.oreVoidium), 0, new ModelResourceLocation(InitBlocks.oreVoidium.getRegistryName().toString(), "inventory"));
	}
}
