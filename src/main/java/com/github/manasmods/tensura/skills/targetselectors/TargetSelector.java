package com.github.manasmods.tensura.skills.targetselectors;

import net.minecraft.world.level.Level;

import java.lang.annotation.Target;
import java.util.function.Consumer;

public interface TargetSelector<R> {

    public void apply(Level level, R entity);

    public void register();
    public void unregister();

}
