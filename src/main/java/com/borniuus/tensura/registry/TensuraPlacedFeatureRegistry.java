package com.borniuus.tensura.registry;

import com.borniuus.tensura.block.TensuraBlocks;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;


public class TensuraPlacedFeatureRegistry {
    private static final PlacementModifier TREE_THRESHOLD = SurfaceWaterDepthFilter.forMaxDepth(0);
    public static RegistryObject<PlacedFeature> SAKURA_TREE_CHECKED, SAKURA_TREE_LARGE_CHECKED, SAKURA_FOREST_CHECKED;

    static void register(DeferredRegister<PlacedFeature> registry) {
        SAKURA_TREE_CHECKED = registry.register("sakura_tree_checked", () -> new PlacedFeature(TensuraConfiguredFeatureRegistry.SAKURA_TREE.getHolder().get(),
            List.of(PlacementUtils.filteredByBlockSurvival(TensuraBlocks.SAKURA_SAPLING))));
        SAKURA_TREE_LARGE_CHECKED = registry.register("sakura_tree_large_checked", () -> new PlacedFeature(TensuraConfiguredFeatureRegistry.SAKURA_TREE_LARGE.getHolder().get(),
            List.of(PlacementUtils.filteredByBlockSurvival(TensuraBlocks.SAKURA_SAPLING))));
        SAKURA_FOREST_CHECKED = registry.register("sakura_forest_trees_checked", () -> new PlacedFeature(TensuraConfiguredFeatureRegistry.SAKURA_TREE_LARGE.getHolder().get(),
            VegetationPlacements.treePlacement(PlacementUtils.countExtra(10, 0.1F, 1))));

    }
}
