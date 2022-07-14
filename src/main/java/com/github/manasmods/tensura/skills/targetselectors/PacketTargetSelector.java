package com.github.manasmods.tensura.skills.targetselectors;

import net.minecraft.world.level.Level;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.Event;

public class PacketTargetSelector<T> implements TargetSelector {

    private final TargetSelectorExecutor<T> executor;

    public PacketTargetSelector(TargetSelectorExecutor<T> executor) {
        this.executor = executor;
    }

    public static <T extends Event> PacketTargetSelector<T> create(TargetSelectorExecutor<T> executor) {
        return new PacketTargetSelector(executor);
    }

    public void onEvent(T e) {
        this.apply(null, e);
    }

    @Override
    public void apply(Level level, Object entity) {
        this.executor.execute(level, (T) entity);
    }

    @Override
    public void register() {
        //Register packet listener on network instance
    }

    @Override
    public void unregister() {

    }
}
