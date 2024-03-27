package shtundex.client.gui;

import shtundex.world.inventory.StaffOfPowerMenu;

import shtundex.network.StaffOfPowerButtonMessage;

import shtundex.ShtundexMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StaffOfPowerScreen extends AbstractContainerScreen<StaffOfPowerMenu> {
	private final static HashMap<String, Object> guistate = StaffOfPowerMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_gm_1;
	Button button_gm_0;
	Button button_test;
	Button button_god_mode;
	Button button_shtuk_mode;
	Button button_fly;

	public StaffOfPowerScreen(StaffOfPowerMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("shtundex:textures/screens/staff_of_power.png");

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

		guiGraphics.blit(new ResourceLocation("shtundex:textures/screens/220px-white-noise-mv255-240x180.png"), this.leftPos + -20, this.topPos + 1, 0, 0, 220, 165, 220, 165);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.shtundex.staff_of_power.label_chtuxlagor"), 42, 4, -13312, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_gm_1 = Button.builder(Component.translatable("gui.shtundex.staff_of_power.button_gm_1"), e -> {
			if (true) {
				ShtundexMod.PACKET_HANDLER.sendToServer(new StaffOfPowerButtonMessage(0, x, y, z));
				StaffOfPowerButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 18, 45, 20).build();
		guistate.put("button:button_gm_1", button_gm_1);
		this.addRenderableWidget(button_gm_1);
		button_gm_0 = Button.builder(Component.translatable("gui.shtundex.staff_of_power.button_gm_0"), e -> {
			if (true) {
				ShtundexMod.PACKET_HANDLER.sendToServer(new StaffOfPowerButtonMessage(1, x, y, z));
				StaffOfPowerButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 40, 45, 20).build();
		guistate.put("button:button_gm_0", button_gm_0);
		this.addRenderableWidget(button_gm_0);
		button_test = Button.builder(Component.translatable("gui.shtundex.staff_of_power.button_test"), e -> {
		}).bounds(this.leftPos + 122, this.topPos + 18, 46, 20).build();
		guistate.put("button:button_test", button_test);
		this.addRenderableWidget(button_test);
		button_god_mode = Button.builder(Component.translatable("gui.shtundex.staff_of_power.button_god_mode"), e -> {
			if (true) {
				ShtundexMod.PACKET_HANDLER.sendToServer(new StaffOfPowerButtonMessage(3, x, y, z));
				StaffOfPowerButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 3, this.topPos + 74, 66, 20).build();
		guistate.put("button:button_god_mode", button_god_mode);
		this.addRenderableWidget(button_god_mode);
		button_shtuk_mode = Button.builder(Component.translatable("gui.shtundex.staff_of_power.button_shtuk_mode"), e -> {
			if (true) {
				ShtundexMod.PACKET_HANDLER.sendToServer(new StaffOfPowerButtonMessage(4, x, y, z));
				StaffOfPowerButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 108, this.topPos + 40, 77, 20).build();
		guistate.put("button:button_shtuk_mode", button_shtuk_mode);
		this.addRenderableWidget(button_shtuk_mode);
		button_fly = Button.builder(Component.translatable("gui.shtundex.staff_of_power.button_fly"), e -> {
			if (true) {
				ShtundexMod.PACKET_HANDLER.sendToServer(new StaffOfPowerButtonMessage(5, x, y, z));
				StaffOfPowerButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 3, this.topPos + 98, 40, 20).build();
		guistate.put("button:button_fly", button_fly);
		this.addRenderableWidget(button_fly);
	}
}
