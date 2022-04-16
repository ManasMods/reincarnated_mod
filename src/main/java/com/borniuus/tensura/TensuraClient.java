package com.borniuus.tensura;

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
    }
}
