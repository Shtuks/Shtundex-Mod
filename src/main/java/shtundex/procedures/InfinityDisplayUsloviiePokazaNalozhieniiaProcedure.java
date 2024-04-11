package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import net.minecraft.world.level.LevelAccessor;

public class InfinityDisplayUsloviiePokazaNalozhieniiaProcedure {
	public static boolean execute(LevelAccessor world) {
		if (ShtundexModVariables.WorldVariables.get(world).InfinityMode == true) {
			return true;
		}
		return false;
	}
}
