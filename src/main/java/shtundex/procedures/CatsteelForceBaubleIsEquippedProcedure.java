package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class CatsteelForceBaubleIsEquippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			_player.getAbilities().mayfly = true;
			_player.onUpdateAbilities();
		}
		{
			boolean _setval = true;
			entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.iscatsteelforceequiped = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
