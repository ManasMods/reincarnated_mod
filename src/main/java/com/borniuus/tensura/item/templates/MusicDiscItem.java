package com.borniuus.tensura.item.templates;

import com.borniuus.tensura.item.TensuraCreativeTab;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.RecordItem;

import java.util.function.Supplier;

public class MusicDiscItem extends RecordItem {
    public MusicDiscItem(Supplier<SoundEvent> soundSupplier) {
        super(1, soundSupplier, new Properties().stacksTo(1).tab(TensuraCreativeTab.TENSURA_TAB));
    }
}
