
package shtundex.item;

import shtundex.procedures.DrShtuxibusUsloviieGienieratsiiSushchnostiProcedure;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import java.util.List;

public class ShtuxianCurseItem extends Item {
	public ShtuxianCurseItem() {
		super(new Item.Properties().stacksTo(16).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Something out of this world."));
		list.add(Component.literal("You feel that shoud'nt have this."));
		list.add(Component.literal("Summon Dr.Shtuxibus."));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		DrShtuxibusUsloviieGienieratsiiSushchnostiProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
