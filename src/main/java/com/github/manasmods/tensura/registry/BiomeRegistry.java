package com.github.manasmods.tensura.registry;

import com.github.manasmods.tensura.world.biome.SakuraForestBiome;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.registries.DeferredRegister;

class BiomeRegistry {
    static void register(DeferredRegister<Biome> registry) {
        registry.register("sakura_forest", SakuraForestBiome::create);
    }
}
