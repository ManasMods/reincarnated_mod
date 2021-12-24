package com.borniuus.tensura.registry;

import com.borniuus.tensura.sound.TensuraSoundEvent;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

class SoundEventRegistry {
    /**
     * This Method will register all SoundEvents to Forge.
     * It is called though the {@link TensuraRegistry#register(IEventBus)} Method.
     */
    static void register(DeferredRegister<SoundEvent> registry) {
        registry.register("like_flames", () -> new TensuraSoundEvent("like_flames"));
    }
}
