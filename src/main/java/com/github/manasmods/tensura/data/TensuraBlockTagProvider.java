package com.github.manasmods.tensura.data;

import com.github.manasmods.tensura.block.TensuraBlocks;
import com.github.manasmods.tensura.Tensura;
import com.github.manasmods.manascore.data.gen.BlockTagProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

public class TensuraBlockTagProvider extends BlockTagProvider {
    public TensuraBlockTagProvider(GatherDataEvent gatherDataEvent) {
        super(gatherDataEvent, Tensura.MOD_ID);
    }

    @Override
    protected void generate() {
        tag(BlockTags.LOGS).add(TensuraBlocks.PALM_LOG, TensuraBlocks.SAKURA_LOG);
        tag(BlockTags.LEAVES).add(TensuraBlocks.PALM_LEAVES,TensuraBlocks.SAKURA_LEAVES);
    }
}
