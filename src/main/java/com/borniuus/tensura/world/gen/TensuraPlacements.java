package com.borniuus.tensura.world.gen;

import com.borniuus.tensura.registry.TensuraRegistry;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.registries.RegistryObject;

public class TensuraPlacements {
    public static final LazyOptional<RegistryObject<PlacedFeature>> SAKURA_TREE_CHECKED = LazyOptional.of(() -> TensuraRegistry.getPlacedFeatures().get("sakura_tree_checked"));
    public static final LazyOptional<RegistryObject<PlacedFeature>> SAKURA_TREE_LARGE_CHECKED = LazyOptional.of(() -> TensuraRegistry.getPlacedFeatures().get("sakura_tree_large_checked"));
    public static final LazyOptional<RegistryObject<PlacedFeature>> SAKURA_FOREST_TREES_CHECKED = LazyOptional.of(() -> TensuraRegistry.getPlacedFeatures().get("sakura_forest_trees_checked"));
}
