
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package shtundex.init;

import shtundex.ShtundexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class ShtundexModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, ShtundexMod.MODID);
	public static final RegistryObject<Potion> SHTUXIAN_BLOOD = REGISTRY.register("shtuxian_blood",
			() -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 2, false, false), new MobEffectInstance(MobEffects.DIG_SPEED, 6000, 2, false, true), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 2, false, true),
					new MobEffectInstance(MobEffects.REGENERATION, 6000, 2, false, true), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 2, false, true)));
}
