package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import net.minecraft.world.entity.Entity;

public class ShtQ7ForceBaubleIsEquippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.isshtq7forceequipped = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
