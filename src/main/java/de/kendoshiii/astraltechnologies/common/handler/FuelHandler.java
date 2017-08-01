package de.kendoshiii.astraltechnologies.common.handler;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler {

	public static class EnderGenFuel {

		public static int getItemBurnTime(ItemStack stack) {

			if(stack.isEmpty()){
				return 0;
			}
			else
			{
				int burnTime = ForgeEventFactory.getItemBurnTime(stack);
				if(burnTime >= 0){
					return burnTime;
				}
				Item item = stack.getItem();
				
				if(item == Items.ENDER_PEARL){
					return 800;
				}
				if(item == Items.ENDER_EYE){
					return 3200;
				}
			}
			
			return 0;

		}

		public static boolean isItemFuel(ItemStack stack) {
			
			return getItemBurnTime(stack) > 0;

		}

	}
	
	public static class NetherGenFuel {

		public static int getItemBurnTime(ItemStack stack) {

			if(stack.isEmpty()){
				return 0;
			}
			else
			{
				int burnTime = ForgeEventFactory.getItemBurnTime(stack);
				if(burnTime >= 0){
					return burnTime;
				}
				Item item = stack.getItem();
				
				if(item == Items.NETHER_STAR){
					return 2400;
				}
				
			}
			
			return 0;

		}

		public static boolean isItemFuel(ItemStack stack) {
			
			return getItemBurnTime(stack) > 0;

		}

	}

	public static class CulinaryGenFuel{

		public static int getItemBurnTime(ItemStack stack) {

			if(stack.isEmpty()){
				return 0;
			}
			else
			{
				int burnTime = ForgeEventFactory.getItemBurnTime(stack);
				if(burnTime >= 0){
					return burnTime;
				}
				Item item = stack.getItem();
				
				if(item == Items.APPLE){
					return 290;
				}
				if(item == Items.MUSHROOM_STEW){
					return 865;
				}
				if(item == Items.COOKED_CHICKEN){
					return 865;
				}
				if(item == Items.BAKED_POTATO){
					return 865;
				}
				if(item == Items.BREAD){
					return 720;
				}
				if(item == Items.COOKED_FISH){
					return 720;
				}

			}
			
			return 0;

		}

		public static boolean isItemFuel(ItemStack stack) {
			
			return getItemBurnTime(stack) > 0;

		}

	}

}
