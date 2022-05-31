package com.github.manasmods.tensura.world.tree.grower;

import com.github.manasmods.tensura.registry.TensuraConfiguredFeatureRegistry;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class PalmTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random pRandom, boolean pLargeHive) {
        return TensuraConfiguredFeatureRegistry.PALM_TREE.getHolder().get();
    }
}
