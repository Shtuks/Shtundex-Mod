
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package shtundex.init;

import shtundex.block.ShtundexWorldPortalBlock;
import shtundex.block.ShtundexStoneBlock;
import shtundex.block.PressBlock;
import shtundex.block.MoltenCatsteelBlock;
import shtundex.block.CrateBlock;
import shtundex.block.CatsteelWorkbenchBlockBlock;
import shtundex.block.CatsteelOreBlock;
import shtundex.block.CatsteelBlockBlock;
import shtundex.block.AlphaltBlock;

import shtundex.ShtundexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class ShtundexModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ShtundexMod.MODID);
	public static final RegistryObject<Block> CATSTEEL_ORE = REGISTRY.register("catsteel_ore", () -> new CatsteelOreBlock());
	public static final RegistryObject<Block> SHTUNDEX_WORLD_PORTAL = REGISTRY.register("shtundex_world_portal", () -> new ShtundexWorldPortalBlock());
	public static final RegistryObject<Block> SHTUNDEX_STONE = REGISTRY.register("shtundex_stone", () -> new ShtundexStoneBlock());
	public static final RegistryObject<Block> ALPHALT = REGISTRY.register("alphalt", () -> new AlphaltBlock());
	public static final RegistryObject<Block> MOLTEN_CATSTEEL = REGISTRY.register("molten_catsteel", () -> new MoltenCatsteelBlock());
	public static final RegistryObject<Block> CATSTEEL_BLOCK = REGISTRY.register("catsteel_block", () -> new CatsteelBlockBlock());
	public static final RegistryObject<Block> CRATE = REGISTRY.register("crate", () -> new CrateBlock());
	public static final RegistryObject<Block> PRESS = REGISTRY.register("press", () -> new PressBlock());
	public static final RegistryObject<Block> CATSTEEL_WORKBENCH_BLOCK = REGISTRY.register("catsteel_workbench_block", () -> new CatsteelWorkbenchBlockBlock());
}
