package com.borniuus.tensura.world.biome.terrablender;

import com.borniuus.tensura.Tensura;
import com.borniuus.tensura.world.biome.TensuraBiomes;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import net.minecraftforge.registries.ForgeRegistries;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class TensuraOverworldRegion extends Region {
    public TensuraOverworldRegion() {
        super(new ResourceLocation(Tensura.MOD_ID, "overworld"), RegionType.OVERWORLD, 2);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        addModifiedVanillaOverworldBiomes(mapper, builder -> {
            builder.replaceBiome(Biomes.FOREST, ResourceKey.create(ForgeRegistries.Keys.BIOMES, TensuraBiomes.SAKURA_FOREST.getRegistryName()));
        });
    }
}
