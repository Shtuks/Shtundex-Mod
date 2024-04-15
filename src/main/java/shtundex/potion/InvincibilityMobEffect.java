
package shtundex.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class InvincibilityMobEffect extends MobEffect {
	public InvincibilityMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6684673);
	}

	@Override
	public String getDescriptionId() {
		return "effect.shtundex.invincibility";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
