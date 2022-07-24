package com.github.manasmods.tensura.skills.targetselectors;

import com.github.manasmods.tensura.skills.SkillInstance;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import java.util.function.Consumer;

@CommonTargetSelector
public class SingleEntityTargetSelector implements TargetSelector<Entity> {

    private final TargetSelectorExecutor<Entity> executor;
    private Consumer<PlayerInteractEvent.EntityInteract> event;

    /**
     * The instance this executor is registered on
     */
    private SkillInstance instance;

    public SingleEntityTargetSelector(TargetSelectorExecutor<Entity> executor) {
        this.executor = executor;
    }

    public static SingleEntityTargetSelector create(TargetSelectorExecutor<Entity> executor) {
        return new SingleEntityTargetSelector(executor);
    }

    public void onRightClickEntity(PlayerInteractEvent.EntityInteract e) {
        this.apply(e.getWorld(), e.getEntity());
    }

    @Override
    public void apply(Level level, Entity entity) {
        this.executor.execute(level, this.instance, entity);
    }

    @Override
    public void register(SkillInstance instance) {
        this.event = this::onRightClickEntity;
        this.instance = instance;

        MinecraftForge.EVENT_BUS.addListener(this.event);
    }

    @Override
    public void unregister() {
        MinecraftForge.EVENT_BUS.unregister(this.event);
    }
}
