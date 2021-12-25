package com.borniuus.tensura.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class PrimitiveBedBlockEntity extends BlockEntity {
    public PrimitiveBedBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(TensuraBlockEntities.PRIMITIVE_BED_BLOCK_ENTITY, pWorldPosition, pBlockState);
    }
}
