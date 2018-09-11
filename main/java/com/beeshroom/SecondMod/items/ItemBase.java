package com.beeshroom.SecondMod.items;

import com.beeshroom.SecondMod.Main;
import com.beeshroom.SecondMod.init.ModItems;
import com.beeshroom.SecondMod.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.oatmealtab);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	{
	Main.proxy.registerItemRenderer(this,0,"inventory");
		
	}

}
