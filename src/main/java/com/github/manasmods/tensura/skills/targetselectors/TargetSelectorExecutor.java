package com.github.manasmods.tensura.skills.targetselectors;

import net.minecraft.world.level.Level;

@FunctionalInterface
public interface TargetSelectorExecutor<R> {

    public void execute(Level level, R r);

}
