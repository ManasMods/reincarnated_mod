package com.borniuus.tensura.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class SimpleBlock extends Block {
    /**
     * Easy to use {@link Block}.
     *
     * @param material Type of material.
     */
    public SimpleBlock(Material material) {
        this(material, properties1 -> properties1);
    }

    /**
     * Easy to use {@link Block}.
     *
     * @param material   Type of material.
     * @param properties {@link FunctionalInterface} of {@link Properties}. Can be used to apply custom settings.
     */
    public SimpleBlock(Material material, BlockProperties properties) {
        super(properties.create(Properties.of(material)));
    }

    @FunctionalInterface
    public interface BlockProperties {
        Properties create(Properties properties);
    }
}
