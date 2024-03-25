
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package shtundex.init;

import shtundex.ShtundexMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

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
				tabData.accept(ShtundexModItems.CHTUXLAGOR_BLESSING_CURIOS.get());
				tabData.accept(ShtundexModItems.SHTUNDEX_WORLD_BLESSING.get());
				tabData.accept(ShtundexModItems.PLATE_PRESS.get());
				tabData.accept(ShtundexModBlocks.PRESS.get().asItem());
				tabData.accept(ShtundexModBlocks.CATSTEEL_WORKBENCH_BLOCK.get().asItem());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> LORE = REGISTRY.register("lore",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.shtundex.lore")).icon(() -> new ItemStack(ShtundexModItems.LORE_CATSTEEL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ShtundexModItems.LORE_CATSTEEL.get());
				tabData.accept(ShtundexModItems.LORE_SHTUXIBUS.get());
				tabData.accept(ShtundexModItems.LORE_CHTUXLAGOR.get());
				tabData.accept(ShtundexModItems.LORE_SHTUNDEX_WORLD.get());
				tabData.accept(ShtundexModItems.LORE_SHTQ_7V_3.get());
			})

					.build());
}
