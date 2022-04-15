package com.borniuus.tensura.item.templates;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;

public class SimplePotionFoodItem extends SimpleFoodItem {
    /**
     * Single Constructor version of {@link SimpleFoodItem} which always provides a {@link MobEffectInstance} to the Eater.
     *
     * @param nutrition          Amount of 'hunger' you'll regenerate.
     * @param saturationModifier Saturation the Player gains.
     * @param potionEffect       {@link MobEffect} which will be applied
     * @param potionDuration     Duration of the Potion Effect
     * @param potionAmplifier    Amplifier of the Potion Effect (1 = Regeneration I, 2 = Regeneration II)
     * @param potionChance       Chance of the Potion Effect to be applied to the eating Entity. MIN: 0.0F / MAX: 1.0F
     */
    public SimplePotionFoodItem(int nutrition, float saturationModifier, MobEffect potionEffect, int potionDuration, int potionAmplifier, float potionChance) {
        super(builder -> {
            return builder.nutrition(nutrition)
                .saturationMod(saturationModifier)
                .effect(() -> new MobEffectInstance(potionEffect, potionDuration, potionAmplifier), potionChance);
        });
    }
}
