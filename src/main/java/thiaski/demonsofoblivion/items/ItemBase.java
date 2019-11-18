package thiaski.demonsofoblivion.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import thiaski.demonsofoblivion.Main;
import thiaski.demonsofoblivion.init.ModItems;
import thiaski.demonsofoblivion.util.IHasModel;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
