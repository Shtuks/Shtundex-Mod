package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class DrShtuxibusHealVampProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ShtundexModVariables.WorldVariables.get(world).shtuxteleported = false;
		ShtundexModVariables.WorldVariables.get(world).syncData(world);
		ShtundexModVariables.WorldVariables.get(world).shtuxhealed = false;
		ShtundexModVariables.WorldVariables.get(world).syncData(world);
		ShtundexModVariables.WorldVariables.get(world).bossalife = false;
		ShtundexModVariables.WorldVariables.get(world).syncData(world);
		ShtundexModVariables.WorldVariables.get(world).shtuxPhase3LAST = false;
		ShtundexModVariables.WorldVariables.get(world).syncData(world);
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "stopsound @a");
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Shtuxibus> This is proof of my superiority over all life forms."), false);
		{
			Entity _ent = entity;
			_ent.teleportTo(x, (y + 9999), z);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(x, (y + 9999), z, _ent.getYRot(), _ent.getXRot());
		}
	}
}
