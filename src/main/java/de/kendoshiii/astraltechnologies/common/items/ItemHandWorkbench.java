package de.kendoshiii.astraltechnologies.common.items;

import de.kendoshiii.astraltechnologies.common.config.ConfigValues;
import de.kendoshiii.astraltechnologies.core.Core;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemHandWorkbench extends ItemBase{

	public ItemHandWorkbench(String name) {
		super(name);
		this.setMaxStackSize(1);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

		if(!worldIn.isRemote){
			playerIn.openGui(Core.instance, ConfigValues.handCrafterGui, worldIn, (int) playerIn.posX, (int) playerIn.posY, (int) playerIn.posZ);
		}
		
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
		
	}
	
}
