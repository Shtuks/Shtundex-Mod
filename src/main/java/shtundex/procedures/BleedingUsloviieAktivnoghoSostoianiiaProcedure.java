package shtundex.procedures;

import shtundex.init.ShtundexModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

public class BleedingUsloviieAktivnoghoSostoianiiaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(ShtundexModMobEffects.CRIMSON_REGENERATION.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.REGENERATION);
		entity.clearFire();
	}
}
