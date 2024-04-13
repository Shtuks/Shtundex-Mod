
package shtundex.item;

import shtundex.procedures.ShtuxStaffOfPowerKazhdyiTikVInvientarieProcedure;
import shtundex.procedures.ChtuxlagorBlasterPriUdariePoSushchnostiPriedmietomProcedure;
import shtundex.procedures.ChtuxlagorBlasterPriShchielchkiePKProcedure;
import shtundex.procedures.ChtuxlagorBlasterPriShchielchkiePKMProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import java.util.List;

public class ChtuxlagorBlasterItem extends Item {
	public ChtuxlagorBlasterItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u03A9 Chtux'lag'or \u03A9"));
		list.add(Component.literal("Erase any life being. Shot projectiles that kill in creative mode."));
		list.add(Component.literal("Invincibility while holding in hand."));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		ChtuxlagorBlasterPriUdariePoSushchnostiPriedmietomProcedure.execute(entity);
		return retval;
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		ChtuxlagorBlasterPriShchielchkiePKMProcedure.execute(entity);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			ChtuxlagorBlasterPriShchielchkiePKProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		ShtuxStaffOfPowerKazhdyiTikVInvientarieProcedure.execute(world, itemstack);
	}
}
