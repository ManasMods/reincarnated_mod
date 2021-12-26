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

public class LowerSlopedRoofBlock extends AbstractRoofBlock {
    private static final VoxelShape SOUTH_SHAPE = Stream.of(
        Stream.of(
            Block.box(0, -1.3, 0, 16, 0.7, 0.5),
            Block.box(0, -1.2, 0.5, 16, 0.8, 1),
            Block.box(0, -1, 1, 16, 1, 1.5),
            Block.box(0, -0.8, 1.5, 16, 1.2, 2),
            Block.box(0, -0.6000000000000001, 2, 16, 1.4, 2.5),
            Block.box(0, -0.3999999999999999, 2.5, 16, 1.6, 3),
            Block.box(0, -0.19999999999999996, 3, 16, 1.8, 3.5),
            Block.box(0, 0, 3.5, 16, 2, 4),
            Block.box(0, 0.20000000000000018, 4, 16, 2.2, 4.5),
            Block.box(0, 0.3999999999999999, 4.5, 16, 2.4, 5),
            Block.box(0, 0.6000000000000001, 5, 16, 2.6, 5.5),
            Block.box(0, 0.7999999999999998, 5.5, 16, 2.8, 6)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(0, 1.4, 5.5, 16, 3.4, 6),
            Block.box(0, 1.6, 6, 16, 3.6, 6.5),
            Block.box(0, 1.7999999999999998, 6.5, 16, 3.8, 7),
            Block.box(0, 2, 7, 16, 4, 7.5),
            Block.box(0, 2.2, 7.5, 16, 4.2, 8),
            Block.box(0, 2.4000000000000004, 8, 16, 4.4, 8.5),
            Block.box(0, 2.6500000000000004, 8.5, 16, 4.65, 9),
            Block.box(0, 2.8499999999999996, 9, 16, 4.85, 9.5),
            Block.box(0, 3.05, 9.5, 16, 5.05, 10),
            Block.box(0, 3.25, 10, 16, 5.25, 10.5),
            Block.box(0, 3.45, 10.5, 16, 5.45, 11)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(0, 4, 10.5, 16, 6, 11),
            Block.box(0, 4.2, 11, 16, 6.2, 11.5),
            Block.box(0, 4.4, 11.5, 16, 6.4, 12),
            Block.box(0, 4.6, 12, 16, 6.6, 12.5),
            Block.box(0, 4.85, 12.5, 16, 6.85, 13),
            Block.box(0, 5.05, 13, 16, 7.05, 13.5),
            Block.box(0, 5.25, 13.5, 16, 7.25, 14),
            Block.box(0, 5.45, 14, 16, 7.45, 14.5),
            Block.box(0, 5.65, 14.5, 16, 7.65, 15),
            Block.box(0, 5.85, 15, 16, 7.85, 15.5),
            Block.box(0, 6.050000000000001, 15.5, 16, 8.05, 16)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(2, 0, 14, 14, 2, 16),
            Block.box(0, 0, 14, 2, 7, 16),
            Block.box(0, 0, 4, 2, 2, 14),
            Block.box(1, 5, 14, 15, 7, 16),
            Block.box(2, 0, 4, 14, 2, 6),
            Block.box(1, 0.7, 5.5, 15, 2.7, 7.5),
            Block.box(2, 3.5, 11, 14, 5.5, 13),
            Block.box(14, 0, 4, 16, 2, 14),
            Block.box(14, 0, 14, 16, 7, 16)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(1, 0.10000000000000009, 5, 3, 2.1, 5.5),
            Block.box(1, 0.2999999999999998, 5.5, 3, 2.3, 6),
            Block.box(1, 0.5, 6, 3, 2.5, 6.5),
            Block.box(1, 0.75, 6.5, 3, 2.75, 7),
            Block.box(1, 0.9500000000000002, 7, 3, 2.95, 7.5),
            Block.box(1, 1.15, 7.5, 3, 3.15, 8),
            Block.box(1, 1.35, 8, 3, 3.35, 8.5),
            Block.box(1, 1.5499999999999998, 8.5, 3, 3.55, 9),
            Block.box(1, 1.75, 9, 3, 3.75, 9.5),
            Block.box(1, 1.9500000000000002, 9.5, 3, 3.95, 10),
            Block.box(1, 2.2, 10, 3, 4.2, 10.5),
            Block.box(1, 2.4000000000000004, 10.5, 3, 4.4, 11),
            Block.box(1, 2.5999999999999996, 11, 3, 4.6, 11.5),
            Block.box(1, 2.8, 11.5, 3, 4.8, 12),
            Block.box(1, 3, 12, 3, 5, 12.5),
            Block.box(1, 3.2, 12.5, 3, 5.2, 13),
            Block.box(1, 3.45, 13, 3, 5.45, 13.5),
            Block.box(1, 3.6500000000000004, 13.5, 3, 5.65, 14),
            Block.box(1, 3.8499999999999996, 14, 3, 5.85, 14.5),
            Block.box(1, 4.05, 14.5, 3, 6.05, 15),
            Block.box(1, 4.25, 15, 3, 6.25, 15.5),
            Block.box(1, 4.45, 15.5, 3, 6.45, 16)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(13, 0.10000000000000009, 5, 15, 2.1, 5.5),
            Block.box(13, 0.2999999999999998, 5.5, 15, 2.3, 6),
            Block.box(13, 0.5, 6, 15, 2.5, 6.5),
            Block.box(13, 0.75, 6.5, 15, 2.75, 7),
            Block.box(13, 0.9500000000000002, 7, 15, 2.95, 7.5),
            Block.box(13, 1.15, 7.5, 15, 3.15, 8),
            Block.box(13, 1.35, 8, 15, 3.35, 8.5),
            Block.box(13, 1.5499999999999998, 8.5, 15, 3.55, 9),
            Block.box(13, 1.75, 9, 15, 3.75, 9.5),
            Block.box(13, 1.9500000000000002, 9.5, 15, 3.95, 10),
            Block.box(13, 2.2, 10, 15, 4.2, 10.5),
            Block.box(13, 2.4000000000000004, 10.5, 15, 4.4, 11),
            Block.box(13, 2.5999999999999996, 11, 15, 4.6, 11.5),
            Block.box(13, 2.8, 11.5, 15, 4.8, 12),
            Block.box(13, 3, 12, 15, 5, 12.5),
            Block.box(13, 3.2, 12.5, 15, 5.2, 13),
            Block.box(13, 3.45, 13, 15, 5.45, 13.5),
            Block.box(13, 3.6500000000000004, 13.5, 15, 5.65, 14),
            Block.box(13, 3.8499999999999996, 14, 15, 5.85, 14.5),
            Block.box(13, 4.05, 14.5, 15, 6.05, 15),
            Block.box(13, 4.25, 15, 15, 6.25, 15.5),
            Block.box(13, 4.45, 15.5, 15, 6.45, 16)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    private static final VoxelShape NORTH_SHAPE = Stream.of(
        Stream.of(
            Block.box(0, -1.3, 15.5, 16, 0.7, 16),
            Block.box(0, -1.2, 15, 16, 0.8, 15.5),
            Block.box(0, -1, 14.5, 16, 1, 15),
            Block.box(0, -0.8, 14, 16, 1.2, 14.5),
            Block.box(0, -0.6000000000000001, 13.5, 16, 1.4, 14),
            Block.box(0, -0.3999999999999999, 13, 16, 1.6, 13.5),
            Block.box(0, -0.19999999999999996, 12.5, 16, 1.8, 13),
            Block.box(0, 0, 12, 16, 2, 12.5),
            Block.box(0, 0.20000000000000018, 11.5, 16, 2.2, 12),
            Block.box(0, 0.3999999999999999, 11, 16, 2.4, 11.5),
            Block.box(0, 0.6000000000000001, 10.5, 16, 2.6, 11),
            Block.box(0, 0.7999999999999998, 10, 16, 2.8, 10.5)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(0, 1.4, 10, 16, 3.4, 10.5),
            Block.box(0, 1.6, 9.5, 16, 3.6, 10),
            Block.box(0, 1.7999999999999998, 9, 16, 3.8, 9.5),
            Block.box(0, 2, 8.5, 16, 4, 9),
            Block.box(0, 2.2, 8, 16, 4.2, 8.5),
            Block.box(0, 2.4000000000000004, 7.5, 16, 4.4, 8),
            Block.box(0, 2.6500000000000004, 7, 16, 4.65, 7.5),
            Block.box(0, 2.8499999999999996, 6.5, 16, 4.85, 7),
            Block.box(0, 3.05, 6, 16, 5.05, 6.5),
            Block.box(0, 3.25, 5.5, 16, 5.25, 6),
            Block.box(0, 3.45, 5, 16, 5.45, 5.5)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(0, 4, 5, 16, 6, 5.5),
            Block.box(0, 4.2, 4.5, 16, 6.2, 5),
            Block.box(0, 4.4, 4, 16, 6.4, 4.5),
            Block.box(0, 4.6, 3.5, 16, 6.6, 4),
            Block.box(0, 4.85, 3, 16, 6.85, 3.5),
            Block.box(0, 5.05, 2.5, 16, 7.05, 3),
            Block.box(0, 5.25, 2, 16, 7.25, 2.5),
            Block.box(0, 5.45, 1.5, 16, 7.45, 2),
            Block.box(0, 5.65, 1, 16, 7.65, 1.5),
            Block.box(0, 5.85, 0.5, 16, 7.85, 1),
            Block.box(0, 6.050000000000001, 0, 16, 8.05, 0.5)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(2, 0, 0, 14, 2, 2),
            Block.box(14, 0, 0, 16, 7, 2),
            Block.box(14, 0, 2, 16, 2, 12),
            Block.box(1, 5, 0, 15, 7, 2),
            Block.box(2, 0, 10, 14, 2, 12),
            Block.box(1, 0.7, 8.5, 15, 2.7, 10.5),
            Block.box(2, 3.5, 3, 14, 5.5, 5),
            Block.box(0, 0, 2, 2, 2, 12),
            Block.box(0, 0, 0, 2, 7, 2)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(13, 0.10000000000000009, 10.5, 15, 2.1, 11),
            Block.box(13, 0.2999999999999998, 10, 15, 2.3, 10.5),
            Block.box(13, 0.5, 9.5, 15, 2.5, 10),
            Block.box(13, 0.75, 9, 15, 2.75, 9.5),
            Block.box(13, 0.9500000000000002, 8.5, 15, 2.95, 9),
            Block.box(13, 1.15, 8, 15, 3.15, 8.5),
            Block.box(13, 1.35, 7.5, 15, 3.35, 8),
            Block.box(13, 1.5499999999999998, 7, 15, 3.55, 7.5),
            Block.box(13, 1.75, 6.5, 15, 3.75, 7),
            Block.box(13, 1.9500000000000002, 6, 15, 3.95, 6.5),
            Block.box(13, 2.2, 5.5, 15, 4.2, 6),
            Block.box(13, 2.4000000000000004, 5, 15, 4.4, 5.5),
            Block.box(13, 2.5999999999999996, 4.5, 15, 4.6, 5),
            Block.box(13, 2.8, 4, 15, 4.8, 4.5),
            Block.box(13, 3, 3.5, 15, 5, 4),
            Block.box(13, 3.2, 3, 15, 5.2, 3.5),
            Block.box(13, 3.45, 2.5, 15, 5.45, 3),
            Block.box(13, 3.6500000000000004, 2, 15, 5.65, 2.5),
            Block.box(13, 3.8499999999999996, 1.5, 15, 5.85, 2),
            Block.box(13, 4.05, 1, 15, 6.05, 1.5),
            Block.box(13, 4.25, 0.5, 15, 6.25, 1),
            Block.box(13, 4.45, 0, 15, 6.45, 0.5)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(1, 0.10000000000000009, 10.5, 3, 2.1, 11),
            Block.box(1, 0.2999999999999998, 10, 3, 2.3, 10.5),
            Block.box(1, 0.5, 9.5, 3, 2.5, 10),
            Block.box(1, 0.75, 9, 3, 2.75, 9.5),
            Block.box(1, 0.9500000000000002, 8.5, 3, 2.95, 9),
            Block.box(1, 1.15, 8, 3, 3.15, 8.5),
            Block.box(1, 1.35, 7.5, 3, 3.35, 8),
            Block.box(1, 1.5499999999999998, 7, 3, 3.55, 7.5),
            Block.box(1, 1.75, 6.5, 3, 3.75, 7),
            Block.box(1, 1.9500000000000002, 6, 3, 3.95, 6.5),
            Block.box(1, 2.2, 5.5, 3, 4.2, 6),
            Block.box(1, 2.4000000000000004, 5, 3, 4.4, 5.5),
            Block.box(1, 2.5999999999999996, 4.5, 3, 4.6, 5),
            Block.box(1, 2.8, 4, 3, 4.8, 4.5),
            Block.box(1, 3, 3.5, 3, 5, 4),
            Block.box(1, 3.2, 3, 3, 5.2, 3.5),
            Block.box(1, 3.45, 2.5, 3, 5.45, 3),
            Block.box(1, 3.6500000000000004, 2, 3, 5.65, 2.5),
            Block.box(1, 3.8499999999999996, 1.5, 3, 5.85, 2),
            Block.box(1, 4.05, 1, 3, 6.05, 1.5),
            Block.box(1, 4.25, 0.5, 3, 6.25, 1),
            Block.box(1, 4.45, 0, 3, 6.45, 0.5)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    private static final VoxelShape EAST_SHAPE = Stream.of(
        Stream.of(
            Block.box(0, -1.3, 0, 0.5, 0.7, 16),
            Block.box(0.5, -1.2, 0, 1, 0.8, 16),
            Block.box(1, -1, 0, 1.5, 1, 16),
            Block.box(1.5, -0.8, 0, 2, 1.2, 16),
            Block.box(2, -0.6000000000000001, 0, 2.5, 1.4, 16),
            Block.box(2.5, -0.3999999999999999, 0, 3, 1.6, 16),
            Block.box(3, -0.19999999999999996, 0, 3.5, 1.8, 16),
            Block.box(3.5, 0, 0, 4, 2, 16),
            Block.box(4, 0.20000000000000018, 0, 4.5, 2.2, 16),
            Block.box(4.5, 0.3999999999999999, 0, 5, 2.4, 16),
            Block.box(5, 0.6000000000000001, 0, 5.5, 2.6, 16),
            Block.box(5.5, 0.7999999999999998, 0, 6, 2.8, 16)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(5.5, 1.4, 0, 6, 3.4, 16),
            Block.box(6, 1.6, 0, 6.5, 3.6, 16),
            Block.box(6.5, 1.7999999999999998, 0, 7, 3.8, 16),
            Block.box(7, 2, 0, 7.5, 4, 16),
            Block.box(7.5, 2.2, 0, 8, 4.2, 16),
            Block.box(8, 2.4000000000000004, 0, 8.5, 4.4, 16),
            Block.box(8.5, 2.6500000000000004, 0, 9, 4.65, 16),
            Block.box(9, 2.8499999999999996, 0, 9.5, 4.85, 16),
            Block.box(9.5, 3.05, 0, 10, 5.05, 16),
            Block.box(10, 3.25, 0, 10.5, 5.25, 16),
            Block.box(10.5, 3.45, 0, 11, 5.45, 16)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(10.5, 4, 0, 11, 6, 16),
            Block.box(11, 4.2, 0, 11.5, 6.2, 16),
            Block.box(11.5, 4.4, 0, 12, 6.4, 16),
            Block.box(12, 4.6, 0, 12.5, 6.6, 16),
            Block.box(12.5, 4.85, 0, 13, 6.85, 16),
            Block.box(13, 5.05, 0, 13.5, 7.05, 16),
            Block.box(13.5, 5.25, 0, 14, 7.25, 16),
            Block.box(14, 5.45, 0, 14.5, 7.45, 16),
            Block.box(14.5, 5.65, 0, 15, 7.65, 16),
            Block.box(15, 5.85, 0, 15.5, 7.85, 16),
            Block.box(15.5, 6.050000000000001, 0, 16, 8.05, 16)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(14, 0, 2, 16, 2, 14),
            Block.box(14, 0, 14, 16, 7, 16),
            Block.box(4, 0, 14, 14, 2, 16),
            Block.box(14, 5, 1, 16, 7, 15),
            Block.box(4, 0, 2, 6, 2, 14),
            Block.box(5.5, 0.7, 1, 7.5, 2.7, 15),
            Block.box(11, 3.5, 2, 13, 5.5, 14),
            Block.box(4, 0, 0, 14, 2, 2),
            Block.box(14, 0, 0, 16, 7, 2)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(5, 0.10000000000000009, 13, 5.5, 2.1, 15),
            Block.box(5.5, 0.2999999999999998, 13, 6, 2.3, 15),
            Block.box(6, 0.5, 13, 6.5, 2.5, 15),
            Block.box(6.5, 0.75, 13, 7, 2.75, 15),
            Block.box(7, 0.9500000000000002, 13, 7.5, 2.95, 15),
            Block.box(7.5, 1.15, 13, 8, 3.15, 15),
            Block.box(8, 1.35, 13, 8.5, 3.35, 15),
            Block.box(8.5, 1.5499999999999998, 13, 9, 3.55, 15),
            Block.box(9, 1.75, 13, 9.5, 3.75, 15),
            Block.box(9.5, 1.9500000000000002, 13, 10, 3.95, 15),
            Block.box(10, 2.2, 13, 10.5, 4.2, 15),
            Block.box(10.5, 2.4000000000000004, 13, 11, 4.4, 15),
            Block.box(11, 2.5999999999999996, 13, 11.5, 4.6, 15),
            Block.box(11.5, 2.8, 13, 12, 4.8, 15),
            Block.box(12, 3, 13, 12.5, 5, 15),
            Block.box(12.5, 3.2, 13, 13, 5.2, 15),
            Block.box(13, 3.45, 13, 13.5, 5.45, 15),
            Block.box(13.5, 3.6500000000000004, 13, 14, 5.65, 15),
            Block.box(14, 3.8499999999999996, 13, 14.5, 5.85, 15),
            Block.box(14.5, 4.05, 13, 15, 6.05, 15),
            Block.box(15, 4.25, 13, 15.5, 6.25, 15),
            Block.box(15.5, 4.45, 13, 16, 6.45, 15)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(5, 0.10000000000000009, 1, 5.5, 2.1, 3),
            Block.box(5.5, 0.2999999999999998, 1, 6, 2.3, 3),
            Block.box(6, 0.5, 1, 6.5, 2.5, 3),
            Block.box(6.5, 0.75, 1, 7, 2.75, 3),
            Block.box(7, 0.9500000000000002, 1, 7.5, 2.95, 3),
            Block.box(7.5, 1.15, 1, 8, 3.15, 3),
            Block.box(8, 1.35, 1, 8.5, 3.35, 3),
            Block.box(8.5, 1.5499999999999998, 1, 9, 3.55, 3),
            Block.box(9, 1.75, 1, 9.5, 3.75, 3),
            Block.box(9.5, 1.9500000000000002, 1, 10, 3.95, 3),
            Block.box(10, 2.2, 1, 10.5, 4.2, 3),
            Block.box(10.5, 2.4000000000000004, 1, 11, 4.4, 3),
            Block.box(11, 2.5999999999999996, 1, 11.5, 4.6, 3),
            Block.box(11.5, 2.8, 1, 12, 4.8, 3),
            Block.box(12, 3, 1, 12.5, 5, 3),
            Block.box(12.5, 3.2, 1, 13, 5.2, 3),
            Block.box(13, 3.45, 1, 13.5, 5.45, 3),
            Block.box(13.5, 3.6500000000000004, 1, 14, 5.65, 3),
            Block.box(14, 3.8499999999999996, 1, 14.5, 5.85, 3),
            Block.box(14.5, 4.05, 1, 15, 6.05, 3),
            Block.box(15, 4.25, 1, 15.5, 6.25, 3),
            Block.box(15.5, 4.45, 1, 16, 6.45, 3)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    private static final VoxelShape WEST_SHAPE = Stream.of(
        Stream.of(
            Block.box(15.5, -1.3, 0, 16, 0.7, 16),
            Block.box(15, -1.2, 0, 15.5, 0.8, 16),
            Block.box(14.5, -1, 0, 15, 1, 16),
            Block.box(14, -0.8, 0, 14.5, 1.2, 16),
            Block.box(13.5, -0.6000000000000001, 0, 14, 1.4, 16),
            Block.box(13, -0.3999999999999999, 0, 13.5, 1.6, 16),
            Block.box(12.5, -0.19999999999999996, 0, 13, 1.8, 16),
            Block.box(12, 0, 0, 12.5, 2, 16),
            Block.box(11.5, 0.20000000000000018, 0, 12, 2.2, 16),
            Block.box(11, 0.3999999999999999, 0, 11.5, 2.4, 16),
            Block.box(10.5, 0.6000000000000001, 0, 11, 2.6, 16),
            Block.box(10, 0.7999999999999998, 0, 10.5, 2.8, 16)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(10, 1.4, 0, 10.5, 3.4, 16),
            Block.box(9.5, 1.6, 0, 10, 3.6, 16),
            Block.box(9, 1.7999999999999998, 0, 9.5, 3.8, 16),
            Block.box(8.5, 2, 0, 9, 4, 16),
            Block.box(8, 2.2, 0, 8.5, 4.2, 16),
            Block.box(7.5, 2.4000000000000004, 0, 8, 4.4, 16),
            Block.box(7, 2.6500000000000004, 0, 7.5, 4.65, 16),
            Block.box(6.5, 2.8499999999999996, 0, 7, 4.85, 16),
            Block.box(6, 3.05, 0, 6.5, 5.05, 16),
            Block.box(5.5, 3.25, 0, 6, 5.25, 16),
            Block.box(5, 3.45, 0, 5.5, 5.45, 16)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(5, 4, 0, 5.5, 6, 16),
            Block.box(4.5, 4.2, 0, 5, 6.2, 16),
            Block.box(4, 4.4, 0, 4.5, 6.4, 16),
            Block.box(3.5, 4.6, 0, 4, 6.6, 16),
            Block.box(3, 4.85, 0, 3.5, 6.85, 16),
            Block.box(2.5, 5.05, 0, 3, 7.05, 16),
            Block.box(2, 5.25, 0, 2.5, 7.25, 16),
            Block.box(1.5, 5.45, 0, 2, 7.45, 16),
            Block.box(1, 5.65, 0, 1.5, 7.65, 16),
            Block.box(0.5, 5.85, 0, 1, 7.85, 16),
            Block.box(0, 6.050000000000001, 0, 0.5, 8.05, 16)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(0, 0, 2, 2, 2, 14),
            Block.box(0, 0, 0, 2, 7, 2),
            Block.box(2, 0, 0, 12, 2, 2),
            Block.box(0, 5, 1, 2, 7, 15),
            Block.box(10, 0, 2, 12, 2, 14),
            Block.box(8.5, 0.7, 1, 10.5, 2.7, 15),
            Block.box(3, 3.5, 2, 5, 5.5, 14),
            Block.box(2, 0, 14, 12, 2, 16),
            Block.box(0, 0, 14, 2, 7, 16)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(10.5, 0.10000000000000009, 1, 11, 2.1, 3),
            Block.box(10, 0.2999999999999998, 1, 10.5, 2.3, 3),
            Block.box(9.5, 0.5, 1, 10, 2.5, 3),
            Block.box(9, 0.75, 1, 9.5, 2.75, 3),
            Block.box(8.5, 0.9500000000000002, 1, 9, 2.95, 3),
            Block.box(8, 1.15, 1, 8.5, 3.15, 3),
            Block.box(7.5, 1.35, 1, 8, 3.35, 3),
            Block.box(7, 1.5499999999999998, 1, 7.5, 3.55, 3),
            Block.box(6.5, 1.75, 1, 7, 3.75, 3),
            Block.box(6, 1.9500000000000002, 1, 6.5, 3.95, 3),
            Block.box(5.5, 2.2, 1, 6, 4.2, 3),
            Block.box(5, 2.4000000000000004, 1, 5.5, 4.4, 3),
            Block.box(4.5, 2.5999999999999996, 1, 5, 4.6, 3),
            Block.box(4, 2.8, 1, 4.5, 4.8, 3),
            Block.box(3.5, 3, 1, 4, 5, 3),
            Block.box(3, 3.2, 1, 3.5, 5.2, 3),
            Block.box(2.5, 3.45, 1, 3, 5.45, 3),
            Block.box(2, 3.6500000000000004, 1, 2.5, 5.65, 3),
            Block.box(1.5, 3.8499999999999996, 1, 2, 5.85, 3),
            Block.box(1, 4.05, 1, 1.5, 6.05, 3),
            Block.box(0.5, 4.25, 1, 1, 6.25, 3),
            Block.box(0, 4.45, 1, 0.5, 6.45, 3)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(10.5, 0.10000000000000009, 13, 11, 2.1, 15),
            Block.box(10, 0.2999999999999998, 13, 10.5, 2.3, 15),
            Block.box(9.5, 0.5, 13, 10, 2.5, 15),
            Block.box(9, 0.75, 13, 9.5, 2.75, 15),
            Block.box(8.5, 0.9500000000000002, 13, 9, 2.95, 15),
            Block.box(8, 1.15, 13, 8.5, 3.15, 15),
            Block.box(7.5, 1.35, 13, 8, 3.35, 15),
            Block.box(7, 1.5499999999999998, 13, 7.5, 3.55, 15),
            Block.box(6.5, 1.75, 13, 7, 3.75, 15),
            Block.box(6, 1.9500000000000002, 13, 6.5, 3.95, 15),
            Block.box(5.5, 2.2, 13, 6, 4.2, 15),
            Block.box(5, 2.4000000000000004, 13, 5.5, 4.4, 15),
            Block.box(4.5, 2.5999999999999996, 13, 5, 4.6, 15),
            Block.box(4, 2.8, 13, 4.5, 4.8, 15),
            Block.box(3.5, 3, 13, 4, 5, 15),
            Block.box(3, 3.2, 13, 3.5, 5.2, 15),
            Block.box(2.5, 3.45, 13, 3, 5.45, 15),
            Block.box(2, 3.6500000000000004, 13, 2.5, 5.65, 15),
            Block.box(1.5, 3.8499999999999996, 13, 2, 5.85, 15),
            Block.box(1, 4.05, 13, 1.5, 6.05, 15),
            Block.box(0.5, 4.25, 13, 1, 6.25, 15),
            Block.box(0, 4.45, 13, 0.5, 6.45, 15)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public LowerSlopedRoofBlock(Block parentBlock) {
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
        return pState.getBlock() instanceof LowerSlopedRoofBlock;
    }
}
