
package shtundex.item;

import shtundex.procedures.GreatSwordOfManipulationPriUdariePoSushchnostiPriedmietomProcedure;
import shtundex.procedures.GreatSwordOfManipulationPriShchielchkiePKMProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import java.util.List;

public class GreatSwordOfManipulationItem extends Item {
	public GreatSwordOfManipulationItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("1st mode: Deal 1/3 of enemy max health as damage."));
		list.add(Component.literal("2nd mode: Completely freeze target for 10 seconds."));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		GreatSwordOfManipulationPriShchielchkiePKMProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), ar.getObject());
		return ar;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		GreatSwordOfManipulationPriUdariePoSushchnostiPriedmietomProcedure.execute(entity.level(), entity, itemstack);
		return retval;
	}
}
