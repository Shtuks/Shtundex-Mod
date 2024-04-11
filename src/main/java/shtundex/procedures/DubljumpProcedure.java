package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class DubljumpProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (ShtundexModVariables.WorldVariables.get(world).InfinityMode == true) {
			if ((entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ShtundexModVariables.PlayerVariables())).isonblock == false && !world.getBlockState(BlockPos.containing(x, y - 0.5, z)).canOcclude()) {
				entity.setDeltaMovement(new Vec3((0 + entity.getDeltaMovement().x()), (0.5 + entity.getDeltaMovement().y()), (0 + entity.getDeltaMovement().z())));
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 5, 1, 1, 1, 1);
				{
					boolean _setval = true;
					entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.isonblock = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
