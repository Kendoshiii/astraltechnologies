package de.kendoshiii.astraltechnologies.common.proxy;

import de.kendoshiii.astraltechnologies.client.gui.GuiCrafter;
import de.kendoshiii.astraltechnologies.common.config.ConfigValues;
import de.kendoshiii.astraltechnologies.common.container.ContainerCrafter;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiProxy implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

		BlockPos pos = new BlockPos(x, y, z);
		Block block = world.getBlockState(pos).getBlock();

		TileEntity tile = world.getTileEntity(pos);

		if(ID == ConfigValues.handCrafterGui){
			return new ContainerCrafter(player);
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

		BlockPos pos = new BlockPos(x, y, z);
		Block block = world.getBlockState(pos).getBlock();

		TileEntity tile = world.getTileEntity(pos);

		if(ID == ConfigValues.handCrafterGui){
			return new GuiCrafter(player);
		}
		
		return null;
	}
	
	
}
