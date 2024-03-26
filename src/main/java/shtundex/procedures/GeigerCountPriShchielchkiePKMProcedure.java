package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class GeigerCountPriShchielchkiePKMProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ShtundexModVariables.PlayerVariables())).Radiation > 1000) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("WARNING! Critical RAD Level. (>1000)"), false);
		} else if ((entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ShtundexModVariables.PlayerVariables())).Radiation > 500) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("WARNING! Your RAD too high. (>500)"), false);
		}
		if ((entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ShtundexModVariables.PlayerVariables())).Radiation < 100) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Your RAD is normal. (<100)"), false);
		}
	}
}
