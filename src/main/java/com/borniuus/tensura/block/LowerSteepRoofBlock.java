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

public class LowerSteepRoofBlock extends AbstractRoofBlock {
    private static final VoxelShape SOUTH_SHAPE = Stream.of(Stream.of(
            Block.box(2, 14, 14, 14, 16, 16),
            Block.box(0, 0, 14, 2, 16, 16),
            Block.box(3, 14, 8, 5, 16, 14),
            Block.box(11, 14, 8, 13, 16, 14),
            Block.box(0, 0, 1, 2, 2, 14),
            Block.box(14, 0, 1, 16, 2, 14),
            Block.box(2, 0, 14, 14, 2, 16),
            Block.box(14, 0, 14, 16, 16, 16),
            Block.box(2, 0, 2, 14, 2, 4)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(0, 0, 0, 16, 2, 2),
            Block.box(0, 2, 0.5, 16, 4, 2.5),
            Block.box(0, 4, 1.5, 16, 6, 3.5),
            Block.box(0, 6, 2.25, 16, 8, 4.25),
            Block.box(0, 8, 3.25, 16, 10, 5.25),
            Block.box(0, 10, 4, 16, 11.5, 6)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(0, 11, 5, 16, 13, 7),
            Block.box(0, 13, 5.75, 16, 15, 7.75),
            Block.box(0, 15, 6.5, 16, 16.5, 8.5)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(3, 1, 2, 5, 2, 4),
            Block.box(3, 2, 2.5, 5, 3, 4.5),
            Block.box(3, 3, 3, 5, 4, 5),
            Block.box(3, 4, 3.5, 5, 5, 5.5),
            Block.box(3, 5, 3.8000000000000007, 5, 6, 5.800000000000001),
            Block.box(3, 6, 4.199999999999999, 5, 7, 6.199999999999999),
            Block.box(3, 7, 4.6, 5, 8, 6.6),
            Block.box(3, 8, 5, 5, 9, 7),
            Block.box(3, 9, 5.4, 5, 10, 7.4),
            Block.box(3, 10, 5.800000000000001, 5, 11, 7.800000000000001),
            Block.box(3, 11, 6.199999999999999, 5, 12, 8.2),
            Block.box(3, 12, 6.6, 5, 13, 8.6),
            Block.box(3, 13, 7, 5, 14, 9)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(11, 1, 2, 13, 2, 4),
            Block.box(11, 2, 2.5, 13, 3, 4.5),
            Block.box(11, 3, 3, 13, 4, 5),
            Block.box(11, 4, 3.5, 13, 5, 5.5),
            Block.box(11, 5, 3.8000000000000007, 13, 6, 5.800000000000001),
            Block.box(11, 6, 4.199999999999999, 13, 7, 6.199999999999999),
            Block.box(11, 7, 4.6, 13, 8, 6.6),
            Block.box(11, 8, 5, 13, 9, 7),
            Block.box(11, 9, 5.4, 13, 10, 7.4),
            Block.box(11, 10, 5.800000000000001, 13, 11, 7.800000000000001),
            Block.box(11, 11, 6.199999999999999, 13, 12, 8.2),
            Block.box(11, 12, 6.6, 13, 13, 8.6),
            Block.box(11, 13, 7, 13, 14, 9)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    private static final VoxelShape NORTH_SHAPE = Stream.of(Stream.of(
            Block.box(2, 14, 0, 14, 16, 2),
            Block.box(14, 0, 0, 16, 16, 2),
            Block.box(11, 14, 2, 13, 16, 8),
            Block.box(3, 14, 2, 5, 16, 8),
            Block.box(14, 0, 2, 16, 2, 15),
            Block.box(0, 0, 2, 2, 2, 15),
            Block.box(2, 0, 0, 14, 2, 2),
            Block.box(0, 0, 0, 2, 16, 2),
            Block.box(2, 0, 12, 14, 2, 14)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(0, 0, 14, 16, 2, 16),
            Block.box(0, 2, 13.5, 16, 4, 15.5),
            Block.box(0, 4, 12.5, 16, 6, 14.5),
            Block.box(0, 6, 11.75, 16, 8, 13.75),
            Block.box(0, 8, 10.75, 16, 10, 12.75),
            Block.box(0, 10, 10, 16, 11.5, 12)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(0, 11, 9, 16, 13, 11),
            Block.box(0, 13, 8.25, 16, 15, 10.25),
            Block.box(0, 15, 7.5, 16, 16.5, 9.5)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(11, 1, 12, 13, 2, 14),
            Block.box(11, 2, 11.5, 13, 3, 13.5),
            Block.box(11, 3, 11, 13, 4, 13),
            Block.box(11, 4, 10.5, 13, 5, 12.5),
            Block.box(11, 5, 10.2, 13, 6, 12.2),
            Block.box(11, 6, 9.8, 13, 7, 11.8),
            Block.box(11, 7, 9.4, 13, 8, 11.4),
            Block.box(11, 8, 9, 13, 9, 11),
            Block.box(11, 9, 8.6, 13, 10, 10.6),
            Block.box(11, 10, 8.2, 13, 11, 10.2),
            Block.box(11, 11, 7.800000000000001, 13, 12, 9.8),
            Block.box(11, 12, 7.4, 13, 13, 9.4),
            Block.box(11, 13, 7, 13, 14, 9)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(3, 1, 12, 5, 2, 14),
            Block.box(3, 2, 11.5, 5, 3, 13.5),
            Block.box(3, 3, 11, 5, 4, 13),
            Block.box(3, 4, 10.5, 5, 5, 12.5),
            Block.box(3, 5, 10.2, 5, 6, 12.2),
            Block.box(3, 6, 9.8, 5, 7, 11.8),
            Block.box(3, 7, 9.4, 5, 8, 11.4),
            Block.box(3, 8, 9, 5, 9, 11),
            Block.box(3, 9, 8.6, 5, 10, 10.6),
            Block.box(3, 10, 8.2, 5, 11, 10.2),
            Block.box(3, 11, 7.800000000000001, 5, 12, 9.8),
            Block.box(3, 12, 7.4, 5, 13, 9.4),
            Block.box(3, 13, 7, 5, 14, 9)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    private static final VoxelShape EAST_SHAPE = Stream.of(Stream.of(
            Block.box(14, 14, 2, 16, 16, 14),
            Block.box(14, 0, 14, 16, 16, 16),
            Block.box(8, 14, 11, 14, 16, 13),
            Block.box(8, 14, 3, 14, 16, 5),
            Block.box(1, 0, 14, 14, 2, 16),
            Block.box(1, 0, 0, 14, 2, 2),
            Block.box(14, 0, 2, 16, 2, 14),
            Block.box(14, 0, 0, 16, 16, 2),
            Block.box(2, 0, 2, 4, 2, 14)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(0, 0, 0, 2, 2, 16),
            Block.box(0.5, 2, 0, 2.5, 4, 16),
            Block.box(1.5, 4, 0, 3.5, 6, 16),
            Block.box(2.25, 6, 0, 4.25, 8, 16),
            Block.box(3.25, 8, 0, 5.25, 10, 16),
            Block.box(4, 10, 0, 6, 11.5, 16)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(5, 11, 0, 7, 13, 16),
            Block.box(5.75, 13, 0, 7.75, 15, 16),
            Block.box(6.5, 15, 0, 8.5, 16.5, 16)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(2, 1, 11, 4, 2, 13),
            Block.box(2.5, 2, 11, 4.5, 3, 13),
            Block.box(3, 3, 11, 5, 4, 13),
            Block.box(3.5, 4, 11, 5.5, 5, 13),
            Block.box(3.8000000000000007, 5, 11, 5.800000000000001, 6, 13),
            Block.box(4.199999999999999, 6, 11, 6.199999999999999, 7, 13),
            Block.box(4.6, 7, 11, 6.6, 8, 13),
            Block.box(5, 8, 11, 7, 9, 13),
            Block.box(5.4, 9, 11, 7.4, 10, 13),
            Block.box(5.800000000000001, 10, 11, 7.800000000000001, 11, 13),
            Block.box(6.199999999999999, 11, 11, 8.2, 12, 13),
            Block.box(6.6, 12, 11, 8.6, 13, 13),
            Block.box(7, 13, 11, 9, 14, 13)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(2, 1, 3, 4, 2, 5),
            Block.box(2.5, 2, 3, 4.5, 3, 5),
            Block.box(3, 3, 3, 5, 4, 5),
            Block.box(3.5, 4, 3, 5.5, 5, 5),
            Block.box(3.8000000000000007, 5, 3, 5.800000000000001, 6, 5),
            Block.box(4.199999999999999, 6, 3, 6.199999999999999, 7, 5),
            Block.box(4.6, 7, 3, 6.6, 8, 5),
            Block.box(5, 8, 3, 7, 9, 5),
            Block.box(5.4, 9, 3, 7.4, 10, 5),
            Block.box(5.800000000000001, 10, 3, 7.800000000000001, 11, 5),
            Block.box(6.199999999999999, 11, 3, 8.2, 12, 5),
            Block.box(6.6, 12, 3, 8.6, 13, 5),
            Block.box(7, 13, 3, 9, 14, 5)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    private static final VoxelShape WEST_SHAPE = Stream.of(Stream.of(
            Block.box(0, 14, 2, 2, 16, 14),
            Block.box(0, 0, 0, 2, 16, 2),
            Block.box(2, 14, 3, 8, 16, 5),
            Block.box(2, 14, 11, 8, 16, 13),
            Block.box(2, 0, 0, 15, 2, 2),
            Block.box(2, 0, 14, 15, 2, 16),
            Block.box(0, 0, 2, 2, 2, 14),
            Block.box(0, 0, 14, 2, 16, 16),
            Block.box(12, 0, 2, 14, 2, 14)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(14, 0, 0, 16, 2, 16),
            Block.box(13.5, 2, 0, 15.5, 4, 16),
            Block.box(12.5, 4, 0, 14.5, 6, 16),
            Block.box(11.75, 6, 0, 13.75, 8, 16),
            Block.box(10.75, 8, 0, 12.75, 10, 16),
            Block.box(10, 10, 0, 12, 11.5, 16)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(9, 11, 0, 11, 13, 16),
            Block.box(8.25, 13, 0, 10.25, 15, 16),
            Block.box(7.5, 15, 0, 9.5, 16.5, 16)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(12, 1, 3, 14, 2, 5),
            Block.box(11.5, 2, 3, 13.5, 3, 5),
            Block.box(11, 3, 3, 13, 4, 5),
            Block.box(10.5, 4, 3, 12.5, 5, 5),
            Block.box(10.2, 5, 3, 12.2, 6, 5),
            Block.box(9.8, 6, 3, 11.8, 7, 5),
            Block.box(9.4, 7, 3, 11.4, 8, 5),
            Block.box(9, 8, 3, 11, 9, 5),
            Block.box(8.6, 9, 3, 10.6, 10, 5),
            Block.box(8.2, 10, 3, 10.2, 11, 5),
            Block.box(7.800000000000001, 11, 3, 9.8, 12, 5),
            Block.box(7.4, 12, 3, 9.4, 13, 5),
            Block.box(7, 13, 3, 9, 14, 5)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(12, 1, 11, 14, 2, 13),
            Block.box(11.5, 2, 11, 13.5, 3, 13),
            Block.box(11, 3, 11, 13, 4, 13),
            Block.box(10.5, 4, 11, 12.5, 5, 13),
            Block.box(10.2, 5, 11, 12.2, 6, 13),
            Block.box(9.8, 6, 11, 11.8, 7, 13),
            Block.box(9.4, 7, 11, 11.4, 8, 13),
            Block.box(9, 8, 11, 11, 9, 13),
            Block.box(8.6, 9, 11, 10.6, 10, 13),
            Block.box(8.2, 10, 11, 10.2, 11, 13),
            Block.box(7.800000000000001, 11, 11, 9.8, 12, 13),
            Block.box(7.4, 12, 11, 9.4, 13, 13),
            Block.box(7, 13, 11, 9, 14, 13)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    public static final VoxelShape INNER_WEST_SHAPE = Stream.of(
        Stream.of(
            Block.box(0, 0, 14, 2, 16, 16),
            Block.box(3, 14, 11, 8, 16, 13),
            Block.box(0, 0, 1, 2, 2, 14),
            Block.box(2, 0, 14, 15, 2, 16),
            Block.box(2, 0, 2, 14, 2, 4),
            Block.box(12, 0, 2, 14, 2, 14),
            Block.box(3, 14, 8, 5, 16, 13)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(0.5, 14, 14, 1.5, 16, 15.7),
            Block.box(1.5, 14, 13, 2.5, 16, 15),
            Block.box(2.5, 14, 12, 3.5, 16, 14)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Stream.of(
                Block.box(0, 0, 0, 16, 2, 1.7),
                Block.box(0, 2, 0.8, 16, 4, 2.5),
                Block.box(0, 4, 1.5999999999999999, 16, 6, 3.3),
                Block.box(0, 6, 2.3999999999999995, 16, 8, 4.1),
                Block.box(0, 8, 3, 16, 8.5, 4.7)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Shapes.join(Block.box(0, 8.5, 3.3999999999999995, 13, 10.5, 5.1), Block.box(0, 10.5, 3.8, 13, 11.3, 5.5), BooleanOp.OR),
            Stream.of(
                Block.box(0, 11.5, 4.8, 11, 12.5, 6.5),
                Block.box(0, 12.5, 5.2, 11, 13.5, 6.9),
                Block.box(0, 13.5, 5.6, 11, 14.5, 7.3)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Shapes.join(Block.box(0, 14.5, 6.1, 10, 15.5, 7.8), Block.box(0, 15.5, 6.6000000000000005, 10, 16.5, 8.3), BooleanOp.OR)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Stream.of(
                Block.box(14.3, 0, 0, 16, 2, 16),
                Block.box(13.5, 2, 0, 15.2, 4, 16),
                Block.box(12.7, 4, 0, 14.399999999999999, 6, 16),
                Block.box(11.900000000000002, 6, 0, 13.600000000000001, 8, 16),
                Block.box(11.3, 8, 0, 13, 8.5, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Shapes.join(Block.box(10.900000000000002, 8.5, 3, 12.600000000000001, 10.5, 16), Block.box(10.5, 10.5, 3, 12.2, 11.3, 16), BooleanOp.OR),
            Stream.of(
                Block.box(9.5, 11.5, 5, 11.2, 12.5, 16),
                Block.box(9.100000000000001, 12.5, 5, 10.8, 13.5, 16),
                Block.box(8.7, 13.5, 5, 10.399999999999999, 14.5, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Shapes.join(Block.box(8.2, 14.5, 6, 9.899999999999999, 15.5, 16), Block.box(7.699999999999998, 15.5, 6, 9.399999999999999, 16.5, 16), BooleanOp.OR)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(3, 1, 2, 5, 2, 4),
            Block.box(3, 2, 2.5, 5, 3, 4.5),
            Block.box(3, 3, 3, 5, 4, 5),
            Block.box(3, 4, 3.3, 5, 5, 5.3),
            Block.box(3, 5, 3.8, 5, 6, 5.8),
            Block.box(3, 6, 4.2, 5, 7, 6.2),
            Block.box(3, 7, 4.5, 5, 8, 6.5),
            Block.box(3, 8, 5, 5, 9, 7),
            Block.box(3, 9, 5.4, 5, 10, 7.4),
            Block.box(3, 10, 5.8, 5, 11, 7.8),
            Block.box(3, 11, 6.199999999999999, 5, 12, 8.2),
            Block.box(3, 12, 6.6, 5, 13, 8.6),
            Block.box(3, 13, 7, 5, 14, 9),
            Block.box(3, 14, 7.4, 5, 15, 9.4),
            Block.box(3, 15, 7.800000000000001, 5, 16, 9.8)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(12, 1, 11, 14, 2, 13),
            Block.box(11.5, 2, 11, 13.5, 3, 13),
            Block.box(11, 3, 11, 13, 4, 13),
            Block.box(10.7, 4, 11, 12.7, 5, 13),
            Block.box(10.2, 5, 11, 12.2, 6, 13),
            Block.box(9.8, 6, 11, 11.8, 7, 13),
            Block.box(9.5, 7, 11, 11.5, 8, 13),
            Block.box(9, 8, 11, 11, 9, 13),
            Block.box(8.6, 9, 11, 10.6, 10, 13),
            Block.box(8.2, 10, 11, 10.2, 11, 13),
            Block.box(7.800000000000001, 11, 11, 9.8, 12, 13),
            Block.box(7.4, 12, 11, 9.4, 13, 13),
            Block.box(7, 13, 11, 9, 14, 13),
            Block.box(6.6, 14, 11, 8.6, 15, 13),
            Block.box(6.199999999999999, 15, 11, 8.2, 16, 13)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    public static final VoxelShape INNER_EAST_SHAPE = Stream.of(
        Stream.of(
            Block.box(14, 0, 0, 16, 16, 2),
            Block.box(8, 14, 3, 13, 16, 5),
            Block.box(14, 0, 2, 16, 2, 15),
            Block.box(1, 0, 0, 14, 2, 2),
            Block.box(2, 0, 12, 14, 2, 14),
            Block.box(2, 0, 2, 4, 2, 14),
            Block.box(11, 14, 3, 13, 16, 8)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(14.5, 14, 0.3000000000000007, 15.5, 16, 2),
            Block.box(13.5, 14, 1, 14.5, 16, 3),
            Block.box(12.5, 14, 2, 13.5, 16, 4)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Stream.of(
                Block.box(0, 0, 14.3, 16, 2, 16),
                Block.box(0, 2, 13.5, 16, 4, 15.2),
                Block.box(0, 4, 12.7, 16, 6, 14.4),
                Block.box(0, 6, 11.9, 16, 8, 13.600000000000001),
                Block.box(0, 8, 11.3, 16, 8.5, 13)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Shapes.join(Block.box(3, 8.5, 10.9, 16, 10.5, 12.600000000000001), Block.box(3, 10.5, 10.5, 16, 11.3, 12.2), BooleanOp.OR),
            Stream.of(
                Block.box(5, 11.5, 9.5, 16, 12.5, 11.2),
                Block.box(5, 12.5, 9.1, 16, 13.5, 10.8),
                Block.box(5, 13.5, 8.7, 16, 14.5, 10.4)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Shapes.join(Block.box(6, 14.5, 8.2, 16, 15.5, 9.9), Block.box(6, 15.5, 7.699999999999999, 16, 16.5, 9.399999999999999), BooleanOp.OR)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Stream.of(
                Block.box(0, 0, 0, 1.6999999999999993, 2, 16),
                Block.box(0.8000000000000007, 2, 0, 2.5, 4, 16),
                Block.box(1.6000000000000014, 4, 0, 3.3000000000000007, 6, 16),
                Block.box(2.3999999999999986, 6, 0, 4.099999999999998, 8, 16),
                Block.box(3, 8, 0, 4.699999999999999, 8.5, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Shapes.join(Block.box(3.3999999999999986, 8.5, 0, 5.099999999999998, 10.5, 13), Block.box(3.8000000000000007, 10.5, 0, 5.5, 11.3, 13), BooleanOp.OR),
            Stream.of(
                Block.box(4.800000000000001, 11.5, 0, 6.5, 12.5, 11),
                Block.box(5.199999999999999, 12.5, 0, 6.899999999999999, 13.5, 11),
                Block.box(5.600000000000001, 13.5, 0, 7.300000000000001, 14.5, 11)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Shapes.join(Block.box(6.100000000000001, 14.5, 0, 7.800000000000001, 15.5, 10), Block.box(6.600000000000001, 15.5, 0, 8.3, 16.5, 10), BooleanOp.OR)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(11, 1, 12, 13, 2, 14),
            Block.box(11, 2, 11.5, 13, 3, 13.5),
            Block.box(11, 3, 11, 13, 4, 13),
            Block.box(11, 4, 10.7, 13, 5, 12.7),
            Block.box(11, 5, 10.2, 13, 6, 12.2),
            Block.box(11, 6, 9.8, 13, 7, 11.8),
            Block.box(11, 7, 9.5, 13, 8, 11.5),
            Block.box(11, 8, 9, 13, 9, 11),
            Block.box(11, 9, 8.6, 13, 10, 10.6),
            Block.box(11, 10, 8.2, 13, 11, 10.2),
            Block.box(11, 11, 7.800000000000001, 13, 12, 9.8),
            Block.box(11, 12, 7.4, 13, 13, 9.4),
            Block.box(11, 13, 7, 13, 14, 9),
            Block.box(11, 14, 6.6, 13, 15, 8.6),
            Block.box(11, 15, 6.199999999999999, 13, 16, 8.2)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(2, 1, 3, 4, 2, 5),
            Block.box(2.5, 2, 3, 4.5, 3, 5),
            Block.box(3, 3, 3, 5, 4, 5),
            Block.box(3.3000000000000007, 4, 3, 5.300000000000001, 5, 5),
            Block.box(3.8000000000000007, 5, 3, 5.800000000000001, 6, 5),
            Block.box(4.199999999999999, 6, 3, 6.199999999999999, 7, 5),
            Block.box(4.5, 7, 3, 6.5, 8, 5),
            Block.box(5, 8, 3, 7, 9, 5),
            Block.box(5.4, 9, 3, 7.4, 10, 5),
            Block.box(5.800000000000001, 10, 3, 7.800000000000001, 11, 5),
            Block.box(6.199999999999999, 11, 3, 8.2, 12, 5),
            Block.box(6.6, 12, 3, 8.6, 13, 5),
            Block.box(7, 13, 3, 9, 14, 5),
            Block.box(7.4, 14, 3, 9.4, 15, 5),
            Block.box(7.800000000000001, 15, 3, 9.8, 16, 5)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape INNER_NORTH_SHAPE = Stream.of(
        Stream.of(
            Block.box(0, 0, 0, 2, 16, 2),
            Block.box(3, 14, 3, 5, 16, 8),
            Block.box(2, 0, 0, 15, 2, 2),
            Block.box(0, 0, 2, 2, 2, 15),
            Block.box(12, 0, 2, 14, 2, 14),
            Block.box(2, 0, 12, 14, 2, 14),
            Block.box(3, 14, 3, 8, 16, 5)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(0.3000000000000007, 14, 0.5, 2, 16, 1.5),
            Block.box(1, 14, 1.5, 3, 16, 2.5),
            Block.box(2, 14, 2.5, 4, 16, 3.5)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Stream.of(
                Block.box(14.3, 0, 0, 16, 2, 16),
                Block.box(13.5, 2, 0, 15.2, 4, 16),
                Block.box(12.7, 4, 0, 14.4, 6, 16),
                Block.box(11.9, 6, 0, 13.600000000000001, 8, 16),
                Block.box(11.3, 8, 0, 13, 8.5, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Shapes.join(Block.box(10.9, 8.5, 0, 12.600000000000001, 10.5, 13), Block.box(10.5, 10.5, 0, 12.2, 11.3, 13), BooleanOp.OR),
            Stream.of(
                Block.box(9.5, 11.5, 0, 11.2, 12.5, 11),
                Block.box(9.1, 12.5, 0, 10.8, 13.5, 11),
                Block.box(8.7, 13.5, 0, 10.4, 14.5, 11)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Shapes.join(Block.box(8.2, 14.5, 0, 9.9, 15.5, 10), Block.box(7.699999999999999, 15.5, 0, 9.399999999999999, 16.5, 10), BooleanOp.OR)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Stream.of(
                Block.box(0, 0, 14.3, 16, 2, 16),
                Block.box(0, 2, 13.5, 16, 4, 15.2),
                Block.box(0, 4, 12.7, 16, 6, 14.399999999999999),
                Block.box(0, 6, 11.900000000000002, 16, 8, 13.600000000000001),
                Block.box(0, 8, 11.3, 16, 8.5, 13)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Shapes.join(Block.box(0, 8.5, 10.900000000000002, 13, 10.5, 12.600000000000001), Block.box(0, 10.5, 10.5, 13, 11.3, 12.2), BooleanOp.OR),
            Stream.of(
                Block.box(0, 11.5, 9.5, 11, 12.5, 11.2),
                Block.box(0, 12.5, 9.100000000000001, 11, 13.5, 10.8),
                Block.box(0, 13.5, 8.7, 11, 14.5, 10.399999999999999)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Shapes.join(Block.box(0, 14.5, 8.2, 10, 15.5, 9.899999999999999), Block.box(0, 15.5, 7.699999999999999, 10, 16.5, 9.399999999999999), BooleanOp.OR)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(12, 1, 3, 14, 2, 5),
            Block.box(11.5, 2, 3, 13.5, 3, 5),
            Block.box(11, 3, 3, 13, 4, 5),
            Block.box(10.7, 4, 3, 12.7, 5, 5),
            Block.box(10.2, 5, 3, 12.2, 6, 5),
            Block.box(9.8, 6, 3, 11.8, 7, 5),
            Block.box(9.5, 7, 3, 11.5, 8, 5),
            Block.box(9, 8, 3, 11, 9, 5),
            Block.box(8.6, 9, 3, 10.6, 10, 5),
            Block.box(8.2, 10, 3, 10.2, 11, 5),
            Block.box(7.800000000000001, 11, 3, 9.8, 12, 5),
            Block.box(7.4, 12, 3, 9.4, 13, 5),
            Block.box(7, 13, 3, 9, 14, 5),
            Block.box(6.6, 14, 3, 8.6, 15, 5),
            Block.box(6.199999999999999, 15, 3, 8.2, 16, 5)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(3, 1, 12, 5, 2, 14),
            Block.box(3, 2, 11.5, 5, 3, 13.5),
            Block.box(3, 3, 11, 5, 4, 13),
            Block.box(3, 4, 10.7, 5, 5, 12.7),
            Block.box(3, 5, 10.2, 5, 6, 12.2),
            Block.box(3, 6, 9.8, 5, 7, 11.8),
            Block.box(3, 7, 9.5, 5, 8, 11.5),
            Block.box(3, 8, 9, 5, 9, 11),
            Block.box(3, 9, 8.6, 5, 10, 10.6),
            Block.box(3, 10, 8.2, 5, 11, 10.2),
            Block.box(3, 11, 7.800000000000001, 5, 12, 9.8),
            Block.box(3, 12, 7.4, 5, 13, 9.4),
            Block.box(3, 13, 7, 5, 14, 9),
            Block.box(3, 14, 6.6, 5, 15, 8.6),
            Block.box(3, 15, 6.199999999999999, 5, 16, 8.2)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    private static final VoxelShape INNER_SOUTH_SHAPE = Stream.of(
        Stream.of(
            Block.box(14, 0, 14, 16, 16, 16),
            Block.box(11, 14, 8, 13, 16, 13),
            Block.box(1, 0, 14, 14, 2, 16),
            Block.box(14, 0, 1, 16, 2, 14),
            Block.box(2, 0, 2, 4, 2, 14),
            Block.box(2, 0, 2, 14, 2, 4),
            Block.box(8, 14, 11, 13, 16, 13)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(14, 14, 14.5, 15.7, 16, 15.5),
            Block.box(13, 14, 13.5, 15, 16, 14.5),
            Block.box(12, 14, 12.5, 14, 16, 13.5)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Stream.of(
                Block.box(0, 0, 0, 1.6999999999999993, 2, 16),
                Block.box(0.8000000000000007, 2, 0, 2.5, 4, 16),
                Block.box(1.5999999999999996, 4, 0, 3.3000000000000007, 6, 16),
                Block.box(2.3999999999999986, 6, 0, 4.1, 8, 16),
                Block.box(3, 8, 0, 4.699999999999999, 8.5, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Shapes.join(Block.box(3.3999999999999986, 8.5, 3, 5.1, 10.5, 16), Block.box(3.8000000000000007, 10.5, 3, 5.5, 11.3, 16), BooleanOp.OR),
            Stream.of(
                Block.box(4.800000000000001, 11.5, 5, 6.5, 12.5, 16),
                Block.box(5.199999999999999, 12.5, 5, 6.9, 13.5, 16),
                Block.box(5.6, 13.5, 5, 7.300000000000001, 14.5, 16)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Shapes.join(Block.box(6.1, 14.5, 6, 7.800000000000001, 15.5, 16), Block.box(6.600000000000001, 15.5, 6, 8.3, 16.5, 16), BooleanOp.OR)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Stream.of(
                Block.box(0, 0, 0, 16, 2, 1.6999999999999993),
                Block.box(0, 2, 0.8000000000000007, 16, 4, 2.5),
                Block.box(0, 4, 1.6000000000000014, 16, 6, 3.3000000000000007),
                Block.box(0, 6, 2.3999999999999986, 16, 8, 4.099999999999998),
                Block.box(0, 8, 3, 16, 8.5, 4.699999999999999)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Shapes.join(Block.box(3, 8.5, 3.3999999999999986, 16, 10.5, 5.099999999999998), Block.box(3, 10.5, 3.8000000000000007, 16, 11.3, 5.5), BooleanOp.OR),
            Stream.of(
                Block.box(5, 11.5, 4.800000000000001, 16, 12.5, 6.5),
                Block.box(5, 12.5, 5.199999999999999, 16, 13.5, 6.899999999999999),
                Block.box(5, 13.5, 5.600000000000001, 16, 14.5, 7.300000000000001)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
            Shapes.join(Block.box(6, 14.5, 6.100000000000001, 16, 15.5, 7.800000000000001), Block.box(6, 15.5, 6.600000000000001, 16, 16.5, 8.3), BooleanOp.OR)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(2, 1, 11, 4, 2, 13),
            Block.box(2.5, 2, 11, 4.5, 3, 13),
            Block.box(3, 3, 11, 5, 4, 13),
            Block.box(3.3000000000000007, 4, 11, 5.300000000000001, 5, 13),
            Block.box(3.8000000000000007, 5, 11, 5.800000000000001, 6, 13),
            Block.box(4.199999999999999, 6, 11, 6.199999999999999, 7, 13),
            Block.box(4.5, 7, 11, 6.5, 8, 13),
            Block.box(5, 8, 11, 7, 9, 13),
            Block.box(5.4, 9, 11, 7.4, 10, 13),
            Block.box(5.800000000000001, 10, 11, 7.800000000000001, 11, 13),
            Block.box(6.199999999999999, 11, 11, 8.2, 12, 13),
            Block.box(6.6, 12, 11, 8.6, 13, 13),
            Block.box(7, 13, 11, 9, 14, 13),
            Block.box(7.4, 14, 11, 9.4, 15, 13),
            Block.box(7.800000000000001, 15, 11, 9.8, 16, 13)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(11, 1, 2, 13, 2, 4),
            Block.box(11, 2, 2.5, 13, 3, 4.5),
            Block.box(11, 3, 3, 13, 4, 5),
            Block.box(11, 4, 3.3000000000000007, 13, 5, 5.300000000000001),
            Block.box(11, 5, 3.8000000000000007, 13, 6, 5.800000000000001),
            Block.box(11, 6, 4.199999999999999, 13, 7, 6.199999999999999),
            Block.box(11, 7, 4.5, 13, 8, 6.5),
            Block.box(11, 8, 5, 13, 9, 7),
            Block.box(11, 9, 5.4, 13, 10, 7.4),
            Block.box(11, 10, 5.800000000000001, 13, 11, 7.800000000000001),
            Block.box(11, 11, 6.199999999999999, 13, 12, 8.2),
            Block.box(11, 12, 6.6, 13, 13, 8.6),
            Block.box(11, 13, 7, 13, 14, 9),
            Block.box(11, 14, 7.4, 13, 15, 9.4),
            Block.box(11, 15, 7.800000000000001, 13, 16, 9.8)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape OUTER_SOUTH_SHAPE = Stream.of(
        Stream.of(
            Block.box(2, 14, 14, 14, 16, 16),
            Block.box(14, 14, 2, 16, 16, 14),
            Block.box(0, 0, 14, 2, 16, 16),
            Block.box(14, 0, 0, 16, 16, 2),
            Block.box(3, 14, 8, 5, 16, 14),
            Block.box(8, 14, 3, 14, 16, 5),
            Block.box(1, 0, 2, 3, 2, 14),
            Block.box(14, 0, 2, 16, 2, 14),
            Block.box(2, 0, 14, 14, 2, 16),
            Block.box(14, 0, 14, 16, 16, 16),
            Block.box(2, 0, 1, 14, 2, 3)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(0, 0, 0, 1.6, 2, 7),
            Block.box(0.8000000000000003, 2, 0, 2.4000000000000004, 4, 7),
            Block.box(1.6, 4, 0, 3.2, 6, 7),
            Block.box(2.4, 6, 0, 4, 8, 7),
            Block.box(3.2000000000000006, 8, 0, 4.800000000000001, 10, 7),
            Block.box(3.8000000000000003, 10, 0, 5.4, 11.3, 7)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(0, 0, 0, 7, 2, 1.6),
            Block.box(0, 2, 0.8000000000000003, 7, 4, 2.4000000000000004),
            Block.box(0, 4, 1.6, 7, 6, 3.2),
            Block.box(0, 6, 2.4, 7, 8, 4),
            Block.box(0, 8, 3.2000000000000006, 7, 10, 4.800000000000001),
            Block.box(0, 10, 3.8000000000000003, 7, 11.3, 5.4)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(0, 11, 4.7, 6, 12, 7),
            Block.box(0, 12, 5.1, 6, 13, 7.3999999999999995),
            Block.box(0, 13, 5.5, 6, 14, 7.8),
            Block.box(0, 13, 5.5, 6, 14, 7.8),
            Block.box(0, 14, 5.9, 6, 15, 8.2),
            Block.box(0, 15, 6.3, 7, 16, 8.6),
            Block.box(0, 16, 6.3, 7, 16.7, 8.6)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(4.7, 11, 0, 7, 12, 6),
            Block.box(5.1, 12, 0, 7.3999999999999995, 13, 6),
            Block.box(5.5, 13, 0, 7.8, 14, 6),
            Block.box(5.5, 13, 0, 7.8, 14, 6),
            Block.box(5.9, 14, 0, 8.2, 15, 6),
            Block.box(6.3, 15, 0, 8.6, 16, 7),
            Block.box(6.3, 16, 0, 8.6, 16.7, 7)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(3, 1, 2, 5, 2, 4),
            Block.box(3, 2, 2.5, 5, 3, 4.5),
            Block.box(3, 3, 2.9000000000000004, 5, 4, 4.9),
            Block.box(3, 4, 3, 5, 5, 5),
            Block.box(3, 5, 3.5999999999999996, 5, 6, 5.6),
            Block.box(3, 6, 4, 5, 7, 6),
            Block.box(3, 7, 4.5, 5, 8, 6.5),
            Block.box(3, 8, 5, 5, 9, 7),
            Block.box(3, 9, 5.4, 5, 10, 7.4),
            Block.box(3, 10, 5.8, 5, 11, 7.8),
            Block.box(3, 11, 6.199999999999999, 5, 12, 8.2),
            Block.box(3, 12, 6.6, 5, 13, 8.6),
            Block.box(3, 13, 7, 5, 14, 9),
            Block.box(3, 14, 7.4, 5, 15, 9.4),
            Block.box(3, 15, 7.800000000000001, 5, 16, 9.8)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(2, 1, 3, 4, 2, 5),
            Block.box(2.5, 2, 3, 4.5, 3, 5),
            Block.box(2.9000000000000004, 3, 3, 4.9, 4, 5),
            Block.box(3, 4, 3, 5, 5, 5),
            Block.box(3.5999999999999996, 5, 3, 5.6, 6, 5),
            Block.box(4, 6, 3, 6, 7, 5),
            Block.box(4.5, 7, 3, 6.5, 8, 5),
            Block.box(5, 8, 3, 7, 9, 5),
            Block.box(5.4, 9, 3, 7.4, 10, 5),
            Block.box(5.8, 10, 3, 7.8, 11, 5),
            Block.box(6.199999999999999, 11, 3, 8.2, 12, 5),
            Block.box(6.6, 12, 3, 8.6, 13, 5),
            Block.box(7, 13, 3, 9, 14, 5),
            Block.box(7.4, 14, 3, 9.4, 15, 5),
            Block.box(7.800000000000001, 15, 3, 9.8, 16, 5)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    private static final VoxelShape OUTER_NORTH_SHAPE = Stream.of(
        Stream.of(
            Block.box(2, 14, 0, 14, 16, 2),
            Block.box(0, 14, 2, 2, 16, 14),
            Block.box(14, 0, 0, 16, 16, 2),
            Block.box(0, 0, 14, 2, 16, 16),
            Block.box(11, 14, 2, 13, 16, 8),
            Block.box(2, 14, 11, 8, 16, 13),
            Block.box(13, 0, 2, 15, 2, 14),
            Block.box(0, 0, 2, 2, 2, 14),
            Block.box(2, 0, 0, 14, 2, 2),
            Block.box(0, 0, 0, 2, 16, 2),
            Block.box(2, 0, 13, 14, 2, 15)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(14.4, 0, 9, 16, 2, 16),
            Block.box(13.6, 2, 9, 15.2, 4, 16),
            Block.box(12.8, 4, 9, 14.4, 6, 16),
            Block.box(12, 6, 9, 13.6, 8, 16),
            Block.box(11.2, 8, 9, 12.799999999999999, 10, 16),
            Block.box(10.6, 10, 9, 12.2, 11.3, 16)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(9, 0, 14.4, 16, 2, 16),
            Block.box(9, 2, 13.6, 16, 4, 15.2),
            Block.box(9, 4, 12.8, 16, 6, 14.4),
            Block.box(9, 6, 12, 16, 8, 13.6),
            Block.box(9, 8, 11.2, 16, 10, 12.799999999999999),
            Block.box(9, 10, 10.6, 16, 11.3, 12.2)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(10, 11, 9, 16, 12, 11.3),
            Block.box(10, 12, 8.600000000000001, 16, 13, 10.9),
            Block.box(10, 13, 8.2, 16, 14, 10.5),
            Block.box(10, 13, 8.2, 16, 14, 10.5),
            Block.box(10, 14, 7.800000000000001, 16, 15, 10.1),
            Block.box(9, 15, 7.4, 16, 16, 9.7),
            Block.box(9, 16, 7.4, 16, 16.7, 9.7)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(9, 11, 10, 11.3, 12, 16),
            Block.box(8.600000000000001, 12, 10, 10.9, 13, 16),
            Block.box(8.2, 13, 10, 10.5, 14, 16),
            Block.box(8.2, 13, 10, 10.5, 14, 16),
            Block.box(7.800000000000001, 14, 10, 10.1, 15, 16),
            Block.box(7.4, 15, 9, 9.7, 16, 16),
            Block.box(7.4, 16, 9, 9.7, 16.7, 16)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(11, 1, 12, 13, 2, 14),
            Block.box(11, 2, 11.5, 13, 3, 13.5),
            Block.box(11, 3, 11.1, 13, 4, 13.1),
            Block.box(11, 4, 11, 13, 5, 13),
            Block.box(11, 5, 10.4, 13, 6, 12.4),
            Block.box(11, 6, 10, 13, 7, 12),
            Block.box(11, 7, 9.5, 13, 8, 11.5),
            Block.box(11, 8, 9, 13, 9, 11),
            Block.box(11, 9, 8.6, 13, 10, 10.6),
            Block.box(11, 10, 8.2, 13, 11, 10.2),
            Block.box(11, 11, 7.800000000000001, 13, 12, 9.8),
            Block.box(11, 12, 7.4, 13, 13, 9.4),
            Block.box(11, 13, 7, 13, 14, 9),
            Block.box(11, 14, 6.6, 13, 15, 8.6),
            Block.box(11, 15, 6.199999999999999, 13, 16, 8.2)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(12, 1, 11, 14, 2, 13),
            Block.box(11.5, 2, 11, 13.5, 3, 13),
            Block.box(11.1, 3, 11, 13.1, 4, 13),
            Block.box(11, 4, 11, 13, 5, 13),
            Block.box(10.4, 5, 11, 12.4, 6, 13),
            Block.box(10, 6, 11, 12, 7, 13),
            Block.box(9.5, 7, 11, 11.5, 8, 13),
            Block.box(9, 8, 11, 11, 9, 13),
            Block.box(8.6, 9, 11, 10.6, 10, 13),
            Block.box(8.2, 10, 11, 10.2, 11, 13),
            Block.box(7.800000000000001, 11, 11, 9.8, 12, 13),
            Block.box(7.4, 12, 11, 9.4, 13, 13),
            Block.box(7, 13, 11, 9, 14, 13),
            Block.box(6.6, 14, 11, 8.6, 15, 13),
            Block.box(6.199999999999999, 15, 11, 8.2, 16, 13)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    private static final VoxelShape OUTER_WEST_SHAPE = Stream.of(
        Stream.of(
            Block.box(0, 14, 2, 2, 16, 14),
            Block.box(2, 14, 14, 14, 16, 16),
            Block.box(0, 0, 0, 2, 16, 2),
            Block.box(14, 0, 14, 16, 16, 16),
            Block.box(2, 14, 3, 8, 16, 5),
            Block.box(11, 14, 8, 13, 16, 14),
            Block.box(2, 0, 1, 14, 2, 3),
            Block.box(2, 0, 14, 14, 2, 16),
            Block.box(0, 0, 2, 2, 2, 14),
            Block.box(0, 0, 14, 2, 16, 16),
            Block.box(13, 0, 2, 15, 2, 14)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(9, 0, 0, 16, 2, 1.5999999999999996),
            Block.box(9, 2, 0.8000000000000007, 16, 4, 2.4000000000000004),
            Block.box(9, 4, 1.5999999999999996, 16, 6, 3.1999999999999993),
            Block.box(9, 6, 2.4000000000000004, 16, 8, 4),
            Block.box(9, 8, 3.200000000000001, 16, 10, 4.800000000000001),
            Block.box(9, 10, 3.8000000000000007, 16, 11.3, 5.4)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(14.4, 0, 0, 16, 2, 7),
            Block.box(13.6, 2, 0, 15.2, 4, 7),
            Block.box(12.8, 4, 0, 14.4, 6, 7),
            Block.box(12, 6, 0, 13.6, 8, 7),
            Block.box(11.2, 8, 0, 12.799999999999999, 10, 7),
            Block.box(10.6, 10, 0, 12.2, 11.3, 7)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(9, 11, 0, 11.3, 12, 6),
            Block.box(8.600000000000001, 12, 0, 10.9, 13, 6),
            Block.box(8.2, 13, 0, 10.5, 14, 6),
            Block.box(8.2, 13, 0, 10.5, 14, 6),
            Block.box(7.800000000000001, 14, 0, 10.1, 15, 6),
            Block.box(7.4, 15, 0, 9.7, 16, 7),
            Block.box(7.4, 16, 0, 9.7, 16.7, 7)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(10, 11, 4.699999999999999, 16, 12, 7),
            Block.box(10, 12, 5.1, 16, 13, 7.399999999999999),
            Block.box(10, 13, 5.5, 16, 14, 7.800000000000001),
            Block.box(10, 13, 5.5, 16, 14, 7.800000000000001),
            Block.box(10, 14, 5.9, 16, 15, 8.2),
            Block.box(9, 15, 6.300000000000001, 16, 16, 8.6),
            Block.box(9, 16, 6.300000000000001, 16, 16.7, 8.6)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(12, 1, 3, 14, 2, 5),
            Block.box(11.5, 2, 3, 13.5, 3, 5),
            Block.box(11.1, 3, 3, 13.1, 4, 5),
            Block.box(11, 4, 3, 13, 5, 5),
            Block.box(10.4, 5, 3, 12.4, 6, 5),
            Block.box(10, 6, 3, 12, 7, 5),
            Block.box(9.5, 7, 3, 11.5, 8, 5),
            Block.box(9, 8, 3, 11, 9, 5),
            Block.box(8.6, 9, 3, 10.6, 10, 5),
            Block.box(8.2, 10, 3, 10.2, 11, 5),
            Block.box(7.800000000000001, 11, 3, 9.8, 12, 5),
            Block.box(7.4, 12, 3, 9.4, 13, 5),
            Block.box(7, 13, 3, 9, 14, 5),
            Block.box(6.6, 14, 3, 8.6, 15, 5),
            Block.box(6.199999999999999, 15, 3, 8.2, 16, 5)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(11, 1, 2, 13, 2, 4),
            Block.box(11, 2, 2.5, 13, 3, 4.5),
            Block.box(11, 3, 2.9000000000000004, 13, 4, 4.9),
            Block.box(11, 4, 3, 13, 5, 5),
            Block.box(11, 5, 3.5999999999999996, 13, 6, 5.6),
            Block.box(11, 6, 4, 13, 7, 6),
            Block.box(11, 7, 4.5, 13, 8, 6.5),
            Block.box(11, 8, 5, 13, 9, 7),
            Block.box(11, 9, 5.4, 13, 10, 7.4),
            Block.box(11, 10, 5.800000000000001, 13, 11, 7.800000000000001),
            Block.box(11, 11, 6.199999999999999, 13, 12, 8.2),
            Block.box(11, 12, 6.6, 13, 13, 8.6),
            Block.box(11, 13, 7, 13, 14, 9),
            Block.box(11, 14, 7.4, 13, 15, 9.4),
            Block.box(11, 15, 7.800000000000001, 13, 16, 9.8)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    private static final VoxelShape OUTER_EAST_SHAPE = Stream.of(
        Stream.of(
            Block.box(14, 14, 2, 16, 16, 14),
            Block.box(2, 14, 0, 14, 16, 2),
            Block.box(14, 0, 14, 16, 16, 16),
            Block.box(0, 0, 0, 2, 16, 2),
            Block.box(8, 14, 11, 14, 16, 13),
            Block.box(3, 14, 2, 5, 16, 8),
            Block.box(2, 0, 13, 14, 2, 15),
            Block.box(2, 0, 0, 14, 2, 2),
            Block.box(14, 0, 2, 16, 2, 14),
            Block.box(14, 0, 0, 16, 16, 2),
            Block.box(1, 0, 2, 3, 2, 14)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(0, 0, 14.4, 7, 2, 16),
            Block.box(0, 2, 13.6, 7, 4, 15.2),
            Block.box(0, 4, 12.8, 7, 6, 14.4),
            Block.box(0, 6, 12, 7, 8, 13.6),
            Block.box(0, 8, 11.2, 7, 10, 12.799999999999999),
            Block.box(0, 10, 10.6, 7, 11.3, 12.2)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(0, 0, 9, 1.5999999999999996, 2, 16),
            Block.box(0.8000000000000007, 2, 9, 2.4000000000000004, 4, 16),
            Block.box(1.5999999999999996, 4, 9, 3.1999999999999993, 6, 16),
            Block.box(2.4000000000000004, 6, 9, 4, 8, 16),
            Block.box(3.200000000000001, 8, 9, 4.800000000000001, 10, 16),
            Block.box(3.8000000000000007, 10, 9, 5.4, 11.3, 16)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(4.699999999999999, 11, 10, 7, 12, 16),
            Block.box(5.1, 12, 10, 7.399999999999999, 13, 16),
            Block.box(5.5, 13, 10, 7.800000000000001, 14, 16),
            Block.box(5.5, 13, 10, 7.800000000000001, 14, 16),
            Block.box(5.9, 14, 10, 8.2, 15, 16),
            Block.box(6.300000000000001, 15, 9, 8.6, 16, 16),
            Block.box(6.300000000000001, 16, 9, 8.6, 16.7, 16)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(0, 11, 9, 6, 12, 11.3),
            Block.box(0, 12, 8.600000000000001, 6, 13, 10.9),
            Block.box(0, 13, 8.2, 6, 14, 10.5),
            Block.box(0, 13, 8.2, 6, 14, 10.5),
            Block.box(0, 14, 7.800000000000001, 6, 15, 10.1),
            Block.box(0, 15, 7.4, 7, 16, 9.7),
            Block.box(0, 16, 7.4, 7, 16.7, 9.7)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(2, 1, 11, 4, 2, 13),
            Block.box(2.5, 2, 11, 4.5, 3, 13),
            Block.box(2.9000000000000004, 3, 11, 4.9, 4, 13),
            Block.box(3, 4, 11, 5, 5, 13),
            Block.box(3.5999999999999996, 5, 11, 5.6, 6, 13),
            Block.box(4, 6, 11, 6, 7, 13),
            Block.box(4.5, 7, 11, 6.5, 8, 13),
            Block.box(5, 8, 11, 7, 9, 13),
            Block.box(5.4, 9, 11, 7.4, 10, 13),
            Block.box(5.800000000000001, 10, 11, 7.800000000000001, 11, 13),
            Block.box(6.199999999999999, 11, 11, 8.2, 12, 13),
            Block.box(6.6, 12, 11, 8.6, 13, 13),
            Block.box(7, 13, 11, 9, 14, 13),
            Block.box(7.4, 14, 11, 9.4, 15, 13),
            Block.box(7.800000000000001, 15, 11, 9.8, 16, 13)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
        Stream.of(
            Block.box(3, 1, 12, 5, 2, 14),
            Block.box(3, 2, 11.5, 5, 3, 13.5),
            Block.box(3, 3, 11.1, 5, 4, 13.1),
            Block.box(3, 4, 11, 5, 5, 13),
            Block.box(3, 5, 10.4, 5, 6, 12.4),
            Block.box(3, 6, 10, 5, 7, 12),
            Block.box(3, 7, 9.5, 5, 8, 11.5),
            Block.box(3, 8, 9, 5, 9, 11),
            Block.box(3, 9, 8.6, 5, 10, 10.6),
            Block.box(3, 10, 8.2, 5, 11, 10.2),
            Block.box(3, 11, 7.800000000000001, 5, 12, 9.8),
            Block.box(3, 12, 7.4, 5, 13, 9.4),
            Block.box(3, 13, 7, 5, 14, 9),
            Block.box(3, 14, 6.6, 5, 15, 8.6),
            Block.box(3, 15, 6.199999999999999, 5, 16, 8.2)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get()
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();


    public LowerSteepRoofBlock(Block parentBlock) {
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
                    case EAST -> shape=OUTER_SOUTH_SHAPE;
                    case WEST -> shape=OUTER_NORTH_SHAPE;
                    case NORTH -> shape=OUTER_EAST_SHAPE;
                    case SOUTH -> shape=OUTER_WEST_SHAPE;
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
        return pState.getBlock() instanceof LowerSteepRoofBlock;
    }
}
