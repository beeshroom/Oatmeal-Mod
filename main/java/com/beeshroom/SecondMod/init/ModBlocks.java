package com.beeshroom.SecondMod.init;

import java.util.ArrayList;
import java.util.List;

import com.beeshroom.SecondMod.blocks.BlockBase;
import com.beeshroom.SecondMod.blocks.BlockOatCrop;
import com.beeshroom.SecondMod.blocks.OatBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block OAT_BLOCK = new OatBlock("oat_block", Material.LEAVES);
	
	public static final Block CROP_OATS = new BlockOatCrop();
	
	
	
	public static BlockOatCrop crop_oats = new BlockOatCrop();

	public static void register(IForgeRegistry<Block> registry) 
	{
		registry.registerAll
		(
			crop_oats
		);
	}
}