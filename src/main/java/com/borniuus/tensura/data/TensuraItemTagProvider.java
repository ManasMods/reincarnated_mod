package com.borniuus.tensura.data;

import com.borniuus.tensura.Tensura;
import com.github.manasmods.manascore.data.gen.BlockTagProvider;
import com.github.manasmods.manascore.data.gen.ItemTagProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

public class TensuraItemTagProvider extends ItemTagProvider {
    public TensuraItemTagProvider(GatherDataEvent gatherDataEvent, BlockTagProvider blockTagProvider) {
        super(gatherDataEvent, Tensura.MOD_ID, blockTagProvider);
    }

    @Override
    protected void generate() {
        copy(BlockTags.LOGS, ItemTags.LOGS);
        copy(BlockTags.LEAVES, ItemTags.LEAVES);
    }
}
