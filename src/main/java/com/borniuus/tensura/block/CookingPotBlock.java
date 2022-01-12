package com.borniuus.tensura.block;

import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class CookingPotBlock extends CampfireBlock {
    private static final VoxelShape SOUTH_SHAPE = Stream.of(Block.box(1, 0, 1, 15, 0.5, 31),
                    Block.box(4, 0, 23, 12, 1, 28),
                    Block.box(3, 0, 24, 4, 1, 27),
                    Block.box(12, 0, 24, 13, 1, 27))
            .reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    private static final VoxelShape NORTH_SHAPE = Stream.of(Block.box(1, 0, -15, 15, 0.5, 15),
                    Block.box(4, 0, -12, 12, 1, -7),
                    Block.box(12, 0, -11, 13, 1, -8),
                    Block.box(3, 0, -11, 4, 1, -8))
            .reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    private static final VoxelShape WEST_SHAPE = Stream.of(Block.box(-15, 0, 1, 15, 0.5, 15),
                    Block.box(-12, 0, 4, -7, 1, 12),
                    Block.box(-11, 0, 3, -8, 1, 4),
                    Block.box(-11, 0, 12, -8, 1, 13))
            .reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    private static final VoxelShape EAST_SHAPE = Stream.of(Block.box(1, 0, 1, 31, 0.5, 15),
                    Block.box(23, 0, 4, 28, 1, 12),
                    Block.box(24, 0, 12, 27, 1, 13),
                    Block.box(24, 0, 3, 27, 1, 4))
            .reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public CookingPotBlock(boolean pSpawnParticles, int pFireDamage, Properties pProperties) {
        super(pSpawnParticles, pFireDamage, pProperties);
    }
}
