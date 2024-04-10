
package shtundex.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class CrimsonRegenerationMobEffect extends MobEffect {
	public CrimsonRegenerationMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -65485);
	}

	@Override
	public String getDescriptionId() {
		return "effect.shtundex.crimson_regeneration";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
