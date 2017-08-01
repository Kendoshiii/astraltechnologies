package de.kendoshiii.astraltechnologies.core;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class InitRecipes {

    public static void initSmelting(){

        GameRegistry.addSmelting(new ItemStack(InitBlocks.oreAstralium), new ItemStack(InitItems.ingotAstralium), 0.1F);
        GameRegistry.addSmelting(new ItemStack(InitBlocks.oreLunarium), new ItemStack(InitItems.ingotLunarium), 0.1F);
        GameRegistry.addSmelting(new ItemStack(InitBlocks.orePyrium), new ItemStack(InitItems.ingotPyrium), 0.1F);
        GameRegistry.addSmelting(new ItemStack(InitBlocks.oreSolarium), new ItemStack(InitItems.ingotSolarium), 0.1F);
        GameRegistry.addSmelting(new ItemStack(InitBlocks.oreVoidium), new ItemStack(InitItems.ingotVoidium), 0.1F);

    }

}
