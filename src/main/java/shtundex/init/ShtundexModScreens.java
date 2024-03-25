
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package shtundex.init;

import shtundex.client.gui.StaffOfPowerScreen;
import shtundex.client.gui.ShtuxScreen;
import shtundex.client.gui.PressGUIScreen;
import shtundex.client.gui.CatsteelWorkbenchScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ShtundexModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ShtundexModMenus.STAFF_OF_POWER.get(), StaffOfPowerScreen::new);
			MenuScreens.register(ShtundexModMenus.SHTUX.get(), ShtuxScreen::new);
			MenuScreens.register(ShtundexModMenus.PRESS_GUI.get(), PressGUIScreen::new);
			MenuScreens.register(ShtundexModMenus.CATSTEEL_WORKBENCH.get(), CatsteelWorkbenchScreen::new);
		});
	}
}
