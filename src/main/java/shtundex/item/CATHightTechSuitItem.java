
package shtundex.item;

import shtundex.procedures.CATHightTechSuitKazhdyiTikDliaShliemaProcedure;
import shtundex.procedures.CATHightTechSuitKazhdyiTikDliaPonozhieiProcedure;
import shtundex.procedures.CATHightTechSuitKazhdyiTikDliaNaghrudnikaProcedure;
import shtundex.procedures.CATHightTechSuitKazhdyiTikDliaBotinokProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.google.common.collect.Iterables;

public abstract class CATHightTechSuitItem extends ArmorItem {
	public CATHightTechSuitItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 1024;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{256, 256, 256, 256}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 100;
			}

			@Override
			public SoundEvent getEquipSound() {
				return SoundEvents.EMPTY;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}

			@Override
			public String getName() {
				return "cat_hight_tech_suit";
			}

			@Override
			public float getToughness() {
				return 10f;
			}

			@Override
			public float getKnockbackResistance() {
				return 1f;
			}
		}, type, properties);
	}

	public static class Helmet extends CATHightTechSuitItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("From the heaven to hell, i am the superior."));
			list.add(Component.literal("Night vision, Increaced swim speed"));
			list.add(Component.literal("You will never need food."));
			list.add(Component.literal("10 sheild points, each recharge in 3 seconds."));
			list.add(Component.literal("Shtuxian revival with cooldown in 1 minute."));
			list.add(Component.literal("- Developer Item -"));
			list.add(Component.literal("- StarlightCat -"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "shtundex:textures/models/armor/cattechsuit_layer_1.png";
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				CATHightTechSuitKazhdyiTikDliaShliemaProcedure.execute(entity);
			}
		}
	}

	public static class Chestplate extends CATHightTechSuitItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("Now i became a death. A destroyer of the worlds."));
			list.add(Component.literal("+16 base damage, Radiation protection"));
			list.add(Component.literal("Flight, +200% mining speed"));
			list.add(Component.literal("+100% Damage Reduction, +30 absorbtion"));
			list.add(Component.literal("- Developer Item  -"));
			list.add(Component.literal("- StarlightCat -"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "shtundex:textures/models/armor/cattechsuit_layer_1.png";
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				CATHightTechSuitKazhdyiTikDliaNaghrudnikaProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
			}
		}
	}

	public static class Leggings extends CATHightTechSuitItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("Shtuxian technologies was too powerful. Enougth for gods to fear."));
			list.add(Component.literal("+ 220% speed, extreme regeneration increacement"));
			list.add(Component.literal("You move underwater same like on normal blocks, no water mining slowness"));
			list.add(Component.literal("- Developer Item -"));
			list.add(Component.literal("- StarlightCat -"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "shtundex:textures/models/armor/cattechsuit_layer_2.png";
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				CATHightTechSuitKazhdyiTikDliaPonozhieiProcedure.execute(entity);
			}
		}
	}

	public static class Boots extends CATHightTechSuitItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("Nothing wait you in the end."));
			list.add(Component.literal("x2 jump hight"));
			list.add(Component.literal("- Developer Item -"));
			list.add(Component.literal("- StarlightCat -"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "shtundex:textures/models/armor/cattechsuit_layer_1.png";
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				CATHightTechSuitKazhdyiTikDliaBotinokProcedure.execute(entity);
			}
		}
	}
}
