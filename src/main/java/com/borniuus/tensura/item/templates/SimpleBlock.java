package com.borniuus.tensura.item.templates;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class SimpleBlock extends Block {
    public SimpleBlock(Material material) {
        this(material, properties1 -> properties1);
    }

    public SimpleBlock(Material material, BlockProperties properties) {
        super(properties.create(Properties.of(material)));
    }

    public interface BlockProperties {
        Properties create(Properties properties);
    }
}
