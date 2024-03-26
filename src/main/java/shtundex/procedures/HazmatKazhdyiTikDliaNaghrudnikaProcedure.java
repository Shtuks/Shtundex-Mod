package shtundex.procedures;

import shtundex.init.ShtundexModMobEffects;
import shtundex.init.ShtundexModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class HazmatKazhdyiTikDliaNaghrudnikaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ShtundexModItems.HAZMAT_HELMET.get())) : false)
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ShtundexModItems.HAZMAT_LEGGINGS.get())) : false)
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ShtundexModItems.HAZMAT_BOOTS.get())) : false)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ShtundexModMobEffects.ANTIRAD.get(), 60, 1, false, false));
		}
	}
}
