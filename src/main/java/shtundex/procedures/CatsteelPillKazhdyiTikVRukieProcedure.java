package shtundex.procedures;

import shtundex.init.ShtundexModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class CatsteelPillKazhdyiTikVRukieProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(ShtundexModMobEffects.ANTIRAD.get()))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ShtundexModMobEffects.CATSTEEL_POSION.get(), 60, 1, false, false));
		}
	}
}
