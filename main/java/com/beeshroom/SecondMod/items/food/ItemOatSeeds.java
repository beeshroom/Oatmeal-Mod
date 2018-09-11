package com.beeshroom.SecondMod.items.food;

import com.beeshroom.SecondMod.Main;
import com.beeshroom.SecondMod.init.ModItems;
import com.beeshroom.SecondMod.util.IHasModel;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class ItemOatSeeds extends ItemFood implements IHasModel, IPlantable 
{
	public ItemOatSeeds(String name, int amount, boolean iswolffood)
	{
		super(amount, iswolffood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.oatmealtab);
		
		ModItems.ITEMS.add(this);
		
	}
	@Override 
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		{
		ItemStack stack = player.getHeldItem(hand);
		IBlockState state = worldIn.getBlockState(pos);
		if(facing == EnumFacing.UP && player.canPlayerEdit(pos.offset(facing), facing, stack) && state.getBlock().canSustainPlant(state, worldIn, pos, EnumFacing.UP, this) && worldIn.isAirBlock(pos.up()))
		{
			worldIn.setBlockState(pos.up(), ModBlocks.OAT_PLANT.getDefaultState());
			stack.shrink(1);
			return EnumActionResult.SUCCESS;
		}
		else return EnumActionResult.FAIL;
			
		}

	
	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos)
	{
	
		return EnumPlantType.Crop; 
	}
	@Override
	public IBlockState getPlant(IBlockAccess world, BlockPos pos) 
	{

		return ModBlocks.OAT_PLANT.getDefaultState();
	}
}

}
