package com.borniuus.tensura.registry;

import com.borniuus.tensura.block.TensuraBlocks;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.BeehiveDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.OptionalInt;

public class TensuraConfiguredFeatureRegistry {
    private static final BeehiveDecorator BEEHIVE = new BeehiveDecorator(0.05F);
    public static RegistryObject<ConfiguredFeature<?, ?>> SAKURA_TREE, SAKURA_TREE_HIVE, SAKURA_TREE_LARGE, SAKURA_TREE_LARGE_HIVE, SAKURA_FOREST;

    static void register(final DeferredRegister<ConfiguredFeature<?, ?>> registry) {
        SAKURA_TREE = registry.register("sakura_tree", () -> new ConfiguredFeature<>(Feature.TREE, basicTree(TensuraBlocks.SAKURA_LOG, TensuraBlocks.SAKURA_LEAVES)));
        SAKURA_TREE_HIVE = registry.register("sakura_tree_hive", () -> new ConfiguredFeature<>(Feature.TREE, basicTreeWithHive(TensuraBlocks.SAKURA_LOG, TensuraBlocks.SAKURA_LEAVES)));
        SAKURA_TREE_LARGE = registry.register("sakura_tree_large", () -> new ConfiguredFeature<>(Feature.TREE, largeTree(TensuraBlocks.SAKURA_LOG, TensuraBlocks.SAKURA_LEAVES)));
        SAKURA_TREE_LARGE_HIVE = registry.register("sakura_tree_large_hive", () -> new ConfiguredFeature<>(Feature.TREE, largeTreeWithHive(TensuraBlocks.SAKURA_LOG, TensuraBlocks.SAKURA_LEAVES)));

        SAKURA_FOREST = registry.register("sakura_forest_trees", () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(
            new WeightedPlacedFeature(TensuraPlacedFeatureRegistry.SAKURA_TREE_LARGE_CHECKED.getHolder().get(), 0.15F)
        ), TensuraPlacedFeatureRegistry.SAKURA_TREE_CHECKED.getHolder().get())));
    }

    private static TreeConfiguration largeTree(Block logBlock, Block leavesBlock) {
        return largeTree(logBlock, leavesBlock, 3, 11, 0, 4).build();
    }

    private static TreeConfiguration largeTreeWithHive(Block logBlock, Block leavesBlock) {
        return largeTree(logBlock, leavesBlock, 3, 11, 0, 4).decorators(List.of(BEEHIVE)).build();
    }

    private static TreeConfiguration basicTree(Block logBlock, Block leavesBlock) {
        return createStraightBlobTree(logBlock, leavesBlock, 4, 2, 0, 2).ignoreVines().build();
    }

    private static TreeConfiguration basicTreeWithHive(Block logBlock, Block leavesBlock) {
        return createStraightBlobTree(logBlock, leavesBlock, 4, 2, 0, 2).ignoreVines().decorators(List.of(BEEHIVE)).build();
    }

    private static TreeConfiguration.TreeConfigurationBuilder createStraightBlobTree(Block logBlock, Block leavesBlock, int baseHeight, int p_195150_, int p_195151_, int leavesRadius) {
        return new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(logBlock),
            new StraightTrunkPlacer(baseHeight, p_195150_, p_195151_), BlockStateProvider.simple(leavesBlock),
            new BlobFoliagePlacer(ConstantInt.of(leavesRadius), ConstantInt.of(0), 3),
            new TwoLayersFeatureSize(1, 0, 1));
    }

    private static TreeConfiguration.TreeConfigurationBuilder largeTree(Block logBlock, Block leavesBlock, int baseHeight, int p_195150_, int p_195151_, int leavesRadius) {
        return new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(logBlock),
            new FancyTrunkPlacer(baseHeight, p_195150_, p_195151_), BlockStateProvider.simple(leavesBlock),
            new FancyFoliagePlacer(ConstantInt.of(leavesRadius), ConstantInt.of(4), 4),
            new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines();
    }
}
