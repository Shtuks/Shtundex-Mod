package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

public class JJCActiveProcedure {
	public static void execute(LevelAccessor world) {
		ShtundexModVariables.WorldVariables.get(world).jjcactive = true;
		ShtundexModVariables.WorldVariables.get(world).syncData(world);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Compatibility turned on."), false);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Recomended to reenter world."), false);
	}
}
