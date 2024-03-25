
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package shtundex.init;

import shtundex.network.ZaWarduoMessage;
import shtundex.network.NormDashMessage;
import shtundex.network.HotkryAbility4Message;
import shtundex.network.HotkeyAbility2Message;
import shtundex.network.HotkeyAbility1Message;
import shtundex.network.DoubleJumpKeyMessage;
import shtundex.network.DashKeyMessage;
import shtundex.network.AbilityHotkey3Message;

import shtundex.ShtundexMod;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ShtundexModKeyMappings {
	public static final KeyMapping HOTKEY_ABILITY_1 = new KeyMapping("key.shtundex.hotkey_ability_1", GLFW.GLFW_KEY_KP_1, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ShtundexMod.PACKET_HANDLER.sendToServer(new HotkeyAbility1Message(0, 0));
				HotkeyAbility1Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping HOTKEY_ABILITY_2 = new KeyMapping("key.shtundex.hotkey_ability_2", GLFW.GLFW_KEY_KP_2, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ShtundexMod.PACKET_HANDLER.sendToServer(new HotkeyAbility2Message(0, 0));
				HotkeyAbility2Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ZA_WARDUO = new KeyMapping("key.shtundex.za_warduo", GLFW.GLFW_KEY_KP_3, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ShtundexMod.PACKET_HANDLER.sendToServer(new ZaWarduoMessage(0, 0));
				ZaWarduoMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DASH_KEY = new KeyMapping("key.shtundex.dash_key", GLFW.GLFW_KEY_KP_5, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ShtundexMod.PACKET_HANDLER.sendToServer(new DashKeyMessage(0, 0));
				DashKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping NORM_DASH = new KeyMapping("key.shtundex.norm_dash", GLFW.GLFW_KEY_KP_6, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ShtundexMod.PACKET_HANDLER.sendToServer(new NormDashMessage(0, 0));
				NormDashMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DOUBLE_JUMP_KEY = new KeyMapping("key.shtundex.double_jump_key", GLFW.GLFW_KEY_SPACE, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ShtundexMod.PACKET_HANDLER.sendToServer(new DoubleJumpKeyMessage(0, 0));
				DoubleJumpKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ABILITY_HOTKEY_3 = new KeyMapping("key.shtundex.ability_hotkey_3", GLFW.GLFW_KEY_KP_4, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ShtundexMod.PACKET_HANDLER.sendToServer(new AbilityHotkey3Message(0, 0));
				AbilityHotkey3Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping HOTKRY_ABILITY_4 = new KeyMapping("key.shtundex.hotkry_ability_4", GLFW.GLFW_KEY_KP_8, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ShtundexMod.PACKET_HANDLER.sendToServer(new HotkryAbility4Message(0, 0));
				HotkryAbility4Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(HOTKEY_ABILITY_1);
		event.register(HOTKEY_ABILITY_2);
		event.register(ZA_WARDUO);
		event.register(DASH_KEY);
		event.register(NORM_DASH);
		event.register(DOUBLE_JUMP_KEY);
		event.register(ABILITY_HOTKEY_3);
		event.register(HOTKRY_ABILITY_4);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				HOTKEY_ABILITY_1.consumeClick();
				HOTKEY_ABILITY_2.consumeClick();
				ZA_WARDUO.consumeClick();
				DASH_KEY.consumeClick();
				NORM_DASH.consumeClick();
				DOUBLE_JUMP_KEY.consumeClick();
				ABILITY_HOTKEY_3.consumeClick();
				HOTKRY_ABILITY_4.consumeClick();
			}
		}
	}
}
