package com.borniuus.tensura.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers {

    public static final ForgeTier UNIQUE = new ForgeTier(4, 2400, 10.2f, 3f, 18,
            Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(Items.AIR));

    public static final ForgeTier FLINT = new ForgeTier(0,1,1,1,5,
            Tags.Blocks.NEEDS_WOOD_TOOL,
            () -> Ingredient.of(Items.FLINT));

    public static final ForgeTier SILVER = new ForgeTier(2,191,5F,1,16,
            Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(TensuraItems.SILVER_INGOT));

    public static final ForgeTier LOW_MAGISTEEL = new ForgeTier(4,1796,8F,1,12,
            Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(TensuraItems.MAGISTEEL_INGOT));

    public static final ForgeTier HIGH_MAGISTEEL = new ForgeTier(5,3656,1,1,16,
            Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(TensuraItems.MAGISTEEL_INGOT));

    public static final ForgeTier MITHRIL = new ForgeTier(6,8775,1,1,20,
            Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(TensuraItems.MITHRIL_INGOT));

    public static final ForgeTier ORICHALCUM = new ForgeTier(7,10530,1,1,25,
            Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(TensuraItems.ORICHALCUM_INGOT));

    public static final ForgeTier PURE_MAGISTEEL = new ForgeTier(8,11583,1,1,30,
            Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(TensuraItems.MAGISTEEL_INGOT));

    public static final ForgeTier ADAMANTITE = new ForgeTier(9,52124,1,1,40,
            Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(TensuraItems.ADAMANTITE_INGOT));

    public static final ForgeTier HIHIIROKANE = new ForgeTier(10,172010,1,1,100,
            Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(TensuraItems.HIHIIROKANE_INGOT));
}
