package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.Difficulty;
import net.minecraft.network.chat.Component;

public class InfinityModeChangerPriShchielchkiePKMProcedure {
	public static void execute(LevelAccessor world) {
		if (world.getDifficulty() == Difficulty.HARD) {
			if (ShtundexModVariables.WorldVariables.get(world).InfinityMode == false) {
				ShtundexModVariables.WorldVariables.get(world).InfinityMode = true;
				ShtundexModVariables.WorldVariables.get(world).syncData(world);
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Infinity mode activated."), false);
			} else {
				ShtundexModVariables.WorldVariables.get(world).InfinityMode = false;
				ShtundexModVariables.WorldVariables.get(world).syncData(world);
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Infinity mode diactivated."), false);
			}
		} else {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Your difficulty too low. You should use this item on \"Hard\" difficulcy."), false);
		}
	}
}
