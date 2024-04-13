package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import net.minecraft.world.level.LevelAccessor;

public class JJCActiveProcedure {
	public static void execute(LevelAccessor world) {
		if (ShtundexModVariables.WorldVariables.get(world).jjcactive == false) {
			ShtundexModVariables.WorldVariables.get(world).jjcactive = true;
			ShtundexModVariables.WorldVariables.get(world).syncData(world);
		}
		if (ShtundexModVariables.WorldVariables.get(world).jjcactive == true) {
			ShtundexModVariables.WorldVariables.get(world).jjcactive = false;
			ShtundexModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
