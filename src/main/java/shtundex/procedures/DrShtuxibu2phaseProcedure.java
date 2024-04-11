package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import shtundex.init.ShtundexModEntities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class DrShtuxibu2phaseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "stopsound @a");
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = ShtundexModEntities.SHTUXIBUS_EX.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
		ShtundexModVariables.WorldVariables.get(world).bossalife = false;
		ShtundexModVariables.WorldVariables.get(world).syncData(world);
		ShtundexModVariables.WorldVariables.get(world).shtuxteleported = false;
		ShtundexModVariables.WorldVariables.get(world).syncData(world);
		ShtundexModVariables.WorldVariables.get(world).shtuxPhase3LAST = false;
		ShtundexModVariables.WorldVariables.get(world).syncData(world);
		ShtundexModVariables.WorldVariables.get(world).shtuxibusdefeated = true;
		ShtundexModVariables.WorldVariables.get(world).syncData(world);
	}
}
