package com.borniuus.tensura.block;

import com.borniuus.tensura.block.state.properties.SmithingBenchPart;
import com.borniuus.tensura.block.state.properties.TensuraBlockStateProperties;
import com.borniuus.tensura.item.templates.SimpleBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.Material;

import javax.annotation.Nullable;


public class SmithingBenchBlock extends SimpleBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final EnumProperty<SmithingBenchPart> PART = TensuraBlockStateProperties.SMITHING_BENCH_PART;

    public SmithingBenchBlock(Material material, BlockProperties properties) {
        super(material, properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(PART, SmithingBenchPart.BENCH));
    }


    @Override
    public void setPlacedBy(Level pLevel, BlockPos pPos, BlockState pState, @Nullable LivingEntity pPlacer, ItemStack pStack) {
        super.setPlacedBy(pLevel, pPos, pState, pPlacer, pStack);
        if (!pLevel.isClientSide) {
            BlockPos blockpos = pPos.relative(pState.getValue(FACING).getCounterClockWise());
            pLevel.setBlock(blockpos, pState.setValue(PART, SmithingBenchPart.ANVIL), 3);
            pLevel.blockUpdated(pPos, Blocks.AIR);
            pState.updateNeighbourShapes(pLevel, pPos, 3);
        }

    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING).add(PART);
    }

    @Override
    public void playerWillDestroy(Level pLevel, BlockPos pPos, BlockState pState, Player pPlayer) {
        if (!pLevel.isClientSide && pPlayer.isCreative()) {
            Direction direction = pState.getValue(FACING);
            BlockPos blockpos = getOtherPartPosition(pPos, direction, pState.getValue(PART));
            pLevel.setBlockAndUpdate(blockpos, Blocks.AIR.defaultBlockState());
        }

        super.playerWillDestroy(pLevel, pPos, pState, pPlayer);
    }

    private BlockPos getOtherPartPosition(BlockPos sourcePos, Direction direction, SmithingBenchPart part) {
        return part == SmithingBenchPart.BENCH ? sourcePos.relative(direction.getCounterClockWise()) : sourcePos.relative(direction.getClockWise());
    }
}