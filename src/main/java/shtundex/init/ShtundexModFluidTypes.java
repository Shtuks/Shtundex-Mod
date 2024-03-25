
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package shtundex.init;

import shtundex.fluid.types.MoltenCatsteelFluidType;

import shtundex.ShtundexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

public class ShtundexModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ShtundexMod.MODID);
	public static final RegistryObject<FluidType> MOLTEN_CATSTEEL_TYPE = REGISTRY.register("molten_catsteel", () -> new MoltenCatsteelFluidType());
}
