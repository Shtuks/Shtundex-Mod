package shtundex.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class ChtuxlagorBlasterPriUdariePoSushchnostiPriedmietomProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(0);
	}
}
