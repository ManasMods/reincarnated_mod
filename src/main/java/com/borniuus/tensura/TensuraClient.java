package com.borniuus.tensura;

import com.borniuus.tensura.block.WindowBlock;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class TensuraClient extends TensuraCommon {
    @Override
    public void clientInit() {
        WindowBlock.getWindowBlocks().forEach(windowBlock -> ItemBlockRenderTypes.setRenderLayer(windowBlock, RenderType.cutout()));
    }
}
