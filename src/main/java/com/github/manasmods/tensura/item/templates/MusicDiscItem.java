package com.github.manasmods.tensura.item.templates;

import com.github.manasmods.tensura.item.TensuraCreativeTab;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.RecordItem;

import java.util.function.Supplier;

public class MusicDiscItem extends RecordItem {
    /**
     * Easy to use {@link RecordItem}.
     *
     * @param soundSupplier Supplier reference to the sound event triggered when playing the disc.
     */
    public MusicDiscItem(Supplier<SoundEvent> soundSupplier) {
        this(1, soundSupplier);
    }

    /**
     * Easy to use {@link RecordItem}.
     *
     * @param comparatorValue    Redstone power outputted by a {@link Items#COMPARATOR}.
     * @param soundEventSupplier Supplier reference to the sound event triggered when playing the disc.
     */
    public MusicDiscItem(int comparatorValue, Supplier<SoundEvent> soundEventSupplier) {
        super(comparatorValue, soundEventSupplier, new Properties().stacksTo(1).tab(TensuraCreativeTab.MISCELLANEOUS));
    }
}
