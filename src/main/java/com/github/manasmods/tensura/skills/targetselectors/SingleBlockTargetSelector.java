package com.github.manasmods.tensura.skills.targetselectors;

import com.github.manasmods.tensura.skills.SkillInstance;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import java.util.function.Consumer;

public class SingleBlockTargetSelector implements TargetSelector<BlockPos> {

    private final TargetSelectorExecutor<BlockPos> executor;
    private Consumer<PlayerInteractEvent.RightClickBlock> event;

    /**
     * The instance this executor is registered on
     */
    private SkillInstance instance;

    public SingleBlockTargetSelector(TargetSelectorExecutor<BlockPos> executor) {
        this.executor = executor;
    }

    public static SingleBlockTargetSelector create(TargetSelectorExecutor<BlockPos> executor) {
        return new SingleBlockTargetSelector(executor);
    }

    public void onRightClickBlock(PlayerInteractEvent.RightClickBlock e) {
        this.apply(e.getWorld(), e.getPos());
    }

    @Override
    public void apply(Level level, BlockPos entity) {
        this.executor.execute(level, this.instance, entity);
    }

    @Override
    public void register(SkillInstance instance) {
        this.event = this::onRightClickBlock;
        this.instance = instance;

        MinecraftForge.EVENT_BUS.addListener(this.event);
    }

    @Override
    public void unregister() {
        MinecraftForge.EVENT_BUS.unregister(this.event);
    }
}