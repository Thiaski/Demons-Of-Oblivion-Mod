package thiaski.demonsofoblivion.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import thiaski.demonsofoblivion.items.ItemBase;
import thiaski.demonsofoblivion.items.armor.ArmorBase;
import thiaski.demonsofoblivion.items.tools.ToolSword;
import thiaski.demonsofoblivion.util.Reference;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_DAEMONIUM = EnumHelper.addToolMaterial("material_daemonium", 4, 2000, 10.0F, 5.0F, 15);
	public static final ArmorMaterial ARMOR_MATERIAL_DAEMONIUM = EnumHelper.addArmorMaterial("armor_material_daemonium", 
			Reference.MOD_ID + ":daemonium", 15, new int[] {3, 7, 10, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	//Items 
	public static final Item DAEMONIUM_INGOT = new ItemBase("daemonium_ingot");
	
	
	//Tools
	public static final ItemSword DAEMONIUM_SWORD = new ToolSword("daemonium_sword", MATERIAL_DAEMONIUM);
	
	
	//Armors
	public static final Item DAEMONIUM_HELMET = new ArmorBase("daemonium_helmet", ARMOR_MATERIAL_DAEMONIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item DAEMONIUM_CHESTPLATE = new ArmorBase("daemonium_chestplate", ARMOR_MATERIAL_DAEMONIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item DAEMONIUM_LEGGINGS = new ArmorBase("daemonium_leggings", ARMOR_MATERIAL_DAEMONIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item DAEMONIUM_BOOTS = new ArmorBase("daemonium_boots", ARMOR_MATERIAL_DAEMONIUM, 1, EntityEquipmentSlot.FEET);
}
