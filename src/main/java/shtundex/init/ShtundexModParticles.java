
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package shtundex.init;

import shtundex.client.particle.MolniaParticle;
import shtundex.client.particle.Gog4Particle;
import shtundex.client.particle.Gigi2Particle;
import shtundex.client.particle.Gei5Particle;
import shtundex.client.particle.GaiaReefrenceParticle;
import shtundex.client.particle.Gai3Particle;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ShtundexModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(ShtundexModParticleTypes.GAIA_REEFRENCE.get(), GaiaReefrenceParticle::provider);
		event.registerSpriteSet(ShtundexModParticleTypes.GIGI_2.get(), Gigi2Particle::provider);
		event.registerSpriteSet(ShtundexModParticleTypes.GAI_3.get(), Gai3Particle::provider);
		event.registerSpriteSet(ShtundexModParticleTypes.GOG_4.get(), Gog4Particle::provider);
		event.registerSpriteSet(ShtundexModParticleTypes.GEI_5.get(), Gei5Particle::provider);
		event.registerSpriteSet(ShtundexModParticleTypes.MOLNIA.get(), MolniaParticle::provider);
	}
}
