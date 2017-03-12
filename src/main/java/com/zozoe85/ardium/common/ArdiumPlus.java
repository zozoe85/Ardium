package com.zozoe85.ardium.common;

import com.zozoe85.ardium.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = "ardiumplus", name="ArdiumPlus", version="1.0.0")



public class ArdiumPlus {

	public static final String MODID = "ardiumplus";
	
	public static Item swordadmin, adminhelmet, adminchestplate,adminleggins,adminboots;
	
	public static ToolMaterial tooladmin= EnumHelper.addToolMaterial("tooladmin", 2, 1000000, 30.0F, 199999999.0F, 18);
	
	
	public static ArmorMaterial armoradmin = EnumHelper.addArmorMaterial("armorAdmin", 1000000, new int[] {100, 160, 140, 80}, 20);

	public static Block ardiumold;
	
	public static CreativeTabs ardiumpluscreativetabs = new ArdiumPlusCreativeTabs("ardium_plus_creative_tabs");
	
	
	
	
	
	
	
	@Instance("ardiumplus") 
    public static ArdiumPlus instance;

	@SidedProxy(clientSide = "com.zozoe85.ardium.proxy.ClientProxy", serverSide = "com.zozoe85.ardium.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	
	
	
	
	

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

		swordadmin = new AdminSword(tooladmin).setUnlocalizedName("adminsword").setTextureName(MODID + ":admin_sword").setCreativeTab(ardiumpluscreativetabs);
		GameRegistry.registerItem(swordadmin, "adminsword");
		
		adminhelmet = new AdminArmor(armoradmin, 0).setUnlocalizedName("adminhelmet").setTextureName(MODID + ":adminhelmet").setCreativeTab(ardiumpluscreativetabs);
		adminchestplate = new AdminArmor(armoradmin, 1).setUnlocalizedName("adminchestplate").setTextureName(MODID + ":adminchestplate").setCreativeTab(ardiumpluscreativetabs);
		adminleggins = new AdminArmor(armoradmin, 2).setUnlocalizedName("adminleggins").setTextureName(MODID + ":adminleggins").setCreativeTab(ardiumpluscreativetabs);
		adminboots = new AdminArmor(armoradmin, 3).setUnlocalizedName("adminboots").setTextureName(MODID + ":adminboots").setCreativeTab(ardiumpluscreativetabs);
		
		GameRegistry.registerItem(adminhelmet, "adminhelmet");
		GameRegistry.registerItem(adminchestplate, "adminchestplate");
		GameRegistry.registerItem(adminleggins, "adminleggins");
		GameRegistry.registerItem(adminboots, "adminboots");
		
		ardiumold= new ArdiumOld(Material.rock).setBlockName("ardiumold").setBlockTextureName(MODID + ":ardiumold").setHardness(5.0F).setCreativeTab(ardiumpluscreativetabs);
	    GameRegistry.registerBlock(ardiumold, "ardiumold");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
          proxy.registerRender();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}






}
