package com.borniuus.tensura.item.custom;

import net.minecraft.world.food.FoodProperties;


public class Foods {
    public static final FoodProperties BULLDEER_BEEF = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.4F).build();
    public static final FoodProperties BULLDEER_STEAK = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.9F).build();
    public static final FoodProperties BULLDEER_SHISH_KEBAB = (new FoodProperties.Builder()).nutrition(16).saturationMod(1F).build();
    public static final FoodProperties RAW_GIANT_ANT_MEAT = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.4F).build();
    public static final FoodProperties COOKED_GIANT_ANT_MEAT = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.9F).build();
    public static final FoodProperties RAW_GIANT_BAT_MEAT = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.4F).build();
    public static final FoodProperties COOKED_GIANT_BAT_MEAT = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.9F).build();
    public static final FoodProperties RAW_KNIGHT_SPIDER_MEAT = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).build();
    public static final FoodProperties COOKED_KNIGHT_SPIDER_MEAT = (new FoodProperties.Builder()).nutrition(9).saturationMod(0.9F).build();
    public static final FoodProperties RAW_ARMOURSAURUS_MEAT = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).build();
    public static final FoodProperties COOKED_ARMOURSAURUS_MEAT = (new FoodProperties.Builder()).nutrition(9).saturationMod(0.9F).build();
    public static final FoodProperties RAW_CHARYBDIS_MEAT = (new FoodProperties.Builder()).nutrition(9).saturationMod(0.5F).build();
    public static final FoodProperties CHARYBDIS_SASHIMI = (new FoodProperties.Builder()).nutrition(16).saturationMod(1.2F).build();
    public static final FoodProperties COOKED_CHARYBDIS_MEAT = (new FoodProperties.Builder()).nutrition(18).saturationMod(1F).build();
    public static final FoodProperties RAW_SERPENT_MEAT = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).build();
    public static final FoodProperties COOKED_SERPENT_MEAT = (new FoodProperties.Builder()).nutrition(9).saturationMod(0.9F).build();
    public static final FoodProperties RAW_SPEAR_TORO_MEAT = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.4F).build();
    public static final FoodProperties SPEAR_TORO_SASHIMI = (new FoodProperties.Builder()).nutrition(10).saturationMod(1F).build();
    public static final FoodProperties COOKED_SPEAR_TORO_MEAT = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.9F).build();
    public static final FoodProperties RAW_MEGALODON_MEAT = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.4F).build();
    public static final FoodProperties MEGALODON_SASHIMI = (new FoodProperties.Builder()).nutrition(10).saturationMod(1F).build();
    public static final FoodProperties COOKED_MEGALODON_MEAT = (new FoodProperties.Builder()).nutrition(14).saturationMod(0.9F).build();
    public static final FoodProperties RICE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties BLACK_RICE = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.4F).build();
    public static final FoodProperties SWEET_POTATO = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties LARGE_SWEET_POTATO = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.5F).build();
    public static final FoodProperties BAKED_SWEET_POTATO = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.5F).build();
    public static final FoodProperties BAKED_LARGE_SWEET_POTATO = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.7F).build();
    public static final FoodProperties LARGE_POTATO = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.5F).build();
    public static final FoodProperties BAKED_LARGE_POTATO = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.3F).build();
    public static final FoodProperties ONIGIRI = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).build();
    public static final FoodProperties BLACK_ONIGIRI = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.3F).build();
    public static final FoodProperties SUSHI = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).build();
    public static final FoodProperties SISSIE_FIN_SOUP = stew(15).build();
    public static final FoodProperties DUBIOUS_FOOD = (new FoodProperties.Builder().build());
    public static final FoodProperties BOWL_OF_RAMEN = stew(15).build();

    private static FoodProperties.Builder stew(int pNutrition) {
        return (new FoodProperties.Builder()).nutrition(pNutrition).saturationMod(0.5F);
    }
}