package com.github.manasmods.tensura.skills.targetselectors;

import com.github.manasmods.tensura.skills.SkillInstance;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.network.NetworkEvent;

@CommonTargetSelector
public class PacketTargetSelector<T> implements TargetSelector {

    private final TargetSelectorExecutor<T> executor;

    /**
     * The instance this executor is registered on
     */
    private SkillInstance instance;

    public PacketTargetSelector(TargetSelectorExecutor<T> executor) {
        this.executor = executor;
    }

    public static <T> PacketTargetSelector<T> create(TargetSelectorExecutor<T> executor) {
        return new PacketTargetSelector(executor);
    }

    public void onEvent(T e) {
        this.apply(null, e);
    }

    @Override
    public void apply(Level level, Object entity) {
        this.executor.execute(level, instance, (T) entity);
    }

    @Override
    public void register(SkillInstance instance) {
        this.instance = instance;

        //Register packet listener on network instance
    }

    @Override
    public void unregister() {

    }

    @RequiredArgsConstructor
    @Data
    public class Message {
        private T message;
        private NetworkEvent.Context context;
    }
}
