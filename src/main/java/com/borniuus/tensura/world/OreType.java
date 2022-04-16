package com.borniuus.tensura.world;

import lombok.Getter;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {

    SILVER(Lazy.of(() -> TensuraBlocks.silver_ore), 8, 10, 40),
    SILVER1(Lazy.of(() -> TensuraBlocks.deepslate_silver_ore), 8, 10, 40);

    @Getter
    private final Lazy<Block> block;
    @Getter
    private final int maxVeinSize;
    @Getter
    private final int minHeight;
    @Getter
    private final int maxHeight;

    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    public static OreType get(Block block) {
        for (OreType ore : values()) {
            if (block == ore.block) {

            }
        }
        return null;
    }
}
