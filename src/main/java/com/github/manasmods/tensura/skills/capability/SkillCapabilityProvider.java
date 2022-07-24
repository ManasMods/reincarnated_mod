package com.github.manasmods.tensura.skills.capability;

import com.github.manasmods.tensura.skills.Skill;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SkillCapabilityProvider implements ICapabilityProvider, INBTSerializable<CompoundTag> {

    private final ISkillCapability data;
    private final LazyOptional<ISkillCapability> lazyOptional;

    public SkillCapabilityProvider(Player player) {
        this.data = new SkillCapability(player);
        this.lazyOptional = LazyOptional.of(() -> data);
    }

    @Override
    public CompoundTag serializeNBT() {
        return this.data.serializeNBT();
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        this.data.deserializeNBT(nbt);
    }

    @NotNull
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        return this.getCapability(cap);
    }

    @NotNull
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap) {
        return ISkillCapability.SKILL_CAPABILITY.orEmpty(cap, this.lazyOptional);
    }
}
