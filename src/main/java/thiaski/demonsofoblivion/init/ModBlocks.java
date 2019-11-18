package thiaski.demonsofoblivion.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import thiaski.demonsofoblivion.blocks.NewCommonBlock;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	/**
	 NewBlock (String name, Material material, SoundType soundType, 
	float hardness, float resistance, String harvestLevelType, int harvestLevel, float lightLevel, boolean unbreakable
	*/
	
	public static final Block NETHER_DAEMONIUM_ORE = new NewCommonBlock("nether_daemonium_ore", Material.ROCK, SoundType.STONE,
			5.0F, 15.0F, "pickaxe", 3, 0.0F, false);
}
