package shtundex.procedures;

import shtundex.init.ShtundexModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.core.BlockPos;

public class ChalkPriShchielchkiePKMPoBlokuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		world.setBlock(BlockPos.containing(x, y + 1, z), ShtundexModBlocks.CHALK_RITUAL.get().defaultBlockState(), 3);
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}
