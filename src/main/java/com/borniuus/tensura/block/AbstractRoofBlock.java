package com.borniuus.tensura.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class AbstractRoofBlock extends Block {
    public static final EnumProperty<StairsShape> SHAPE_TYPE = BlockStateProperties.STAIRS_SHAPE;
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    private final BlockState parentBlock;

    public AbstractRoofBlock(Block parentBlock) {
        super(Properties.copy(parentBlock));
        this.parentBlock = parentBlock.defaultBlockState();
        registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(SHAPE_TYPE, StairsShape.STRAIGHT));
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return getShape(pState.getValue(FACING), pPos, pState);
    }

    protected abstract VoxelShape getShape(Direction direction, BlockPos pos, BlockState state);

    @Override
    public void animateTick(BlockState pState, Level pLevel, BlockPos pPos, Random pRandom) {
        this.parentBlock.getBlock().animateTick(pState, pLevel, pPos, pRandom);
    }

    @Override
    public void attack(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer) {
        this.parentBlock.attack(pLevel, pPos, pPlayer);
    }

    @Override
    public void destroy(LevelAccessor pLevel, BlockPos pPos, BlockState pState) {
        this.parentBlock.getBlock().destroy(pLevel, pPos, pState);
    }

    @Override
    public float getExplosionResistance(BlockState state, BlockGetter world, BlockPos pos, Explosion explosion) {
        return this.parentBlock.getExplosionResistance(world, pos, explosion);
    }

    @Override
    public void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pIsMoving) {
        if (!pState.is(pState.getBlock())) {
            this.parentBlock.neighborChanged(pLevel, pPos, Blocks.AIR, pPos, false);
            this.parentBlock.getBlock().onPlace(pState, pLevel, pPos, pOldState, false);
        }
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        if (!pState.is(pNewState.getBlock())) {
            this.parentBlock.getBlock().onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
        }
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        this.parentBlock.getBlock().stepOn(pLevel, pPos, pState, pEntity);
    }

    @Override
    public boolean isRandomlyTicking(BlockState pState) {
        return this.parentBlock.getBlock().isRandomlyTicking(pState);
    }

    @Override
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, Random pRandom) {
        this.parentBlock.getBlock().randomTick(pState, pLevel, pPos, pRandom);
    }

    @Override
    public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, Random pRandom) {
        this.parentBlock.getBlock().tick(pState, pLevel, pPos, pRandom);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        return this.parentBlock.use(pLevel, pPlayer, pHand, pHit);
    }

    @Override
    public void wasExploded(Level pLevel, BlockPos pPos, Explosion pExplosion) {
        this.parentBlock.getBlock().wasExploded(pLevel, pPos, pExplosion);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockPos blockpos = pContext.getClickedPos();
        BlockState blockstate = this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection());
        return blockstate.setValue(SHAPE_TYPE, getStairsShape(blockstate, pContext.getLevel(), blockpos));
    }

    @Override
    public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
        return pState.setValue(SHAPE_TYPE, getStairsShape(pState, pLevel, pCurrentPos));
    }

    private StairsShape getStairsShape(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        Direction direction = pState.getValue(FACING);
        BlockState blockstate = pLevel.getBlockState(pPos.relative(direction));
        if (isRoofBlock(blockstate)) {
            Direction direction1 = blockstate.getValue(FACING);
            if (direction1.getAxis() != pState.getValue(FACING).getAxis() && canTakeShape(pState, pLevel, pPos, direction1.getOpposite())) {
                if (direction1 == direction.getCounterClockWise()) {
                    return StairsShape.OUTER_LEFT;
                }

                return StairsShape.OUTER_RIGHT;
            }
        }

        BlockState blockstate1 = pLevel.getBlockState(pPos.relative(direction.getOpposite()));
        if (isRoofBlock(blockstate1)) {
            Direction direction2 = blockstate1.getValue(FACING);
            if (direction2.getAxis() != pState.getValue(FACING).getAxis() && canTakeShape(pState, pLevel, pPos, direction2)) {
                if (direction2 == direction.getCounterClockWise()) {
                    return StairsShape.INNER_LEFT;
                }

                return StairsShape.INNER_RIGHT;
            }
        }

        return StairsShape.STRAIGHT;
    }

    private boolean canTakeShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, Direction pFace) {
        BlockState blockstate = pLevel.getBlockState(pPos.relative(pFace));
        return !isRoofBlock(blockstate) || blockstate.getValue(FACING) != pState.getValue(FACING);
    }

    public abstract boolean isRoofBlock(BlockState pState);

    @Override
    public BlockState rotate(BlockState pState, Rotation pRot) {
        return pState.setValue(FACING, pRot.rotate(pState.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState pState, Mirror pMirror) {
        Direction direction = pState.getValue(FACING);
        StairsShape stairsshape = pState.getValue(SHAPE_TYPE);
        switch (pMirror) {
            case LEFT_RIGHT:
                if (direction.getAxis() == Direction.Axis.Z) {
                    return switch (stairsshape) {
                        case INNER_LEFT -> pState.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE_TYPE, StairsShape.INNER_RIGHT);
                        case INNER_RIGHT -> pState.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE_TYPE, StairsShape.INNER_LEFT);
                        case OUTER_LEFT -> pState.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE_TYPE, StairsShape.OUTER_RIGHT);
                        case OUTER_RIGHT -> pState.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE_TYPE, StairsShape.OUTER_LEFT);
                        default -> pState.rotate(Rotation.CLOCKWISE_180);
                    };
                }
                break;
            case FRONT_BACK:
                if (direction.getAxis() == Direction.Axis.X) {
                    return switch (stairsshape) {
                        case INNER_LEFT -> pState.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE_TYPE, StairsShape.INNER_LEFT);
                        case INNER_RIGHT -> pState.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE_TYPE, StairsShape.INNER_RIGHT);
                        case OUTER_LEFT -> pState.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE_TYPE, StairsShape.OUTER_RIGHT);
                        case OUTER_RIGHT -> pState.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE_TYPE, StairsShape.OUTER_LEFT);
                        case STRAIGHT -> pState.rotate(Rotation.CLOCKWISE_180);
                    };
                }
        }

        return super.mirror(pState, pMirror);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING, SHAPE_TYPE);
    }

    @Override
    public boolean isPathfindable(BlockState pState, BlockGetter pLevel, BlockPos pPos, PathComputationType pType) {
        return false;
    }
}
