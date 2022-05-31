package com.github.manasmods.tensura.block.state.properties;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

@RequiredArgsConstructor
public enum SmithingBenchPart implements StringRepresentable {
    BENCH("bench"),
    ANVIL("anvil");

    @Getter
    private final String name;

    @Override
    @NotNull
    public String getSerializedName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
