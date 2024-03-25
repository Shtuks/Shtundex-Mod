
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package shtundex.init;

import shtundex.potion.TimeStopMobEffect;
import shtundex.potion.InvincibilityMobEffect;
import shtundex.potion.FlightMobEffect;
import shtundex.potion.CooldownMobEffect;

import shtundex.ShtundexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class ShtundexModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ShtundexMod.MODID);
	public static final RegistryObject<MobEffect> FLIGHT = REGISTRY.register("flight", () -> new FlightMobEffect());
	public static final RegistryObject<MobEffect> COOLDOWN = REGISTRY.register("cooldown", () -> new CooldownMobEffect());
	public static final RegistryObject<MobEffect> TIME_STOP = REGISTRY.register("time_stop", () -> new TimeStopMobEffect());
	public static final RegistryObject<MobEffect> INVINCIBILITY = REGISTRY.register("invincibility", () -> new InvincibilityMobEffect());
}
