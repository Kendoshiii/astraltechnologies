package de.kendoshiii.astraltechnologies.common.blocks;

import de.kendoshiii.astraltechnologies.common.lib.Reference;
import de.kendoshiii.astraltechnologies.core.Core;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBase extends Block{

	private String name;
	
	public BlockBase(String name) {
		super(Material.GROUND);
		this.name = name;
		this.setRegistryName(Reference.MODID, name);
		this.setCreativeTab(Core.instance.tab);
	}

	@Override
	public String getUnlocalizedName() {
		return "block." + name;
	}
	
}
