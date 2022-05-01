package com.borniuus.tensura.world.gen;

import com.borniuus.tensura.registry.TensuraRegistry;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.registries.RegistryObject;

public class TensuraFeatures {
    public static final LazyOptional<RegistryObject<ConfiguredFeature<?, ?>>> SAKURA_TREE = LazyOptional.of(() -> TensuraRegistry.getConfiguredFeatures().get("sakura_tree"));
    public static final LazyOptional<RegistryObject<ConfiguredFeature<?, ?>>> SAKURA_TREE_HIVE = LazyOptional.of(() -> TensuraRegistry.getConfiguredFeatures().get("sakura_tree_hive"));
    public static final LazyOptional<RegistryObject<ConfiguredFeature<?, ?>>> SAKURA_TREE_LARGE = LazyOptional.of(() -> TensuraRegistry.getConfiguredFeatures().get("sakura_tree_large"));
    public static final LazyOptional<RegistryObject<ConfiguredFeature<?, ?>>> SAKURA_TREE_LARGE_HIVE = LazyOptional.of(() -> TensuraRegistry.getConfiguredFeatures().get("sakura_tree_large_hive"));
    public static final LazyOptional<RegistryObject<ConfiguredFeature<?, ?>>> SAKURA_FOREST_TREES = LazyOptional.of(() -> TensuraRegistry.getConfiguredFeatures().get("sakura_forest_trees"));
}
