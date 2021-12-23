package com.borniuus.tensura.item.templates;

import com.borniuus.tensura.item.TensuraCreativeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public class SimpleBlockItem extends BlockItem {
    public SimpleBlockItem(Block pBlock) {
        super(pBlock, new Properties().tab(TensuraCreativeTab.TENSURA_TAB2));
    }
}
