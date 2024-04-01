
package shtundex.item;

import shtundex.procedures.ChalkPriShchielchkiePKMPoBlokuProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import java.util.List;

public class ChalkItem extends Item {
	public ChalkItem() {
		super(new Item.Properties().durability(32).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal(""));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		ChalkPriShchielchkiePKMPoBlokuProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
