package com.borniuus.tensura.block;

import lombok.Getter;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

import java.util.ArrayList;

public class WindowBlock extends IronBarsBlock {
    @Getter
    private static final ArrayList<WindowBlock> windowBlocks = new ArrayList<>();

    public WindowBlock() {
        super(Properties.of(Material.GLASS).strength(0.3F).sound(SoundType.GLASS).noOcclusion());
        windowBlocks.add(this);
    }
}
