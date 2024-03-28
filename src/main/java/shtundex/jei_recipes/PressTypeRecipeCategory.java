
package shtundex.jei_recipes;

import shtundex.init.ShtundexModJeiPlugin;
import shtundex.init.ShtundexModBlocks;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class PressTypeRecipeCategory implements IRecipeCategory<PressTypeRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("shtundex", "press_type");
	public final static ResourceLocation TEXTURE = new ResourceLocation("shtundex", "textures/screens/press_gui.png");
	private final IDrawable background;
	private final IDrawable icon;

	public PressTypeRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 166);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ShtundexModBlocks.PRESS.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<PressTypeRecipe> getRecipeType() {
		return ShtundexModJeiPlugin.PressType_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Press");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, PressTypeRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 15, 15).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 15, 0).addItemStack(recipe.getResultItem(null));
	}
}
