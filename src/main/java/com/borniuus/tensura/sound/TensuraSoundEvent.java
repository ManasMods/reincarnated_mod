package com.borniuus.tensura.sound;

import com.borniuus.tensura.Tensura;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class TensuraSoundEvent extends SoundEvent {
    public TensuraSoundEvent(String name) {
        super(new ResourceLocation(Tensura.MOD_ID, name));
    }
}
