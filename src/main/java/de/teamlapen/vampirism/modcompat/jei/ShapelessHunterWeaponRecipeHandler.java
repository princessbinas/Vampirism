package de.teamlapen.vampirism.modcompat.jei;

import de.teamlapen.vampirism.inventory.ShapelessHunterWeaponRecipe;
import mezz.jei.api.recipe.IRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;
import mezz.jei.util.ErrorUtil;
import mezz.jei.util.Log;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;


public class ShapelessHunterWeaponRecipeHandler implements IRecipeHandler<ShapelessHunterWeaponRecipe> {
    @Nonnull
    @Override
    public String getRecipeCategoryUid() {
        return VampirismJEIPlugin.HUNTER_WEAPON_RECIPE_UID;
    }

    @Nonnull
    @Override
    public String getRecipeCategoryUid(@Nonnull ShapelessHunterWeaponRecipe recipe) {
        return VampirismJEIPlugin.HUNTER_WEAPON_RECIPE_UID;
    }

    @Nonnull
    @Override
    public Class<ShapelessHunterWeaponRecipe> getRecipeClass() {
        return ShapelessHunterWeaponRecipe.class;
    }

    @Nonnull
    @Override
    public IRecipeWrapper getRecipeWrapper(@Nonnull ShapelessHunterWeaponRecipe recipe) {
        return new ShapelessHunterWeaponRecipeWrapper(recipe);
    }

    @Override
    public boolean isRecipeValid(@Nonnull ShapelessHunterWeaponRecipe recipe) {
        int inputCount = 0;
        for (Object input : recipe.recipeItems) {
            if (input instanceof ItemStack) {
                inputCount++;
            } else {
                String recipeInfo = ErrorUtil.getInfoFromBrokenRecipe(recipe, this);
                Log.error("Recipe has an input that is not an ItemStack. {}", recipeInfo);
                return false;
            }
        }
        if (inputCount > 16) {
            String recipeInfo = ErrorUtil.getInfoFromBrokenRecipe(recipe, this);
            Log.error("Recipe has too many inputs. {}", recipeInfo);
            return false;
        }
        return inputCount > 0;
    }
}