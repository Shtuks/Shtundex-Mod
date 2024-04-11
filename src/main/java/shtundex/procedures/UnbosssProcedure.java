package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import net.minecraft.world.level.LevelAccessor;

public class UnbosssProcedure {
	public static void execute(LevelAccessor world) {
		ShtundexModVariables.WorldVariables.get(world).bossalife = false;
		ShtundexModVariables.WorldVariables.get(world).syncData(world);
	}
}
