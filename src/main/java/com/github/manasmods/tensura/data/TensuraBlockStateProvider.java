package com.github.manasmods.tensura.data;

import com.github.manasmods.tensura.Tensura;
import com.github.manasmods.tensura.block.TensuraBlocks;
import com.github.manasmods.manascore.data.gen.BlockStateProvider;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

public class TensuraBlockStateProvider extends BlockStateProvider {

    public TensuraBlockStateProvider(GatherDataEvent gatherDataEvent) {
        super(gatherDataEvent, Tensura.MOD_ID);
    }

    @Override
    protected void generate() {
        //BLOCKS WITH DIFFERENT TOP + BOTTOM TO THE SIDES

        pillar(TensuraBlocks.PALM_LOG);
        pillar(TensuraBlocks.SAKURA_LOG);
        pillar(TensuraBlocks.THATCH_BLOCK);

        //BLOCKS WITH SAME TEXTURE ON ALL SIDES

        defaultBlock(TensuraBlocks.BLOCK_OF_ADAMANTITE);
        defaultBlock(TensuraBlocks.BLOCK_OF_HIHIIROKANE);
        defaultBlock(TensuraBlocks.BLOCK_OF_ORICHALCUM);
        defaultBlock(TensuraBlocks.BLOCK_OF_MAGISTEEL);
        defaultBlock(TensuraBlocks.BLOCK_OF_MITHRIL);
        defaultBlock(TensuraBlocks.DEEPSLATE_SILVER_ORE);
        //defaultBlock(TensuraBlocks.BLOCK_OF_RAW_SILVER);
        defaultBlock(TensuraBlocks.BLOCK_OF_SILVER);
        //defaultBlock(TensuraBlocks.MAGIC_ENGINE);
        defaultBlock(TensuraBlocks.PALM_LEAVES);
        defaultBlock(TensuraBlocks.PALM_PLANKS);
        defaultBlock(TensuraBlocks.SAKURA_LEAVES);
        defaultBlock(TensuraBlocks.SAKURA_PLANKS);
        //defaultBlock(TensuraBlocks.SARASA_SAND);
        defaultBlock(TensuraBlocks.SILVER_ORE);

        //STAIRS

        stairs(TensuraBlocks.PALM_STAIRS, TensuraBlocks.PALM_PLANKS);
        stairs(TensuraBlocks.SAKURA_STAIRS, TensuraBlocks.SAKURA_PLANKS);
        stairs(TensuraBlocks.THATCH_STAIRS, TensuraBlocks.THATCH_BLOCK);

        //SLABS

        slab(TensuraBlocks.PALM_SLAB, TensuraBlocks.PALM_PLANKS);
        slab(TensuraBlocks.SAKURA_SLAB, TensuraBlocks.SAKURA_PLANKS);
        slab(TensuraBlocks.THATCH_SLAB, TensuraBlocks.THATCH_BLOCK);

        //OTHER

        //paneBlock(TensuraBlocks.EXAMPLE_WINDOW, new ResourceLocation("minecraft:block/glass"), new ResourceLocation("minecraft:block/glass_pane_top"));
    }
}

