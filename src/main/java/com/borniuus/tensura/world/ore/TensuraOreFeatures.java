package com.borniuus.tensura.world.ore;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import java.util.List;

public class TensuraOreFeatures {
    public static final Holder<PlacedFeature> ORE_SILVER = PlacementUtils.register("ore_silver", TensuraOrePlacement.ORE_SILVER_SMALL,
        commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384))));
    public static final Holder<PlacedFeature> ORE_SILVER_LARGE = PlacementUtils.register("ore_silver_large", TensuraOrePlacement.ORE_SILVER_LARGE,
        rareOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-24), VerticalAnchor.aboveBottom(56))));
    public static final Holder<PlacedFeature> ORE_SILVER_BURIED = PlacementUtils.register("ore_silver_buried", TensuraOrePlacement.ORE_SILVER_BURIED,
        commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-24), VerticalAnchor.aboveBottom(56))));

    /**
     * @param amount    Guaranteed amount of ore clusters per chunk
     * @param placement Y Level range for ore cluster placement
     */
    private static List<PlacementModifier> commonOrePlacement(int amount, HeightRangePlacement placement) {
        return orePlacement(CountPlacement.of(amount), placement);
    }

    /**
     * @param chance    Chance for one ore cluster per chunk
     * @param placement Y Level range for ore cluster placement
     */
    private static List<PlacementModifier> rareOrePlacement(int chance, HeightRangePlacement placement) {
        return orePlacement(RarityFilter.onAverageOnceEvery(chance), placement);
    }

    private static List<PlacementModifier> orePlacement(PlacementModifier placementModifier, HeightRangePlacement heightRangePlacement) {
        return List.of(placementModifier, InSquarePlacement.spread(), heightRangePlacement, BiomeFilter.biome());
    }

    private static void registerOreFeatures(final BiomeLoadingEvent e) {
        switch (e.getCategory()) {
            case THEEND, NETHER -> {
                //Nothing here since we don't generate any ore in the end or the nether
            }
            default -> {
                //Add to all other biomes
                e.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ORE_SILVER);
                e.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ORE_SILVER_LARGE);
                e.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ORE_SILVER_BURIED);
            }
        }
    }

    public static void register() {
        IEventBus forgeEventBus = MinecraftForge.EVENT_BUS;
        forgeEventBus.addListener(TensuraOreFeatures::registerOreFeatures);
    }
}
