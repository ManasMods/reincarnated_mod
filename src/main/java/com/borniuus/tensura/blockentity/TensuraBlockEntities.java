package com.borniuus.tensura.blockentity;

import com.borniuus.tensura.Tensura;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Tensura.MOD_ID)
public class TensuraBlockEntities {
    @ObjectHolder("primitive_bed")
    public static final BlockEntityType<PrimitiveBedBlockEntity> PRIMITIVE_BED_BLOCK_ENTITY = null;
}
