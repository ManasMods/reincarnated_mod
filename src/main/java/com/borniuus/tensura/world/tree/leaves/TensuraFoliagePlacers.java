package com.borniuus.tensura.world.tree.leaves;

import com.borniuus.tensura.Tensura;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Tensura.MOD_ID)
public class TensuraFoliagePlacers {
    @ObjectHolder("palm_foliage_placer")
    public static final FoliagePlacerType<PalmFoliagePlacer> PALM_FOLIAGE_PLACER = null;
}
