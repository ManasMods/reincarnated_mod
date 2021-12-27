package com.borniuus.tensura.block;

import com.borniuus.tensura.Tensura;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class UpperSteepRoofBlock extends AbstractRoofBlock {
    private static final VoxelShape SOUTH_SHAPE;
    private static final VoxelShape NORTH_SHAPE;
    private static final VoxelShape EAST_SHAPE;
    private static final VoxelShape WEST_SHAPE;

    public static final VoxelShape INNER_WEST_SHAPE;
    public static final VoxelShape INNER_EAST_SHAPE;
    private static final VoxelShape INNER_NORTH_SHAPE;
    private static final VoxelShape INNER_SOUTH_SHAPE;

    private static final VoxelShape OUTER_SOUTH_SHAPE;
    private static final VoxelShape OUTER_NORTH_SHAPE;
    private static final VoxelShape OUTER_WEST_SHAPE;
    private static final VoxelShape OUTER_EAST_SHAPE;

    static {
        {
            SOUTH_SHAPE = Stream.of(
                Stream.of(
                    Block.box(2, 0, 14, 14, 2, 16),
                    Block.box(0, 0, 14, 2, 16, 16),
                    Block.box(2, 14, 14, 14, 16, 16),
                    Block.box(14, 0, 14, 16, 16, 16),
                    Block.box(14, 0, 8, 16, 2, 14),
                    Block.box(0, 0, 8, 2, 2, 14)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(0, 0, 6.300000000000001, 16, 1, 8.3),
                    Block.box(0, 1, 6.6, 16, 2, 8.6),
                    Block.box(0, 2, 7, 16, 3, 9),
                    Block.box(0, 3, 7.5, 16, 4, 9.5),
                    Block.box(0, 4, 7.9, 16, 5, 9.9),
                    Block.box(0, 5, 8.2, 16, 6.2, 10.2)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(0, 6, 9.2, 16, 7, 11.2),
                    Block.box(0, 7, 9.6, 16, 8, 11.6),
                    Block.box(0, 8, 10, 16, 9, 12),
                    Block.box(0, 9, 10.4, 16, 10, 12.4),
                    Block.box(0, 10, 10.8, 16, 11, 12.8),
                    Block.box(0, 11, 11.2, 16, 12, 13.2),
                    Block.box(0, 12, 11.7, 16, 13, 13.7),
                    Block.box(0, 13, 12.1, 16, 14, 14.1),
                    Block.box(0, 14, 12.5, 16, 15, 14.5),
                    Block.box(0, 15, 12.9, 16, 16, 14.9),
                    Block.box(0, 16, 13.4, 16, 17, 15.4),
                    Block.box(0, 17, 13.8, 16, 18, 15.8)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(3, 1, 8.8, 5, 2, 10.8),
                    Block.box(3, 2, 9.2, 5, 3, 11.2),
                    Block.box(3, 3, 9.6, 5, 4, 11.6),
                    Block.box(3, 4, 10, 5, 5, 12),
                    Block.box(3, 5, 10.4, 5, 6, 12.4),
                    Block.box(3, 6, 10.8, 5, 7, 12.8),
                    Block.box(3, 7, 11.2, 5, 8, 13.2),
                    Block.box(3, 8, 11.7, 5, 9, 13.7),
                    Block.box(3, 9, 12.1, 5, 10, 14.1),
                    Block.box(3, 10, 12.5, 5, 11, 14.5),
                    Block.box(3, 11, 12.9, 5, 12, 14.9),
                    Block.box(3, 12, 13.3, 5, 13, 15.3),
                    Block.box(3, 13, 13.8, 5, 14, 15.8),
                    Block.box(3, 14, 14.2, 5, 15, 16.2),
                    Block.box(3, 15, 14.5, 5, 15.8, 16.5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(11, 1, 8.8, 13, 2, 10.8),
                    Block.box(11, 2, 9.2, 13, 3, 11.2),
                    Block.box(11, 3, 9.6, 13, 4, 11.6),
                    Block.box(11, 4, 10, 13, 5, 12),
                    Block.box(11, 5, 10.4, 13, 6, 12.4),
                    Block.box(11, 6, 10.8, 13, 7, 12.8),
                    Block.box(11, 7, 11.2, 13, 8, 13.2),
                    Block.box(11, 8, 11.7, 13, 9, 13.7),
                    Block.box(11, 9, 12.1, 13, 10, 14.1),
                    Block.box(11, 10, 12.5, 13, 11, 14.5),
                    Block.box(11, 11, 12.9, 13, 12, 14.9),
                    Block.box(11, 12, 13.3, 13, 13, 15.3),
                    Block.box(11, 13, 13.8, 13, 14, 15.8),
                    Block.box(11, 14, 14.2, 13, 15, 16.2),
                    Block.box(11, 15, 14.5, 13, 15.8, 16.5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
            EAST_SHAPE = Stream.of(
                Stream.of(
                    Block.box(14, 0, 2, 16, 2, 14),
                    Block.box(14, 0, 14, 16, 16, 16),
                    Block.box(14, 14, 2, 16, 16, 14),
                    Block.box(14, 0, 0, 16, 16, 2),
                    Block.box(8, 0, 0, 14, 2, 2),
                    Block.box(8, 0, 14, 14, 2, 16)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(6.300000000000001, 0, 0, 8.3, 1, 16),
                    Block.box(6.6, 1, 0, 8.6, 2, 16),
                    Block.box(7, 2, 0, 9, 3, 16),
                    Block.box(7.5, 3, 0, 9.5, 4, 16),
                    Block.box(7.9, 4, 0, 9.9, 5, 16),
                    Block.box(8.2, 5, 0, 10.2, 6.2, 16)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(9.2, 6, 0, 11.2, 7, 16),
                    Block.box(9.6, 7, 0, 11.6, 8, 16),
                    Block.box(10, 8, 0, 12, 9, 16),
                    Block.box(10.4, 9, 0, 12.4, 10, 16),
                    Block.box(10.8, 10, 0, 12.8, 11, 16),
                    Block.box(11.2, 11, 0, 13.2, 12, 16),
                    Block.box(11.7, 12, 0, 13.7, 13, 16),
                    Block.box(12.1, 13, 0, 14.1, 14, 16),
                    Block.box(12.5, 14, 0, 14.5, 15, 16),
                    Block.box(12.9, 15, 0, 14.9, 16, 16),
                    Block.box(13.4, 16, 0, 15.4, 17, 16),
                    Block.box(13.8, 17, 0, 15.8, 18, 16)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(8.8, 1, 11, 10.8, 2, 13),
                    Block.box(9.2, 2, 11, 11.2, 3, 13),
                    Block.box(9.6, 3, 11, 11.6, 4, 13),
                    Block.box(10, 4, 11, 12, 5, 13),
                    Block.box(10.4, 5, 11, 12.4, 6, 13),
                    Block.box(10.8, 6, 11, 12.8, 7, 13),
                    Block.box(11.2, 7, 11, 13.2, 8, 13),
                    Block.box(11.7, 8, 11, 13.7, 9, 13),
                    Block.box(12.1, 9, 11, 14.1, 10, 13),
                    Block.box(12.5, 10, 11, 14.5, 11, 13),
                    Block.box(12.9, 11, 11, 14.9, 12, 13),
                    Block.box(13.3, 12, 11, 15.3, 13, 13),
                    Block.box(13.8, 13, 11, 15.8, 14, 13),
                    Block.box(14.2, 14, 11, 16.2, 15, 13),
                    Block.box(14.5, 15, 11, 16.5, 15.8, 13)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(8.8, 1, 3, 10.8, 2, 5),
                    Block.box(9.2, 2, 3, 11.2, 3, 5),
                    Block.box(9.6, 3, 3, 11.6, 4, 5),
                    Block.box(10, 4, 3, 12, 5, 5),
                    Block.box(10.4, 5, 3, 12.4, 6, 5),
                    Block.box(10.8, 6, 3, 12.8, 7, 5),
                    Block.box(11.2, 7, 3, 13.2, 8, 5),
                    Block.box(11.7, 8, 3, 13.7, 9, 5),
                    Block.box(12.1, 9, 3, 14.1, 10, 5),
                    Block.box(12.5, 10, 3, 14.5, 11, 5),
                    Block.box(12.9, 11, 3, 14.9, 12, 5),
                    Block.box(13.3, 12, 3, 15.3, 13, 5),
                    Block.box(13.8, 13, 3, 15.8, 14, 5),
                    Block.box(14.2, 14, 3, 16.2, 15, 5),
                    Block.box(14.5, 15, 3, 16.5, 15.8, 5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
            NORTH_SHAPE = Stream.of(
                Stream.of(
                    Block.box(2, 0, 0, 14, 2, 2),
                    Block.box(14, 0, 0, 16, 16, 2),
                    Block.box(2, 14, 0, 14, 16, 2),
                    Block.box(0, 0, 0, 2, 16, 2),
                    Block.box(0, 0, 2, 2, 2, 8),
                    Block.box(14, 0, 2, 16, 2, 8)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(0, 0, 7.699999999999999, 16, 1, 9.7),
                    Block.box(0, 1, 7.4, 16, 2, 9.4),
                    Block.box(0, 2, 7, 16, 3, 9),
                    Block.box(0, 3, 6.5, 16, 4, 8.5),
                    Block.box(0, 4, 6.1, 16, 5, 8.1),
                    Block.box(0, 5, 5.800000000000001, 16, 6.2, 7.800000000000001)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(0, 6, 4.800000000000001, 16, 7, 6.800000000000001),
                    Block.box(0, 7, 4.4, 16, 8, 6.4),
                    Block.box(0, 8, 4, 16, 9, 6),
                    Block.box(0, 9, 3.5999999999999996, 16, 10, 5.6),
                    Block.box(0, 10, 3.1999999999999993, 16, 11, 5.199999999999999),
                    Block.box(0, 11, 2.8000000000000007, 16, 12, 4.800000000000001),
                    Block.box(0, 12, 2.3000000000000007, 16, 13, 4.300000000000001),
                    Block.box(0, 13, 1.9000000000000004, 16, 14, 3.9000000000000004),
                    Block.box(0, 14, 1.5, 16, 15, 3.5),
                    Block.box(0, 15, 1.0999999999999996, 16, 16, 3.0999999999999996),
                    Block.box(0, 16, 0.5999999999999996, 16, 17, 2.5999999999999996),
                    Block.box(0, 17, 0.1999999999999993, 16, 18, 2.1999999999999993)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(11, 1, 5.199999999999999, 13, 2, 7.199999999999999),
                    Block.box(11, 2, 4.800000000000001, 13, 3, 6.800000000000001),
                    Block.box(11, 3, 4.4, 13, 4, 6.4),
                    Block.box(11, 4, 4, 13, 5, 6),
                    Block.box(11, 5, 3.5999999999999996, 13, 6, 5.6),
                    Block.box(11, 6, 3.1999999999999993, 13, 7, 5.199999999999999),
                    Block.box(11, 7, 2.8000000000000007, 13, 8, 4.800000000000001),
                    Block.box(11, 8, 2.3000000000000007, 13, 9, 4.300000000000001),
                    Block.box(11, 9, 1.9000000000000004, 13, 10, 3.9000000000000004),
                    Block.box(11, 10, 1.5, 13, 11, 3.5),
                    Block.box(11, 11, 1.0999999999999996, 13, 12, 3.0999999999999996),
                    Block.box(11, 12, 0.6999999999999993, 13, 13, 2.6999999999999993),
                    Block.box(11, 13, 0.1999999999999993, 13, 14, 2.1999999999999993),
                    Block.box(11, 14, -0.1999999999999993, 13, 15, 1.8000000000000007),
                    Block.box(11, 15, -0.5, 13, 15.8, 1.5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(3, 1, 5.199999999999999, 5, 2, 7.199999999999999),
                    Block.box(3, 2, 4.800000000000001, 5, 3, 6.800000000000001),
                    Block.box(3, 3, 4.4, 5, 4, 6.4),
                    Block.box(3, 4, 4, 5, 5, 6),
                    Block.box(3, 5, 3.5999999999999996, 5, 6, 5.6),
                    Block.box(3, 6, 3.1999999999999993, 5, 7, 5.199999999999999),
                    Block.box(3, 7, 2.8000000000000007, 5, 8, 4.800000000000001),
                    Block.box(3, 8, 2.3000000000000007, 5, 9, 4.300000000000001),
                    Block.box(3, 9, 1.9000000000000004, 5, 10, 3.9000000000000004),
                    Block.box(3, 10, 1.5, 5, 11, 3.5),
                    Block.box(3, 11, 1.0999999999999996, 5, 12, 3.0999999999999996),
                    Block.box(3, 12, 0.6999999999999993, 5, 13, 2.6999999999999993),
                    Block.box(3, 13, 0.1999999999999993, 5, 14, 2.1999999999999993),
                    Block.box(3, 14, -0.1999999999999993, 5, 15, 1.8000000000000007),
                    Block.box(3, 15, -0.5, 5, 15.8, 1.5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
            WEST_SHAPE = Stream.of(
                Stream.of(
                    Block.box(0, 0, 2, 2, 2, 14),
                    Block.box(0, 0, 0, 2, 16, 2),
                    Block.box(0, 14, 2, 2, 16, 14),
                    Block.box(0, 0, 14, 2, 16, 16),
                    Block.box(2, 0, 14, 8, 2, 16),
                    Block.box(2, 0, 0, 8, 2, 2)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(7.699999999999999, 0, 0, 9.7, 1, 16),
                    Block.box(7.4, 1, 0, 9.4, 2, 16),
                    Block.box(7, 2, 0, 9, 3, 16),
                    Block.box(6.5, 3, 0, 8.5, 4, 16),
                    Block.box(6.1, 4, 0, 8.1, 5, 16),
                    Block.box(5.800000000000001, 5, 0, 7.800000000000001, 6.2, 16)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(4.800000000000001, 6, 0, 6.800000000000001, 7, 16),
                    Block.box(4.4, 7, 0, 6.4, 8, 16),
                    Block.box(4, 8, 0, 6, 9, 16),
                    Block.box(3.5999999999999996, 9, 0, 5.6, 10, 16),
                    Block.box(3.1999999999999993, 10, 0, 5.199999999999999, 11, 16),
                    Block.box(2.8000000000000007, 11, 0, 4.800000000000001, 12, 16),
                    Block.box(2.3000000000000007, 12, 0, 4.300000000000001, 13, 16),
                    Block.box(1.9000000000000004, 13, 0, 3.9000000000000004, 14, 16),
                    Block.box(1.5, 14, 0, 3.5, 15, 16),
                    Block.box(1.0999999999999996, 15, 0, 3.0999999999999996, 16, 16),
                    Block.box(0.5999999999999996, 16, 0, 2.5999999999999996, 17, 16),
                    Block.box(0.1999999999999993, 17, 0, 2.1999999999999993, 18, 16)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(5.199999999999999, 1, 3, 7.199999999999999, 2, 5),
                    Block.box(4.800000000000001, 2, 3, 6.800000000000001, 3, 5),
                    Block.box(4.4, 3, 3, 6.4, 4, 5),
                    Block.box(4, 4, 3, 6, 5, 5),
                    Block.box(3.5999999999999996, 5, 3, 5.6, 6, 5),
                    Block.box(3.1999999999999993, 6, 3, 5.199999999999999, 7, 5),
                    Block.box(2.8000000000000007, 7, 3, 4.800000000000001, 8, 5),
                    Block.box(2.3000000000000007, 8, 3, 4.300000000000001, 9, 5),
                    Block.box(1.9000000000000004, 9, 3, 3.9000000000000004, 10, 5),
                    Block.box(1.5, 10, 3, 3.5, 11, 5),
                    Block.box(1.0999999999999996, 11, 3, 3.0999999999999996, 12, 5),
                    Block.box(0.6999999999999993, 12, 3, 2.6999999999999993, 13, 5),
                    Block.box(0.1999999999999993, 13, 3, 2.1999999999999993, 14, 5),
                    Block.box(-0.1999999999999993, 14, 3, 1.8000000000000007, 15, 5),
                    Block.box(-0.5, 15, 3, 1.5, 15.8, 5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(5.199999999999999, 1, 11, 7.199999999999999, 2, 13),
                    Block.box(4.800000000000001, 2, 11, 6.800000000000001, 3, 13),
                    Block.box(4.4, 3, 11, 6.4, 4, 13),
                    Block.box(4, 4, 11, 6, 5, 13),
                    Block.box(3.5999999999999996, 5, 11, 5.6, 6, 13),
                    Block.box(3.1999999999999993, 6, 11, 5.199999999999999, 7, 13),
                    Block.box(2.8000000000000007, 7, 11, 4.800000000000001, 8, 13),
                    Block.box(2.3000000000000007, 8, 11, 4.300000000000001, 9, 13),
                    Block.box(1.9000000000000004, 9, 11, 3.9000000000000004, 10, 13),
                    Block.box(1.5, 10, 11, 3.5, 11, 13),
                    Block.box(1.0999999999999996, 11, 11, 3.0999999999999996, 12, 13),
                    Block.box(0.6999999999999993, 12, 11, 2.6999999999999993, 13, 13),
                    Block.box(0.1999999999999993, 13, 11, 2.1999999999999993, 14, 13),
                    Block.box(-0.1999999999999993, 14, 11, 1.8000000000000007, 15, 13),
                    Block.box(-0.5, 15, 11, 1.5, 15.8, 13)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        }
        {
            INNER_WEST_SHAPE = Stream.of(
                Stream.of(
                    Block.box(0, 0, 14, 2, 16, 16),
                    Block.box(0, 0, 8, 2, 2, 14),
                    Block.box(2, 0, 14, 8, 2, 16)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(0, 0, 7.300000000000001, 9, 1, 9.3),
                    Block.box(0, 1, 7.6, 9, 2, 9.6),
                    Block.box(0, 2, 8, 9, 3, 10),
                    Block.box(0, 3, 8.5, 9, 4, 10.5),
                    Block.box(0, 4, 8.9, 9, 5, 10.9),
                    Block.box(0, 5, 9.2, 9, 5.8, 11.2)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(6.9, 0, 7, 8.9, 1, 16),
                    Block.box(6.6, 1, 7, 8.6, 2, 16),
                    Block.box(6.199999999999999, 2, 7, 8.2, 3, 16),
                    Block.box(5.7, 3, 7, 7.7, 4, 16),
                    Block.box(5.3, 4, 7, 7.3, 5, 16),
                    Block.box(4.9, 5, 7, 6.9, 5.8, 16)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(0, 5, 10, 7, 6, 12),
                    Block.box(0, 6, 10.3, 7, 7, 12.3),
                    Block.box(0, 7, 10.7, 7, 8, 12.7),
                    Block.box(0, 8, 11.1, 7, 9, 13.1),
                    Block.box(0, 9, 11.5, 7, 10, 13.5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(4.2, 5, 9, 6.2, 6, 16),
                    Block.box(4, 6, 9, 6, 7, 16),
                    Block.box(3.5, 7, 9, 5.5, 8, 16),
                    Block.box(3.0999999999999996, 8, 9, 5.1, 9, 16),
                    Block.box(2.7, 9, 9, 4.7, 10.2, 16)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(0, 10, 11.9, 5, 11, 13.9),
                    Block.box(0, 11, 12.3, 5, 12, 14.3),
                    Block.box(0, 12, 12.7, 5, 13, 14.7),
                    Block.box(0, 13, 13.2, 5, 14, 15.2),
                    Block.box(0, 14, 13.6, 5, 15, 15.6),
                    Block.box(0, 15, 14, 5, 16, 16),
                    Block.box(0, 16, 14.399999999999999, 5, 17, 16.4),
                    Block.box(0, 17, 14.7, 5, 17.6, 16.7)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(2.2, 10, 11, 4.2, 11, 16),
                    Block.box(1.7999999999999998, 11, 11, 3.8, 12, 16),
                    Block.box(1.4, 12, 11, 3.4, 13, 16),
                    Block.box(1, 13, 11, 3, 14, 16),
                    Block.box(0.6000000000000001, 14, 11, 2.6, 15, 16),
                    Block.box(0.20000000000000018, 15, 11, 2.2, 16, 16),
                    Block.box(-0.19999999999999996, 16, 11, 1.8, 17, 16),
                    Block.box(-0.6000000000000001, 17, 11, 1.4, 17.6, 16)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(3, 1, 8.8, 5, 2, 10.8),
                    Block.box(3, 2, 9.2, 5, 3, 11.2),
                    Block.box(3, 3, 9.6, 5, 4, 11.6),
                    Block.box(3, 4, 10, 5, 5, 12),
                    Block.box(3, 5, 10.4, 5, 6, 12.4),
                    Block.box(3, 6, 10.8, 5, 7, 12.8),
                    Block.box(3, 7, 11.2, 5, 8, 13.2),
                    Block.box(3, 8, 11.7, 5, 9, 13.7),
                    Block.box(3, 9, 12.1, 5, 10, 14.1),
                    Block.box(3, 10, 12.5, 5, 11, 14.5),
                    Block.box(3, 11, 12.9, 5, 12, 14.9),
                    Block.box(3, 12, 13.3, 5, 13, 15.3),
                    Block.box(3, 13, 13.8, 5, 14, 15.8),
                    Block.box(3, 14, 14.2, 5, 15, 16.2),
                    Block.box(3, 15, 14.5, 5, 15.8, 16.5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(5.199999999999999, 1, 11, 7.199999999999999, 2, 13),
                    Block.box(4.800000000000001, 2, 11, 6.800000000000001, 3, 13),
                    Block.box(4.4, 3, 11, 6.4, 4, 13),
                    Block.box(4, 4, 11, 6, 5, 13),
                    Block.box(3.5999999999999996, 5, 11, 5.6, 6, 13),
                    Block.box(3.1999999999999993, 6, 11, 5.199999999999999, 7, 13),
                    Block.box(2.8000000000000007, 7, 11, 4.800000000000001, 8, 13),
                    Block.box(2.3000000000000007, 8, 11, 4.300000000000001, 9, 13),
                    Block.box(1.9000000000000004, 9, 11, 3.9000000000000004, 10, 13),
                    Block.box(1.5, 10, 11, 3.5, 11, 13),
                    Block.box(1.0999999999999996, 11, 11, 3.0999999999999996, 12, 13),
                    Block.box(0.6999999999999993, 12, 11, 2.6999999999999993, 13, 13),
                    Block.box(0.1999999999999993, 13, 11, 2.1999999999999993, 14, 13),
                    Block.box(-0.1999999999999993, 14, 11, 1.8000000000000007, 15, 13),
                    Block.box(-0.5, 15, 11, 1.5, 15.8, 13)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
            INNER_SOUTH_SHAPE = Stream.of(
                Stream.of(
                    Block.box(14, 0, 14, 16, 16, 16),
                    Block.box(8, 0, 14, 14, 2, 16),
                    Block.box(14, 0, 8, 16, 2, 14)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(7.300000000000001, 0, 7, 9.3, 1, 16),
                    Block.box(7.6, 1, 7, 9.6, 2, 16),
                    Block.box(8, 2, 7, 10, 3, 16),
                    Block.box(8.5, 3, 7, 10.5, 4, 16),
                    Block.box(8.9, 4, 7, 10.9, 5, 16),
                    Block.box(9.2, 5, 7, 11.2, 5.8, 16)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(7, 0, 7.1, 16, 1, 9.1),
                    Block.box(7, 1, 7.4, 16, 2, 9.4),
                    Block.box(7, 2, 7.800000000000001, 16, 3, 9.8),
                    Block.box(7, 3, 8.3, 16, 4, 10.3),
                    Block.box(7, 4, 8.7, 16, 5, 10.7),
                    Block.box(7, 5, 9.1, 16, 5.8, 11.1)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(10, 5, 9, 12, 6, 16),
                    Block.box(10.3, 6, 9, 12.3, 7, 16),
                    Block.box(10.7, 7, 9, 12.7, 8, 16),
                    Block.box(11.1, 8, 9, 13.1, 9, 16),
                    Block.box(11.5, 9, 9, 13.5, 10, 16)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(9, 5, 9.8, 16, 6, 11.8),
                    Block.box(9, 6, 10, 16, 7, 12),
                    Block.box(9, 7, 10.5, 16, 8, 12.5),
                    Block.box(9, 8, 10.9, 16, 9, 12.9),
                    Block.box(9, 9, 11.3, 16, 10.2, 13.3)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(11.9, 10, 11, 13.9, 11, 16),
                    Block.box(12.3, 11, 11, 14.3, 12, 16),
                    Block.box(12.7, 12, 11, 14.7, 13, 16),
                    Block.box(13.2, 13, 11, 15.2, 14, 16),
                    Block.box(13.6, 14, 11, 15.6, 15, 16),
                    Block.box(14, 15, 11, 16, 16, 16),
                    Block.box(14.399999999999999, 16, 11, 16.4, 17, 16),
                    Block.box(14.7, 17, 11, 16.7, 17.6, 16)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(11, 10, 11.8, 16, 11, 13.8),
                    Block.box(11, 11, 12.2, 16, 12, 14.2),
                    Block.box(11, 12, 12.6, 16, 13, 14.6),
                    Block.box(11, 13, 13, 16, 14, 15),
                    Block.box(11, 14, 13.4, 16, 15, 15.4),
                    Block.box(11, 15, 13.8, 16, 16, 15.8),
                    Block.box(11, 16, 14.2, 16, 17, 16.2),
                    Block.box(11, 17, 14.6, 16, 17.6, 16.6)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(8.8, 1, 11, 10.8, 2, 13),
                    Block.box(9.2, 2, 11, 11.2, 3, 13),
                    Block.box(9.6, 3, 11, 11.6, 4, 13),
                    Block.box(10, 4, 11, 12, 5, 13),
                    Block.box(10.4, 5, 11, 12.4, 6, 13),
                    Block.box(10.8, 6, 11, 12.8, 7, 13),
                    Block.box(11.2, 7, 11, 13.2, 8, 13),
                    Block.box(11.7, 8, 11, 13.7, 9, 13),
                    Block.box(12.1, 9, 11, 14.1, 10, 13),
                    Block.box(12.5, 10, 11, 14.5, 11, 13),
                    Block.box(12.9, 11, 11, 14.9, 12, 13),
                    Block.box(13.3, 12, 11, 15.3, 13, 13),
                    Block.box(13.8, 13, 11, 15.8, 14, 13),
                    Block.box(14.2, 14, 11, 16.2, 15, 13),
                    Block.box(14.5, 15, 11, 16.5, 15.8, 13)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(11, 1, 8.8, 13, 2, 10.8),
                    Block.box(11, 2, 9.2, 13, 3, 11.2),
                    Block.box(11, 3, 9.6, 13, 4, 11.6),
                    Block.box(11, 4, 10, 13, 5, 12),
                    Block.box(11, 5, 10.4, 13, 6, 12.4),
                    Block.box(11, 6, 10.8, 13, 7, 12.8),
                    Block.box(11, 7, 11.2, 13, 8, 13.2),
                    Block.box(11, 8, 11.7, 13, 9, 13.7),
                    Block.box(11, 9, 12.1, 13, 10, 14.1),
                    Block.box(11, 10, 12.5, 13, 11, 14.5),
                    Block.box(11, 11, 12.9, 13, 12, 14.9),
                    Block.box(11, 12, 13.3, 13, 13, 15.3),
                    Block.box(11, 13, 13.8, 13, 14, 15.8),
                    Block.box(11, 14, 14.2, 13, 15, 16.2),
                    Block.box(11, 15, 14.5, 13, 15.8, 16.5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
            INNER_EAST_SHAPE = Stream.of(
                Stream.of(
                    Block.box(14, 0, 0, 16, 16, 2),
                    Block.box(14, 0, 2, 16, 2, 8),
                    Block.box(8, 0, 0, 14, 2, 2)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(7, 0, 6.699999999999999, 16, 1, 8.7),
                    Block.box(7, 1, 6.4, 16, 2, 8.4),
                    Block.box(7, 2, 6, 16, 3, 8),
                    Block.box(7, 3, 5.5, 16, 4, 7.5),
                    Block.box(7, 4, 5.1, 16, 5, 7.1),
                    Block.box(7, 5, 4.800000000000001, 16, 5.8, 6.800000000000001)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(7.1, 0, 0, 9.1, 1, 9),
                    Block.box(7.4, 1, 0, 9.4, 2, 9),
                    Block.box(7.800000000000001, 2, 0, 9.8, 3, 9),
                    Block.box(8.3, 3, 0, 10.3, 4, 9),
                    Block.box(8.7, 4, 0, 10.7, 5, 9),
                    Block.box(9.1, 5, 0, 11.1, 5.8, 9)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(9, 5, 4, 16, 6, 6),
                    Block.box(9, 6, 3.6999999999999993, 16, 7, 5.699999999999999),
                    Block.box(9, 7, 3.3000000000000007, 16, 8, 5.300000000000001),
                    Block.box(9, 8, 2.9000000000000004, 16, 9, 4.9),
                    Block.box(9, 9, 2.5, 16, 10, 4.5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(9.8, 5, 0, 11.8, 6, 7),
                    Block.box(10, 6, 0, 12, 7, 7),
                    Block.box(10.5, 7, 0, 12.5, 8, 7),
                    Block.box(10.9, 8, 0, 12.9, 9, 7),
                    Block.box(11.3, 9, 0, 13.3, 10.2, 7)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(11, 10, 2.0999999999999996, 16, 11, 4.1),
                    Block.box(11, 11, 1.6999999999999993, 16, 12, 3.6999999999999993),
                    Block.box(11, 12, 1.3000000000000007, 16, 13, 3.3000000000000007),
                    Block.box(11, 13, 0.8000000000000007, 16, 14, 2.8000000000000007),
                    Block.box(11, 14, 0.40000000000000036, 16, 15, 2.4000000000000004),
                    Block.box(11, 15, 0, 16, 16, 2),
                    Block.box(11, 16, -0.3999999999999986, 16, 17, 1.6000000000000014),
                    Block.box(11, 17, -0.6999999999999993, 16, 17.6, 1.3000000000000007)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(11.8, 10, 0, 13.8, 11, 5),
                    Block.box(12.2, 11, 0, 14.2, 12, 5),
                    Block.box(12.6, 12, 0, 14.6, 13, 5),
                    Block.box(13, 13, 0, 15, 14, 5),
                    Block.box(13.4, 14, 0, 15.4, 15, 5),
                    Block.box(13.8, 15, 0, 15.8, 16, 5),
                    Block.box(14.2, 16, 0, 16.2, 17, 5),
                    Block.box(14.6, 17, 0, 16.6, 17.6, 5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(11, 1, 5.199999999999999, 13, 2, 7.199999999999999),
                    Block.box(11, 2, 4.800000000000001, 13, 3, 6.800000000000001),
                    Block.box(11, 3, 4.4, 13, 4, 6.4),
                    Block.box(11, 4, 4, 13, 5, 6),
                    Block.box(11, 5, 3.5999999999999996, 13, 6, 5.6),
                    Block.box(11, 6, 3.1999999999999993, 13, 7, 5.199999999999999),
                    Block.box(11, 7, 2.8000000000000007, 13, 8, 4.800000000000001),
                    Block.box(11, 8, 2.3000000000000007, 13, 9, 4.300000000000001),
                    Block.box(11, 9, 1.9000000000000004, 13, 10, 3.9000000000000004),
                    Block.box(11, 10, 1.5, 13, 11, 3.5),
                    Block.box(11, 11, 1.0999999999999996, 13, 12, 3.0999999999999996),
                    Block.box(11, 12, 0.6999999999999993, 13, 13, 2.6999999999999993),
                    Block.box(11, 13, 0.1999999999999993, 13, 14, 2.1999999999999993),
                    Block.box(11, 14, -0.1999999999999993, 13, 15, 1.8000000000000007),
                    Block.box(11, 15, -0.5, 13, 15.8, 1.5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(8.8, 1, 3, 10.8, 2, 5),
                    Block.box(9.2, 2, 3, 11.2, 3, 5),
                    Block.box(9.6, 3, 3, 11.6, 4, 5),
                    Block.box(10, 4, 3, 12, 5, 5),
                    Block.box(10.4, 5, 3, 12.4, 6, 5),
                    Block.box(10.8, 6, 3, 12.8, 7, 5),
                    Block.box(11.2, 7, 3, 13.2, 8, 5),
                    Block.box(11.7, 8, 3, 13.7, 9, 5),
                    Block.box(12.1, 9, 3, 14.1, 10, 5),
                    Block.box(12.5, 10, 3, 14.5, 11, 5),
                    Block.box(12.9, 11, 3, 14.9, 12, 5),
                    Block.box(13.3, 12, 3, 15.3, 13, 5),
                    Block.box(13.8, 13, 3, 15.8, 14, 5),
                    Block.box(14.2, 14, 3, 16.2, 15, 5),
                    Block.box(14.5, 15, 3, 16.5, 15.8, 5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
            INNER_NORTH_SHAPE = Stream.of(
                Stream.of(
                    Block.box(0, 0, 0, 2, 16, 2),
                    Block.box(2, 0, 0, 8, 2, 2),
                    Block.box(0, 0, 2, 2, 2, 8)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(6.699999999999999, 0, 0, 8.7, 1, 9),
                    Block.box(6.4, 1, 0, 8.4, 2, 9),
                    Block.box(6, 2, 0, 8, 3, 9),
                    Block.box(5.5, 3, 0, 7.5, 4, 9),
                    Block.box(5.1, 4, 0, 7.1, 5, 9),
                    Block.box(4.800000000000001, 5, 0, 6.800000000000001, 5.8, 9)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(0, 0, 6.9, 9, 1, 8.9),
                    Block.box(0, 1, 6.6, 9, 2, 8.6),
                    Block.box(0, 2, 6.199999999999999, 9, 3, 8.2),
                    Block.box(0, 3, 5.699999999999999, 9, 4, 7.699999999999999),
                    Block.box(0, 4, 5.300000000000001, 9, 5, 7.300000000000001),
                    Block.box(0, 5, 4.9, 9, 5.8, 6.9)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(4, 5, 0, 6, 6, 7),
                    Block.box(3.6999999999999993, 6, 0, 5.699999999999999, 7, 7),
                    Block.box(3.3000000000000007, 7, 0, 5.300000000000001, 8, 7),
                    Block.box(2.9000000000000004, 8, 0, 4.9, 9, 7),
                    Block.box(2.5, 9, 0, 4.5, 10, 7)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(0, 5, 4.199999999999999, 7, 6, 6.199999999999999),
                    Block.box(0, 6, 4, 7, 7, 6),
                    Block.box(0, 7, 3.5, 7, 8, 5.5),
                    Block.box(0, 8, 3.0999999999999996, 7, 9, 5.1),
                    Block.box(0, 9, 2.6999999999999993, 7, 10.2, 4.699999999999999)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(2.0999999999999996, 10, 0, 4.1, 11, 5),
                    Block.box(1.6999999999999993, 11, 0, 3.6999999999999993, 12, 5),
                    Block.box(1.3000000000000007, 12, 0, 3.3000000000000007, 13, 5),
                    Block.box(0.8000000000000007, 13, 0, 2.8000000000000007, 14, 5),
                    Block.box(0.40000000000000036, 14, 0, 2.4000000000000004, 15, 5),
                    Block.box(0, 15, 0, 2, 16, 5),
                    Block.box(-0.3999999999999986, 16, 0, 1.6000000000000014, 17, 5),
                    Block.box(-0.6999999999999993, 17, 0, 1.3000000000000007, 17.6, 5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(0, 10, 2.1999999999999993, 5, 11, 4.199999999999999),
                    Block.box(0, 11, 1.8000000000000007, 5, 12, 3.8000000000000007),
                    Block.box(0, 12, 1.4000000000000004, 5, 13, 3.4000000000000004),
                    Block.box(0, 13, 1, 5, 14, 3),
                    Block.box(0, 14, 0.5999999999999996, 5, 15, 2.5999999999999996),
                    Block.box(0, 15, 0.1999999999999993, 5, 16, 2.1999999999999993),
                    Block.box(0, 16, -0.1999999999999993, 5, 17, 1.8000000000000007),
                    Block.box(0, 17, -0.6000000000000014, 5, 17.6, 1.4000000000000004)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(5.199999999999999, 1, 3, 7.199999999999999, 2, 5),
                    Block.box(4.800000000000001, 2, 3, 6.800000000000001, 3, 5),
                    Block.box(4.4, 3, 3, 6.4, 4, 5),
                    Block.box(4, 4, 3, 6, 5, 5),
                    Block.box(3.5999999999999996, 5, 3, 5.6, 6, 5),
                    Block.box(3.1999999999999993, 6, 3, 5.199999999999999, 7, 5),
                    Block.box(2.8000000000000007, 7, 3, 4.800000000000001, 8, 5),
                    Block.box(2.3000000000000007, 8, 3, 4.300000000000001, 9, 5),
                    Block.box(1.9000000000000004, 9, 3, 3.9000000000000004, 10, 5),
                    Block.box(1.5, 10, 3, 3.5, 11, 5),
                    Block.box(1.0999999999999996, 11, 3, 3.0999999999999996, 12, 5),
                    Block.box(0.6999999999999993, 12, 3, 2.6999999999999993, 13, 5),
                    Block.box(0.1999999999999993, 13, 3, 2.1999999999999993, 14, 5),
                    Block.box(-0.1999999999999993, 14, 3, 1.8000000000000007, 15, 5),
                    Block.box(-0.5, 15, 3, 1.5, 15.8, 5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(3, 1, 5.199999999999999, 5, 2, 7.199999999999999),
                    Block.box(3, 2, 4.800000000000001, 5, 3, 6.800000000000001),
                    Block.box(3, 3, 4.4, 5, 4, 6.4),
                    Block.box(3, 4, 4, 5, 5, 6),
                    Block.box(3, 5, 3.5999999999999996, 5, 6, 5.6),
                    Block.box(3, 6, 3.1999999999999993, 5, 7, 5.199999999999999),
                    Block.box(3, 7, 2.8000000000000007, 5, 8, 4.800000000000001),
                    Block.box(3, 8, 2.3000000000000007, 5, 9, 4.300000000000001),
                    Block.box(3, 9, 1.9000000000000004, 5, 10, 3.9000000000000004),
                    Block.box(3, 10, 1.5, 5, 11, 3.5),
                    Block.box(3, 11, 1.0999999999999996, 5, 12, 3.0999999999999996),
                    Block.box(3, 12, 0.6999999999999993, 5, 13, 2.6999999999999993),
                    Block.box(3, 13, 0.1999999999999993, 5, 14, 2.1999999999999993),
                    Block.box(3, 14, -0.1999999999999993, 5, 15, 1.8000000000000007),
                    Block.box(3, 15, -0.5, 5, 15.8, 1.5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        }
        {
            OUTER_SOUTH_SHAPE = Stream.of(
                Stream.of(
                    Block.box(0, 0, 8, 2, 2, 14),
                    Block.box(8, 0, 0, 14, 2, 2),
                    Block.box(14, 0, 14, 16, 16, 16),
                    Block.box(2, 0, 14, 14, 2, 16),
                    Block.box(14, 0, 2, 16, 2, 14),
                    Block.box(0, 0, 14, 2, 16, 16),
                    Block.box(14, 0, 0, 16, 16, 2),
                    Block.box(2, 14, 14, 14, 16, 16),
                    Block.box(14, 14, 2, 16, 16, 14)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(0, 0, 6.800000000000001, 10, 1, 8.8),
                    Block.box(0, 1, 7.1, 10, 2, 9.1),
                    Block.box(0, 2, 7.5, 10, 3, 9.5),
                    Block.box(0, 3, 7.9, 10, 4, 9.9),
                    Block.box(0, 4, 8.3, 10, 5, 10.3),
                    Block.box(0, 5, 8.8, 10, 6.2, 10.8)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(6.800000000000001, 0, 0, 8.8, 1, 10),
                    Block.box(7.1, 1, 0, 9.1, 2, 10),
                    Block.box(7.5, 2, 0, 9.5, 3, 10),
                    Block.box(7.9, 3, 0, 9.9, 4, 10),
                    Block.box(8.3, 4, 0, 10.3, 5, 10),
                    Block.box(8.8, 5, 0, 10.8, 6.2, 10)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(0, 6, 9.7, 15, 7, 11.7),
                    Block.box(0, 7, 10.1, 15, 8, 12.1),
                    Block.box(0, 8, 10.5, 15, 9, 12.5),
                    Block.box(0, 9, 10.9, 15, 10, 12.9),
                    Block.box(0, 10, 11.3, 15, 11, 13.3),
                    Block.box(0, 11, 11.8, 15, 12, 13.8),
                    Block.box(0, 12, 12.2, 15, 13, 14.2),
                    Block.box(0, 13, 12.6, 15, 14, 14.6),
                    Block.box(0, 14, 13.1, 16, 15, 15.1),
                    Block.box(0, 15, 13.5, 16, 16, 15.5),
                    Block.box(0, 16, 13.9, 16, 17, 15.9),
                    Block.box(0, 17, 14.2, 16, 17.8, 16.2)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(9.7, 6, 0, 11.7, 7, 15),
                    Block.box(10.1, 7, 0, 12.1, 8, 15),
                    Block.box(10.5, 8, 0, 12.5, 9, 15),
                    Block.box(10.9, 9, 0, 12.9, 10, 15),
                    Block.box(11.3, 10, 0, 13.3, 11, 15),
                    Block.box(11.8, 11, 0, 13.8, 12, 15),
                    Block.box(12.2, 12, 0, 14.2, 13, 15),
                    Block.box(12.6, 13, 0, 14.6, 14, 15),
                    Block.box(13.1, 14, 0, 15.1, 15, 16),
                    Block.box(13.5, 15, 0, 15.5, 16, 16),
                    Block.box(13.9, 16, 0, 15.9, 17, 16),
                    Block.box(14.2, 17, 0, 16.2, 17.8, 16)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(3, 1, 8.8, 5, 2, 10.8),
                    Block.box(3, 2, 9.2, 5, 3, 11.2),
                    Block.box(3, 3, 9.6, 5, 4, 11.6),
                    Block.box(3, 4, 10, 5, 5, 12),
                    Block.box(3, 5, 10.4, 5, 6, 12.4),
                    Block.box(3, 6, 10.8, 5, 7, 12.8),
                    Block.box(3, 7, 11.2, 5, 8, 13.2),
                    Block.box(3, 8, 11.7, 5, 9, 13.7),
                    Block.box(3, 9, 12.1, 5, 10, 14.1),
                    Block.box(3, 10, 12.5, 5, 11, 14.5),
                    Block.box(3, 11, 12.9, 5, 12, 14.9),
                    Block.box(3, 12, 13.3, 5, 13, 15.3),
                    Block.box(3, 13, 13.8, 5, 14, 15.8),
                    Block.box(3, 14, 14.2, 5, 15, 16.2),
                    Block.box(3, 15, 14.5, 5, 15.8, 16.5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(8.8, 1, 3, 10.8, 2, 5),
                    Block.box(9.2, 2, 3, 11.2, 3, 5),
                    Block.box(9.6, 3, 3, 11.6, 4, 5),
                    Block.box(10, 4, 3, 12, 5, 5),
                    Block.box(10.4, 5, 3, 12.4, 6, 5),
                    Block.box(10.8, 6, 3, 12.8, 7, 5),
                    Block.box(11.2, 7, 3, 13.2, 8, 5),
                    Block.box(11.7, 8, 3, 13.7, 9, 5),
                    Block.box(12.1, 9, 3, 14.1, 10, 5),
                    Block.box(12.5, 10, 3, 14.5, 11, 5),
                    Block.box(12.9, 11, 3, 14.9, 12, 5),
                    Block.box(13.3, 12, 3, 15.3, 13, 5),
                    Block.box(13.8, 13, 3, 15.8, 14, 5),
                    Block.box(14.2, 14, 3, 16.2, 15, 5),
                    Block.box(14.5, 15, 3, 16.5, 15.8, 5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
            OUTER_EAST_SHAPE = Stream.of(
                Stream.of(
                    Block.box(8, 0, 14, 14, 2, 16),
                    Block.box(0, 0, 2, 2, 2, 8),
                    Block.box(14, 0, 0, 16, 16, 2),
                    Block.box(14, 0, 2, 16, 2, 14),
                    Block.box(2, 0, 0, 14, 2, 2),
                    Block.box(14, 0, 14, 16, 16, 16),
                    Block.box(0, 0, 0, 2, 16, 2),
                    Block.box(14, 14, 2, 16, 16, 14),
                    Block.box(2, 14, 0, 14, 16, 2)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(6.800000000000001, 0, 6, 8.8, 1, 16),
                    Block.box(7.1, 1, 6, 9.1, 2, 16),
                    Block.box(7.5, 2, 6, 9.5, 3, 16),
                    Block.box(7.9, 3, 6, 9.9, 4, 16),
                    Block.box(8.3, 4, 6, 10.3, 5, 16),
                    Block.box(8.8, 5, 6, 10.8, 6.2, 16)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(0, 0, 7.199999999999999, 10, 1, 9.2),
                    Block.box(0, 1, 6.9, 10, 2, 8.9),
                    Block.box(0, 2, 6.5, 10, 3, 8.5),
                    Block.box(0, 3, 6.1, 10, 4, 8.1),
                    Block.box(0, 4, 5.699999999999999, 10, 5, 7.699999999999999),
                    Block.box(0, 5, 5.199999999999999, 10, 6.2, 7.199999999999999)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(9.7, 6, 1, 11.7, 7, 16),
                    Block.box(10.1, 7, 1, 12.1, 8, 16),
                    Block.box(10.5, 8, 1, 12.5, 9, 16),
                    Block.box(10.9, 9, 1, 12.9, 10, 16),
                    Block.box(11.3, 10, 1, 13.3, 11, 16),
                    Block.box(11.8, 11, 1, 13.8, 12, 16),
                    Block.box(12.2, 12, 1, 14.2, 13, 16),
                    Block.box(12.6, 13, 1, 14.6, 14, 16),
                    Block.box(13.1, 14, 0, 15.1, 15, 16),
                    Block.box(13.5, 15, 0, 15.5, 16, 16),
                    Block.box(13.9, 16, 0, 15.9, 17, 16),
                    Block.box(14.2, 17, 0, 16.2, 17.8, 16)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(0, 6, 4.300000000000001, 15, 7, 6.300000000000001),
                    Block.box(0, 7, 3.9000000000000004, 15, 8, 5.9),
                    Block.box(0, 8, 3.5, 15, 9, 5.5),
                    Block.box(0, 9, 3.0999999999999996, 15, 10, 5.1),
                    Block.box(0, 10, 2.6999999999999993, 15, 11, 4.699999999999999),
                    Block.box(0, 11, 2.1999999999999993, 15, 12, 4.199999999999999),
                    Block.box(0, 12, 1.8000000000000007, 15, 13, 3.8000000000000007),
                    Block.box(0, 13, 1.4000000000000004, 15, 14, 3.4000000000000004),
                    Block.box(0, 14, 0.9000000000000004, 16, 15, 2.9000000000000004),
                    Block.box(0, 15, 0.5, 16, 16, 2.5),
                    Block.box(0, 16, 0.09999999999999964, 16, 17, 2.0999999999999996),
                    Block.box(0, 17, -0.1999999999999993, 16, 17.8, 1.8000000000000007)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(8.8, 1, 11, 10.8, 2, 13),
                    Block.box(9.2, 2, 11, 11.2, 3, 13),
                    Block.box(9.6, 3, 11, 11.6, 4, 13),
                    Block.box(10, 4, 11, 12, 5, 13),
                    Block.box(10.4, 5, 11, 12.4, 6, 13),
                    Block.box(10.8, 6, 11, 12.8, 7, 13),
                    Block.box(11.2, 7, 11, 13.2, 8, 13),
                    Block.box(11.7, 8, 11, 13.7, 9, 13),
                    Block.box(12.1, 9, 11, 14.1, 10, 13),
                    Block.box(12.5, 10, 11, 14.5, 11, 13),
                    Block.box(12.9, 11, 11, 14.9, 12, 13),
                    Block.box(13.3, 12, 11, 15.3, 13, 13),
                    Block.box(13.8, 13, 11, 15.8, 14, 13),
                    Block.box(14.2, 14, 11, 16.2, 15, 13),
                    Block.box(14.5, 15, 11, 16.5, 15.8, 13)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(3, 1, 5.199999999999999, 5, 2, 7.199999999999999),
                    Block.box(3, 2, 4.800000000000001, 5, 3, 6.800000000000001),
                    Block.box(3, 3, 4.4, 5, 4, 6.4),
                    Block.box(3, 4, 4, 5, 5, 6),
                    Block.box(3, 5, 3.5999999999999996, 5, 6, 5.6),
                    Block.box(3, 6, 3.1999999999999993, 5, 7, 5.199999999999999),
                    Block.box(3, 7, 2.8000000000000007, 5, 8, 4.800000000000001),
                    Block.box(3, 8, 2.3000000000000007, 5, 9, 4.300000000000001),
                    Block.box(3, 9, 1.9000000000000004, 5, 10, 3.9000000000000004),
                    Block.box(3, 10, 1.5, 5, 11, 3.5),
                    Block.box(3, 11, 1.0999999999999996, 5, 12, 3.0999999999999996),
                    Block.box(3, 12, 0.6999999999999993, 5, 13, 2.6999999999999993),
                    Block.box(3, 13, 0.1999999999999993, 5, 14, 2.1999999999999993),
                    Block.box(3, 14, -0.1999999999999993, 5, 15, 1.8000000000000007),
                    Block.box(3, 15, -0.5, 5, 15.8, 1.5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
            OUTER_NORTH_SHAPE = Stream.of(
                Stream.of(
                    Block.box(14, 0, 2, 16, 2, 8),
                    Block.box(2, 0, 14, 8, 2, 16),
                    Block.box(0, 0, 0, 2, 16, 2),
                    Block.box(2, 0, 0, 14, 2, 2),
                    Block.box(0, 0, 2, 2, 2, 14),
                    Block.box(14, 0, 0, 16, 16, 2),
                    Block.box(0, 0, 14, 2, 16, 16),
                    Block.box(2, 14, 0, 14, 16, 2),
                    Block.box(0, 14, 2, 2, 16, 14)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(6, 0, 7.199999999999999, 16, 1, 9.2),
                    Block.box(6, 1, 6.9, 16, 2, 8.9),
                    Block.box(6, 2, 6.5, 16, 3, 8.5),
                    Block.box(6, 3, 6.1, 16, 4, 8.1),
                    Block.box(6, 4, 5.699999999999999, 16, 5, 7.699999999999999),
                    Block.box(6, 5, 5.199999999999999, 16, 6.2, 7.199999999999999)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(7.199999999999999, 0, 6, 9.2, 1, 16),
                    Block.box(6.9, 1, 6, 8.9, 2, 16),
                    Block.box(6.5, 2, 6, 8.5, 3, 16),
                    Block.box(6.1, 3, 6, 8.1, 4, 16),
                    Block.box(5.699999999999999, 4, 6, 7.699999999999999, 5, 16),
                    Block.box(5.199999999999999, 5, 6, 7.199999999999999, 6.2, 16)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(1, 6, 4.300000000000001, 16, 7, 6.300000000000001),
                    Block.box(1, 7, 3.9000000000000004, 16, 8, 5.9),
                    Block.box(1, 8, 3.5, 16, 9, 5.5),
                    Block.box(1, 9, 3.0999999999999996, 16, 10, 5.1),
                    Block.box(1, 10, 2.6999999999999993, 16, 11, 4.699999999999999),
                    Block.box(1, 11, 2.1999999999999993, 16, 12, 4.199999999999999),
                    Block.box(1, 12, 1.8000000000000007, 16, 13, 3.8000000000000007),
                    Block.box(1, 13, 1.4000000000000004, 16, 14, 3.4000000000000004),
                    Block.box(0, 14, 0.9000000000000004, 16, 15, 2.9000000000000004),
                    Block.box(0, 15, 0.5, 16, 16, 2.5),
                    Block.box(0, 16, 0.09999999999999964, 16, 17, 2.0999999999999996),
                    Block.box(0, 17, -0.1999999999999993, 16, 17.8, 1.8000000000000007)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(4.300000000000001, 6, 1, 6.300000000000001, 7, 16),
                    Block.box(3.9000000000000004, 7, 1, 5.9, 8, 16),
                    Block.box(3.5, 8, 1, 5.5, 9, 16),
                    Block.box(3.0999999999999996, 9, 1, 5.1, 10, 16),
                    Block.box(2.6999999999999993, 10, 1, 4.699999999999999, 11, 16),
                    Block.box(2.1999999999999993, 11, 1, 4.199999999999999, 12, 16),
                    Block.box(1.8000000000000007, 12, 1, 3.8000000000000007, 13, 16),
                    Block.box(1.4000000000000004, 13, 1, 3.4000000000000004, 14, 16),
                    Block.box(0.9000000000000004, 14, 0, 2.9000000000000004, 15, 16),
                    Block.box(0.5, 15, 0, 2.5, 16, 16),
                    Block.box(0.09999999999999964, 16, 0, 2.0999999999999996, 17, 16),
                    Block.box(-0.1999999999999993, 17, 0, 1.8000000000000007, 17.8, 16)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(11, 1, 5.199999999999999, 13, 2, 7.199999999999999),
                    Block.box(11, 2, 4.800000000000001, 13, 3, 6.800000000000001),
                    Block.box(11, 3, 4.4, 13, 4, 6.4),
                    Block.box(11, 4, 4, 13, 5, 6),
                    Block.box(11, 5, 3.5999999999999996, 13, 6, 5.6),
                    Block.box(11, 6, 3.1999999999999993, 13, 7, 5.199999999999999),
                    Block.box(11, 7, 2.8000000000000007, 13, 8, 4.800000000000001),
                    Block.box(11, 8, 2.3000000000000007, 13, 9, 4.300000000000001),
                    Block.box(11, 9, 1.9000000000000004, 13, 10, 3.9000000000000004),
                    Block.box(11, 10, 1.5, 13, 11, 3.5),
                    Block.box(11, 11, 1.0999999999999996, 13, 12, 3.0999999999999996),
                    Block.box(11, 12, 0.6999999999999993, 13, 13, 2.6999999999999993),
                    Block.box(11, 13, 0.1999999999999993, 13, 14, 2.1999999999999993),
                    Block.box(11, 14, -0.1999999999999993, 13, 15, 1.8000000000000007),
                    Block.box(11, 15, -0.5, 13, 15.8, 1.5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(5.199999999999999, 1, 11, 7.199999999999999, 2, 13),
                    Block.box(4.800000000000001, 2, 11, 6.800000000000001, 3, 13),
                    Block.box(4.4, 3, 11, 6.4, 4, 13),
                    Block.box(4, 4, 11, 6, 5, 13),
                    Block.box(3.5999999999999996, 5, 11, 5.6, 6, 13),
                    Block.box(3.1999999999999993, 6, 11, 5.199999999999999, 7, 13),
                    Block.box(2.8000000000000007, 7, 11, 4.800000000000001, 8, 13),
                    Block.box(2.3000000000000007, 8, 11, 4.300000000000001, 9, 13),
                    Block.box(1.9000000000000004, 9, 11, 3.9000000000000004, 10, 13),
                    Block.box(1.5, 10, 11, 3.5, 11, 13),
                    Block.box(1.0999999999999996, 11, 11, 3.0999999999999996, 12, 13),
                    Block.box(0.6999999999999993, 12, 11, 2.6999999999999993, 13, 13),
                    Block.box(0.1999999999999993, 13, 11, 2.1999999999999993, 14, 13),
                    Block.box(-0.1999999999999993, 14, 11, 1.8000000000000007, 15, 13),
                    Block.box(-0.5, 15, 11, 1.5, 15.8, 13)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
            OUTER_WEST_SHAPE = Stream.of(
                Stream.of(
                    Block.box(2, 0, 0, 8, 2, 2),
                    Block.box(14, 0, 8, 16, 2, 14),
                    Block.box(0, 0, 14, 2, 16, 16),
                    Block.box(0, 0, 2, 2, 2, 14),
                    Block.box(2, 0, 14, 14, 2, 16),
                    Block.box(0, 0, 0, 2, 16, 2),
                    Block.box(14, 0, 14, 16, 16, 16),
                    Block.box(0, 14, 2, 2, 16, 14),
                    Block.box(2, 14, 14, 14, 16, 16)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(7.199999999999999, 0, 0, 9.2, 1, 10),
                    Block.box(6.9, 1, 0, 8.9, 2, 10),
                    Block.box(6.5, 2, 0, 8.5, 3, 10),
                    Block.box(6.1, 3, 0, 8.1, 4, 10),
                    Block.box(5.699999999999999, 4, 0, 7.699999999999999, 5, 10),
                    Block.box(5.199999999999999, 5, 0, 7.199999999999999, 6.2, 10)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(6, 0, 6.800000000000001, 16, 1, 8.8),
                    Block.box(6, 1, 7.1, 16, 2, 9.1),
                    Block.box(6, 2, 7.5, 16, 3, 9.5),
                    Block.box(6, 3, 7.9, 16, 4, 9.9),
                    Block.box(6, 4, 8.3, 16, 5, 10.3),
                    Block.box(6, 5, 8.8, 16, 6.2, 10.8)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(4.300000000000001, 6, 0, 6.300000000000001, 7, 15),
                    Block.box(3.9000000000000004, 7, 0, 5.9, 8, 15),
                    Block.box(3.5, 8, 0, 5.5, 9, 15),
                    Block.box(3.0999999999999996, 9, 0, 5.1, 10, 15),
                    Block.box(2.6999999999999993, 10, 0, 4.699999999999999, 11, 15),
                    Block.box(2.1999999999999993, 11, 0, 4.199999999999999, 12, 15),
                    Block.box(1.8000000000000007, 12, 0, 3.8000000000000007, 13, 15),
                    Block.box(1.4000000000000004, 13, 0, 3.4000000000000004, 14, 15),
                    Block.box(0.9000000000000004, 14, 0, 2.9000000000000004, 15, 16),
                    Block.box(0.5, 15, 0, 2.5, 16, 16),
                    Block.box(0.09999999999999964, 16, 0, 2.0999999999999996, 17, 16),
                    Block.box(-0.1999999999999993, 17, 0, 1.8000000000000007, 17.8, 16)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(1, 6, 9.7, 16, 7, 11.7),
                    Block.box(1, 7, 10.1, 16, 8, 12.1),
                    Block.box(1, 8, 10.5, 16, 9, 12.5),
                    Block.box(1, 9, 10.9, 16, 10, 12.9),
                    Block.box(1, 10, 11.3, 16, 11, 13.3),
                    Block.box(1, 11, 11.8, 16, 12, 13.8),
                    Block.box(1, 12, 12.2, 16, 13, 14.2),
                    Block.box(1, 13, 12.6, 16, 14, 14.6),
                    Block.box(0, 14, 13.1, 16, 15, 15.1),
                    Block.box(0, 15, 13.5, 16, 16, 15.5),
                    Block.box(0, 16, 13.9, 16, 17, 15.9),
                    Block.box(0, 17, 14.2, 16, 17.8, 16.2)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(5.199999999999999, 1, 3, 7.199999999999999, 2, 5),
                    Block.box(4.800000000000001, 2, 3, 6.800000000000001, 3, 5),
                    Block.box(4.4, 3, 3, 6.4, 4, 5),
                    Block.box(4, 4, 3, 6, 5, 5),
                    Block.box(3.5999999999999996, 5, 3, 5.6, 6, 5),
                    Block.box(3.1999999999999993, 6, 3, 5.199999999999999, 7, 5),
                    Block.box(2.8000000000000007, 7, 3, 4.800000000000001, 8, 5),
                    Block.box(2.3000000000000007, 8, 3, 4.300000000000001, 9, 5),
                    Block.box(1.9000000000000004, 9, 3, 3.9000000000000004, 10, 5),
                    Block.box(1.5, 10, 3, 3.5, 11, 5),
                    Block.box(1.0999999999999996, 11, 3, 3.0999999999999996, 12, 5),
                    Block.box(0.6999999999999993, 12, 3, 2.6999999999999993, 13, 5),
                    Block.box(0.1999999999999993, 13, 3, 2.1999999999999993, 14, 5),
                    Block.box(-0.1999999999999993, 14, 3, 1.8000000000000007, 15, 5),
                    Block.box(-0.5, 15, 3, 1.5, 15.8, 5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Stream.of(
                    Block.box(11, 1, 8.8, 13, 2, 10.8),
                    Block.box(11, 2, 9.2, 13, 3, 11.2),
                    Block.box(11, 3, 9.6, 13, 4, 11.6),
                    Block.box(11, 4, 10, 13, 5, 12),
                    Block.box(11, 5, 10.4, 13, 6, 12.4),
                    Block.box(11, 6, 10.8, 13, 7, 12.8),
                    Block.box(11, 7, 11.2, 13, 8, 13.2),
                    Block.box(11, 8, 11.7, 13, 9, 13.7),
                    Block.box(11, 9, 12.1, 13, 10, 14.1),
                    Block.box(11, 10, 12.5, 13, 11, 14.5),
                    Block.box(11, 11, 12.9, 13, 12, 14.9),
                    Block.box(11, 12, 13.3, 13, 13, 15.3),
                    Block.box(11, 13, 13.8, 13, 14, 15.8),
                    Block.box(11, 14, 14.2, 13, 15, 16.2),
                    Block.box(11, 15, 14.5, 13, 15.8, 16.5)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        }
    }

    public UpperSteepRoofBlock(Block parentBlock) {
        super(parentBlock);
    }

    @Override
    protected VoxelShape getShape(Direction direction, BlockPos pos, BlockState state) {
        VoxelShape shape;
        StairsShape stairsShape = state.getValue(SHAPE_TYPE);

        switch (stairsShape) {
            case STRAIGHT -> {
                switch (direction) {
                    case NORTH -> shape = NORTH_SHAPE;
                    case SOUTH -> shape = SOUTH_SHAPE;
                    case EAST -> shape = EAST_SHAPE;
                    case WEST -> shape = WEST_SHAPE;
                    default -> {
                        Tensura.getLogger().error("Could not load Direction {} with shape {} of LowerSteepRoofBlock at position {}. Using Fallback shape.", direction, pos, stairsShape);
                        shape = SOUTH_SHAPE;
                    }
                }
            }
            case OUTER_LEFT -> {
                switch (direction) {
                    case NORTH -> shape = INNER_NORTH_SHAPE;
                    case SOUTH -> shape = INNER_SOUTH_SHAPE;
                    case EAST -> shape = INNER_EAST_SHAPE;
                    case WEST -> shape = INNER_WEST_SHAPE;
                    default -> {
                        Tensura.getLogger().error("Could not load Direction {} with shape {} of LowerSteepRoofBlock at position {}. Using Fallback shape.", direction, pos, stairsShape);
                        shape = INNER_SOUTH_SHAPE;
                    }
                }
            }
            case OUTER_RIGHT -> {
                switch (direction) {
                    case EAST -> shape = INNER_SOUTH_SHAPE;
                    case WEST -> shape = INNER_NORTH_SHAPE;
                    case NORTH -> shape = INNER_EAST_SHAPE;
                    case SOUTH -> shape = INNER_WEST_SHAPE;
                    default -> {
                        Tensura.getLogger().error("Could not load Direction {} with shape {} of LowerSteepRoofBlock at position {}. Using Fallback shape.", direction, pos, stairsShape);
                        shape = INNER_SOUTH_SHAPE;
                    }
                }
            }
            case INNER_LEFT -> {
                switch (direction) {
                    case NORTH -> shape = OUTER_NORTH_SHAPE;
                    case SOUTH -> shape = OUTER_SOUTH_SHAPE;
                    case EAST -> shape = OUTER_EAST_SHAPE;
                    case WEST -> shape = OUTER_WEST_SHAPE;
                    default -> {
                        Tensura.getLogger().error("Could not load Direction {} with shape {} of LowerSteepRoofBlock at position {}. Using Fallback shape.", direction, pos, stairsShape);
                        shape = OUTER_SOUTH_SHAPE;
                    }
                }
            }
            case INNER_RIGHT -> {
                switch (direction) {
                    case EAST -> shape = OUTER_SOUTH_SHAPE;
                    case WEST -> shape = OUTER_NORTH_SHAPE;
                    case NORTH -> shape = OUTER_EAST_SHAPE;
                    case SOUTH -> shape = OUTER_WEST_SHAPE;
                    default -> {
                        Tensura.getLogger().error("Could not load Direction {} with shape {} of LowerSteepRoofBlock at position {}. Using Fallback shape.", direction, pos, stairsShape);
                        shape = OUTER_SOUTH_SHAPE;
                    }
                }
            }
            default -> {
                Tensura.getLogger().error("Could not load Direction {} with shape {} of LowerSteepRoofBlock at position {}. Using Fallback shape.", direction, pos, stairsShape);
                shape = SOUTH_SHAPE;
            }
        }

        return shape;
    }

    @Override
    public boolean isRoofBlock(BlockState pState) {
        return pState.getBlock() instanceof UpperSteepRoofBlock;
    }
}
