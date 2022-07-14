package com.github.manasmods.tensura.skills.capability;

import com.github.manasmods.tensura.Tensura;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;

public class SkillCapability implements ISkillCapability {

    public static final Capability<ISkillCapability> SKILL_CAPABILITY = CapabilityManager.get(new CapabilityToken<ISkillCapability>() {});
    public static final ResourceLocation IDENTIFIER = new ResourceLocation(Tensura.MOD_ID, "skillsCap");

    @Override
    public CompoundTag serializeNBT() {
        return null;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {

    }
}
