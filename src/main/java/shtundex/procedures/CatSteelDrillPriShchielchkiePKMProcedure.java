package shtundex.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class CatSteelDrillPriShchielchkiePKMProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("areaMine") == false) {
			itemstack.getOrCreateTag().putBoolean("areaMine", true);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal_pressure_plate.click_on")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal_pressure_plate.click_on")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if (itemstack.getOrCreateTag().getBoolean("areaMine") == true) {
			itemstack.getOrCreateTag().putBoolean("areaMine", false);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal_pressure_plate.click_off")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal_pressure_plate.click_off")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}
