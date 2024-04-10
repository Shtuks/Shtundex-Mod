
package shtundex.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import shtundex.procedures.CatsteelForceBaubleIsUnequippedProcedure;
import shtundex.procedures.CatsteelForceBaubleIsEquippedProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class CatsteelForceItem extends Item implements ICurioItem {
	public CatsteelForceItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Immunity to \"Catsteel posion\" if effect < 10 lvl"));
		list.add(Component.literal("Access to flight."));
		list.add(Component.literal("Night vision and speed II."));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		CatsteelForceBaubleIsEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		CatsteelForceBaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
