
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jessiejane.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.jessiejane.fluid.types.WaterFluidType;
import net.mcreator.jessiejane.JessiejaneMod;

public class JessiejaneModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, JessiejaneMod.MODID);
	public static final RegistryObject<FluidType> WATER_TYPE = REGISTRY.register("water", () -> new WaterFluidType());
}
