package com.borniuus.tensura.data;

import com.borniuus.tensura.item.TensuraItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SimpleCookingSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import java.util.function.Consumer;

public class TensuraRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public TensuraRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    protected static void simpleCookingRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, String pCookingMethod, SimpleCookingSerializer<?> pCookingSerializer, int pCookingTime, ItemLike pIngredient, ItemLike pResult, float pExperience) {

        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.BULLDEER_BEEF),
                pResult, 0.35F, 200,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.BULLDEER_BEEF),
                has(TensuraItems.BULLDEER_BEEF)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.BULLDEER_STEAK) + "_from_" + "minecraft:smelting");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.BULLDEER_BEEF),
                pResult, 0.35F, 600,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.BULLDEER_BEEF),
                has(TensuraItems.BULLDEER_BEEF)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.BULLDEER_STEAK) + "_from_" + "minecraft:campfire_cooking");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.BULLDEER_BEEF),
                pResult, 0.35F, 100,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.BULLDEER_BEEF),
                has(TensuraItems.BULLDEER_BEEF)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.BULLDEER_STEAK) + "_from_" + "minecraft:smoking");

        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_GIANT_ANT_MEAT),
                pResult, 0.35F, 200,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_GIANT_ANT_MEAT),
                has(TensuraItems.RAW_GIANT_ANT_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_GIANT_ANT_MEAT) + "_from_" + "minecraft:smelting");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_GIANT_ANT_MEAT),
                pResult, 0.35F, 600,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_GIANT_ANT_MEAT),
                has(TensuraItems.RAW_GIANT_ANT_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_GIANT_ANT_MEAT) + "_from_" + "minecraft:campfire_cooking");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_GIANT_ANT_MEAT),
                pResult, 0.35F, 100,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_GIANT_ANT_MEAT),
                has(TensuraItems.RAW_GIANT_ANT_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_GIANT_ANT_MEAT) + "_from_" + "minecraft:smoking");

        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_GIANT_BAT_MEAT),
                pResult, 0.35F, 200,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_GIANT_BAT_MEAT),
                has(TensuraItems.RAW_GIANT_BAT_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_GIANT_BAT_MEAT) + "_from_" + "minecraft:smelting");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_GIANT_BAT_MEAT),
                pResult, 0.35F, 600,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_GIANT_BAT_MEAT),
                has(TensuraItems.RAW_GIANT_BAT_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_GIANT_BAT_MEAT) + "_from_" + "minecraft:campfire_cooking");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_GIANT_BAT_MEAT),
                pResult, 0.35F, 100,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_GIANT_BAT_MEAT),
                has(TensuraItems.RAW_GIANT_BAT_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_GIANT_BAT_MEAT) + "_from_" + "minecraft:smoking");

        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_KNIGHT_SPIDER_MEAT),
                pResult, 0.35F, 200,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_KNIGHT_SPIDER_MEAT),
                has(TensuraItems.RAW_KNIGHT_SPIDER_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_KNIGHT_SPIDER_MEAT) + "_from_" + "minecraft:smelting");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_KNIGHT_SPIDER_MEAT),
                pResult, 0.35F, 600,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_KNIGHT_SPIDER_MEAT),
                has(TensuraItems.RAW_KNIGHT_SPIDER_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_KNIGHT_SPIDER_MEAT) + "_from_" + "minecraft:campfire_cooking");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_KNIGHT_SPIDER_MEAT),
                pResult, 0.35F, 100,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_KNIGHT_SPIDER_MEAT),
                has(TensuraItems.RAW_KNIGHT_SPIDER_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_KNIGHT_SPIDER_MEAT) + "_from_" + "minecraft:smoking");

        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_ARMOURSAURUS_MEAT),
                pResult, 0.35F, 200,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_ARMOURSAURUS_MEAT),
                has(TensuraItems.RAW_ARMOURSAURUS_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_ARMOURSAURUS_MEAT) + "_from_" + "minecraft:smelting");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_ARMOURSAURUS_MEAT),
                pResult, 0.35F, 600,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_ARMOURSAURUS_MEAT),
                has(TensuraItems.RAW_ARMOURSAURUS_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_ARMOURSAURUS_MEAT) + "_from_" + "minecraft:campfire_cooking");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_ARMOURSAURUS_MEAT),
                pResult, 0.35F, 100,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_ARMOURSAURUS_MEAT),
                has(TensuraItems.RAW_ARMOURSAURUS_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_ARMOURSAURUS_MEAT) + "_from_" + "minecraft:smoking");

        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_CHARYBDIS_MEAT),
                pResult, 0.35F, 200,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_CHARYBDIS_MEAT),
                has(TensuraItems.RAW_CHARYBDIS_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_CHARYBDIS_MEAT) + "_from_" + "minecraft:smelting");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_CHARYBDIS_MEAT),
                pResult, 0.35F, 600,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_CHARYBDIS_MEAT),
                has(TensuraItems.RAW_CHARYBDIS_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_CHARYBDIS_MEAT) + "_from_" + "minecraft:campfire_cooking");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_CHARYBDIS_MEAT),
                pResult, 0.35F, 100,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_CHARYBDIS_MEAT),
                has(TensuraItems.RAW_CHARYBDIS_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_CHARYBDIS_MEAT) + "_from_" + "minecraft:smoking");

        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_SERPENT_MEAT),
                pResult, 0.35F, 200,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_SERPENT_MEAT),
                has(TensuraItems.RAW_SERPENT_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_SERPENT_MEAT) + "_from_" + "minecraft:smelting");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_SERPENT_MEAT),
                pResult, 0.35F, 600,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_SERPENT_MEAT),
                has(TensuraItems.RAW_SERPENT_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_SERPENT_MEAT) + "_from_" + "minecraft:campfire_cooking");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_SERPENT_MEAT),
                pResult, 0.35F, 100,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_SERPENT_MEAT),
                has(TensuraItems.RAW_SERPENT_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_SERPENT_MEAT) + "_from_" + "minecraft:smoking");

        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_SPEAR_TORO_MEAT),
                pResult, 0.35F, 200,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_SPEAR_TORO_MEAT),
                has(TensuraItems.RAW_SPEAR_TORO_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_SPEAR_TORO_MEAT) + "_from_" + "minecraft:smelting");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_SPEAR_TORO_MEAT),
                pResult, 0.35F, 600,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_SPEAR_TORO_MEAT),
                has(TensuraItems.RAW_SPEAR_TORO_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_SPEAR_TORO_MEAT) + "_from_" + "minecraft:campfire_cooking");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_SPEAR_TORO_MEAT),
                pResult, 0.35F, 100,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_SPEAR_TORO_MEAT),
                has(TensuraItems.RAW_SPEAR_TORO_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_SPEAR_TORO_MEAT) + "_from_" + "minecraft:smoking");

        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_MEGALODON_MEAT),
                pResult, 0.35F, 200,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_MEGALODON_MEAT),
                has(TensuraItems.RAW_MEGALODON_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_MEGALODON_MEAT) + "_from_" + "minecraft:smelting");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_MEGALODON_MEAT),
                pResult, 0.35F, 600,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_MEGALODON_MEAT),
                has(TensuraItems.RAW_MEGALODON_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_MEGALODON_MEAT) + "_from_" + "minecraft:campfire_cooking");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.RAW_MEGALODON_MEAT),
                pResult, 0.35F, 100,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.RAW_MEGALODON_MEAT),
                has(TensuraItems.RAW_MEGALODON_MEAT)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.COOKED_MEGALODON_MEAT) + "_from_" + "minecraft:smoking");

        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.SWEET_POTATO),
                pResult, 0.35F, 200,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.SWEET_POTATO),
                has(TensuraItems.SWEET_POTATO)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.BAKED_SWEET_POTATO) + "_from_" + "minecraft:smelting");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.SWEET_POTATO),
                pResult, 0.35F, 600,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.SWEET_POTATO),
                has(TensuraItems.SWEET_POTATO)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.BAKED_SWEET_POTATO) + "_from_" + "minecraft:campfire_cooking");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.SWEET_POTATO),
                pResult, 0.35F, 100,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.SWEET_POTATO),
                has(TensuraItems.SWEET_POTATO)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.BAKED_SWEET_POTATO) + "_from_" + "minecraft:smoking");

        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.LARGE_SWEET_POTATO),
                pResult, 0.35F, 200,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.LARGE_SWEET_POTATO),
                has(TensuraItems.LARGE_SWEET_POTATO)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.LARGE_BAKED_SWEET_POTATO) + "_from_" + "minecraft:smelting");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.LARGE_SWEET_POTATO),
                pResult, 0.35F, 600,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.LARGE_SWEET_POTATO),
                has(TensuraItems.LARGE_SWEET_POTATO)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.LARGE_BAKED_SWEET_POTATO) + "_from_" + "minecraft:campfire_cooking");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.LARGE_SWEET_POTATO),
                pResult, 0.35F, 100,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.LARGE_SWEET_POTATO),
                has(TensuraItems.LARGE_SWEET_POTATO)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.LARGE_BAKED_SWEET_POTATO) + "_from_" + "minecraft:smoking");

        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.LARGE_POTATO),
                pResult, 0.35F, 200,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.LARGE_POTATO),
                has(TensuraItems.LARGE_POTATO)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.LARGE_BAKED_POTATO) + "_from_" + "minecraft:smelting");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.LARGE_POTATO),
                pResult, 0.35F, 600,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.LARGE_POTATO),
                has(TensuraItems.LARGE_POTATO)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.LARGE_BAKED_POTATO) + "_from_" + "minecraft:campfire_cooking");
        SimpleCookingRecipeBuilder.cooking(Ingredient.of(TensuraItems.LARGE_POTATO),
                pResult, 0.35F, 100,
                pCookingSerializer).unlockedBy(getHasName(TensuraItems.LARGE_POTATO),
                has(TensuraItems.LARGE_POTATO)).save(pFinishedRecipeConsumer,
                getItemName(TensuraItems.LARGE_BAKED_POTATO) + "_from_" + "minecraft:smoking");


    }
}

