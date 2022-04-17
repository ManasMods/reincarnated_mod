package com.borniuus.tensura.data;

import com.borniuus.tensura.item.TensuraItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SimpleCookingSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import java.util.function.Consumer;

public class TensuraRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public TensuraRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        allSmeltingRecipes(pFinishedRecipeConsumer, Ingredient.of(TensuraItems.BULLDEER_BEEF), TensuraItems.BULLDEER_STEAK, 0.35F, 200,600,100);
        allSmeltingRecipes(pFinishedRecipeConsumer, Ingredient.of(TensuraItems.RAW_GIANT_ANT_MEAT), TensuraItems.COOKED_GIANT_ANT_MEAT, 0.35F, 200,600,100);
        allSmeltingRecipes(pFinishedRecipeConsumer, Ingredient.of(TensuraItems.RAW_GIANT_BAT_MEAT), TensuraItems.COOKED_GIANT_BAT_MEAT, 0.35F, 200,600,100);
        allSmeltingRecipes(pFinishedRecipeConsumer, Ingredient.of(TensuraItems.RAW_KNIGHT_SPIDER_MEAT), TensuraItems.COOKED_KNIGHT_SPIDER_MEAT, 0.35F, 200,600,100);
        allSmeltingRecipes(pFinishedRecipeConsumer, Ingredient.of(TensuraItems.RAW_ARMOURSAURUS_MEAT), TensuraItems.COOKED_ARMOURSAURUS_MEAT, 0.35F, 200,600,100);
        allSmeltingRecipes(pFinishedRecipeConsumer, Ingredient.of(TensuraItems.RAW_CHARYBDIS_MEAT), TensuraItems.COOKED_CHARYBDIS_MEAT, 0.35F, 200,600,100);
        allSmeltingRecipes(pFinishedRecipeConsumer, Ingredient.of(TensuraItems.RAW_SERPENT_MEAT), TensuraItems.COOKED_SERPENT_MEAT, 0.35F, 200,600,100);
        allSmeltingRecipes(pFinishedRecipeConsumer, Ingredient.of(TensuraItems.RAW_SPEAR_TORO_MEAT), TensuraItems.COOKED_SPEAR_TORO_MEAT, 0.35F, 200,600,100);
        allSmeltingRecipes(pFinishedRecipeConsumer, Ingredient.of(TensuraItems.RAW_MEGALODON_MEAT), TensuraItems.COOKED_MEGALODON_MEAT, 0.35F, 200,600,100);
        allSmeltingRecipes(pFinishedRecipeConsumer, Ingredient.of(TensuraItems.SWEET_POTATO), TensuraItems.BAKED_SWEET_POTATO, 0.35F, 200,600,100);
        allSmeltingRecipes(pFinishedRecipeConsumer, Ingredient.of(TensuraItems.LARGE_SWEET_POTATO), TensuraItems.LARGE_BAKED_SWEET_POTATO, 0.35F, 200,600,100);
        allSmeltingRecipes(pFinishedRecipeConsumer, Ingredient.of(TensuraItems.LARGE_POTATO), TensuraItems.LARGE_BAKED_POTATO, 0.35F, 200,600,100);
    }
    private void allSmeltingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Ingredient ingredient, ItemLike result, float exp, int smeltingTicks, int campfireTicks, int smokingTicks) {
        smeltingRecipe(pFinishedRecipeConsumer, ingredient, result, exp, smeltingTicks);
        campfireRecipe(pFinishedRecipeConsumer, ingredient, result, exp, campfireTicks);
        smokingRecipe(pFinishedRecipeConsumer, ingredient, result, exp, smokingTicks);
    }
    private void smeltingRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Ingredient ingredient, ItemLike result, float exp, int cookingTicks) {
        for (ItemStack itemStack : ingredient.getItems()) {
            SimpleCookingRecipeBuilder.smelting(ingredient, result, exp, cookingTicks).unlockedBy("has_" + itemStack.getItem().getRegistryName().getPath(), has(itemStack.getItem()))
                    .save(pFinishedRecipeConsumer);
        }
    }
    private void campfireRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Ingredient ingredient, ItemLike result, float exp, int cookingTicks) {
        for (ItemStack itemStack : ingredient.getItems()) {
            simpleCookingRecipe(pFinishedRecipeConsumer, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING_RECIPE, cookingTicks, itemStack.getItem(), result, exp);
        }
    }
    private void smokingRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Ingredient ingredient, ItemLike result, float exp, int cookingTicks) {
        for (ItemStack itemStack : ingredient.getItems()) {
            simpleCookingRecipe(pFinishedRecipeConsumer, "smoking", RecipeSerializer.SMOKING_RECIPE, cookingTicks, itemStack.getItem(), result, exp);
        }
    }
}