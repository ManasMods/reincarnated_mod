package com.github.manasmods.tensura.registry;

import com.github.manasmods.tensura.block.TensuraBlocks;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;


public class TensuraPlacedFeatureRegistry {
    public static RegistryObject<PlacedFeature> SAKURA_TREE_CHECKED, SAKURA_TREE_LARGE_CHECKED, SAKURA_FOREST_CHECKED;
    public static RegistryObject<PlacedFeature> PALM_TREE_CHECKED, PALM_FOREST_CHECKED;

    static void register(DeferredRegister<PlacedFeature> registry) {
        SAKURA_TREE_CHECKED = registry.register("sakura_tree_checked", () -> new PlacedFeature(TensuraConfiguredFeatureRegistry.SAKURA_TREE.getHolder().get(),
            List.of(PlacementUtils.filteredByBlockSurvival(TensuraBlocks.SAKURA_SAPLING))));
        SAKURA_TREE_LARGE_CHECKED = registry.register("sakura_tree_large_checked", () -> new PlacedFeature(TensuraConfiguredFeatureRegistry.SAKURA_TREE_LARGE.getHolder().get(),
            List.of(PlacementUtils.filteredByBlockSurvival(TensuraBlocks.SAKURA_SAPLING))));
        SAKURA_FOREST_CHECKED = registry.register("sakura_forest_trees_checked", () -> new PlacedFeature(TensuraConfiguredFeatureRegistry.SAKURA_FOREST.getHolder().get(),
            VegetationPlacements.treePlacement(PlacementUtils.countExtra(10, 0.1F, 1))));

        PALM_TREE_CHECKED = registry.register("palm_tree_checked", () -> new PlacedFeature(TensuraConfiguredFeatureRegistry.PALM_TREE.getHolder().get(),
            List.of(PlacementUtils.filteredByBlockSurvival(TensuraBlocks.PALM_SAPLING))));
        PALM_FOREST_CHECKED = registry.register("palm_forest_checked", () -> new PlacedFeature(TensuraConfiguredFeatureRegistry.PALM_FOREST.getHolder().get(),
            VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.1F, 1))));
    }
}
