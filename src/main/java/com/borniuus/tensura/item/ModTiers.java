package com.borniuus.tensura.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers {
    public static final ForgeTier SILVER = new ForgeTier(2, 2266, 6f,
        1f, 17, Tags.Blocks.NEEDS_GOLD_TOOL,
        () -> Ingredient.of(TensuraItems.SILVER_INGOT));

    public static final ForgeTier MAGISTEEL = new ForgeTier(4, 2266, 10f,
        1.8f, 17, Tags.Blocks.NEEDS_NETHERITE_TOOL,
        () -> Ingredient.of(TensuraItems.MAGISTEEL_INGOT));

    public static final ForgeTier UNIQUE = new ForgeTier(4, 2400, 10.2f,
        3f, 17, Tags.Blocks.NEEDS_NETHERITE_TOOL,
        () -> Ingredient.of(TensuraItems.MAGISTEEL_INGOT));


}
