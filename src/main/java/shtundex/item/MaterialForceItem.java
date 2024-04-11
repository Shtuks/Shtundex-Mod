
package shtundex.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import shtundex.procedures.MatforceunequipProcedure;
import shtundex.procedures.MatforceequipProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class MaterialForceItem extends Item implements ICurioItem {
	public MaterialForceItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Immunity to wither, poision, catsteel poision."));
		list.add(Component.literal("Teleport on binded key, flight, piglins become neutral."));
		list.add(Component.literal("Reduced cost of trades, armor twise as effective."));
		list.add(Component.literal("+ 12 base damage but slowing you."));
		list.add(Component.literal("+ 20 defence when in liquid, + 20% damage resistance"));
		list.add(Component.literal("+ 30% speed and night vision."));
		list.add(Component.literal("Armor and item in hand are unbreakable."));
		list.add(Component.literal("+ 5 block reach and instant mining speed."));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		MatforceequipProcedure.execute(slotContext.entity().level(), slotContext.entity().getX(), slotContext.entity().getY(), slotContext.entity().getZ(), slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		MatforceunequipProcedure.execute(slotContext.entity().level(), slotContext.entity().getX(), slotContext.entity().getY(), slotContext.entity().getZ(), slotContext.entity());
	}
}
