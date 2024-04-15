package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import shtundex.init.ShtundexModMobEffects;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

public class NormdasshProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (ShtundexModVariables.WorldVariables.get(world).InfinityMode == true) {
			if (!(entity instanceof Player player && player.getAbilities().flying)) {
				if (!world.getBlockState(BlockPos.containing(x, y - 0.5, z)).canOcclude() && !(entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(ShtundexModMobEffects.COOLDOWN.get()))) {
					entity.setDeltaMovement(new Vec3((1.3 * entity.getLookAngle().x), (1.1 * entity.getLookAngle().y), (1.3 * entity.getLookAngle().z)));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(ShtundexModMobEffects.COOLDOWN.get(), 10, 1, false, false));
				}
			}
		}
	}
}
