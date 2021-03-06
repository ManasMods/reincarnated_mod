package com.github.manasmods.tensura.world.biome;

import com.github.manasmods.tensura.registry.TensuraPlacedFeatureRegistry;
import com.github.manasmods.manascore.world.gen.biome.BiomeBuilder;
import com.github.manasmods.manascore.world.gen.biome.BiomeGenerationSettingsHelper;
import com.github.manasmods.manascore.world.gen.biome.MobSpawnHelper;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.Carvers;
import net.minecraft.data.worldgen.placement.MiscOverworldPlacements;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;

import java.awt.Color;

public class SakuraForestBiome {
    public static Biome create() {
        BiomeGenerationSettingsHelper generationSettingsHelper = new BiomeGenerationSettingsHelper()
            //Add Caves and Canyons
            .addCarver(GenerationStep.Carving.AIR, Carvers.CAVE)
            .addCarver(GenerationStep.Carving.AIR, Carvers.CAVE_EXTRA_UNDERGROUND)
            .addCarver(GenerationStep.Carving.AIR, Carvers.CANYON)
            //Add underground lava lakes
            .addFeature(GenerationStep.Decoration.LAKES, MiscOverworldPlacements.LAKE_LAVA_UNDERGROUND)
            //Add underground crystal formations
            .apply(BiomeDefaultFeatures::addDefaultCrystalFormations)
            //Add Monster Room Structure
            .apply(BiomeDefaultFeatures::addDefaultMonsterRoom)
            //Apply default underground variety
            .apply(BiomeDefaultFeatures::addDefaultUndergroundVariety)
            //Apply default surface freezing
            .apply(BiomeDefaultFeatures::addSurfaceFreezing)
            //Add Trees
            .addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TensuraPlacedFeatureRegistry.SAKURA_FOREST_CHECKED.getHolder().get())
            //Apply mossy stones to surface
            .apply(BiomeDefaultFeatures::addMossyStoneBlock)
            //Add flowers to surface
            .apply(BiomeDefaultFeatures::addForestFlowers)
            //Add grass to surface
            .apply(BiomeDefaultFeatures::addForestGrass)
            .apply(BiomeDefaultFeatures::addPlainGrass)
            //Add Mushrooms to surface
            .apply(BiomeDefaultFeatures::addDefaultMushrooms)
            //Add decoration plants to surface
            .apply(BiomeDefaultFeatures::addDefaultExtraVegetation)
            //Add default ores
            .apply(BiomeDefaultFeatures::addDefaultOres, BiomeDefaultFeatures::addDefaultSoftDisks);

        MobSpawnHelper mobSpawnHelper = new MobSpawnHelper()
            //Add default animals
            .apply(BiomeDefaultFeatures::farmAnimals)
            //Add default cave entities and mobs
            .apply(BiomeDefaultFeatures::commonSpawns)
            //Allow wolves to spawn
            .addSpawn(MobCategory.CREATURE, EntityType.WOLF, 5, 4, 4);

        return BiomeBuilder.forest(generationSettingsHelper, mobSpawnHelper)
            .grassColor(new Color(154, 188, 66))
            .build();
    }
}
