package de.kendoshiii.astraltechnologies.common.items;

import de.kendoshiii.astraltechnologies.common.lib.Reference;
import de.kendoshiii.astraltechnologies.core.Core;
import net.minecraft.item.Item;

public class ItemBase extends Item{

	public ItemBase(String name) {
		this.setRegistryName(Reference.MODID, name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(Core.instance.tab);
	}
		
}
