package com.borniuus.tensura.world;

import com.borniuus.tensura.block.ModBlocks;
import lombok.Getter;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {

    SILVER(Lazy.of(ModBlocks.SILVER_ORE_STONE), 8, 10, 40),
    SILVER1(Lazy.of(ModBlocks.SILVER_ORE_DEEPSLATE), 8, 10, 40);

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
