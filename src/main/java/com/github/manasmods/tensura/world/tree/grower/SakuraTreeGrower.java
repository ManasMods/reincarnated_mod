package com.github.manasmods.tensura.world.tree.grower;

import com.github.manasmods.tensura.registry.TensuraConfiguredFeatureRegistry;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class SakuraTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random pRandom, boolean pLargeHive) {
        if (pRandom.nextInt(10) == 0) {
            RegistryObject<ConfiguredFeature<?, ?>> result = pLargeHive ? TensuraConfiguredFeatureRegistry.SAKURA_TREE_LARGE_HIVE : TensuraConfiguredFeatureRegistry.SAKURA_TREE_LARGE;
            return result.getHolder().get();
        } else {
            RegistryObject<ConfiguredFeature<?, ?>> result = pLargeHive ? TensuraConfiguredFeatureRegistry.SAKURA_TREE_HIVE : TensuraConfiguredFeatureRegistry.SAKURA_TREE;
            return result.getHolder().get();
        }
    }
}
