package com.github.manasmods.tensura.sound;

import com.github.manasmods.tensura.Tensura;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class TensuraSoundEvent extends SoundEvent {
    /**
     * Easy to use {@link SoundEvent}.
     */
    public TensuraSoundEvent(String name) {
        super(new ResourceLocation(Tensura.MOD_ID, name));
    }
}
