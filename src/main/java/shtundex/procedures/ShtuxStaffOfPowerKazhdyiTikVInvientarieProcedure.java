package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;

public class ShtuxStaffOfPowerKazhdyiTikVInvientarieProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		if (ShtundexModVariables.WorldVariables.get(world).InfinityMode == false) {
			itemstack.shrink(1);
		}
	}
}
