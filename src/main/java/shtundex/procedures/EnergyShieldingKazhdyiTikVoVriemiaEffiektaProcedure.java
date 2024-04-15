package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import shtundex.ShtundexMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class EnergyShieldingKazhdyiTikVoVriemiaEffiektaProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ShtundexModVariables.PlayerVariables())).shieldammount < (entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ShtundexModVariables.PlayerVariables())).maxshield) {
			ShtundexMod.queueServerWork(60, () -> {
				{
					double _setval = (entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ShtundexModVariables.PlayerVariables())).shieldammount + 1;
					entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.shieldammount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
	}
}
