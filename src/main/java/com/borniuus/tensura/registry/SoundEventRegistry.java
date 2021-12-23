package com.borniuus.tensura.registry;

import com.borniuus.tensura.sound.TensuraSoundEvent;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;

class SoundEventRegistry {
    static void register(DeferredRegister<SoundEvent> registry) {
        registry.register("like_flames",() -> new TensuraSoundEvent("like_flames"));
    }
}
