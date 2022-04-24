package com.borniuus.tensura;

import com.borniuus.tensura.block.WindowBlock;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.IEventBus;

public class TensuraClient extends TensuraCommon {
    @Override
    public void preInit(IEventBus modEventBus) {
        super.preInit(modEventBus);
    }

    @Override
    public void clientInit() {
        //Register all Window Blocks as cutout transparency blocks
        WindowBlock.getWindowBlocks().forEach(windowBlock -> ItemBlockRenderTypes.setRenderLayer(windowBlock, RenderType.cutout()));
    }
}
