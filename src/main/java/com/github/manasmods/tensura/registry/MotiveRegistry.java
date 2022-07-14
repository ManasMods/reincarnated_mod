package com.github.manasmods.tensura.registry;

import com.github.manasmods.tensura.motive.TensuraMotive;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

class MotiveRegistry {
    /**
     * This Method will register all Motives to Forge.
     * It is called though the {@link TensuraRegistry#register(IEventBus)} Method.
     */
    static void register(DeferredRegister<Motive> registry) {
        //        registry.register("name", () -> new Motive(width,height));
        registry.register("sunflower", () -> new Motive(80, 48));
        registry.register("fulbrosia", () -> new Motive(48, 32));
        registry.register("world_map", () -> new Motive(96, 64));
        registry.register("ingrassia", () -> new Motive(48, 32));
        registry.register("blumund", () -> new Motive(64, 32));
        registry.register("filtwood", () -> new Motive(64, 32));
        registry.register("raja", () -> new Motive(32, 48));
    }
}