package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import net.minecraft.world.entity.Entity;

public class CatclothonProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 8;
			entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.maxshield = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
