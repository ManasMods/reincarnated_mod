package com.borniuus.tensura.block;

import com.borniuus.tensura.Tensura;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class UpperSlopedRoofBlock extends AbstractRoofBlock {
    private static final VoxelShape SOUTH_SHAPE;
    private static final VoxelShape NORTH_SHAPE;
    private static final VoxelShape WEST_SHAPE;
    private static final VoxelShape EAST_SHAPE;

    static {
        SOUTH_SHAPE = Stream.of(
            Stream.of(
                Block.box(14, 0, 0, 16, 7, 2),
                Block.box(14, 0, 2, 16, 2, 14),
                Block.box(14, 0, 14, 16, 14, 16),
                Block.box(2, 0, 14, 14, 2, 16),
                Block.box(0, 0, 2, 2, 2, 14),
                Block.box(0, 0, 14, 2, 14, 16),
                Block.box(0.999, 11.999, 12.999, 15.001, 14.001, 15.001),
                Block.box(0.999, 5.999, 0.999, 15.001, 8.001, 3.001),
                Block.box(0, 0, 0, 2, 7, 2),
                Block.box(2, 0, 0, 14, 2, 2),
                Block.box(0.999, 8.699, 7.499, 15.001, 10.701, 9.501)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Stream.of(
                Block.box(0, 6, 0, 16, 8, 0.5),
                Block.box(0, 6.199999999999999, 0.5, 16, 8.2, 1),
                Block.box(0, 6.4, 1, 16, 8.4, 1.5),
                Block.box(0, 6.6, 1.5, 16, 8.6, 2),
                Block.box(0, 6.85, 2, 16, 8.85, 2.5),
                Block.box(0, 7.050000000000001, 2.5, 16, 9.05, 3),
                Block.box(0, 7.25, 3, 16, 9.25, 3.5),
                Block.box(0, 7.449999999999999, 3.5, 16, 9.45, 4),
                Block.box(0, 7.65, 4, 16, 9.65, 4.5),
                Block.box(0, 7.85, 4.5, 16, 9.85, 5),
                Block.box(0, 8.05, 5, 16, 10.05, 5.5)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Stream.of(
                Block.box(0, 8.8, 5.5, 16, 10.8, 6),
                Block.box(0, 9, 6, 16, 11, 6.5),
                Block.box(0, 9.25, 6.5, 16, 11.25, 7),
                Block.box(0, 9.45, 7, 16, 11.45, 7.5),
                Block.box(0, 9.65, 7.5, 16, 11.65, 8),
                Block.box(0, 9.85, 8, 16, 11.85, 8.5),
                Block.box(0, 10.05, 8.5, 16, 12.05, 9),
                Block.box(0, 10.25, 9, 16, 12.25, 9.5),
                Block.box(0, 10.5, 9.5, 16, 12.5, 10),
                Block.box(0, 10.7, 10, 16, 12.7, 10.5)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Stream.of(
                Block.box(0, 11.45, 10.5, 16, 13.45, 11),
                Block.box(0, 11.65, 11, 16, 13.65, 11.5),
                Block.box(0, 11.85, 11.5, 16, 13.85, 12),
                Block.box(0, 12.05, 12, 16, 14.05, 12.5),
                Block.box(0, 12.25, 12.5, 16, 14.25, 13),
                Block.box(0, 12.5, 13, 16, 14.5, 13.5),
                Block.box(0, 12.7, 13.5, 16, 14.7, 14),
                Block.box(0, 12.9, 14, 16, 14.9, 14.5),
                Block.box(0, 13.1, 14.5, 16, 15.1, 15),
                Block.box(0, 13.3, 15, 16, 15.3, 15.5),
                Block.box(0, 13.5, 15.5, 16, 15.5, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Stream.of(
                Block.box(1, 6, 1, 3, 8, 1.5),
                Block.box(1, 6.199999999999999, 1.5, 3, 8.2, 2),
                Block.box(1, 6.4, 2, 3, 8.4, 2.5),
                Block.box(1, 6.6, 2.5, 3, 8.6, 3),
                Block.box(1, 6.800000000000001, 3, 3, 8.8, 3.5),
                Block.box(1, 7, 3.5, 3, 9, 4),
                Block.box(1, 7.199999999999999, 4, 3, 9.2, 4.5),
                Block.box(1, 7.4, 4.5, 3, 9.4, 5),
                Block.box(1, 7.6, 5, 3, 9.6, 5.5),
                Block.box(1, 7.800000000000001, 5.5, 3, 9.8, 6),
                Block.box(1, 8, 6, 3, 10, 6.5),
                Block.box(1, 8.2, 6.5, 3, 10.2, 7),
                Block.box(1, 8.4, 7, 3, 10.4, 7.5),
                Block.box(1, 8.6, 7.5, 3, 10.6, 8),
                Block.box(1, 8.8, 8, 3, 10.8, 8.5),
                Block.box(1, 9, 8.5, 3, 11, 9),
                Block.box(1, 9.2, 9, 3, 11.2, 9.5),
                Block.box(1, 9.4, 9.5, 3, 11.4, 10),
                Block.box(1, 9.6, 10, 3, 11.6, 10.5),
                Block.box(1, 9.8, 10.5, 3, 11.8, 11),
                Block.box(1, 10, 11, 3, 12, 11.5),
                Block.box(1, 10.2, 11.5, 3, 12.2, 12),
                Block.box(1, 10.4, 12, 3, 12.4, 12.5),
                Block.box(1, 10.6, 12.5, 3, 12.6, 13),
                Block.box(1, 10.8, 13, 3, 12.8, 13.5),
                Block.box(1, 11, 13.5, 3, 13, 14)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Stream.of(
                Block.box(13, 6, 1, 15, 8, 1.5),
                Block.box(13, 6.199999999999999, 1.5, 15, 8.2, 2),
                Block.box(13, 6.4, 2, 15, 8.4, 2.5),
                Block.box(13, 6.6, 2.5, 15, 8.6, 3),
                Block.box(13, 6.800000000000001, 3, 15, 8.8, 3.5),
                Block.box(13, 7, 3.5, 15, 9, 4),
                Block.box(13, 7.199999999999999, 4, 15, 9.2, 4.5),
                Block.box(13, 7.4, 4.5, 15, 9.4, 5),
                Block.box(13, 7.6, 5, 15, 9.6, 5.5),
                Block.box(13, 7.800000000000001, 5.5, 15, 9.8, 6),
                Block.box(13, 8, 6, 15, 10, 6.5),
                Block.box(13, 8.2, 6.5, 15, 10.2, 7),
                Block.box(13, 8.4, 7, 15, 10.4, 7.5),
                Block.box(13, 8.6, 7.5, 15, 10.6, 8),
                Block.box(13, 8.8, 8, 15, 10.8, 8.5),
                Block.box(13, 9, 8.5, 15, 11, 9),
                Block.box(13, 9.2, 9, 15, 11.2, 9.5),
                Block.box(13, 9.4, 9.5, 15, 11.4, 10),
                Block.box(13, 9.6, 10, 15, 11.6, 10.5),
                Block.box(13, 9.8, 10.5, 15, 11.8, 11),
                Block.box(13, 10, 11, 15, 12, 11.5),
                Block.box(13, 10.2, 11.5, 15, 12.2, 12),
                Block.box(13, 10.4, 12, 15, 12.4, 12.5),
                Block.box(13, 10.6, 12.5, 15, 12.6, 13),
                Block.box(13, 10.8, 13, 15, 12.8, 13.5),
                Block.box(13, 11, 13.5, 15, 13, 14)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        NORTH_SHAPE = Stream.of(
            Stream.of(
                Block.box(0, 0, 14, 2, 7, 16),
                Block.box(0, 0, 2, 2, 2, 14),
                Block.box(0, 0, 0, 2, 14, 2),
                Block.box(2, 0, 0, 14, 2, 2),
                Block.box(14, 0, 2, 16, 2, 14),
                Block.box(14, 0, 0, 16, 14, 2),
                Block.box(0.9990000000000006, 11.999, 0.9990000000000006, 15.001000000000001, 14.001, 3.0009999999999994),
                Block.box(0.9990000000000006, 5.999, 12.999, 15.001000000000001, 8.001, 15.001000000000001),
                Block.box(14, 0, 14, 16, 7, 16),
                Block.box(2, 0, 14, 14, 2, 16),
                Block.box(0.9990000000000006, 8.699, 6.4990000000000006, 15.001000000000001, 10.701, 8.501000000000001)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Stream.of(
                Block.box(0, 6, 15.5, 16, 8, 16),
                Block.box(0, 6.199999999999999, 15, 16, 8.2, 15.5),
                Block.box(0, 6.4, 14.5, 16, 8.4, 15),
                Block.box(0, 6.6, 14, 16, 8.6, 14.5),
                Block.box(0, 6.85, 13.5, 16, 8.85, 14),
                Block.box(0, 7.050000000000001, 13, 16, 9.05, 13.5),
                Block.box(0, 7.25, 12.5, 16, 9.25, 13),
                Block.box(0, 7.449999999999999, 12, 16, 9.45, 12.5),
                Block.box(0, 7.65, 11.5, 16, 9.65, 12),
                Block.box(0, 7.85, 11, 16, 9.85, 11.5),
                Block.box(0, 8.05, 10.5, 16, 10.05, 11)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Stream.of(
                Block.box(0, 8.8, 10, 16, 10.8, 10.5),
                Block.box(0, 9, 9.5, 16, 11, 10),
                Block.box(0, 9.25, 9, 16, 11.25, 9.5),
                Block.box(0, 9.45, 8.5, 16, 11.45, 9),
                Block.box(0, 9.65, 8, 16, 11.65, 8.5),
                Block.box(0, 9.85, 7.5, 16, 11.85, 8),
                Block.box(0, 10.05, 7, 16, 12.05, 7.5),
                Block.box(0, 10.25, 6.5, 16, 12.25, 7),
                Block.box(0, 10.5, 6, 16, 12.5, 6.5),
                Block.box(0, 10.7, 5.5, 16, 12.7, 6)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Stream.of(
                Block.box(0, 11.45, 5, 16, 13.45, 5.5),
                Block.box(0, 11.65, 4.5, 16, 13.65, 5),
                Block.box(0, 11.85, 4, 16, 13.85, 4.5),
                Block.box(0, 12.05, 3.5, 16, 14.05, 4),
                Block.box(0, 12.25, 3, 16, 14.25, 3.5),
                Block.box(0, 12.5, 2.5, 16, 14.5, 3),
                Block.box(0, 12.7, 2, 16, 14.7, 2.5),
                Block.box(0, 12.9, 1.5, 16, 14.9, 2),
                Block.box(0, 13.1, 1, 16, 15.1, 1.5),
                Block.box(0, 13.3, 0.5, 16, 15.3, 1),
                Block.box(0, 13.5, 0, 16, 15.5, 0.5)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Stream.of(
                Block.box(13, 6, 14.5, 15, 8, 15),
                Block.box(13, 6.199999999999999, 14, 15, 8.2, 14.5),
                Block.box(13, 6.4, 13.5, 15, 8.4, 14),
                Block.box(13, 6.6, 13, 15, 8.6, 13.5),
                Block.box(13, 6.800000000000001, 12.5, 15, 8.8, 13),
                Block.box(13, 7, 12, 15, 9, 12.5),
                Block.box(13, 7.199999999999999, 11.5, 15, 9.2, 12),
                Block.box(13, 7.4, 11, 15, 9.4, 11.5),
                Block.box(13, 7.6, 10.5, 15, 9.6, 11),
                Block.box(13, 7.800000000000001, 10, 15, 9.8, 10.5),
                Block.box(13, 8, 9.5, 15, 10, 10),
                Block.box(13, 8.2, 9, 15, 10.2, 9.5),
                Block.box(13, 8.4, 8.5, 15, 10.4, 9),
                Block.box(13, 8.6, 8, 15, 10.6, 8.5),
                Block.box(13, 8.8, 7.5, 15, 10.8, 8),
                Block.box(13, 9, 7, 15, 11, 7.5),
                Block.box(13, 9.2, 6.5, 15, 11.2, 7),
                Block.box(13, 9.4, 6, 15, 11.4, 6.5),
                Block.box(13, 9.6, 5.5, 15, 11.6, 6),
                Block.box(13, 9.8, 5, 15, 11.8, 5.5),
                Block.box(13, 10, 4.5, 15, 12, 5),
                Block.box(13, 10.2, 4, 15, 12.2, 4.5),
                Block.box(13, 10.4, 3.5, 15, 12.4, 4),
                Block.box(13, 10.6, 3, 15, 12.6, 3.5),
                Block.box(13, 10.8, 2.5, 15, 12.8, 3),
                Block.box(13, 11, 2, 15, 13, 2.5)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Stream.of(
                Block.box(1, 6, 14.5, 3, 8, 15),
                Block.box(1, 6.199999999999999, 14, 3, 8.2, 14.5),
                Block.box(1, 6.4, 13.5, 3, 8.4, 14),
                Block.box(1, 6.6, 13, 3, 8.6, 13.5),
                Block.box(1, 6.800000000000001, 12.5, 3, 8.8, 13),
                Block.box(1, 7, 12, 3, 9, 12.5),
                Block.box(1, 7.199999999999999, 11.5, 3, 9.2, 12),
                Block.box(1, 7.4, 11, 3, 9.4, 11.5),
                Block.box(1, 7.6, 10.5, 3, 9.6, 11),
                Block.box(1, 7.800000000000001, 10, 3, 9.8, 10.5),
                Block.box(1, 8, 9.5, 3, 10, 10),
                Block.box(1, 8.2, 9, 3, 10.2, 9.5),
                Block.box(1, 8.4, 8.5, 3, 10.4, 9),
                Block.box(1, 8.6, 8, 3, 10.6, 8.5),
                Block.box(1, 8.8, 7.5, 3, 10.8, 8),
                Block.box(1, 9, 7, 3, 11, 7.5),
                Block.box(1, 9.2, 6.5, 3, 11.2, 7),
                Block.box(1, 9.4, 6, 3, 11.4, 6.5),
                Block.box(1, 9.6, 5.5, 3, 11.6, 6),
                Block.box(1, 9.8, 5, 3, 11.8, 5.5),
                Block.box(1, 10, 4.5, 3, 12, 5),
                Block.box(1, 10.2, 4, 3, 12.2, 4.5),
                Block.box(1, 10.4, 3.5, 3, 12.4, 4),
                Block.box(1, 10.6, 3, 3, 12.6, 3.5),
                Block.box(1, 10.8, 2.5, 3, 12.8, 3),
                Block.box(1, 11, 2, 3, 13, 2.5)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        WEST_SHAPE = Stream.of(
            Stream.of(
                Block.box(14, 0, 14, 16, 7, 16),
                Block.box(2, 0, 14, 14, 2, 16),
                Block.box(0, 0, 14, 2, 14, 16),
                Block.box(0, 0, 2, 2, 2, 14),
                Block.box(2, 0, 0, 14, 2, 2),
                Block.box(0, 0, 0, 2, 14, 2),
                Block.box(0.9990000000000006, 11.999, 0.9989999999999988, 3.0009999999999994, 14.001, 15.001),
                Block.box(12.999, 5.999, 0.9989999999999988, 15.001000000000001, 8.001, 15.001),
                Block.box(14, 0, 0, 16, 7, 2),
                Block.box(14, 0, 2, 16, 2, 14),
                Block.box(6.4990000000000006, 8.699, 0.9989999999999988, 8.501000000000001, 10.701, 15.001)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Stream.of(
                Block.box(15.5, 6, 0, 16, 8, 16),
                Block.box(15, 6.199999999999999, 0, 15.5, 8.2, 16),
                Block.box(14.5, 6.4, 0, 15, 8.4, 16),
                Block.box(14, 6.6, 0, 14.5, 8.6, 16),
                Block.box(13.5, 6.85, 0, 14, 8.85, 16),
                Block.box(13, 7.050000000000001, 0, 13.5, 9.05, 16),
                Block.box(12.5, 7.25, 0, 13, 9.25, 16),
                Block.box(12, 7.449999999999999, 0, 12.5, 9.45, 16),
                Block.box(11.5, 7.65, 0, 12, 9.65, 16),
                Block.box(11, 7.85, 0, 11.5, 9.85, 16),
                Block.box(10.5, 8.05, 0, 11, 10.05, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Stream.of(
                Block.box(10, 8.8, 0, 10.5, 10.8, 16),
                Block.box(9.5, 9, 0, 10, 11, 16),
                Block.box(9, 9.25, 0, 9.5, 11.25, 16),
                Block.box(8.5, 9.45, 0, 9, 11.45, 16),
                Block.box(8, 9.65, 0, 8.5, 11.65, 16),
                Block.box(7.5, 9.85, 0, 8, 11.85, 16),
                Block.box(7, 10.05, 0, 7.5, 12.05, 16),
                Block.box(6.5, 10.25, 0, 7, 12.25, 16),
                Block.box(6, 10.5, 0, 6.5, 12.5, 16),
                Block.box(5.5, 10.7, 0, 6, 12.7, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Stream.of(
                Block.box(5, 11.45, 0, 5.5, 13.45, 16),
                Block.box(4.5, 11.65, 0, 5, 13.65, 16),
                Block.box(4, 11.85, 0, 4.5, 13.85, 16),
                Block.box(3.5, 12.05, 0, 4, 14.05, 16),
                Block.box(3, 12.25, 0, 3.5, 14.25, 16),
                Block.box(2.5, 12.5, 0, 3, 14.5, 16),
                Block.box(2, 12.7, 0, 2.5, 14.7, 16),
                Block.box(1.5, 12.9, 0, 2, 14.9, 16),
                Block.box(1, 13.1, 0, 1.5, 15.1, 16),
                Block.box(0.5, 13.3, 0, 1, 15.3, 16),
                Block.box(0, 13.5, 0, 0.5, 15.5, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Stream.of(
                Block.box(14.5, 6, 1, 15, 8, 3),
                Block.box(14, 6.199999999999999, 1, 14.5, 8.2, 3),
                Block.box(13.5, 6.4, 1, 14, 8.4, 3),
                Block.box(13, 6.6, 1, 13.5, 8.6, 3),
                Block.box(12.5, 6.800000000000001, 1, 13, 8.8, 3),
                Block.box(12, 7, 1, 12.5, 9, 3),
                Block.box(11.5, 7.199999999999999, 1, 12, 9.2, 3),
                Block.box(11, 7.4, 1, 11.5, 9.4, 3),
                Block.box(10.5, 7.6, 1, 11, 9.6, 3),
                Block.box(10, 7.800000000000001, 1, 10.5, 9.8, 3),
                Block.box(9.5, 8, 1, 10, 10, 3),
                Block.box(9, 8.2, 1, 9.5, 10.2, 3),
                Block.box(8.5, 8.4, 1, 9, 10.4, 3),
                Block.box(8, 8.6, 1, 8.5, 10.6, 3),
                Block.box(7.5, 8.8, 1, 8, 10.8, 3),
                Block.box(7, 9, 1, 7.5, 11, 3),
                Block.box(6.5, 9.2, 1, 7, 11.2, 3),
                Block.box(6, 9.4, 1, 6.5, 11.4, 3),
                Block.box(5.5, 9.6, 1, 6, 11.6, 3),
                Block.box(5, 9.8, 1, 5.5, 11.8, 3),
                Block.box(4.5, 10, 1, 5, 12, 3),
                Block.box(4, 10.2, 1, 4.5, 12.2, 3),
                Block.box(3.5, 10.4, 1, 4, 12.4, 3),
                Block.box(3, 10.6, 1, 3.5, 12.6, 3),
                Block.box(2.5, 10.8, 1, 3, 12.8, 3),
                Block.box(2, 11, 1, 2.5, 13, 3)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Stream.of(
                Block.box(14.5, 6, 13, 15, 8, 15),
                Block.box(14, 6.199999999999999, 13, 14.5, 8.2, 15),
                Block.box(13.5, 6.4, 13, 14, 8.4, 15),
                Block.box(13, 6.6, 13, 13.5, 8.6, 15),
                Block.box(12.5, 6.800000000000001, 13, 13, 8.8, 15),
                Block.box(12, 7, 13, 12.5, 9, 15),
                Block.box(11.5, 7.199999999999999, 13, 12, 9.2, 15),
                Block.box(11, 7.4, 13, 11.5, 9.4, 15),
                Block.box(10.5, 7.6, 13, 11, 9.6, 15),
                Block.box(10, 7.800000000000001, 13, 10.5, 9.8, 15),
                Block.box(9.5, 8, 13, 10, 10, 15),
                Block.box(9, 8.2, 13, 9.5, 10.2, 15),
                Block.box(8.5, 8.4, 13, 9, 10.4, 15),
                Block.box(8, 8.6, 13, 8.5, 10.6, 15),
                Block.box(7.5, 8.8, 13, 8, 10.8, 15),
                Block.box(7, 9, 13, 7.5, 11, 15),
                Block.box(6.5, 9.2, 13, 7, 11.2, 15),
                Block.box(6, 9.4, 13, 6.5, 11.4, 15),
                Block.box(5.5, 9.6, 13, 6, 11.6, 15),
                Block.box(5, 9.8, 13, 5.5, 11.8, 15),
                Block.box(4.5, 10, 13, 5, 12, 15),
                Block.box(4, 10.2, 13, 4.5, 12.2, 15),
                Block.box(3.5, 10.4, 13, 4, 12.4, 15),
                Block.box(3, 10.6, 13, 3.5, 12.6, 15),
                Block.box(2.5, 10.8, 13, 3, 12.8, 15),
                Block.box(2, 11, 13, 2.5, 13, 15)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        EAST_SHAPE = Stream.of(
            Stream.of(
                Block.box(0, 0, 0, 2, 7, 2),
                Block.box(2, 0, 0, 14, 2, 2),
                Block.box(14, 0, 0, 16, 14, 2),
                Block.box(14, 0, 2, 16, 2, 14),
                Block.box(2, 0, 14, 14, 2, 16),
                Block.box(14, 0, 14, 16, 14, 16),
                Block.box(12.999, 11.999, 0.9990000000000006, 15.001, 14.001, 15.001000000000001),
                Block.box(0.9989999999999988, 5.999, 0.9990000000000006, 3.0009999999999994, 8.001, 15.001000000000001),
                Block.box(0, 0, 14, 2, 7, 16),
                Block.box(0, 0, 2, 2, 2, 14),
                Block.box(7.498999999999999, 8.699, 0.9990000000000006, 9.501, 10.701, 15.001000000000001)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Stream.of(
                Block.box(0, 6, 0, 0.5, 8, 16),
                Block.box(0.5, 6.199999999999999, 0, 1, 8.2, 16),
                Block.box(1, 6.4, 0, 1.5, 8.4, 16),
                Block.box(1.5, 6.6, 0, 2, 8.6, 16),
                Block.box(2, 6.85, 0, 2.5, 8.85, 16),
                Block.box(2.5, 7.050000000000001, 0, 3, 9.05, 16),
                Block.box(3, 7.25, 0, 3.5, 9.25, 16),
                Block.box(3.5, 7.449999999999999, 0, 4, 9.45, 16),
                Block.box(4, 7.65, 0, 4.5, 9.65, 16),
                Block.box(4.5, 7.85, 0, 5, 9.85, 16),
                Block.box(5, 8.05, 0, 5.5, 10.05, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Stream.of(
                Block.box(5.5, 8.8, 0, 6, 10.8, 16),
                Block.box(6, 9, 0, 6.5, 11, 16),
                Block.box(6.5, 9.25, 0, 7, 11.25, 16),
                Block.box(7, 9.45, 0, 7.5, 11.45, 16),
                Block.box(7.5, 9.65, 0, 8, 11.65, 16),
                Block.box(8, 9.85, 0, 8.5, 11.85, 16),
                Block.box(8.5, 10.05, 0, 9, 12.05, 16),
                Block.box(9, 10.25, 0, 9.5, 12.25, 16),
                Block.box(9.5, 10.5, 0, 10, 12.5, 16),
                Block.box(10, 10.7, 0, 10.5, 12.7, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Stream.of(
                Block.box(10.5, 11.45, 0, 11, 13.45, 16),
                Block.box(11, 11.65, 0, 11.5, 13.65, 16),
                Block.box(11.5, 11.85, 0, 12, 13.85, 16),
                Block.box(12, 12.05, 0, 12.5, 14.05, 16),
                Block.box(12.5, 12.25, 0, 13, 14.25, 16),
                Block.box(13, 12.5, 0, 13.5, 14.5, 16),
                Block.box(13.5, 12.7, 0, 14, 14.7, 16),
                Block.box(14, 12.9, 0, 14.5, 14.9, 16),
                Block.box(14.5, 13.1, 0, 15, 15.1, 16),
                Block.box(15, 13.3, 0, 15.5, 15.3, 16),
                Block.box(15.5, 13.5, 0, 16, 15.5, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Stream.of(
                Block.box(1, 6, 13, 1.5, 8, 15),
                Block.box(1.5, 6.199999999999999, 13, 2, 8.2, 15),
                Block.box(2, 6.4, 13, 2.5, 8.4, 15),
                Block.box(2.5, 6.6, 13, 3, 8.6, 15),
                Block.box(3, 6.800000000000001, 13, 3.5, 8.8, 15),
                Block.box(3.5, 7, 13, 4, 9, 15),
                Block.box(4, 7.199999999999999, 13, 4.5, 9.2, 15),
                Block.box(4.5, 7.4, 13, 5, 9.4, 15),
                Block.box(5, 7.6, 13, 5.5, 9.6, 15),
                Block.box(5.5, 7.800000000000001, 13, 6, 9.8, 15),
                Block.box(6, 8, 13, 6.5, 10, 15),
                Block.box(6.5, 8.2, 13, 7, 10.2, 15),
                Block.box(7, 8.4, 13, 7.5, 10.4, 15),
                Block.box(7.5, 8.6, 13, 8, 10.6, 15),
                Block.box(8, 8.8, 13, 8.5, 10.8, 15),
                Block.box(8.5, 9, 13, 9, 11, 15),
                Block.box(9, 9.2, 13, 9.5, 11.2, 15),
                Block.box(9.5, 9.4, 13, 10, 11.4, 15),
                Block.box(10, 9.6, 13, 10.5, 11.6, 15),
                Block.box(10.5, 9.8, 13, 11, 11.8, 15),
                Block.box(11, 10, 13, 11.5, 12, 15),
                Block.box(11.5, 10.2, 13, 12, 12.2, 15),
                Block.box(12, 10.4, 13, 12.5, 12.4, 15),
                Block.box(12.5, 10.6, 13, 13, 12.6, 15),
                Block.box(13, 10.8, 13, 13.5, 12.8, 15),
                Block.box(13.5, 11, 13, 14, 13, 15)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Stream.of(
                Block.box(1, 6, 1, 1.5, 8, 3),
                Block.box(1.5, 6.199999999999999, 1, 2, 8.2, 3),
                Block.box(2, 6.4, 1, 2.5, 8.4, 3),
                Block.box(2.5, 6.6, 1, 3, 8.6, 3),
                Block.box(3, 6.800000000000001, 1, 3.5, 8.8, 3),
                Block.box(3.5, 7, 1, 4, 9, 3),
                Block.box(4, 7.199999999999999, 1, 4.5, 9.2, 3),
                Block.box(4.5, 7.4, 1, 5, 9.4, 3),
                Block.box(5, 7.6, 1, 5.5, 9.6, 3),
                Block.box(5.5, 7.800000000000001, 1, 6, 9.8, 3),
                Block.box(6, 8, 1, 6.5, 10, 3),
                Block.box(6.5, 8.2, 1, 7, 10.2, 3),
                Block.box(7, 8.4, 1, 7.5, 10.4, 3),
                Block.box(7.5, 8.6, 1, 8, 10.6, 3),
                Block.box(8, 8.8, 1, 8.5, 10.8, 3),
                Block.box(8.5, 9, 1, 9, 11, 3),
                Block.box(9, 9.2, 1, 9.5, 11.2, 3),
                Block.box(9.5, 9.4, 1, 10, 11.4, 3),
                Block.box(10, 9.6, 1, 10.5, 11.6, 3),
                Block.box(10.5, 9.8, 1, 11, 11.8, 3),
                Block.box(11, 10, 1, 11.5, 12, 3),
                Block.box(11.5, 10.2, 1, 12, 12.2, 3),
                Block.box(12, 10.4, 1, 12.5, 12.4, 3),
                Block.box(12.5, 10.6, 1, 13, 12.6, 3),
                Block.box(13, 10.8, 1, 13.5, 12.8, 3),
                Block.box(13.5, 11, 1, 14, 13, 3)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    }

    public UpperSlopedRoofBlock(Block parentBlock) {
        super(parentBlock);
    }

    @Override
    protected VoxelShape getShape(Direction direction, BlockPos pos, BlockState state) {
        VoxelShape shape;

        switch (direction) {
            case NORTH -> shape = NORTH_SHAPE;
            case SOUTH -> shape = SOUTH_SHAPE;
            case EAST -> shape = EAST_SHAPE;
            case WEST -> shape = WEST_SHAPE;
            default -> {
                Tensura.getLogger().error("Could not load Direction of LowerRoofBlock at position {}. Using Fallback shape.", pos);
                shape = SOUTH_SHAPE;
            }
        }

        return shape;
    }

    @Override
    public boolean isRoofBlock(BlockState pState) {
        return pState.getBlock() instanceof UpperSlopedRoofBlock;
    }
}
