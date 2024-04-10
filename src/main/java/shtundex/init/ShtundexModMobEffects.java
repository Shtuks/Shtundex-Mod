
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package shtundex.init;

import shtundex.potion.TimeStopMobEffect;
import shtundex.potion.ShtukModeCDMobEffect;
import shtundex.potion.RadiationMobEffect;
import shtundex.potion.NothingMobEffect;
import shtundex.potion.InvincibilityMobEffect;
import shtundex.potion.HtucMobEffect;
import shtundex.potion.FlightMobEffect;
import shtundex.potion.ElectrificationMobEffect;
import shtundex.potion.CrimsonRegenerationMobEffect;
import shtundex.potion.CooldownMobEffect;
import shtundex.potion.ChtuxlagorPresenceMobEffect;
import shtundex.potion.CatsteelPosionMobEffect;
import shtundex.potion.BleedingMobEffect;
import shtundex.potion.AntiradMobEffect;
import shtundex.potion.AntiCreativeMobEffect;

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
	public static final RegistryObject<MobEffect> CATSTEEL_POSION = REGISTRY.register("catsteel_posion", () -> new CatsteelPosionMobEffect());
	public static final RegistryObject<MobEffect> ANTIRAD = REGISTRY.register("antirad", () -> new AntiradMobEffect());
	public static final RegistryObject<MobEffect> RADIATION = REGISTRY.register("radiation", () -> new RadiationMobEffect());
	public static final RegistryObject<MobEffect> HTUC = REGISTRY.register("htuc", () -> new HtucMobEffect());
	public static final RegistryObject<MobEffect> CHTUXLAGOR_PRESENCE = REGISTRY.register("chtuxlagor_presence", () -> new ChtuxlagorPresenceMobEffect());
	public static final RegistryObject<MobEffect> SHTUK_MODE_CD = REGISTRY.register("shtuk_mode_cd", () -> new ShtukModeCDMobEffect());
	public static final RegistryObject<MobEffect> NOTHING = REGISTRY.register("nothing", () -> new NothingMobEffect());
	public static final RegistryObject<MobEffect> CRIMSON_REGENERATION = REGISTRY.register("crimson_regeneration", () -> new CrimsonRegenerationMobEffect());
	public static final RegistryObject<MobEffect> BLEEDING = REGISTRY.register("bleeding", () -> new BleedingMobEffect());
	public static final RegistryObject<MobEffect> ANTI_CREATIVE = REGISTRY.register("anti_creative", () -> new AntiCreativeMobEffect());
	public static final RegistryObject<MobEffect> ELECTRIFICATION = REGISTRY.register("electrification", () -> new ElectrificationMobEffect());
}
