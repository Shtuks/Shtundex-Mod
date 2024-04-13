
package shtundex.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ShtuxianRevivalMobEffect extends MobEffect {
	public ShtuxianRevivalMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16742637);
	}

	@Override
	public String getDescriptionId() {
		return "effect.shtundex.shtuxian_revival";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
