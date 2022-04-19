package com.borniuus.tensura.block.state.properties;

import net.minecraft.world.level.block.state.properties.EnumProperty;

public class TensuraBlockStateProperties {
    public static final EnumProperty<SmithingBenchPart> SMITHING_BENCH_PART = EnumProperty.create("part", SmithingBenchPart.class);
    public static final EnumProperty<LoomPart> LOOM_PART = EnumProperty.create("part", LoomPart.class);
}
