package thiaski.demonsofoblivion.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import thiaski.demonsofoblivion.init.ModBlocks;

public class ModWorldGen implements IWorldGenerator {

	@Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		
		if (world.provider.getDimension() == 0) {
    	   generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
 
        if (world.provider.getDimension() == -1){
            generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
 
    }
 
    private void generateOverworld(Random random, int chunkX, int chunkZ, World world, 
    		IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        
 
    }
 
    private void generateNether(Random random, int chunkX, int chunkZ, World world, 
    		IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        generateOre(ModBlocks.NETHER_DAEMONIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 
        		0, 256, 10 + random.nextInt(4), 6, Blocks.NETHERRACK);

    }
 
    private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, 
    		int size, int chances, Block block){
 
        int deltaY = maxY - minY;
        for(int i=0; i<chances; i++){
           	BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
        	WorldGenMinable generator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(block));
           	generator.generate(world, random, pos);
       
        }
    }
}

