package com.zozoe85.ardium.common;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class AdminArmor extends ItemArmor {

	public AdminArmor(ArmorMaterial armor, int type) {
		super(armor, 0, type);
		// TODO Auto-generated constructor stub
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(slot == 2)
		{
			return ArdiumPlus.MODID + ":textures/models/armor/admin_armor_2.png";
		}
		return ArdiumPlus.MODID + ":textures/models/armor/admin_armor_1.png";
	}
}
