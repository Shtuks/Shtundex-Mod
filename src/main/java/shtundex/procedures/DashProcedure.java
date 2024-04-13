package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class DashProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (ShtundexModVariables.WorldVariables.get(world).bossalife == false) {
			if ((entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ShtundexModVariables.PlayerVariables())).isshtuk == true
					|| (entity.getCapability(ShtundexModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ShtundexModVariables.PlayerVariables())).isadvancedshtuk == true) {
				entity.setDeltaMovement(new Vec3((2 * entity.getLookAngle().x), (2 * entity.getLookAngle().y), (2 * entity.getLookAngle().z)));
			} else {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("You not a shtuk."), false);
			}
		}
	}
}
