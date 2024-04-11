
package shtundex.item;

import shtundex.procedures.InfinityModeChangerPriShchielchkiePKMProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import java.util.List;

public class InfinityModeChangerItem extends Item {
	public InfinityModeChangerItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Activate basic mobility abilities."));
		list.add(Component.literal("Unlock some items."));
		list.add(Component.literal("Bosses inflict debuffs."));
		list.add(Component.literal("S.H.T.U.K buffs are nerfed."));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		InfinityModeChangerPriShchielchkiePKMProcedure.execute(world);
		return ar;
	}
}
