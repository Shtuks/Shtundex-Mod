package shtundex.procedures;

import shtundex.init.ShtundexModMobEffects;

import shtundex.ShtundexMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;

public class SpecialAttackPriNazhatiiKlavishiProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(ShtundexModMobEffects.COOLDOWN.get()))) {
			ShtundexMod.queueServerWork(10, () -> {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			});
			ShtundexMod.queueServerWork(10, () -> {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			});
			ShtundexMod.queueServerWork(10, () -> {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			});
			ShtundexMod.queueServerWork(10, () -> {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			});
			ShtundexMod.queueServerWork(10, () -> {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			});
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ShtundexModMobEffects.COOLDOWN.get(), 100, 0, false, false));
		}
	}
}
