
package shtundex.potion;

import shtundex.procedures.CatsteelPosionKazhdyiTikVoVriemiaEffiektaProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class CatsteelPosionMobEffect extends MobEffect {
	public CatsteelPosionMobEffect() {
		super(MobEffectCategory.HARMFUL, -26368);
	}

	@Override
	public String getDescriptionId() {
		return "effect.shtundex.catsteel_posion";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		CatsteelPosionKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
