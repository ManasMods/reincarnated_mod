package com.github.manasmods.tensura.skills.targetselectors;

import com.github.manasmods.tensura.skills.SkillInstance;
import net.minecraft.world.level.Level;

@FunctionalInterface
public interface TargetSelectorExecutor<R> {

    public void execute(Level level, SkillInstance instance, R r);

}
