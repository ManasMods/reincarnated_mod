package com.github.manasmods.tensura.skills.targetselectors;

import com.github.manasmods.tensura.skills.SkillInstance;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;

import java.util.function.Consumer;

public class SelfEventTargetSelector<T extends Event> implements TargetSelector {
    private final TargetSelectorExecutor<T> executor;
    private Consumer<T> event;

    /**
     * The instance this executor is registered on
     */
    private SkillInstance instance;

    public SelfEventTargetSelector(TargetSelectorExecutor<T> executor) {
        this.executor = executor;
    }

    public static <T extends Event> SelfEventTargetSelector<T> create(TargetSelectorExecutor<T> executor) {
        return new SelfEventTargetSelector(executor);
    }

    public void onEvent(T e) {
        this.apply(null, e);
    }

    @Override
    public void apply(Level level, Object entity) {
        this.executor.execute(level, this.instance, (T) entity);
    }

    @Override
    public void register(SkillInstance instance) {
        this.event = this::onEvent;
        MinecraftForge.EVENT_BUS.addListener(this.event);
    }

    @Override
    public void unregister() {
        MinecraftForge.EVENT_BUS.unregister(this.event);
    }
}
