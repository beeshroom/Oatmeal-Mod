package com.beeshroom.SecondMod.init;

import java.util.ArrayList;
import java.util.List;

import com.beeshroom.SecondMod.items.ItemBase;
import com.beeshroom.SecondMod.items.food.ItemCustomFood;

import net.minecraft.item.Item;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//items
	public static final Item OATS = new ItemBase("oats");
	
	//food 
	public static final Item OATMEAL = new ItemCustomFood("Oatmeal", 8, false);
	public static final Item OAT_SEEDS = new ItemBase("oat_seeds");
}
