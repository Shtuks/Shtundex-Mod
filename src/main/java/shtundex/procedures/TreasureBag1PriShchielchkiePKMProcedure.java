package shtundex.procedures;

import shtundex.network.ShtundexModVariables;

import shtundex.init.ShtundexModItems;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class TreasureBag1PriShchielchkiePKMProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(ShtundexModItems.CATSTEEL_BAR.get());
			_setstack.setCount((int) Mth.nextDouble(RandomSource.create(), 10, 20));
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(ShtundexModItems.SHTUNDER_PRISM.get());
			_setstack.setCount((int) Mth.nextDouble(RandomSource.create(), 10, 20));
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(ShtundexModItems.CAT_CLOTH.get());
			_setstack.setCount((int) Mth.nextDouble(RandomSource.create(), 10, 20));
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(ShtundexModItems.CATSTEEL_PLATE.get());
			_setstack.setCount((int) Mth.nextDouble(RandomSource.create(), 10, 20));
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(ShtundexModItems.LORE_SHTUXIBUS.get());
			_setstack.setCount((int) Mth.nextDouble(RandomSource.create(), 1, 1));
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (ShtundexModVariables.WorldVariables.get(world).InfinityMode == true) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ShtundexModItems.SHTUXIAN_ENERGY.get());
				_setstack.setCount((int) Mth.nextDouble(RandomSource.create(), 1, 5));
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(ShtundexModItems.TREASURE_BAG_1.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
