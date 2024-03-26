package shtundex.client.gui;

import shtundex.world.inventory.MacerguiMenu;

import shtundex.network.MacerguiButtonMessage;

import shtundex.ShtundexMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MacerguiScreen extends AbstractContainerScreen<MacerguiMenu> {
	private final static HashMap<String, Object> guistate = MacerguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_srrownaoborot;

	public MacerguiScreen(MacerguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("shtundex:textures/screens/macergui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("shtundex:textures/screens/fire2.png"), this.leftPos + 150, this.topPos + 52, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("shtundex:textures/screens/grindingball.png"), this.leftPos + 123, this.topPos + 52, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.shtundex.macergui.label_macerator"), 60, 7, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_srrownaoborot = new ImageButton(this.leftPos + 60, this.topPos + 34, 32, 16, 0, 0, 16, new ResourceLocation("shtundex:textures/screens/atlas/imagebutton_srrownaoborot.png"), 32, 32, e -> {
			if (true) {
				ShtundexMod.PACKET_HANDLER.sendToServer(new MacerguiButtonMessage(0, x, y, z));
				MacerguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_srrownaoborot", imagebutton_srrownaoborot);
		this.addRenderableWidget(imagebutton_srrownaoborot);
	}
}
