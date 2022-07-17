package com.github.manasmods.tensura.skills.capability;

import com.github.manasmods.tensura.Tensura;
import com.github.manasmods.tensura.skills.Skill;
import com.github.manasmods.tensura.skills.SkillInstance;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;

import java.util.*;

public class SkillCapability implements ISkillCapability {

    public static final Capability<ISkillCapability> SKILL_CAPABILITY = CapabilityManager.get(new CapabilityToken<ISkillCapability>() {});
    public static final ResourceLocation IDENTIFIER = new ResourceLocation(Tensura.MOD_ID, "skillsCap");

    private HashMap<ResourceLocation, Skill> skills = new HashMap<>();
    private HashMap<ResourceLocation, SkillInstance> skillInstances = new HashMap<>();

    private CompoundTag savedData;

    private Player player;

    public SkillCapability(Player player) {
        this.player = player;
    }

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag tag = new CompoundTag();
        ListTag skillList = new ListTag();

        List<ResourceLocation> toSave = new ArrayList<>(this.skills.keySet());

        //Save enabled skills with data first
        for(SkillInstance instance : this.skillInstances.values()) {
            CompoundTag skill = instance.serializeNBT();

            skillList.add(skill);

            toSave.remove(instance.getSkill().getRegistryName());
        }

        //Save remaining disabled skills
        for(ResourceLocation loc : toSave) {
            Skill skill = this.skills.get(loc);

            skillList.add(skill.serializeNBT());
        }

        tag.put("skills", skillList);

        //Serialize rest(magicule amount etc)

        return tag;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        //Disable all skills before loading
        this.disableSkills();

        if(nbt.contains("skills")) {
            this.skills.clear();

            ListTag list = nbt.getList("skills", ListTag.TAG_COMPOUND);

            for(Tag tag : list) {
                CompoundTag compoundTag = (CompoundTag) tag;

                if(compoundTag.contains("instance")) {
                    //Load enabled skill instance
                    Skill skill = Skill.deserializeFromNBT(compoundTag);

                    if(!this.skillInstances.containsKey(skill.getRegistryName())) {
                        SkillInstance instance = skill.createInstance(this.player);

                        instance.deserializeNBT(compoundTag);
                        //Load subskills by parent
                        List<SkillInstance> subskills = instance.compileSubskills();
                        for(SkillInstance subskill : subskills) {
                            for(Tag subTag : list) {
                                CompoundTag subCompound = (CompoundTag) subTag;

                                String name = subCompound.getString("name");

                                if(name.equals(subskill.getSkill().getRegistryName().toString())) {
                                    if(subCompound.contains("instance") && subCompound.contains("parent")) {
                                        String parentKey = subCompound.getString("parent");

                                        if(parentKey.equals(skill.getRegistryName().toString())) {
                                            subskill.deserializeNBT(subCompound);

                                            //Enable subskill
                                            subskill.register();

                                            this.skillInstances.put(subskill.getSkill().getRegistryName(), subskill);
                                        }
                                    }
                                }
                            }
                        }

                        //Enable skill
                        instance.register();

                        this.skillInstances.put(skill.getRegistryName(), instance);
                    }
                } else {
                    //Load disabled skill

                    Skill skill = Skill.deserializeFromNBT(compoundTag);

                    this.skills.put(skill.getRegistryName(), skill);
                }
            }
        }
    }

    @Override
    public void acquireSkill(Skill skill) {
        if(!this.skills.containsKey(skill.getRegistryName())) {
            this.skills.put(skill.getRegistryName(), skill);
        }
    }

    @Override
    public void loseSkill(Skill skill) {
        if(this.skillInstances.containsKey(skill.getRegistryName())) {
            this.disableSkill(this.skillInstances.get(skill.getRegistryName()));
        }

        if(this.skills.containsKey(skill.getRegistryName())) {
            this.skills.remove(skill.getRegistryName());
        }
    }

    @Override
    public void calculateSkills(Player player) {
        //Get all skills
        List<Skill> skills = new ArrayList<>(this.getSkills());

        //Sort skills by type (ultimate < unique < intrinsic < extra < common)
        skills.sort((first, second) -> {
            if(first.getType().getType() < second.getType().getType()) {
                return -1;
            } else if(first.getType().getType() > second.getType().getType()) {
                return 1;
            }

            return 0;
        });

        for(Skill skill : skills) {
            //First skill first serves subskills
            this.enableSkill(player, skill, false);
        }
    }

    @Override
    public void disableSkills() {
        Iterator<SkillInstance> skills = this.skillInstances.values().iterator();

        while(skills.hasNext()) {
            skills.next().unregister();
            skills.remove();
        }
    }

    @Override
    public boolean enableSkill(Player player, Skill skill, boolean unregister) {
        if(!this.skillInstances.containsKey(skill.getRegistryName())) {
            SkillInstance instance = skill.createInstance(player);

            //Compile all subskill instances
            List<SkillInstance> subskills = instance.compileSubskills();

            //Disable all previous skills and and insert the subskill
            for(SkillInstance subskill : subskills) {
                if(this.skillInstances.containsKey(subskill.getSkill().getRegistryName())) {
                    if(unregister) {
                        this.disableSkill(this.skillInstances.get(subskill.getSkill().getRegistryName()));
                    } else {
                        continue;
                    }
                }

                this.skillInstances.put(subskill.getSkill().getRegistryName(), subskill);
            }

            //Enable skills and subskills
            instance.register();
            instance.registerSubskills();

            this.skillInstances.put(skill.getRegistryName(), instance);

            return true;
        }

        return false;
    }

    @Override
    public void disableSkill(SkillInstance instance) {
        instance.unregister();
        instance.unregisterSubskills();

        for(SkillInstance subskill : instance.getSubSkillInstances()) {
            this.skillInstances.remove(subskill.getSkill().getRegistryName());
        }

        this.skillInstances.remove(instance.getSkill().getRegistryName());
    }

    @Override
    public List<SkillInstance> getSkillInstances() {
        return List.copyOf(this.skillInstances.values());
    }

    @Override
    public List<Skill> getSkills() {
        return List.copyOf(this.skills.values());
    }
}
