
package shtundex.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import shtundex.procedures.ShtundexWorldBlessingWhileBaubleIsEquippedTickProcedure;
import shtundex.procedures.ShtundexWorldBlessingBaubleIsEquippedProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.network.chat.Component;

import java.util.List;

public class ShtundexWorldBlessingItem extends Item implements ICurioItem {
	public ShtundexWorldBlessingItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public boolean makesPiglinsNeutral(SlotContext slotContext, ItemStack stack) {
		return true;
	}

	@Override
	public boolean isEnderMask(SlotContext slotContext, EnderMan enderMan, ItemStack stack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("You will have all exploring buffs."));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		ShtundexWorldBlessingWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity());
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		ShtundexWorldBlessingBaubleIsEquippedProcedure.execute(slotContext.entity());
	}
}
