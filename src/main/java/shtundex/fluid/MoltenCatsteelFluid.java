
package shtundex.fluid;

import shtundex.init.ShtundexModItems;
import shtundex.init.ShtundexModFluids;
import shtundex.init.ShtundexModFluidTypes;
import shtundex.init.ShtundexModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

public abstract class MoltenCatsteelFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ShtundexModFluidTypes.MOLTEN_CATSTEEL_TYPE.get(), () -> ShtundexModFluids.MOLTEN_CATSTEEL.get(),
			() -> ShtundexModFluids.FLOWING_MOLTEN_CATSTEEL.get()).explosionResistance(460f).bucket(() -> ShtundexModItems.MOLTEN_CATSTEEL_BUCKET.get()).block(() -> (LiquidBlock) ShtundexModBlocks.MOLTEN_CATSTEEL.get());

	private MoltenCatsteelFluid() {
		super(PROPERTIES);
	}

	public static class Source extends MoltenCatsteelFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MoltenCatsteelFluid {
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
