package com.borniuus.tensura.registry;

import com.borniuus.tensura.block.TensuraBlocks;
import com.borniuus.tensura.world.gen.TensuraFeatures;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.TREE_THRESHOLD;

class PlacementRegistry {
    static final Map<String, RegistryObject<PlacedFeature>> placedFeatures = new HashMap<>();

    static void register(DeferredRegister<PlacedFeature> registry) {
        register(registry, "sakura_tree_checked", () -> new PlacedFeature(Holder.direct(
            TensuraFeatures.SAKURA_TREE.orElseThrow(() -> new IllegalArgumentException("Can not load Value from Registry.")).get()),
            List.of(PlacementUtils.filteredByBlockSurvival(TensuraBlocks.SAKURA_SAPLING))));
        register(registry, "sakura_tree_large_checked", () -> new PlacedFeature(Holder.direct(
            TensuraFeatures.SAKURA_TREE_LARGE.orElseThrow(() -> new IllegalArgumentException("Can not load Value from Registry.")).get()),
            List.of(PlacementUtils.filteredByBlockSurvival(TensuraBlocks.SAKURA_SAPLING))));
        register(registry, "sakura_forest_trees_checked", () -> new PlacedFeature(Holder.direct(
            TensuraFeatures.SAKURA_TREE_LARGE.orElseThrow(() -> new IllegalArgumentException("Can not load Value from Registry.")).get()),
            List.of(CountPlacement.of(16), InSquarePlacement.spread(), TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR)));
    }

    private static void register(DeferredRegister<PlacedFeature> registry, String registryName, Supplier<PlacedFeature> supplier) {
        placedFeatures.put(registryName, registry.register(registryName, supplier));
    }
}
