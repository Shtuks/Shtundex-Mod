package shtundex.procedures;

import shtundex.init.ShtundexModMobEffects;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class ShtuxSwordKazhdyiTikVRukieProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(ShtundexModMobEffects.HTUC.get(), 60, 1, false, false));
		JJCCheckProcedure.execute(world, x, y, z, entity, itemstack);
	}
}
