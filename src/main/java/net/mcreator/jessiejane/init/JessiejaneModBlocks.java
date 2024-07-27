
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jessiejane.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.jessiejane.block.WoodblockBlock;
import net.mcreator.jessiejane.block.WaterBlock;
import net.mcreator.jessiejane.block.UnderTheSeaBlockBlock;
import net.mcreator.jessiejane.block.TheblockBlock;
import net.mcreator.jessiejane.block.TNTBlock;
import net.mcreator.jessiejane.block.PearlBlockBlock;
import net.mcreator.jessiejane.block.MoonblockBlock;
import net.mcreator.jessiejane.block.LeefeBlock;
import net.mcreator.jessiejane.JessiejaneMod;

public class JessiejaneModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, JessiejaneMod.MODID);
	public static final RegistryObject<Block> PEARL_BLOCK = REGISTRY.register("pearl_block", () -> new PearlBlockBlock());
	public static final RegistryObject<Block> TNT = REGISTRY.register("tnt", () -> new TNTBlock());
	public static final RegistryObject<Block> THEBLOCK = REGISTRY.register("theblock", () -> new TheblockBlock());
	public static final RegistryObject<Block> WOODBLOCK = REGISTRY.register("woodblock", () -> new WoodblockBlock());
	public static final RegistryObject<Block> UNDER_THE_SEA_BLOCK = REGISTRY.register("under_the_sea_block", () -> new UnderTheSeaBlockBlock());
	public static final RegistryObject<Block> LEEFE = REGISTRY.register("leefe", () -> new LeefeBlock());
	public static final RegistryObject<Block> WATER = REGISTRY.register("water", () -> new WaterBlock());
	public static final RegistryObject<Block> MOONBLOCK = REGISTRY.register("moonblock", () -> new MoonblockBlock());
	public static final RegistryObject<Block> WOOD = REGISTRY.register("wood", () -> new WoodBlock());

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			TheblockBlock.blockColorLoad(event);
		}
	}
}
