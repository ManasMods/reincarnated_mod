package com.github.manasmods.tensura.skills.capability;

import com.github.manasmods.tensura.Tensura;
import com.github.manasmods.tensura.skills.Skill;
import com.github.manasmods.tensura.skills.SkillInstance;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;

import java.util.List;

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

    @Override
    public void acquireSkill(Skill skill) {

    }

    @Override
    public void loseSkill(Skill skill) {

    }

    @Override
    public void calculateSkills() {

    }

    @Override
    public void disableSkills() {

    }

    @Override
    public void enableSkill(Skill skill) {

    }

    @Override
    public void disableSkill(SkillInstance instance) {

    }

    @Override
    public List<SkillInstance> getSkillInstances() {
        return null;
    }

    @Override
    public List<Skill> getSkills() {
        return null;
    }
}
