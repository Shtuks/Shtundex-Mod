package shtundex.procedures;

import shtundex.init.ShtundexModMobEffects;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

public class NormdasshProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(ShtundexModMobEffects.COOLDOWN.get()))) {
			entity.setDeltaMovement(new Vec3((1.5 * entity.getLookAngle().x), (1.2 * entity.getLookAngle().y), (1.5 * entity.getLookAngle().z)));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ShtundexModMobEffects.COOLDOWN.get(), 100, 1, false, false));
		} else {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Ability on cooldown."), false);
		}
	}
}
