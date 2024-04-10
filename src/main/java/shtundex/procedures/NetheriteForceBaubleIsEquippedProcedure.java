package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import net.minecraft.world.entity.Entity;

public class NetheriteForceBaubleIsEquippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.isnetheriteforceequiped = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
