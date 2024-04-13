package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class JJCActiveProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		if (BoolArgumentType.getBool(arguments, "shtundexcompatibility") == true) {
			ShtundexModVariables.WorldVariables.get(world).jjcactive = true;
			ShtundexModVariables.WorldVariables.get(world).syncData(world);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Compatibility turned on."), false);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Recomended to reenter world."), false);
		}
		if (BoolArgumentType.getBool(arguments, "shtundexcompatibility") == false) {
			ShtundexModVariables.WorldVariables.get(world).jjcactive = false;
			ShtundexModVariables.WorldVariables.get(world).syncData(world);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Compatibility turned off."), false);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Recomended to reenter world."), false);
		}
	}
}
