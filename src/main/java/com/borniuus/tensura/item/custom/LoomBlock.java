package com.borniuus.tensura.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.LoomMenu;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;


public class LoomBlock extends net.minecraft.world.level.block.LoomBlock {
    private static final Component CONTAINER_TITLE = new TranslatableComponent("container.loom");

    public LoomBlock(Properties p_54777_) {
        super(p_54777_);
    }

    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        } else {
            player.openMenu(state.getMenuProvider(level, pos));
            player.awardStat(Stats.INTERACT_WITH_LOOM);
            return InteractionResult.CONSUME;
        }
    }

    public MenuProvider getMenuProvider(BlockState pState, Level pLevel, BlockPos pPos) {
        return new SimpleMenuProvider((p_54783_, p_54784_, p_54785_) -> {
            return new LoomMenu(p_54783_, p_54784_, ContainerLevelAccess.create(pLevel, pPos));
        }, CONTAINER_TITLE);


    }
}
