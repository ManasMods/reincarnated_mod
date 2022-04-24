package com.borniuus.tensura.world.biome.helper;

import lombok.RequiredArgsConstructor;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.MobSpawnSettings;

@RequiredArgsConstructor
public class MobSpawnHelper {
    private final MobSpawnSettings.Builder mobSpawnSettings;

    public MobSpawnHelper() {
        mobSpawnSettings = new MobSpawnSettings.Builder();
    }

    public static MobSpawnHelper from(MobSpawnSettings.Builder mobSpawnSettings) {
        return new MobSpawnHelper(mobSpawnSettings);
    }

    public MobSpawnSettings.Builder toBuilder() {
        return mobSpawnSettings;
    }

    public MobSpawnSettings finishMobSpawnSettings() {
        return mobSpawnSettings.build();
    }

    public MobSpawnHelper apply(MobSpawnHelper.DefaultBiomeMobSpawnSettings defaultBiomeFeature) {
        defaultBiomeFeature.apply(this.mobSpawnSettings);
        return this;
    }

    public MobSpawnHelper apply(MobSpawnHelper.DefaultBiomeMobSpawnSettings defaultBiomeFeature, MobSpawnHelper.DefaultBiomeMobSpawnSettings... defaultBiomeFeatures) {
        apply(defaultBiomeFeature);

        for (MobSpawnHelper.DefaultBiomeMobSpawnSettings feature : defaultBiomeFeatures) {
            apply(feature);
        }

        return this;
    }

    public MobSpawnHelper addSpawn(MobCategory category, EntityType<?> entityType, int weight, int minCount, int maxCount) {
        mobSpawnSettings.addSpawn(category, new MobSpawnSettings.SpawnerData(entityType, weight, minCount, maxCount));
        return this;
    }

    @FunctionalInterface
    public interface DefaultBiomeMobSpawnSettings {
        void apply(MobSpawnSettings.Builder builder);
    }
}
