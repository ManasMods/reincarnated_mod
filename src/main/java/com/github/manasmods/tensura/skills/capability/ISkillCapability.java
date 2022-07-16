package com.github.manasmods.tensura.skills.capability;

import com.github.manasmods.tensura.skills.Skill;
import com.github.manasmods.tensura.skills.SkillInstance;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.util.INBTSerializable;

import java.util.List;

public interface ISkillCapability extends INBTSerializable<CompoundTag> {

    /**
     * Acquires a new skill, thereby also acquiring all its subskills.
     * Unique Skill subskills override standalone skills that are the same.
     * Ultimate Skills subskills override subskills by Unique Skills and standalone skills that are the same
     * @param skill the skill to learn
     */
    public void acquireSkill(Skill skill);

    /**
     * Removes a skill from, thereby also losing all its subskills.
     * Skills that were learned as standalone will be reacquired by calling {@link ISkillCapability#calculateSkills()}
     * @param skill the skill to remove
     */
    public void loseSkill(Skill skill);

    /**
     * Calculates all available skills.
     * Skills from Unique and Ultimate Skills will override Skill Instances of shared standalone skills.
     *
     * After calculation, the skills will be automatically instanced and their listeners registered
     */
    public void calculateSkills();

    /**
     * Disables all skills, unregistering their listeners and making them unavailable.
     * Use {@link ISkillCapability#calculateSkills()} to reactivate them
     */
    public void disableSkills();

    /**
     * Enables a skill and creates a skill instance, thereby registering all listeners of the skills effects
     * @param skill the skill
     */
    public void enableSkill(Skill skill);

    /**
     * Disables the skill instance, unregistering its listeners and making it unavailable.
     * @param instance
     */
    public void disableSkill(SkillInstance instance);

    /**
     * Gets all currently registered skill instances
     * @return list of all skill instances
     */
    public List<SkillInstance> getSkillInstances();

    /**
     * Gets a list of all raw acquired skills, including standalone skills absorbed into unique and ultimate skills.
     * @return list of all skills
     */
    public List<Skill> getSkills();

}
