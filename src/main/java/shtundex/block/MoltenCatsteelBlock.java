
package shtundex.block;

import shtundex.init.ShtundexModFluids;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

public class MoltenCatsteelBlock extends LiquidBlock {
	public MoltenCatsteelBlock() {
		super(() -> ShtundexModFluids.MOLTEN_CATSTEEL.get(), BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).strength(460f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 15).noCollission()
				.noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
