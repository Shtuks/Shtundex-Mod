package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import net.minecraft.world.entity.Entity;

public class ShtuxibusForceBaubleIsUnequippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = false;
			entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.isshtuxianforcequipped = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = false;
			entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.CatsteelShiel = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
