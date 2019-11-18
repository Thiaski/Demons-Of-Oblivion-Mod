package thiaski.demonsofoblivion.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import thiaski.demonsofoblivion.init.ModItems;

public class NewCommonBlock extends BlockBase {
	
	public NewCommonBlock(String name, Material material, SoundType soundType, float hardness, 
			float resistance, String harvestLevelType, int harvestLevel, float lightLevel, boolean unbreakable) {
		
		super(name, material);
		setSoundType(soundType);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(harvestLevelType, harvestLevel);
		setLightLevel(lightLevel);
		if (unbreakable){
			setBlockUnbreakable();
		}	
	}
}
