package com.borniuus.tensura.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers {
    public static final ForgeTier MAGISTEEL = new ForgeTier(4, 2266, 10f,
            4.5f, 17, Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(ModItems.MAGISTEEL_INGOT.get()));
}
