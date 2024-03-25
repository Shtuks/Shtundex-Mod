
package shtundex.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class LoreShtundexWorldItem extends Item {
	public LoreShtundexWorldItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Shtuxibus' home world. "));
		list.add(Component.literal("The technologically advanced race of shtuxians once flourished here."));
		list.add(Component.literal("After an unknown cataclysm, the air is filled with a caustic greenish gas."));
		list.add(Component.literal("The Shtuxians have fled the planet, and now in these uninhabited wastelands you can see echoes of a once great civilization."));
	}
}
