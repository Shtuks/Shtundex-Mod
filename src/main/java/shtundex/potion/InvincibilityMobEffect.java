
package shtundex.potion;

import shtundex.procedures.InvincibilityPriNalozhieniiEffiektaProcedure;
import shtundex.procedures.InvincibilityPriIstiechieniiEffiektaProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
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
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		InvincibilityPriNalozhieniiEffiektaProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		InvincibilityPriIstiechieniiEffiektaProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
