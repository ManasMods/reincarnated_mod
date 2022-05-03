package com.borniuus.tensura.handler;

import com.borniuus.tensura.registry.TensuraPlacedFeatureRegistry;
import com.borniuus.tensura.world.ore.TensuraOreFeatures;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.IEventBus;

public class WorldGenHandler {
    private static void registerOreFeatures(final BiomeLoadingEvent e) {

        switch (e.getName().toString()) {
            case "minecraft:forest", "minecraft:old_growth_birch_forest", "minecraft:flower_forest" -> {
                e.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TensuraPlacedFeatureRegistry.PALM_FOREST_CHECKED.getHolder().get());
            }
        }

        switch (e.getCategory()) {
            case THEEND, NETHER -> {
                //Nothing here since we don't generate any ore in the end or the nether
            }
            default -> {
                //Add to all other biomes
                e.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, TensuraOreFeatures.ORE_SILVER);
                e.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, TensuraOreFeatures.ORE_SILVER_LARGE);
                e.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, TensuraOreFeatures.ORE_SILVER_BURIED);
            }
        }
    }

    public static void register() {
        IEventBus forgeEventBus = MinecraftForge.EVENT_BUS;
        forgeEventBus.addListener(WorldGenHandler::registerOreFeatures);
    }
}
