
package shtundex.potion;

import shtundex.procedures.ChtuxlagorPresenceKazhdyiTikVoVriemiaEffiektaProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ChtuxlagorPresenceMobEffect extends MobEffect {
	public ChtuxlagorPresenceMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.shtundex.chtuxlagor_presence";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ChtuxlagorPresenceKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
