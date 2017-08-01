package de.kendoshiii.astraltechnologies.common.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ContainerCrafter extends ContainerWorkbench{

	public ContainerCrafter(EntityPlayer player) {
		super(player.inventory, player.world, player.getPosition());
	}

	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return true;
	}
	
}
