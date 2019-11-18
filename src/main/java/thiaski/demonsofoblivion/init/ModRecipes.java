package thiaski.demonsofoblivion.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		
		GameRegistry.addSmelting(ModBlocks.NETHER_DAEMONIUM_ORE, new ItemStack(ModItems.DAEMONIUM_INGOT, 1), 1.5F);
	}

}
