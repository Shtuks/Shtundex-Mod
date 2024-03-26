package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import shtundex.init.ShtundexModMobEffects;
import shtundex.init.ShtundexModItems;
import shtundex.init.ShtundexModBlocks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RadCheckProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ShtundexModVariables.PlayerVariables())).Radiation >= 500) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 60, 1, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 60, 1, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 60, 1, false, false));
		}
		if ((entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ShtundexModVariables.PlayerVariables())).Radiation >= 500) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ShtundexModMobEffects.RADIATION.get(), 60, 10, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 60, 4, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 60, 4, false, false));
		}
		if ((entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ShtundexModVariables.PlayerVariables())).Radiation >= 1000) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ShtundexModMobEffects.RADIATION.get(), 60, 1, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ShtundexModMobEffects.CATSTEEL_POSION.get(), 60, 1, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 60, 4, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 60, 4, false, false));
		}
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ShtundexModItems.URANIUM_INGOT.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ShtundexModBlocks.URANIUM_BLOCK.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ShtundexModItems.URANIUM_DUST.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ShtundexModItems.CATSTEEL_PILL.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ShtundexModItems.DEPELLETED_CATSTEEL.get())) : false)) {
			{
				double _setval = (entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ShtundexModVariables.PlayerVariables())).Radiation + 1;
				entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Radiation = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
