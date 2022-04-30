package com.borniuus.tensura.world.tree;

import com.borniuus.tensura.block.TensuraBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.TREE_THRESHOLD;

public class TensuraTreePlacements {
    public static final Holder<PlacedFeature> SAKURA_CHECKED = PlacementUtils.register("sakura_tree", TensuraTreeFeatures.SAKURA,
        PlacementUtils.filteredByBlockSurvival(TensuraBlocks.SAKURA_SAPLING));
    public static final Holder<PlacedFeature> SAKURA_LARGE_CHECKED = PlacementUtils.register("sakura_tree_large", TensuraTreeFeatures.SAKURA_LARGE,
        PlacementUtils.filteredByBlockSurvival(TensuraBlocks.SAKURA_SAPLING));

    public static final Holder<PlacedFeature> SAKURA_FOREST = PlacementUtils.register("sakura_forest_trees", TensuraTreeFeatures.SAKURA_FOREST,
        CountPlacement.of(16), InSquarePlacement.spread(), TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR);
}
