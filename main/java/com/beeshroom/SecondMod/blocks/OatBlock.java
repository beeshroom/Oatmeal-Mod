package com.beeshroom.SecondMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class OatBlock extends BlockBase
{

	public OatBlock(String name, Material material) 
	{
		super(name, material);

		setSoundType(SoundType.PLANT);
		setHardness(0.4f);
		setResistance(2.5f);
		setHarvestLevel("shears", 0);
		//setLightOpacity(1);
		//setBlockUnbreakable();
		//setLightLevel(1.0f);
		
	
		
		
	}

}
