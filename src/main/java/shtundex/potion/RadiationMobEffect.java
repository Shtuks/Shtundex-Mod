
package shtundex.potion;

import shtundex.procedures.RadiationKazhdyiTikVoVriemiaEffiektaProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RadiationMobEffect extends MobEffect {
	public RadiationMobEffect() {
		super(MobEffectCategory.HARMFUL, -16711936);
	}

	@Override
	public String getDescriptionId() {
		return "effect.shtundex.radiation";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RadiationKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
