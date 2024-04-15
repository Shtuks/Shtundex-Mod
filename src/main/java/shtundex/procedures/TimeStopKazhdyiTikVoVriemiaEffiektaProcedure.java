package shtundex.procedures;

import net.minecraft.world.entity.Entity;

public class TimeStopKazhdyiTikVoVriemiaEffiektaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setTicksFrozen(1);
	}
}
