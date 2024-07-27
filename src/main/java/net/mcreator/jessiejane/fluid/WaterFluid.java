
package net.mcreator.jessiejane.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.jessiejane.init.JessiejaneModItems;
import net.mcreator.jessiejane.init.JessiejaneModFluids;
import net.mcreator.jessiejane.init.JessiejaneModFluidTypes;
import net.mcreator.jessiejane.init.JessiejaneModBlocks;

public abstract class WaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> JessiejaneModFluidTypes.WATER_TYPE.get(), () -> JessiejaneModFluids.WATER.get(), () -> JessiejaneModFluids.FLOWING_WATER.get())
			.explosionResistance(100f).tickRate(6).bucket(() -> JessiejaneModItems.WATER_BUCKET.get()).block(() -> (LiquidBlock) JessiejaneModBlocks.WATER.get());

	private WaterFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends WaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends WaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
