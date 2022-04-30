package com.borniuus.tensura.world.tree.grower;

import com.borniuus.tensura.world.tree.TensuraTreeFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class SakuraTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random pRandom, boolean pLargeHive) {
        if (pRandom.nextInt(10) == 0) {
            return pLargeHive ? TensuraTreeFeatures.SAKURA_LARGE_BEEHIVE : TensuraTreeFeatures.SAKURA_LARGE;
        } else {
            return pLargeHive ? TensuraTreeFeatures.SAKURA_BEEHIVE : TensuraTreeFeatures.SAKURA;
        }
    }
}
