
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package shtundex.init;

import shtundex.world.inventory.StaffOfPowerMenu;
import shtundex.world.inventory.ShtuxMenu;
import shtundex.world.inventory.PressGUIMenu;
import shtundex.world.inventory.MacerguiMenu;
import shtundex.world.inventory.CatsteelgenguiMenu;
import shtundex.world.inventory.CatsteelWorkbenchMenu;

import shtundex.ShtundexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class ShtundexModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ShtundexMod.MODID);
	public static final RegistryObject<MenuType<StaffOfPowerMenu>> STAFF_OF_POWER = REGISTRY.register("staff_of_power", () -> IForgeMenuType.create(StaffOfPowerMenu::new));
	public static final RegistryObject<MenuType<ShtuxMenu>> SHTUX = REGISTRY.register("shtux", () -> IForgeMenuType.create(ShtuxMenu::new));
	public static final RegistryObject<MenuType<PressGUIMenu>> PRESS_GUI = REGISTRY.register("press_gui", () -> IForgeMenuType.create(PressGUIMenu::new));
	public static final RegistryObject<MenuType<CatsteelWorkbenchMenu>> CATSTEEL_WORKBENCH = REGISTRY.register("catsteel_workbench", () -> IForgeMenuType.create(CatsteelWorkbenchMenu::new));
	public static final RegistryObject<MenuType<CatsteelgenguiMenu>> CATSTEELGENGUI = REGISTRY.register("catsteelgengui", () -> IForgeMenuType.create(CatsteelgenguiMenu::new));
	public static final RegistryObject<MenuType<MacerguiMenu>> MACERGUI = REGISTRY.register("macergui", () -> IForgeMenuType.create(MacerguiMenu::new));
}
