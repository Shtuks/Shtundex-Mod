
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package shtundex.init;

import shtundex.enchantment.AbsoluteUnbreakingEnchantment;

import shtundex.ShtundexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

public class ShtundexModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ShtundexMod.MODID);
	public static final RegistryObject<Enchantment> ABSOLUTE_UNBREAKING = REGISTRY.register("absolute_unbreaking", () -> new AbsoluteUnbreakingEnchantment());
}
