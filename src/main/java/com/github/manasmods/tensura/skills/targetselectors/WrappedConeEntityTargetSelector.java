package com.github.manasmods.tensura.skills.targetselectors;

import com.github.manasmods.tensura.skills.SkillInstance;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * A wrapped cone entity list target selectors.
 * Selects multiple entities in a cone in the view direction of a player entity.
 * Should be wrapped around another TargetSelector(preferably a {@link SelfEventTargetSelector}).
 * This wrapped target selector gets called by the other target selector on event.
 */
@CommonTargetSelector
public class WrappedConeEntityTargetSelector implements TargetSelector<List<Entity>>{

    private final TargetSelectorExecutor<List<Entity>> executor;
    private final TargetSelector wrappedSelector;
    private final int distance;

    private Consumer<PlayerInteractEvent.RightClickBlock> event;

    public WrappedConeEntityTargetSelector(Function<TargetSelectorExecutor<Player>, TargetSelector> wrappedSelector, TargetSelectorExecutor<List<Entity>> executor, int distance) {
        this.wrappedSelector = wrappedSelector.apply(this::performTracing);

        this.executor = executor;
        this.distance = distance;
    }

    public static WrappedConeEntityTargetSelector create(Function<TargetSelectorExecutor<Player>, TargetSelector> wrappedSelector, TargetSelectorExecutor<List<Entity>> executor, int distance) {
        return new WrappedConeEntityTargetSelector(wrappedSelector, executor, distance);
    }

    /**
     * The instance this executor is registered on
     */
    private SkillInstance instance;

    private void performTracing(Level level, SkillInstance instance, Player player) {
        //Create list of boxes and check for collisions
        List<AABB> boxes = new ArrayList<>();

        //Create a box every 0.5 blocks with a size of 0.75 * 0.5 * the distance
        for(double d = 0.5; d < this.distance; d += 0.5) {
            double size = d * 0.375;
            Vec3 loc = player.getLookAngle().multiply(1 + d, 1 + d, 1 + d);

            AABB box = new AABB(loc.x, loc.y, loc.z, loc.x, loc.y, loc.z).inflate(size);
            boxes.add(box);
        }

        List<Entity> entityList = new ArrayList<>();

        for(AABB box : boxes) {
            List<Entity> entities = level.getEntities(player, box);

            entityList.addAll(entities);
        }

        this.apply(level, entityList);
    }

    @Override
    public void apply(Level level, List<Entity> entities) {
        this.executor.execute(level, this.instance, entities);
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


