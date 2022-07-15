package com.github.manasmods.tensura.skills;

import com.github.manasmods.tensura.skills.targetselectors.TargetSelector;
import lombok.Getter;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SkillInstance {

    @Getter
    private Skill skill;

    @Getter

    private Player player;

    private List<SkillEffectInstance> instances;

    @Getter
    private List<SkillInstance> subSkillInstances;

    /**
     * CompoundTag to persist data
     */
    @Getter
    private CompoundTag data;

    @Getter
    private boolean isSubskill;
    @Getter
    private SkillInstance parent;



    public SkillInstance(Skill skill, Player player) {
        this.skill = skill;
        this.player = player;
        this.isSubskill = false;

        this.instances = new ArrayList<>();
        this.data = new CompoundTag();

        this.skill.getEffects().forEach(e -> this.instances.add(new SkillEffectInstance(this.skill, e)));
    }

    public SkillInstance(Skill skill, Player player, SkillInstance parent) {
        this(skill, player);
        this.isSubskill = true;
        this.parent = parent;
    }

    public List<SkillInstance> compileSubskills() {
        List<SkillInstance> subskills = new ArrayList<>();

        for (Skill subSkill : this.skill.getSubSkills()) {
            SkillInstance instance = subSkill.crateSubSkillInstance(this, this.player);

            subskills.add(instance);
        }

        this.subSkillInstances = subskills;

        return subskills;
    }

    public void serializeToNBT(CompoundTag tag) {
        if(this.skill.isPersistData()) {
            CompoundTag data = this.getData();
            tag.put("data", data);
        }
    }

    public void deserializeNBT(CompoundTag tag) {
        data = tag.getCompound("data").copy();
    }

    public void register() {
        this.instances.forEach(sk -> sk.register(this));
    }

    public void registerSubskills() {
        this.subSkillInstances.forEach(SkillInstance::register);
    }

}
