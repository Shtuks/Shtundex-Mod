
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package shtundex.init;

import shtundex.ShtundexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

public class ShtundexModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, ShtundexMod.MODID);
	public static final RegistryObject<SimpleParticleType> GAIA_REEFRENCE = REGISTRY.register("gaia_reefrence", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> GIGI_2 = REGISTRY.register("gigi_2", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> GAI_3 = REGISTRY.register("gai_3", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> GOG_4 = REGISTRY.register("gog_4", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> GEI_5 = REGISTRY.register("gei_5", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> MOLNIA = REGISTRY.register("molnia", () -> new SimpleParticleType(false));
}
