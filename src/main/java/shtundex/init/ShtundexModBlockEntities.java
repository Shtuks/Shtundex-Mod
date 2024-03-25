
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package shtundex.init;

import shtundex.block.entity.PressBlockEntity;
import shtundex.block.entity.CatsteelWorkbenchBlockBlockEntity;

import shtundex.ShtundexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class ShtundexModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ShtundexMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> PRESS = register("press", ShtundexModBlocks.PRESS, PressBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CATSTEEL_WORKBENCH_BLOCK = register("catsteel_workbench_block", ShtundexModBlocks.CATSTEEL_WORKBENCH_BLOCK, CatsteelWorkbenchBlockBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
