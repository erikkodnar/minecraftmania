
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jessiejane.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.jessiejane.JessiejaneMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JessiejaneModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JessiejaneMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(JessiejaneModBlocks.TNT.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(JessiejaneModItems.TOOL.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(JessiejaneModBlocks.PEARL_BLOCK.get().asItem());
			tabData.accept(JessiejaneModBlocks.THEBLOCK.get().asItem());
			tabData.accept(JessiejaneModBlocks.WOODBLOCK.get().asItem());
			tabData.accept(JessiejaneModBlocks.UNDER_THE_SEA_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(JessiejaneModItems.RAINTOOL.get());
			tabData.accept(JessiejaneModItems.TOOL.get());
			tabData.accept(JessiejaneModItems.REDTOOL.get());
			tabData.accept(JessiejaneModItems.TREETOOL.get());
			tabData.accept(JessiejaneModItems.PICK.get());
		}
	}
}
