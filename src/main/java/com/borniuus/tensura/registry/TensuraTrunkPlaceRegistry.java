package com.borniuus.tensura.registry;

import com.borniuus.tensura.world.tree.trunk.PalmTrunkPlacer;
import com.mojang.serialization.Codec;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TensuraTrunkPlaceRegistry {
    public static RegistryObject<TrunkPlacerType<PalmTrunkPlacer>> PALM_TRUNK_PLACER;

    public static void register(DeferredRegister<TrunkPlacerType<?>> register) {
        PALM_TRUNK_PLACER = register.register("palm_trunk_placer", () -> createTrunkPlacerType(PalmTrunkPlacer.CODEC));
    }

    private static <P extends TrunkPlacer> TrunkPlacerType<P> createTrunkPlacerType(Codec<P> codec) {
        Constructor<?> constructor = TrunkPlacerType.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        try {
            return (TrunkPlacerType<P>) constructor.newInstance(codec);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
