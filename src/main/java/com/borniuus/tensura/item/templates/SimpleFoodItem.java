package com.borniuus.tensura.item.templates;

import com.borniuus.tensura.item.TensuraCreativeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class SimpleFoodItem extends Item {
    public SimpleFoodItem(int nutrition, float saturationModifier) {
        super(new Properties().tab(TensuraCreativeTab.TENSURA_TAB3).food(new FoodProperties.Builder().nutrition(nutrition).saturationMod(saturationModifier).build()));
    }

    public SimpleFoodItem(FoodBuilder foodBuilder) {
        super(new Properties().tab(TensuraCreativeTab.TENSURA_TAB3).food(foodBuilder.create(new FoodProperties.Builder()).build()));
    }


    @FunctionalInterface
    public interface FoodBuilder {
        FoodProperties.Builder create(FoodProperties.Builder builder);
    }
}
