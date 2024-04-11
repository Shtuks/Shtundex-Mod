
package shtundex.item;

import shtundex.procedures.TrerraformingDirtStaffPriVzmakhieSushchnostiPriedmietomProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import java.util.List;

public class TrerraformingDirtStaffItem extends Item {
	public TrerraformingDirtStaffItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		TrerraformingDirtStaffPriVzmakhieSushchnostiPriedmietomProcedure.execute(entity);
		return retval;
	}
}
