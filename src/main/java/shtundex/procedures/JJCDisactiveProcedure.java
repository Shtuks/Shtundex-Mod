package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

public class JJCDisactiveProcedure {
	public static void execute(LevelAccessor world) {
		ShtundexModVariables.WorldVariables.get(world).jjcactive = false;
		ShtundexModVariables.WorldVariables.get(world).syncData(world);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Compatibility turned off."), false);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Recomended to reenter world."), false);
	}
}
