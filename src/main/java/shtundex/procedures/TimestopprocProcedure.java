package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import shtundex.init.ShtundexModMobEffects;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class TimestopprocProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ShtundexModVariables.PlayerVariables())).shtuxianenergy >= 2
				&& ((entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ShtundexModVariables.PlayerVariables())).isadvancedshtuk == true
						|| (entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ShtundexModVariables.PlayerVariables())).isshtuk == true)) {
			if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(ShtundexModMobEffects.SHTUK_MODE_CD.get()))) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"effect give @e shtundex:time_stop 20");
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(ShtundexModMobEffects.TIME_STOP.get());
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(ShtundexModMobEffects.SHTUK_MODE_CD.get(), 500, 2, false, false));
				{
					double _setval = (entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ShtundexModVariables.PlayerVariables())).shtuxianenergy - 2;
					entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.shtuxianenergy = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Wait for ability to recharge."), false);
			}
		} else {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("You not a shtuk or have not enough energy."), false);
		}
	}
}
