package com.zozoe85.ardium.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ArdiumPlusCreativeTabs extends CreativeTabs {

	public ArdiumPlusCreativeTabs(String lable) {
		super(lable);
	// TODO Auto-generated constructor stub
	

	}
  @Override
  public Item getTabIconItem()
  {
     return ArdiumPlus.swordadmin;
  }
}