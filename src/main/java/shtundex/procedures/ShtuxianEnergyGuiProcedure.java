package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import net.minecraft.world.entity.Entity;

public class ShtuxianEnergyGuiProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ShtundexModVariables.PlayerVariables())).shtuxianenergy == 0) {
			return true;
		}
		return false;
	}
}
