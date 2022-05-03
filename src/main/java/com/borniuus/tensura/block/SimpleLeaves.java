package com.borniuus.tensura.block;

import lombok.Getter;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

import java.util.ArrayList;

public class SimpleLeaves extends LeavesBlock {
    @Getter
    private static final ArrayList<WindowBlock> leavesBlocks = new ArrayList<>();
    public SimpleLeaves() {
        this(SoundType.GRASS);
    }

    public SimpleLeaves(SoundType soundType) {
        super(BlockBehaviour.Properties.of(Material.LEAVES)
            .strength(0.2F)
            .randomTicks()
            .sound(soundType)
            .noOcclusion()
            .isValidSpawn(SimpleLeaves::ocelotOrParrot)
            .isSuffocating(SimpleLeaves::never)
            .isViewBlocking(SimpleLeaves::never));
    }

    private static boolean ocelotOrParrot(BlockState p_50822_, BlockGetter p_50823_, BlockPos p_50824_, EntityType<?> p_50825_) {
        return p_50825_ == EntityType.OCELOT || p_50825_ == EntityType.PARROT;
    }

    private static boolean never(BlockState p_50806_, BlockGetter p_50807_, BlockPos p_50808_) {
        return false;
    }
}
