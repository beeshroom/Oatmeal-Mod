package com.beeshroom.SecondMod.init;

import java.util.ArrayList;
import java.util.List;

import com.beeshroom.SecondMod.blocks.BlockBase;
import com.beeshroom.SecondMod.blocks.BlockOatPlant;
import com.beeshroom.SecondMod.blocks.OatBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block OAT_BLOCK = new OatBlock("oat_block", Material.LEAVES);
	
	public static final Block OAT_PLANT = new BlockOatPlant("oat_plant");
	
}
