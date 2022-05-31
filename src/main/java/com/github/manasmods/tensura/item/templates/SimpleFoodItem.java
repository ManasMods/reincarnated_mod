package com.github.manasmods.tensura.item.templates;

import com.github.manasmods.tensura.item.TensuraCreativeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class SimpleFoodItem extends Item {
    /**
     * Easy to use eatable {@link Item}.
     *
     * @param nutrition          Amount of 'hunger' you'll regenerate.
     * @param saturationModifier Saturation the Player gains.
     */
    public SimpleFoodItem(int nutrition, float saturationModifier) {
        super(new Properties().tab(TensuraCreativeTab.CONSUMABLES).food(new FoodProperties.Builder().nutrition(nutrition).saturationMod(saturationModifier).build()));
    }

    /**
     * Easy to use eatable {@link Item}.
     *
     * @param foodBuilder {@link FunctionalInterface} of the {@link FoodProperties.Builder}. This can be used if more than nutrition and saturation has to be applied to this item.
     */
    public SimpleFoodItem(FoodBuilder foodBuilder) {
        super(new Properties().tab(TensuraCreativeTab.CONSUMABLES).food(foodBuilder.create(new FoodProperties.Builder()).build()));
    }


    @FunctionalInterface
    public interface FoodBuilder {
        FoodProperties.Builder create(FoodProperties.Builder builder);
    }
}
