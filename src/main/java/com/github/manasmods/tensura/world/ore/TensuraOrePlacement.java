package com.github.manasmods.tensura.world.ore;

import com.github.manasmods.tensura.block.TensuraBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

import static net.minecraft.data.worldgen.features.OreFeatures.DEEPSLATE_ORE_REPLACEABLES;
import static net.minecraft.data.worldgen.features.OreFeatures.STONE_ORE_REPLACEABLES;

class TensuraOrePlacement {
    @SuppressWarnings("ConstantConditions")
    private static final List<OreConfiguration.TargetBlockState> ORE_SILVER_TARGET_LIST = List.of(
        OreConfiguration.target(STONE_ORE_REPLACEABLES, TensuraBlocks.SILVER_ORE.defaultBlockState()),
        OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, TensuraBlocks.DEEPSLATE_SILVER_ORE.defaultBlockState())
    );

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_SILVER_SMALL = FeatureUtils.register("ore_silver_small", Feature.ORE,
        new OreConfiguration(ORE_SILVER_TARGET_LIST, 4, 0.5F));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_SILVER_LARGE = FeatureUtils.register("ore_silver_large", Feature.ORE,
        new OreConfiguration(ORE_SILVER_TARGET_LIST, 12, 0.7F));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_SILVER_BURIED = FeatureUtils.register("ore_silver_buried", Feature.ORE,
        new OreConfiguration(ORE_SILVER_TARGET_LIST, 8, 1.0F));
}
