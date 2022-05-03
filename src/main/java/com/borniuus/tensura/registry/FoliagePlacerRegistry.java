package com.borniuus.tensura.registry;

import com.borniuus.tensura.world.tree.leaves.PalmFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraftforge.registries.DeferredRegister;

class FoliagePlacerRegistry {

    static void register(DeferredRegister<FoliagePlacerType<?>> registry) {
        registry.register("palm_foliage_placer", () -> new FoliagePlacerType<>(PalmFoliagePlacer.CODEC));
    }
}
