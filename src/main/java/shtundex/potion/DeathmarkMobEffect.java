
package shtundex.potion;

import shtundex.procedures.DeathmarkKazhdyiTikVoVriemiaEffiektaProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class DeathmarkMobEffect extends MobEffect {
	public DeathmarkMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.shtundex.deathmark";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DeathmarkKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
