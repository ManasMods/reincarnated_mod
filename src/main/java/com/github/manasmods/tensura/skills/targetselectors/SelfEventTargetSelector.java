package com.github.manasmods.tensura.skills.targetselectors;

import com.github.manasmods.tensura.Tensura;
import com.github.manasmods.tensura.skills.SkillInstance;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.EventPriority;

import java.util.function.Consumer;

@CommonTargetSelector
public class SelfEventTargetSelector<T extends Event> implements TargetSelector {
    private final TargetSelectorExecutor<T> executor;
    private Consumer<T> event;
    private Class<T> eventType;

    /**
     * The instance this executor is registered on
     */
    private SkillInstance instance;

    public SelfEventTargetSelector(TargetSelectorExecutor<T> executor, Class<T> type) {
        this.executor = executor;
        this.eventType = type;
    }

    public static <T extends Event> SelfEventTargetSelector<T> create(TargetSelectorExecutor<T> executor, Class<T> type) {
        return new SelfEventTargetSelector(executor, type);
    }

    public void onEvent(T e) {
        Tensura.getLogger().info("RUNNING EVENT " + e.getClass().toString());
        this.apply(null, e);
    }

    @Override
    public void apply(Level level, Object entity) {
        this.executor.execute(level, this.instance, (T) entity);
    }

    @Override
    public void register(SkillInstance instance) {
        this.event = this::onEvent;
        MinecraftForge.EVENT_BUS.addListener(EventPriority.NORMAL, false, this.eventType, this.event);
    }

    @Override
    public void unregister() {
        MinecraftForge.EVENT_BUS.unregister(this.event);
    }
}
