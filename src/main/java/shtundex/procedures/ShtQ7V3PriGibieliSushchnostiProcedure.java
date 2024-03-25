package shtundex.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

public class ShtQ7V3PriGibieliSushchnostiProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Sht-Q7> Ouch. That hurt... I can't continue."), false);
	}
}
