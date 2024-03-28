package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class RanciProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ShtundexModVariables.PlayerVariables())).ranech == true) {
			entity.setDeltaMovement(new Vec3(0, (1.2 + entity.getDeltaMovement().y()), 0));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.DRIPPING_LAVA, x, y, z, 10, 1, 1, 1, 1);
		}
	}
}
