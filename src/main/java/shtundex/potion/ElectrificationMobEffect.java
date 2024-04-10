
package shtundex.potion;

import shtundex.procedures.ElectrificationKazhdyiTikVoVriemiaEffiektaProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ElectrificationMobEffect extends MobEffect {
	public ElectrificationMobEffect() {
		super(MobEffectCategory.HARMFUL, -3342337);
	}

	@Override
	public String getDescriptionId() {
		return "effect.shtundex.electrification";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ElectrificationKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
