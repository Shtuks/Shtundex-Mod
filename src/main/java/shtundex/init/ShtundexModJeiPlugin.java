
package shtundex.init;

import shtundex.jei_recipes.PressTypeRecipeCategory;
import shtundex.jei_recipes.PressTypeRecipe;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class ShtundexModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<PressTypeRecipe> PressType_Type = new mezz.jei.api.recipe.RecipeType<>(PressTypeRecipeCategory.UID, PressTypeRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("shtundex:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new PressTypeRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<PressTypeRecipe> PressTypeRecipes = recipeManager.getAllRecipesFor(PressTypeRecipe.Type.INSTANCE);
		registration.addRecipes(PressType_Type, PressTypeRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
	}
}
