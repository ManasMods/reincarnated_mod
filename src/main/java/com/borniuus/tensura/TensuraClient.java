package com.borniuus.tensura;

import com.borniuus.tensura.block.TensuraBlocks;
import com.borniuus.tensura.block.WindowBlock;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.IEventBus;

public class TensuraClient extends TensuraCommon {
    @Override
    public void preInit(IEventBus modBus) {
        super.preInit(modBus);
    }

    @Override
    public void clientInit() {
        //Register all Window Blocks as cutout transparency blocks
        WindowBlock.getWindowBlocks().forEach(windowBlock -> ItemBlockRenderTypes.setRenderLayer(windowBlock, RenderType.cutout()));
        ItemBlockRenderTypes.setRenderLayer(TensuraBlocks.PALM_LEAVES, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TensuraBlocks.SAKURA_LEAVES, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TensuraBlocks.SMITHING_BENCH, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TensuraBlocks.LOOM, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TensuraBlocks.COOKING_POT, RenderType.translucent());
    }
}
