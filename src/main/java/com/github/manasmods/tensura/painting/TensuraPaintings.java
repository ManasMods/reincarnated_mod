package com.github.manasmods.tensura.painting;

import com.github.manasmods.tensura.Tensura;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TensuraPaintings {
    public static final DeferredRegister<Motive> PAINTING_MOVTIES =
            DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, Tensura.MOD_ID);

    public static final RegistryObject<Motive> SUNFLOWER =
            PAINTING_MOVTIES.register("sunflower", () -> new Motive(64, 32));
    public static final RegistryObject<Motive> FULBROSIA =
            PAINTING_MOVTIES.register("fulbrosia", () -> new Motive(48, 32));
}