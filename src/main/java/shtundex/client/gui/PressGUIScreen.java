package shtundex.client.gui;

import shtundex.world.inventory.PressGUIMenu;

import shtundex.network.PressGUIButtonMessage;

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

public class PressGUIScreen extends AbstractContainerScreen<PressGUIMenu> {
	private final static HashMap<String, Object> guistate = PressGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_srrownaoborot;

	public PressGUIScreen(PressGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("shtundex:textures/screens/press_gui.png");

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

		guiGraphics.blit(new ResourceLocation("shtundex:textures/screens/fire2.png"), this.leftPos + 151, this.topPos + 55, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("shtundex:textures/screens/platepress.png"), this.leftPos + 124, this.topPos + 55, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("shtundex:textures/screens/blackie.png"), this.leftPos + 0, this.topPos + 1, 0, 0, 176, 166, 176, 166);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.shtundex.press_gui.label_press"), 71, 4, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_srrownaoborot = new ImageButton(this.leftPos + 64, this.topPos + 35, 32, 16, 0, 0, 16, new ResourceLocation("shtundex:textures/screens/atlas/imagebutton_srrownaoborot.png"), 32, 32, e -> {
			if (true) {
				ShtundexMod.PACKET_HANDLER.sendToServer(new PressGUIButtonMessage(0, x, y, z));
				PressGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_srrownaoborot", imagebutton_srrownaoborot);
		this.addRenderableWidget(imagebutton_srrownaoborot);
	}
}
