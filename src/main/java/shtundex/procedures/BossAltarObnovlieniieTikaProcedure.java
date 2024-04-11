package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import shtundex.entity.DrShtuxibusEntity;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.Comparator;

public class BossAltarObnovlieniieTikaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (ShtundexModVariables.WorldVariables.get(world).shtuxhealed == false && ShtundexModVariables.WorldVariables.get(world).shtuxteleported == false) {
			{
				Entity _ent = ((Entity) world.getEntitiesOfClass(DrShtuxibusEntity.class, AABB.ofSize(new Vec3(x, y, z), 12, 12, 12), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null));
				_ent.teleportTo(x, (y + 2), z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, (y + 2), z, _ent.getYRot(), _ent.getXRot());
			}
			ShtundexModVariables.WorldVariables.get(world).shtuxteleported = true;
			ShtundexModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
