package com.github.manasmods.tensura.skills.targetselectors;

import com.github.manasmods.tensura.skills.SkillInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.DistExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * A wrapped line of sight single entity target selectors.
 * Selects one entity the player is looking at
 * Should be wrapped around another TargetSelector.
 * The other TargetSelector triggers this one which calculates the entity a player is looking at.
 */
@CommonTargetSelector
public class WrappedLOSEntityTargetSelector implements TargetSelector<Entity>{

    private final TargetSelectorExecutor<Entity> executor;
    private final TargetSelector wrappedSelector;
    private final int distance;

    private Consumer<PlayerInteractEvent.RightClickBlock> event;

    public WrappedLOSEntityTargetSelector(Function<TargetSelectorExecutor<Player>, TargetSelector> wrappedSelector, TargetSelectorExecutor<Entity> executor, int distance) {
        this.wrappedSelector = wrappedSelector.apply(this::performTracing);

        this.executor = executor;
        this.distance = distance;
    }

    /**
     * Constructs a new WrappedLOSEntityTargetSelector
     * @param wrappedSelector a function to create the target selector this is wrapped around
     * @param executor a target executor to execute with the found entity
     * @param distance the distance(minecraft normal distance is 4.0)
     * @return
     */
    public static WrappedLOSEntityTargetSelector create(Function<TargetSelectorExecutor<Player>, TargetSelector> wrappedSelector, TargetSelectorExecutor<Entity> executor, int distance) {
        return new WrappedLOSEntityTargetSelector(wrappedSelector, executor, distance);
    }

    /**
     * The instance this executor is registered on
     */
    private SkillInstance instance;

    private void performTracing(Level level, SkillInstance instance, Player player) {
        Vec3 viewVector = player.getViewVector(1.0F);
        Vec3 expandedVec = viewVector.add(viewVector.x * this.distance, viewVector.y * this.distance, viewVector.z * this.distance);
        AABB aabb = player.getBoundingBox().expandTowards(viewVector.scale(this.distance)).inflate(1.0D, 1.0D, 1.0D);
        EntityHitResult entityhitresult = ProjectileUtil.getEntityHitResult(player, player.getEyePosition(), expandedVec, aabb, (entity) -> {
            return !entity.isSpectator() && entity.isPickable();
        }, this.distance * this.distance);

        if(entityhitresult != null) {
            this.apply(entityhitresult.getEntity().level, entityhitresult.getEntity());
        }
    }

    @Override
    public void apply(Level level, Entity entity) {
        this.executor.execute(level, this.instance, entity);
    }

    @Override
    public void register(SkillInstance instance) {
        this.wrappedSelector.register(instance);
    }

    @Override
    public void unregister() {
        this.wrappedSelector.unregister();
    }
}


