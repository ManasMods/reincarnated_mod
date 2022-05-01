package com.borniuus.tensura.world.tree.grower;

import com.borniuus.tensura.world.gen.TensuraFeatures;
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
            RegistryObject<ConfiguredFeature<?, ?>> result = pLargeHive ? TensuraFeatures.SAKURA_TREE_LARGE_HIVE.orElseThrow(() -> new IllegalArgumentException("Can not load Value from Registry.")) :
                TensuraFeatures.SAKURA_TREE_LARGE.orElseThrow(() -> new IllegalArgumentException("Can not load Value from Registry."));
            return Holder.direct(result.get());
        } else {
            RegistryObject<ConfiguredFeature<?, ?>> result = pLargeHive ? TensuraFeatures.SAKURA_TREE_HIVE.orElseThrow(() -> new IllegalArgumentException("Can not load Value from Registry.")) :
                TensuraFeatures.SAKURA_TREE.orElseThrow(() -> new IllegalArgumentException("Can not load Value from Registry."));
            return Holder.direct(result.get());
        }
    }
}
