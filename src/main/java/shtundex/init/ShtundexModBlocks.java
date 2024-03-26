
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package shtundex.init;

import shtundex.block.UraniumOreBlock;
import shtundex.block.UraniumBlockBlock;
import shtundex.block.TinOreBlock;
import shtundex.block.TinBlockBlock;
import shtundex.block.ShtundexWorldPortalBlock;
import shtundex.block.ShtundexStoneBlock;
import shtundex.block.PressBlock;
import shtundex.block.MoltenCatsteelBlock;
import shtundex.block.MaceratorBlock;
import shtundex.block.LeadOreBlock;
import shtundex.block.LeadBlockBlock;
import shtundex.block.DeepslateUraniumOreBlock;
import shtundex.block.DeepslateTinOreBlock;
import shtundex.block.DeepslateLeadOreBlock;
import shtundex.block.CrateBlock;
import shtundex.block.CatsteelWorkbenchBlockBlock;
import shtundex.block.CatsteelOreBlock;
import shtundex.block.CatsteelGreneratorBlock;
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
	public static final RegistryObject<Block> TIN_ORE = REGISTRY.register("tin_ore", () -> new TinOreBlock());
	public static final RegistryObject<Block> TIN_BLOCK = REGISTRY.register("tin_block", () -> new TinBlockBlock());
	public static final RegistryObject<Block> MACERATOR = REGISTRY.register("macerator", () -> new MaceratorBlock());
	public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = REGISTRY.register("deepslate_tin_ore", () -> new DeepslateTinOreBlock());
	public static final RegistryObject<Block> CATSTEEL_GRENERATOR = REGISTRY.register("catsteel_grenerator", () -> new CatsteelGreneratorBlock());
	public static final RegistryObject<Block> URANIUM_ORE = REGISTRY.register("uranium_ore", () -> new UraniumOreBlock());
	public static final RegistryObject<Block> URANIUM_BLOCK = REGISTRY.register("uranium_block", () -> new UraniumBlockBlock());
	public static final RegistryObject<Block> DEEPSLATE_URANIUM_ORE = REGISTRY.register("deepslate_uranium_ore", () -> new DeepslateUraniumOreBlock());
	public static final RegistryObject<Block> LEAD_ORE = REGISTRY.register("lead_ore", () -> new LeadOreBlock());
	public static final RegistryObject<Block> LEAD_BLOCK = REGISTRY.register("lead_block", () -> new LeadBlockBlock());
	public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = REGISTRY.register("deepslate_lead_ore", () -> new DeepslateLeadOreBlock());
}
