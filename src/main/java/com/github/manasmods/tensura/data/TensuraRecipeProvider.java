package com.github.manasmods.tensura.data;

import com.github.manasmods.tensura.block.TensuraBlocks;
import com.github.manasmods.tensura.item.TensuraItems;
import com.github.manasmods.manascore.data.gen.RecipeProvider;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

import java.util.function.Consumer;

public class TensuraRecipeProvider extends RecipeProvider {

    public TensuraRecipeProvider(GatherDataEvent gatherDataEvent) {
        super(gatherDataEvent);
    }

    @Override
    protected void generate(Consumer<FinishedRecipe> consumer) {

        //**********SMELTING CHANGES

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

        //**********BLOCK RECIPES
        //WOOD

        ShapelessRecipeBuilder.shapeless(TensuraBlocks.PALM_PLANKS,4)
                .requires(TensuraBlocks.PALM_LOG)
                .unlockedBy("has_palm_log", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TensuraBlocks.PALM_LOG).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(TensuraBlocks.SAKURA_PLANKS,4)
                .requires(TensuraBlocks.SAKURA_LOG)
                .unlockedBy("has_sakura_log", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TensuraBlocks.SAKURA_LOG).build()))
                .save(consumer);
        stairs(consumer, TensuraBlocks.PALM_STAIRS, TensuraBlocks.PALM_PLANKS);
        stairs(consumer, TensuraBlocks.SAKURA_STAIRS, TensuraBlocks.SAKURA_PLANKS);
        slab(consumer, TensuraBlocks.PALM_SLAB, TensuraBlocks.PALM_PLANKS);
        slab(consumer, TensuraBlocks.SAKURA_SLAB, TensuraBlocks.SAKURA_PLANKS);

        //MISC

        stairs(consumer, TensuraBlocks.THATCH_STAIRS, TensuraBlocks.THATCH_BLOCK);
        slab(consumer, TensuraBlocks.THATCH_SLAB, TensuraBlocks.THATCH_BLOCK);

        //**********ITEM RECIPES

        ShapelessRecipeBuilder.shapeless(TensuraItems.THATCH,9)
                .requires(TensuraBlocks.THATCH_BLOCK)
                .unlockedBy("has_thatch_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(TensuraBlocks.THATCH_BLOCK).build()))
                .save(consumer);

        //**********VANILLA CHANGES

        stairs(consumer, Blocks.OAK_STAIRS, Blocks.OAK_PLANKS);
        slab(consumer, Blocks.OAK_SLAB, Blocks.OAK_PLANKS);
        stairs(consumer, Blocks.SPRUCE_STAIRS, Blocks.SPRUCE_PLANKS);
        slab(consumer, Blocks.SPRUCE_SLAB, Blocks.SPRUCE_PLANKS);
        stairs(consumer, Blocks.BIRCH_STAIRS, Blocks.BIRCH_PLANKS);
        slab(consumer, Blocks.BIRCH_SLAB, Blocks.BIRCH_PLANKS);
        stairs(consumer, Blocks.JUNGLE_STAIRS, Blocks.JUNGLE_PLANKS);
        slab(consumer, Blocks.JUNGLE_SLAB, Blocks.JUNGLE_PLANKS);
        stairs(consumer, Blocks.ACACIA_STAIRS, Blocks.ACACIA_PLANKS);
        slab(consumer, Blocks.ACACIA_SLAB, Blocks.ACACIA_PLANKS);
        stairs(consumer, Blocks.DARK_OAK_STAIRS, Blocks.DARK_OAK_PLANKS);
        slab(consumer, Blocks.DARK_OAK_SLAB, Blocks.DARK_OAK_PLANKS);
        stairs(consumer, Blocks.CRIMSON_STAIRS, Blocks.CRIMSON_PLANKS);
        slab(consumer, Blocks.CRIMSON_SLAB, Blocks.CRIMSON_PLANKS);
        stairs(consumer, Blocks.WARPED_STAIRS, Blocks.WARPED_PLANKS);
        slab(consumer, Blocks.WARPED_SLAB, Blocks.WARPED_PLANKS);
        stairs(consumer, Blocks.STONE_STAIRS, Blocks.STONE);
        slab(consumer, Blocks.STONE_SLAB, Blocks.STONE);
        stairs(consumer, Blocks.COBBLESTONE_STAIRS, Blocks.COBBLESTONE);
        slab(consumer, Blocks.COBBLESTONE_SLAB, Blocks.COBBLESTONE);
        stairs(consumer, Blocks.MOSSY_COBBLESTONE_STAIRS, Blocks.MOSSY_COBBLESTONE);
        slab(consumer, Blocks.MOSSY_COBBLESTONE_SLAB, Blocks.MOSSY_COBBLESTONE);
        stairs(consumer, Blocks.STONE_BRICK_STAIRS, Blocks.STONE_BRICKS);
        slab(consumer, Blocks.STONE_BRICK_SLAB, Blocks.STONE_BRICKS);
        stairs(consumer, Blocks.MOSSY_STONE_BRICK_STAIRS, Blocks.MOSSY_STONE_BRICKS);
        slab(consumer, Blocks.MOSSY_STONE_BRICK_SLAB, Blocks.MOSSY_STONE_BRICKS);
        stairs(consumer, Blocks.ANDESITE_STAIRS, Blocks.ANDESITE);
        slab(consumer, Blocks.ANDESITE_SLAB, Blocks.ANDESITE);
        stairs(consumer, Blocks.POLISHED_ANDESITE_STAIRS, Blocks.POLISHED_ANDESITE);
        slab(consumer, Blocks.POLISHED_ANDESITE_SLAB, Blocks.POLISHED_ANDESITE);
        stairs(consumer, Blocks.DIORITE_STAIRS, Blocks.DIORITE);
        slab(consumer, Blocks.DIORITE_SLAB, Blocks.DIORITE);
        stairs(consumer, Blocks.POLISHED_DIORITE_STAIRS, Blocks.POLISHED_DIORITE);
        slab(consumer, Blocks.POLISHED_DIORITE_SLAB, Blocks.POLISHED_DIORITE);
        stairs(consumer, Blocks.GRANITE_STAIRS, Blocks.GRANITE);
        slab(consumer, Blocks.GRANITE_SLAB, Blocks.GRANITE);
        stairs(consumer, Blocks.POLISHED_GRANITE_STAIRS, Blocks.POLISHED_GRANITE);
        slab(consumer, Blocks.POLISHED_GRANITE_SLAB, Blocks.POLISHED_GRANITE);
        stairs(consumer, Blocks.SANDSTONE_STAIRS, Blocks.SANDSTONE);
        slab(consumer, Blocks.SANDSTONE_SLAB, Blocks.SANDSTONE);
        slab(consumer, Blocks.CUT_SANDSTONE_SLAB, Blocks.CUT_SANDSTONE);
        stairs(consumer, Blocks.SMOOTH_SANDSTONE_STAIRS, Blocks.SMOOTH_SANDSTONE);
        slab(consumer, Blocks.SMOOTH_SANDSTONE_SLAB, Blocks.SMOOTH_SANDSTONE);
        stairs(consumer, Blocks.RED_SANDSTONE_STAIRS, Blocks.RED_SANDSTONE);
        slab(consumer, Blocks.RED_SANDSTONE_SLAB, Blocks.RED_SANDSTONE);
        slab(consumer, Blocks.CUT_RED_SANDSTONE_SLAB, Blocks.CUT_RED_SANDSTONE);
        stairs(consumer, Blocks.SMOOTH_RED_SANDSTONE_STAIRS, Blocks.SMOOTH_RED_SANDSTONE);
        slab(consumer, Blocks.SMOOTH_RED_SANDSTONE_SLAB, Blocks.SMOOTH_RED_SANDSTONE);
        stairs(consumer, Blocks.BRICK_STAIRS, Blocks.BRICKS);
        slab(consumer, Blocks.BRICK_SLAB, Blocks.BRICKS);
        stairs(consumer, Blocks.PRISMARINE_STAIRS, Blocks.PRISMARINE);
        slab(consumer, Blocks.PRISMARINE_SLAB, Blocks.PRISMARINE);
        stairs(consumer, Blocks.PRISMARINE_BRICK_STAIRS, Blocks.PRISMARINE_BRICKS);
        slab(consumer, Blocks.PRISMARINE_BRICK_SLAB, Blocks.PRISMARINE_BRICKS);
        stairs(consumer, Blocks.DARK_PRISMARINE_STAIRS, Blocks.DARK_PRISMARINE);
        slab(consumer, Blocks.DARK_PRISMARINE_SLAB, Blocks.DARK_PRISMARINE);
        stairs(consumer, Blocks.NETHER_BRICK_STAIRS, Blocks.NETHER_BRICKS);
        slab(consumer, Blocks.NETHER_BRICK_SLAB, Blocks.NETHER_BRICKS);
        stairs(consumer, Blocks.RED_NETHER_BRICK_STAIRS, Blocks.RED_NETHER_BRICKS);
        slab(consumer, Blocks.RED_NETHER_BRICK_SLAB, Blocks.RED_NETHER_BRICKS);
        stairs(consumer, Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK);
        slab(consumer, Blocks.QUARTZ_SLAB, Blocks.QUARTZ_BLOCK);
        stairs(consumer, Blocks.SMOOTH_QUARTZ_STAIRS, Blocks.SMOOTH_QUARTZ);
        slab(consumer, Blocks.SMOOTH_QUARTZ_SLAB, Blocks.SMOOTH_QUARTZ);
        stairs(consumer, Blocks.PURPUR_STAIRS, Blocks.PURPUR_BLOCK);
        slab(consumer, Blocks.PURPUR_SLAB, Blocks.PURPUR_BLOCK);
        stairs(consumer, Blocks.END_STONE_BRICK_STAIRS, Blocks.END_STONE_BRICKS);
        slab(consumer, Blocks.END_STONE_BRICK_SLAB, Blocks.END_STONE_BRICKS);
        stairs(consumer, Blocks.BLACKSTONE_STAIRS, Blocks.BLACKSTONE);
        slab(consumer, Blocks.BLACKSTONE_SLAB, Blocks.BLACKSTONE);
        stairs(consumer, Blocks.POLISHED_BLACKSTONE_STAIRS, Blocks.POLISHED_BLACKSTONE);
        slab(consumer, Blocks.POLISHED_BLACKSTONE_SLAB, Blocks.POLISHED_BLACKSTONE);
        stairs(consumer, Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, Blocks.POLISHED_BLACKSTONE_BRICKS);
        slab(consumer, Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.POLISHED_BLACKSTONE_BRICKS);
        stairs(consumer, Blocks.CUT_COPPER_STAIRS, Blocks.CUT_COPPER);
        slab(consumer, Blocks.CUT_COPPER_SLAB, Blocks.CUT_COPPER);
        stairs(consumer, Blocks.EXPOSED_CUT_COPPER_STAIRS, Blocks.EXPOSED_CUT_COPPER);
        slab(consumer, Blocks.EXPOSED_CUT_COPPER_SLAB, Blocks.EXPOSED_CUT_COPPER);
        stairs(consumer, Blocks.WEATHERED_CUT_COPPER_STAIRS, Blocks.WEATHERED_CUT_COPPER);
        slab(consumer, Blocks.WEATHERED_CUT_COPPER_SLAB, Blocks.WEATHERED_CUT_COPPER);
        stairs(consumer, Blocks.OXIDIZED_CUT_COPPER_STAIRS, Blocks.OXIDIZED_CUT_COPPER);
        slab(consumer, Blocks.OXIDIZED_CUT_COPPER_SLAB, Blocks.OXIDIZED_CUT_COPPER);
        stairs(consumer, Blocks.WAXED_CUT_COPPER_STAIRS, Blocks.WAXED_CUT_COPPER);
        slab(consumer, Blocks.WAXED_CUT_COPPER_SLAB, Blocks.WAXED_CUT_COPPER);
        stairs(consumer, Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS, Blocks.WAXED_EXPOSED_CUT_COPPER);
        slab(consumer, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB, Blocks.WAXED_EXPOSED_CUT_COPPER);
        stairs(consumer, Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS, Blocks.WAXED_WEATHERED_CUT_COPPER);
        slab(consumer, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB, Blocks.WAXED_WEATHERED_CUT_COPPER);
        stairs(consumer, Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS, Blocks.WAXED_OXIDIZED_CUT_COPPER);
        slab(consumer, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, Blocks.WAXED_OXIDIZED_CUT_COPPER);
        stairs(consumer, Blocks.COBBLED_DEEPSLATE_STAIRS, Blocks.COBBLED_DEEPSLATE);
        slab(consumer, Blocks.COBBLED_DEEPSLATE_SLAB, Blocks.COBBLED_DEEPSLATE);
        stairs(consumer, Blocks.POLISHED_DEEPSLATE_STAIRS, Blocks.POLISHED_DEEPSLATE);
        slab(consumer, Blocks.POLISHED_DEEPSLATE_SLAB, Blocks.POLISHED_DEEPSLATE);
        stairs(consumer, Blocks.DEEPSLATE_BRICK_STAIRS, Blocks.DEEPSLATE_BRICKS);
        slab(consumer, Blocks.DEEPSLATE_BRICK_SLAB, Blocks.DEEPSLATE_BRICKS);
        stairs(consumer, Blocks.DEEPSLATE_TILE_STAIRS, Blocks.DEEPSLATE_TILES);
        slab(consumer, Blocks.DEEPSLATE_TILE_SLAB, Blocks.DEEPSLATE_TILES);


    }
}