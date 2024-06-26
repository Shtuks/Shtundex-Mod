
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package shtundex.init;

import shtundex.client.renderer.VampireRenderer;
import shtundex.client.renderer.TestBananaRenderer;
import shtundex.client.renderer.ShtuxibusEXRenderer;
import shtundex.client.renderer.ShtuxianColiderRenderer;
import shtundex.client.renderer.ShtuxSwordProjRenderer;
import shtundex.client.renderer.ShtukRenderer;
import shtundex.client.renderer.ShtQ7V3Renderer;
import shtundex.client.renderer.ShtPrigaiteRenderer;
import shtundex.client.renderer.IrradiatedSlimeRenderer;
import shtundex.client.renderer.HumanRenderer;
import shtundex.client.renderer.DrShtuxibusRenderer;
import shtundex.client.renderer.DrShtuxibusRematchRenderer;
import shtundex.client.renderer.DrShtuxibus2Renderer;
import shtundex.client.renderer.ChtuxlagorRenderer;
import shtundex.client.renderer.BlackHoleRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ShtundexModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ShtundexModEntities.DR_SHTUXIBUS.get(), DrShtuxibusRenderer::new);
		event.registerEntityRenderer(ShtundexModEntities.SHTUXIAN_COLIDER.get(), ShtuxianColiderRenderer::new);
		event.registerEntityRenderer(ShtundexModEntities.SHTUXIBUS_EX.get(), ShtuxibusEXRenderer::new);
		event.registerEntityRenderer(ShtundexModEntities.BLASTER_PROJ.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ShtundexModEntities.SHT_Q_7_V_3.get(), ShtQ7V3Renderer::new);
		event.registerEntityRenderer(ShtundexModEntities.SHTUXIBUS_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ShtundexModEntities.SHT_PRIGAITE.get(), ShtPrigaiteRenderer::new);
		event.registerEntityRenderer(ShtundexModEntities.BLACK_HOLE.get(), BlackHoleRenderer::new);
		event.registerEntityRenderer(ShtundexModEntities.DR_SHTUXIBUS_REMATCH.get(), DrShtuxibusRematchRenderer::new);
		event.registerEntityRenderer(ShtundexModEntities.DR_SHTUXIBUS_2.get(), DrShtuxibus2Renderer::new);
		event.registerEntityRenderer(ShtundexModEntities.TEST_BANANA.get(), TestBananaRenderer::new);
		event.registerEntityRenderer(ShtundexModEntities.CHTUXLAGOR.get(), ChtuxlagorRenderer::new);
		event.registerEntityRenderer(ShtundexModEntities.VAMPIRE.get(), VampireRenderer::new);
		event.registerEntityRenderer(ShtundexModEntities.HUMAN.get(), HumanRenderer::new);
		event.registerEntityRenderer(ShtundexModEntities.SHTUK.get(), ShtukRenderer::new);
		event.registerEntityRenderer(ShtundexModEntities.SHTUX_SWORD_PROJ.get(), ShtuxSwordProjRenderer::new);
		event.registerEntityRenderer(ShtundexModEntities.IRRADIATED_SLIME.get(), IrradiatedSlimeRenderer::new);
		event.registerEntityRenderer(ShtundexModEntities.HARGETEIR_2.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ShtundexModEntities.DIRT_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
