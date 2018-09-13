package com.beeshroom.SecondMod.init;

import java.util.ArrayList;
import java.util.List;

import com.beeshroom.SecondMod.items.ItemBase;
import com.beeshroom.SecondMod.items.ItemOatSeed;
import com.beeshroom.SecondMod.items.food.ItemCustomFood;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//items
	public static final Item OATS = new ItemBase("oats");
	
	//food 
	public static final Item OATMEAL = new ItemCustomFood("Oatmeal", 8, false);
	
	public static final Item OAT_SEED = new ItemBase("ItemOatSeed");

	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				// ...
				OATS
		);
	}

	public static void registerModels() {
		// ...
		OATS.registerItems();
	}
}