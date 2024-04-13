
package shtundex.item;

import shtundex.procedures.JJCCheckProcedure;
import shtundex.procedures.CatsteelSwordPriUdariePoSushchnostiInstrumientomProcedure;
import shtundex.procedures.CatsteelSwordPriShchielchkiePKMProcedure;
import shtundex.procedures.CatsteelArmorKazhdyiTikDliaShliemaProcedure;

import shtundex.init.ShtundexModItems;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import java.util.List;

public class CatsteelSwordItem extends SwordItem {
	public CatsteelSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 16000;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 28f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 70;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ShtundexModItems.CATSTEEL_BAR.get()));
			}
		}, 3, 1f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		CatsteelSwordPriUdariePoSushchnostiInstrumientomProcedure.execute(entity);
		return retval;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		CatsteelSwordPriShchielchkiePKMProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
		return ar;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Inflict \"catsteel posion\" at attacked entity for 10 seconds"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			JJCCheckProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
		CatsteelArmorKazhdyiTikDliaShliemaProcedure.execute(itemstack);
	}
}
