package com.borniuus.tensura.world.biome.helper;

import lombok.RequiredArgsConstructor;
import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

@RequiredArgsConstructor
public class BiomeGenerationSettingsHelper {
    private final BiomeGenerationSettings.Builder biomeGenSettings;

    public BiomeGenerationSettingsHelper() {
        this.biomeGenSettings = new BiomeGenerationSettings.Builder();
    }


    public static BiomeGenerationSettingsHelper from(BiomeGenerationSettings.Builder biomeGenSettings) {
        return new BiomeGenerationSettingsHelper(biomeGenSettings);
    }

    public BiomeGenerationSettings.Builder toBuilder() {
        return biomeGenSettings;
    }

    public BiomeGenerationSettingsHelper apply(DefaultBiomeFeature defaultBiomeFeature) {
        defaultBiomeFeature.apply(this.biomeGenSettings);
        return this;
    }

    public BiomeGenerationSettingsHelper apply(DefaultBiomeFeature defaultBiomeFeature, DefaultBiomeFeature... defaultBiomeFeatures) {
        apply(defaultBiomeFeature);

        for (DefaultBiomeFeature feature : defaultBiomeFeatures) {
            apply(feature);
        }

        return this;
    }

    public BiomeGenerationSettingsHelper addCarver(GenerationStep.Carving generationStep, Holder<? extends ConfiguredWorldCarver<?>> carver) {
        biomeGenSettings.addCarver(generationStep, carver);
        return this;
    }

    public BiomeGenerationSettingsHelper addFeature(GenerationStep.Decoration generationStep, Holder<PlacedFeature> feature) {
        biomeGenSettings.addFeature(generationStep, feature);
        return this;
    }

    public BiomeGenerationSettings finishBiomeSettings() {
        return this.biomeGenSettings.build();
    }


    @FunctionalInterface
    public interface DefaultBiomeFeature {
        void apply(BiomeGenerationSettings.Builder builder);
    }
}
