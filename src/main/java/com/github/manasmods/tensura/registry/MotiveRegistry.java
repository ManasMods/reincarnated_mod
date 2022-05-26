package com.github.manasmods.tensura.registry;

import com.github.manasmods.tensura.motive.TensuraMotive;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

class MotiveRegistry {
    /**
     * This Method will register all Motives to Forge.
     * It is called though the {@link TensuraRegistry#register(IEventBus)} Method.
     */
    static void register(DeferredRegister<Motive> registry) {
        registry.register("example", () -> new TensuraMotive(80, 64));
    }
}
