
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package shtundex.init;

import shtundex.fluid.MoltenCatsteelFluid;

import shtundex.ShtundexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

public class ShtundexModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, ShtundexMod.MODID);
	public static final RegistryObject<FlowingFluid> MOLTEN_CATSTEEL = REGISTRY.register("molten_catsteel", () -> new MoltenCatsteelFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_CATSTEEL = REGISTRY.register("flowing_molten_catsteel", () -> new MoltenCatsteelFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(MOLTEN_CATSTEEL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MOLTEN_CATSTEEL.get(), RenderType.translucent());
		}
	}
}
