package com.borniuus.tensura.world.biome.helper;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import net.minecraft.sounds.Music;
import net.minecraft.util.Mth;
import net.minecraft.world.level.biome.AmbientMoodSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSpecialEffects;

import java.awt.Color;

@RequiredArgsConstructor
public class BiomeBuilder {
    private final Biome.BiomeCategory biomeCategory;
    private final BiomeGenerationSettingsHelper generationSettingsHelper;
    private final MobSpawnHelper mobSpawnHelper;
    private final Biome.BiomeBuilder biomeBuilder = new Biome.BiomeBuilder();
    @Setter
    private Biome.Precipitation rainType = Biome.Precipitation.RAIN;
    private float temperature = 0.8F;
    private float downfall = 0.4F;
    private int waterColor = 4159204;
    private int waterFogColor = 329011;
    private int fogColor = 12638463;
    private Music backgroundMusic = null;

    public BiomeBuilder downfall(float downfall) {
        this.downfall = downfall;
        return this;
    }

    public BiomeBuilder waterColor(Color color) {
        this.waterColor = color.getRGB();
        return this;
    }

    public BiomeBuilder waterFogColor(Color color) {
        this.waterFogColor = color.getRGB();
        return this;
    }

    public BiomeBuilder fogColor(Color color) {
        this.fogColor = color.getRGB();
        return this;
    }

    public BiomeBuilder backgroundMusic(Music music) {
        this.backgroundMusic = music;
        return this;
    }

    public BiomeBuilder temperature(float temperature) {
        this.temperature = temperature;
        return this;
    }

    public BiomeBuilder rain(Biome.Precipitation rainType) {
        this.rainType = rainType;
        return this;
    }

    public Biome build() {
        BiomeSpecialEffects.Builder specialEffects = new BiomeSpecialEffects.Builder()
            .waterColor(waterColor)
            .waterFogColor(waterFogColor)
            .fogColor(fogColor)
            .skyColor(calculateSkyColor(temperature))
            .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
            .backgroundMusic(backgroundMusic);

        return biomeBuilder
            .biomeCategory(biomeCategory)
            .precipitation(rainType)
            .temperature(temperature)
            .downfall(downfall)
            .specialEffects(specialEffects.build())
            .mobSpawnSettings(mobSpawnHelper.finishMobSpawnSettings())
            .generationSettings(generationSettingsHelper.finishBiomeSettings())
            .build();
    }

    public static BiomeBuilder forest(BiomeGenerationSettingsHelper generationSettingsHelper, MobSpawnHelper mobSpawnHelper) {
        return new BiomeBuilder(Biome.BiomeCategory.FOREST, generationSettingsHelper, mobSpawnHelper)
            .temperature(0.7F)
            .downfall(0.8F);
    }

    private static int calculateSkyColor(float p_194844_) {
        float $$1 = p_194844_ / 3.0F;
        $$1 = Mth.clamp($$1, -1.0F, 1.0F);
        return Mth.hsvToRgb(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
    }
}
