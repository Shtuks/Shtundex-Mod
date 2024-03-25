
package shtundex.client.screens;

import shtundex.procedures.ShtuxianEnergyGuiProcedure;
import shtundex.procedures.ShtukCheckProcedure;
import shtundex.procedures.Energy7Procedure;
import shtundex.procedures.Energy6Procedure;
import shtundex.procedures.Energy5Procedure;
import shtundex.procedures.Energy4Procedure;
import shtundex.procedures.Energy3Procedure;
import shtundex.procedures.Energy2Procedure;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ShtukGUIOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (ShtukCheckProcedure.execute(entity)) {
			if (Energy7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("shtundex:textures/screens/energy1.png"), w / 2 + -8, h / 2 + 69, 0, 0, 16, 16, 16, 16);
			}
			if (Energy6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("shtundex:textures/screens/energy2.png"), w / 2 + -8, h / 2 + 69, 0, 0, 16, 16, 16, 16);
			}
			if (Energy5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("shtundex:textures/screens/energy3.png"), w / 2 + -8, h / 2 + 69, 0, 0, 16, 16, 16, 16);
			}
			if (Energy4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("shtundex:textures/screens/energy4.png"), w / 2 + -8, h / 2 + 69, 0, 0, 16, 16, 16, 16);
			}
			if (Energy3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("shtundex:textures/screens/energy5.png"), w / 2 + -8, h / 2 + 69, 0, 0, 16, 16, 16, 16);
			}
			if (Energy2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("shtundex:textures/screens/energy6.png"), w / 2 + -8, h / 2 + 69, 0, 0, 16, 16, 16, 16);
			}
			if (ShtuxianEnergyGuiProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("shtundex:textures/screens/energy7.png"), w / 2 + -8, h / 2 + 69, 0, 0, 16, 16, 16, 16);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
