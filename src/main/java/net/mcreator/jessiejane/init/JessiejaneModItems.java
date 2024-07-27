
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jessiejane.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.jessiejane.item.WaterItem;
import net.mcreator.jessiejane.item.TreetoolItem;
import net.mcreator.jessiejane.item.ToolItem;
import net.mcreator.jessiejane.item.RedtoolItem;
import net.mcreator.jessiejane.item.RaintoolItem;
import net.mcreator.jessiejane.item.PickItem;
import net.mcreator.jessiejane.item.PearlingotItem;
import net.mcreator.jessiejane.item.PearlItem;
import net.mcreator.jessiejane.JessiejaneMod;

public class JessiejaneModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, JessiejaneMod.MODID);
	public static final RegistryObject<Item> PEARL = REGISTRY.register("pearl", () -> new PearlItem());
	public static final RegistryObject<Item> PEARL_BLOCK = block(JessiejaneModBlocks.PEARL_BLOCK);
	public static final RegistryObject<Item> PEARLINGOT = REGISTRY.register("pearlingot", () -> new PearlingotItem());
	public static final RegistryObject<Item> TNT = block(JessiejaneModBlocks.TNT);
	public static final RegistryObject<Item> THEBLOCK = block(JessiejaneModBlocks.THEBLOCK);
	public static final RegistryObject<Item> WOODBLOCK = block(JessiejaneModBlocks.WOODBLOCK);
	public static final RegistryObject<Item> UNDER_THE_SEA_BLOCK = block(JessiejaneModBlocks.UNDER_THE_SEA_BLOCK);
	public static final RegistryObject<Item> LEEFE = block(JessiejaneModBlocks.LEEFE);
	public static final RegistryObject<Item> RAINTOOL = REGISTRY.register("raintool", () -> new RaintoolItem());
	public static final RegistryObject<Item> TOOL = REGISTRY.register("tool", () -> new ToolItem());
	public static final RegistryObject<Item> REDTOOL = REGISTRY.register("redtool", () -> new RedtoolItem());
	public static final RegistryObject<Item> TREETOOL = REGISTRY.register("treetool", () -> new TreetoolItem());
	public static final RegistryObject<Item> WATER_BUCKET = REGISTRY.register("water_bucket", () -> new WaterItem());
	public static final RegistryObject<Item> PICK = REGISTRY.register("pick", () -> new PickItem());
	public static final RegistryObject<Item> MOONBLOCK = block(JessiejaneModBlocks.MOONBLOCK);
	public static final RegistryObject<Item> WOOD = block(JessiejaneModBlocks.WOOD);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
