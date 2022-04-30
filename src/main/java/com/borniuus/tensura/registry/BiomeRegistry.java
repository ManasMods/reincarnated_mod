package com.borniuus.tensura.registry;

import com.borniuus.tensura.world.biome.SakuraForestBiome;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.registries.DeferredRegister;

class BiomeRegistry {
    static void register(DeferredRegister<Biome> registry) {
        registry.register("sakura_forest", SakuraForestBiome::create).getKey();
    }
}
