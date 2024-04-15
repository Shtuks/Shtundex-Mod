
package shtundex.potion;

import shtundex.procedures.EnergyShieldingKazhdyiTikVoVriemiaEffiektaProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class EnergyShieldingMobEffect extends MobEffect {
	public EnergyShieldingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16229632);
	}

	@Override
	public String getDescriptionId() {
		return "effect.shtundex.energy_shielding";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EnergyShieldingKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
