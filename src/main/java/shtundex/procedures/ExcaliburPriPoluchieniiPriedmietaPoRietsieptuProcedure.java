package shtundex.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class ExcaliburPriPoluchieniiPriedmietaPoRietsieptuProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.enchant(Enchantments.SMITE, 10);
	}
}
