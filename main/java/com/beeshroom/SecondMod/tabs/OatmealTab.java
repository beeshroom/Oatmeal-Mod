package com.beeshroom.SecondMod.tabs;

import com.beeshroom.SecondMod.init.ModItems;
import com.beeshroom.SecondMod.items.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class OatmealTab extends CreativeTabs
{
	public OatmealTab(String label) {super("oatmealtab");}
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.OATS);}

	}

	
