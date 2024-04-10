
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package shtundex.init;

import shtundex.ShtundexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShtundexModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ShtundexMod.MODID);
	public static final RegistryObject<CreativeModeTab> SHTUNDEX = REGISTRY.register("shtundex",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.shtundex.shtundex")).icon(() -> new ItemStack(ShtundexModItems.SHTUK_CYBERNETIC_PARTS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ShtundexModItems.SHTUXIAN_CURSE.get());
				tabData.accept(ShtundexModItems.CAT_HIGHT_TECH_SUIT_HELMET.get());
				tabData.accept(ShtundexModItems.CAT_HIGHT_TECH_SUIT_CHESTPLATE.get());
				tabData.accept(ShtundexModItems.CAT_HIGHT_TECH_SUIT_LEGGINGS.get());
				tabData.accept(ShtundexModItems.CAT_HIGHT_TECH_SUIT_BOOTS.get());
				tabData.accept(ShtundexModItems.CATSTEEL_BAR.get());
				tabData.accept(ShtundexModItems.SHTUNDER_PRISM.get());
				tabData.accept(ShtundexModItems.CAT_CLOTH.get());
				tabData.accept(ShtundexModItems.CAT_CLOT_ARMOR_HELMET.get());
				tabData.accept(ShtundexModItems.CAT_CLOT_ARMOR_CHESTPLATE.get());
				tabData.accept(ShtundexModItems.CAT_CLOT_ARMOR_LEGGINGS.get());
				tabData.accept(ShtundexModItems.CAT_CLOT_ARMOR_BOOTS.get());
				tabData.accept(ShtundexModItems.SHTUXIAN_ENERGY.get());
				tabData.accept(ShtundexModItems.KOTIUM.get());
				tabData.accept(ShtundexModBlocks.CATSTEEL_ORE.get().asItem());
				tabData.accept(ShtundexModItems.SHTUNDEX_WORLD.get());
				tabData.accept(ShtundexModItems.CLOTH.get());
				tabData.accept(ShtundexModItems.THE_STICK.get());
				tabData.accept(ShtundexModItems.SHTUXIAN_HANDLE.get());
				tabData.accept(ShtundexModItems.CATSTEEL_BLADE.get());
				tabData.accept(ShtundexModItems.SHTUXITE_BLASTER.get());
				tabData.accept(ShtundexModItems.CURSED_CATSTEEL_MECHANISM.get());
				tabData.accept(ShtundexModItems.NETHERITE_GEAR.get());
				tabData.accept(ShtundexModItems.CATSTEEL_ARMOR_HELMET.get());
				tabData.accept(ShtundexModItems.CATSTEEL_ARMOR_CHESTPLATE.get());
				tabData.accept(ShtundexModItems.CATSTEEL_ARMOR_LEGGINGS.get());
				tabData.accept(ShtundexModItems.CATSTEEL_ARMOR_BOOTS.get());
				tabData.accept(ShtundexModItems.CATSTEEL_PLATE.get());
				tabData.accept(ShtundexModItems.SHTUX_SWORD.get());
				tabData.accept(ShtundexModItems.NETHER_STAR_STAFF.get());
				tabData.accept(ShtundexModItems.CAT_STEEL_DRILL.get());
				tabData.accept(ShtundexModItems.SHTUX_STAFF_OF_POWER.get());
				tabData.accept(ShtundexModItems.SHTUK_CYBERNETIC_PARTS.get());
				tabData.accept(ShtundexModItems.HUMAN_CELLS.get());
				tabData.accept(ShtundexModItems.EMPTY_SYRGINE.get());
				tabData.accept(ShtundexModItems.TREASURE_BAG_1.get());
				tabData.accept(ShtundexModItems.TREASURE_BAG_2.get());
				tabData.accept(ShtundexModItems.RECHARGER.get());
				tabData.accept(ShtundexModItems.ADVANCED_SHTUK_PARTS.get());
				tabData.accept(ShtundexModItems.CATSTEEL_DRILL_HEAD.get());
				tabData.accept(ShtundexModItems.CATSTEEL_DRILL_HANDLE.get());
				tabData.accept(ShtundexModItems.CHTUXLAGOR_BLASTER.get());
				tabData.accept(ShtundexModItems.CHTUXLAGOR_SHARD.get());
				tabData.accept(ShtundexModBlocks.SHTUNDEX_STONE.get().asItem());
				tabData.accept(ShtundexModBlocks.ALPHALT.get().asItem());
				tabData.accept(ShtundexModItems.MOLTEN_CATSTEEL_BUCKET.get());
				tabData.accept(ShtundexModItems.SHTUN_STONE_PICKAXE.get());
				tabData.accept(ShtundexModItems.SHTUN_STONE_AXE.get());
				tabData.accept(ShtundexModItems.SHTUN_STONE_SWORD.get());
				tabData.accept(ShtundexModItems.SHTUN_STONE_SHOVEL.get());
				tabData.accept(ShtundexModItems.SHTUN_STONE_HOE.get());
				tabData.accept(ShtundexModItems.CATSTEEL_PICKAXE.get());
				tabData.accept(ShtundexModItems.CATSTEEL_AXE.get());
				tabData.accept(ShtundexModItems.CATSTEEL_SWORD.get());
				tabData.accept(ShtundexModItems.CATSTEEL_SHOVEL.get());
				tabData.accept(ShtundexModItems.SHTUXITE_SOUL.get());
				tabData.accept(ShtundexModItems.CHTUXLAGOR_PIECE.get());
				tabData.accept(ShtundexModBlocks.CATSTEEL_BLOCK.get().asItem());
				tabData.accept(ShtundexModItems.BERRY_PIE.get());
				tabData.accept(ShtundexModItems.FLOUR.get());
				tabData.accept(ShtundexModItems.CATSTEEL_APPLE.get());
				tabData.accept(ShtundexModItems.CATSTEEL_COIN.get());
				tabData.accept(ShtundexModBlocks.CRATE.get().asItem());
				tabData.accept(ShtundexModItems.COIN_PRESS_SCHEME.get());
				tabData.accept(ShtundexModItems.CATSTEEL_NUGGET.get());
				tabData.accept(ShtundexModItems.SWORDLAND.get());
				tabData.accept(ShtundexModItems.PLATE_PRESS.get());
				tabData.accept(ShtundexModBlocks.PRESS.get().asItem());
				tabData.accept(ShtundexModBlocks.CATSTEEL_WORKBENCH_BLOCK.get().asItem());
				tabData.accept(ShtundexModBlocks.TIN_ORE.get().asItem());
				tabData.accept(ShtundexModBlocks.TIN_BLOCK.get().asItem());
				tabData.accept(ShtundexModItems.TIN_INGOT.get());
				tabData.accept(ShtundexModItems.TIN_DUST.get());
				tabData.accept(ShtundexModItems.COPPER_DUST.get());
				tabData.accept(ShtundexModItems.BRONZE_DUST.get());
				tabData.accept(ShtundexModBlocks.MACERATOR.get().asItem());
				tabData.accept(ShtundexModBlocks.DEEPSLATE_TIN_ORE.get().asItem());
				tabData.accept(ShtundexModItems.BRONZE_INGOT.get());
				tabData.accept(ShtundexModItems.CATSTEEL_DUST.get());
				tabData.accept(ShtundexModItems.GRINDING_BALL.get());
				tabData.accept(ShtundexModItems.RAW_TIN.get());
				tabData.accept(ShtundexModItems.WRENCH.get());
				tabData.accept(ShtundexModBlocks.CATSTEEL_GRENERATOR.get().asItem());
				tabData.accept(ShtundexModItems.CATSTEEL_PILL.get());
				tabData.accept(ShtundexModItems.DEPELLETED_CATSTEEL.get());
				tabData.accept(ShtundexModItems.IRON_DUST.get());
				tabData.accept(ShtundexModItems.GOLD_DUST.get());
				tabData.accept(ShtundexModBlocks.URANIUM_ORE.get().asItem());
				tabData.accept(ShtundexModBlocks.URANIUM_BLOCK.get().asItem());
				tabData.accept(ShtundexModItems.URANIUM_INGOT.get());
				tabData.accept(ShtundexModBlocks.DEEPSLATE_URANIUM_ORE.get().asItem());
				tabData.accept(ShtundexModItems.URANIUM_DUST.get());
				tabData.accept(ShtundexModItems.RAW_URANIUM.get());
				tabData.accept(ShtundexModBlocks.LEAD_ORE.get().asItem());
				tabData.accept(ShtundexModBlocks.LEAD_BLOCK.get().asItem());
				tabData.accept(ShtundexModItems.LEAD_INGOT.get());
				tabData.accept(ShtundexModItems.RAW_LEAD.get());
				tabData.accept(ShtundexModBlocks.DEEPSLATE_LEAD_ORE.get().asItem());
				tabData.accept(ShtundexModItems.LEAD_DUST.get());
				tabData.accept(ShtundexModItems.ANTIRAD_CLOTH.get());
				tabData.accept(ShtundexModItems.HAZMAT_HELMET.get());
				tabData.accept(ShtundexModItems.HAZMAT_CHESTPLATE.get());
				tabData.accept(ShtundexModItems.HAZMAT_LEGGINGS.get());
				tabData.accept(ShtundexModItems.HAZMAT_BOOTS.get());
				tabData.accept(ShtundexModItems.LEAD_PLATE.get());
				tabData.accept(ShtundexModItems.GEIGER_COUNT.get());
				tabData.accept(ShtundexModItems.CIRCUIT.get());
				tabData.accept(ShtundexModItems.UNFINISHED_CATSTEEL_CIRCUIT.get());
				tabData.accept(ShtundexModItems.CIRCUIT_PRSSS.get());
				tabData.accept(ShtundexModItems.CATSTEEL_STIMULANTS.get());
				tabData.accept(ShtundexModItems.CHTUXLAGOR_MANTLE_CHESTPLATE.get());
				tabData.accept(ShtundexModItems.COAL_DUST.get());
				tabData.accept(ShtundexModItems.NANOFIBER_CLOTH.get());
				tabData.accept(ShtundexModItems.NANOSABER.get());
				tabData.accept(ShtundexModItems.DIAMOND_DUST.get());
				tabData.accept(ShtundexModItems.NANO_HELMET.get());
				tabData.accept(ShtundexModItems.NANO_CHESTPLATE.get());
				tabData.accept(ShtundexModItems.NANO_LEGGINGS.get());
				tabData.accept(ShtundexModItems.NANO_BOOTS.get());
				tabData.accept(ShtundexModItems.ENERGY_CRYSTAL.get());
				tabData.accept(ShtundexModItems.SHTUXIAN_KIT.get());
				tabData.accept(ShtundexModItems.CHTUXLAGOR_KIT.get());
				tabData.accept(ShtundexModItems.CHALK.get());
				tabData.accept(ShtundexModItems.CAT_CORE.get());
				tabData.accept(ShtundexModItems.NETHERITE_GEAR_TRUE.get());
				tabData.accept(ShtundexModItems.IRON_GEAR.get());
				tabData.accept(ShtundexModBlocks.MACHINE_CASING.get().asItem());
				tabData.accept(ShtundexModItems.NETHERITE_CIRCUIT.get());
				tabData.accept(ShtundexModItems.UNFINISHED_NETHERITE_CIRCUIT.get());
				tabData.accept(ShtundexModItems.XENOMITE_SHARD.get());
				tabData.accept(ShtundexModItems.REFINED_XENIUM_PLATE.get());
				tabData.accept(ShtundexModItems.DARK_STEEL_INGOT.get());
				tabData.accept(ShtundexModItems.OBSIDIAN_DUST.get());
				tabData.accept(ShtundexModItems.DARK_STEEL_DUST.get());
				tabData.accept(ShtundexModItems.DARK_ARMOR_HELMET.get());
				tabData.accept(ShtundexModItems.DARK_ARMOR_CHESTPLATE.get());
				tabData.accept(ShtundexModItems.DARK_ARMOR_LEGGINGS.get());
				tabData.accept(ShtundexModItems.DARK_ARMOR_BOOTS.get());
				tabData.accept(ShtundexModItems.DARK_PICKAXE.get());
				tabData.accept(ShtundexModItems.DARK_AXE.get());
				tabData.accept(ShtundexModItems.DARK_SWORD.get());
				tabData.accept(ShtundexModItems.PIZZA.get());
				tabData.accept(ShtundexModItems.CATSTEEL_STAFF.get());
				tabData.accept(ShtundexModItems.ARMOR_RECHARGE_MODULE.get());
				tabData.accept(ShtundexModItems.PIZZA_BOX.get());
				tabData.accept(ShtundexModItems.TINY_CHTUXLAGOR_SHARD.get());
				tabData.accept(ShtundexModBlocks.CRIMSON_ORE.get().asItem());
				tabData.accept(ShtundexModBlocks.CORRUPTED_ORE.get().asItem());
				tabData.accept(ShtundexModItems.CRIMSON_INGOT.get());
				tabData.accept(ShtundexModItems.WARPED_INGOT.get());
				tabData.accept(ShtundexModItems.WARPED_ARMOR_HELMET.get());
				tabData.accept(ShtundexModItems.WARPED_ARMOR_CHESTPLATE.get());
				tabData.accept(ShtundexModItems.WARPED_ARMOR_LEGGINGS.get());
				tabData.accept(ShtundexModItems.WARPED_ARMOR_BOOTS.get());
				tabData.accept(ShtundexModItems.CRIMSON_ARMOR_HELMET.get());
				tabData.accept(ShtundexModItems.CRIMSON_ARMOR_CHESTPLATE.get());
				tabData.accept(ShtundexModItems.CRIMSON_ARMOR_LEGGINGS.get());
				tabData.accept(ShtundexModItems.CRIMSON_ARMOR_BOOTS.get());
				tabData.accept(ShtundexModItems.CRIMSON_PICKAXE.get());
				tabData.accept(ShtundexModItems.CRIMSON_AXE.get());
				tabData.accept(ShtundexModItems.CRIMSON_SWORD.get());
				tabData.accept(ShtundexModItems.CRIMSON_SHOVEL.get());
				tabData.accept(ShtundexModItems.WARPED_PICKAXE.get());
				tabData.accept(ShtundexModItems.WARPED_AXE.get());
				tabData.accept(ShtundexModItems.WARPED_SWORD.get());
				tabData.accept(ShtundexModItems.WARPED_SHOVEL.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> LORE = REGISTRY.register("lore",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.shtundex.lore")).icon(() -> new ItemStack(ShtundexModItems.LORE_SHTUXIBUS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ShtundexModItems.LORE_CATSTEEL.get());
				tabData.accept(ShtundexModItems.LORE_SHTUXIBUS.get());
				tabData.accept(ShtundexModItems.LORE_CHTUXLAGOR.get());
				tabData.accept(ShtundexModItems.LORE_SHTUNDEX_WORLD.get());
				tabData.accept(ShtundexModItems.LORE_SHTQ_7V_3.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ACCESSORIES = REGISTRY.register("accessories",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.shtundex.accessories")).icon(() -> new ItemStack(ShtundexModItems.CATSTEEL_SHIELD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ShtundexModItems.CHTUXLAGOR_BLESSING_CURIOS.get());
				tabData.accept(ShtundexModItems.SHTUNDEX_WORLD_BLESSING.get());
				tabData.accept(ShtundexModItems.CATSTEEL_SHIELD.get());
				tabData.accept(ShtundexModItems.CATSTEEL_RING.get());
				tabData.accept(ShtundexModItems.VAMPIRIC_AMULET.get());
				tabData.accept(ShtundexModItems.TRAVELER_BOOTS.get());
				tabData.accept(ShtundexModItems.NETHERITE_FORCE.get());
				tabData.accept(ShtundexModItems.GOLDEN_FORCE.get());
				tabData.accept(ShtundexModItems.CRIMSON_FORCE.get());
				tabData.accept(ShtundexModItems.CATSTEEL_FORCE.get());
				tabData.accept(ShtundexModItems.CHTUXLAGOR_FORCE.get());
				tabData.accept(ShtundexModItems.DIAMOND_FORCE.get());
				tabData.accept(ShtundexModItems.MINER_FORCE.get());
				tabData.accept(ShtundexModItems.SHTUXIBUS_FORCE.get());
				tabData.accept(ShtundexModItems.SHT_Q_7_FORCE.get());
				tabData.accept(ShtundexModItems.WARPED_FORCE.get());
				tabData.accept(ShtundexModItems.EMERALD_FORCE.get());
				tabData.accept(ShtundexModItems.TIN_FORCE.get());
				tabData.accept(ShtundexModItems.COPPER_FORCE.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(ShtundexModItems.VAMPIRE_SPAWN_EGG.get());
			tabData.accept(ShtundexModItems.HUMAN_SPAWN_EGG.get());
			tabData.accept(ShtundexModItems.SHTUK_SPAWN_EGG.get());
			tabData.accept(ShtundexModItems.IRRADIATED_SLIME_SPAWN_EGG.get());
		}
	}
}
