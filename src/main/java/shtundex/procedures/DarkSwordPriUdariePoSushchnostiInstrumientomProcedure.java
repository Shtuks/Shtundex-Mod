package shtundex.procedures;

import shtundex.init.ShtundexModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class DarkSwordPriUdariePoSushchnostiInstrumientomProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(ShtundexModMobEffects.RADIATION.get(), 200, 1, false, false));
	}
}
