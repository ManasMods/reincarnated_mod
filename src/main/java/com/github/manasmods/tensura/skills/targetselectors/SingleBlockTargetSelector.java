package com.github.manasmods.tensura.skills.targetselectors;

import net.minecraft.world.level.Level;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import java.util.function.Consumer;

public class SingleBlockTargetSelector<BlockPos> implements TargetSelector {

    private final TargetSelectorExecutor<BlockPos> executor;
    private Consumer<PlayerInteractEvent.RightClickBlock> event;

    public SingleBlockTargetSelector(TargetSelectorExecutor<BlockPos> executor) {
        this.executor = executor;
    }

    public static <BlockState> SingleBlockTargetSelector<BlockState> create(TargetSelectorExecutor<BlockState> executor) {
        return new SingleBlockTargetSelector(executor);
    }

    public void onRightClickBlock(PlayerInteractEvent.RightClickBlock e) {
        this.apply(e.getWorld(), e.getPos());
    }

    @Override
    public void apply(Level level, Object entity) {
        this.executor.execute(level, (BlockPos)entity);
    }

    @Override
    public void register() {
        this.event = this::onRightClickBlock;

        MinecraftForge.EVENT_BUS.addListener(this.event);
    }

    @Override
    public void unregister() {
        MinecraftForge.EVENT_BUS.unregister(this.event);
    }
}
