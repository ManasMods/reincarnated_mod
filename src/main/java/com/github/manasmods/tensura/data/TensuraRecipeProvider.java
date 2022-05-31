package com.github.manasmods.tensura.data;

import com.github.manasmods.tensura.item.TensuraItems;
import com.github.manasmods.manascore.data.gen.RecipeProvider;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

import java.util.function.Consumer;

public class TensuraRecipeProvider extends RecipeProvider {

    public TensuraRecipeProvider(GatherDataEvent gatherDataEvent) {
        super(gatherDataEvent);
    }

    @Override
    protected void generate(Consumer<FinishedRecipe> consumer) {
        allSmeltingRecipes(consumer, Ingredient.of(TensuraItems.BULLDEER_BEEF), TensuraItems.BULLDEER_STEAK, 0.35F, 200, 600, 100);
        allSmeltingRecipes(consumer, Ingredient.of(TensuraItems.RAW_GIANT_ANT_MEAT), TensuraItems.COOKED_GIANT_ANT_MEAT, 0.35F, 200, 600, 100);
        allSmeltingRecipes(consumer, Ingredient.of(TensuraItems.RAW_GIANT_BAT_MEAT), TensuraItems.COOKED_GIANT_BAT_MEAT, 0.35F, 200, 600, 100);
        allSmeltingRecipes(consumer, Ingredient.of(TensuraItems.RAW_KNIGHT_SPIDER_MEAT), TensuraItems.COOKED_KNIGHT_SPIDER_MEAT, 0.35F, 200, 600, 100);
        allSmeltingRecipes(consumer, Ingredient.of(TensuraItems.RAW_ARMOURSAURUS_MEAT), TensuraItems.COOKED_ARMOURSAURUS_MEAT, 0.35F, 200, 600, 100);
        allSmeltingRecipes(consumer, Ingredient.of(TensuraItems.RAW_CHARYBDIS_MEAT), TensuraItems.COOKED_CHARYBDIS_MEAT, 0.35F, 200, 600, 100);
        allSmeltingRecipes(consumer, Ingredient.of(TensuraItems.RAW_SERPENT_MEAT), TensuraItems.COOKED_SERPENT_MEAT, 0.35F, 200, 600, 100);
        allSmeltingRecipes(consumer, Ingredient.of(TensuraItems.RAW_SPEAR_TORO_MEAT), TensuraItems.COOKED_SPEAR_TORO_MEAT, 0.35F, 200, 600, 100);
        allSmeltingRecipes(consumer, Ingredient.of(TensuraItems.RAW_MEGALODON_MEAT), TensuraItems.COOKED_MEGALODON_MEAT, 0.35F, 200, 600, 100);
        allSmeltingRecipes(consumer, Ingredient.of(TensuraItems.SWEET_POTATO), TensuraItems.BAKED_SWEET_POTATO, 0.35F, 200, 600, 100);
        allSmeltingRecipes(consumer, Ingredient.of(TensuraItems.LARGE_SWEET_POTATO), TensuraItems.LARGE_BAKED_SWEET_POTATO, 0.35F, 200, 600, 100);
        allSmeltingRecipes(consumer, Ingredient.of(TensuraItems.LARGE_POTATO), TensuraItems.LARGE_BAKED_POTATO, 0.35F, 200, 600, 100);
    }
}