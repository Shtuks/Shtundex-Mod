
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package shtundex.init;

import shtundex.ShtundexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class ShtundexModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ShtundexMod.MODID);
	public static final RegistryObject<SoundEvent> SWORDLAND = REGISTRY.register("swordland", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("shtundex", "swordland")));
	public static final RegistryObject<SoundEvent> TIMESTOPZA = REGISTRY.register("timestopza", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("shtundex", "timestopza")));
	public static final RegistryObject<SoundEvent> TIMERES = REGISTRY.register("timeres", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("shtundex", "timeres")));
	public static final RegistryObject<SoundEvent> ABILITYSOUND = REGISTRY.register("abilitysound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("shtundex", "abilitysound")));
	public static final RegistryObject<SoundEvent> BLASTSOUND = REGISTRY.register("blastsound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("shtundex", "blastsound")));
	public static final RegistryObject<SoundEvent> SHTUX1TEME = REGISTRY.register("shtux1teme", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("shtundex", "shtux1teme")));
	public static final RegistryObject<SoundEvent> SHTUX2THEME = REGISTRY.register("shtux2theme", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("shtundex", "shtux2theme")));
}
