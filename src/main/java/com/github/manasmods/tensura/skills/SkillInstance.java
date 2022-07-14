package com.github.manasmods.tensura.skills;

import com.github.manasmods.tensura.skills.targetselectors.TargetSelector;
import lombok.Getter;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;

import java.util.ArrayList;
import java.util.List;

public class SkillInstance {

    @Getter
    private Skill skill;

    @Getter

    private Player player;

    private List<SkillEffectInstance> instances;

    @Getter
    private List<SkillInstance> subSkillInstances;

    private boolean isSubskill;



    public SkillInstance(Skill skill, Player player, boolean isSubskill) {
        this.skill = skill;
        this.player = player;
        this.isSubskill = isSubskill;

        this.instances = new ArrayList<>();

        this.skill.getEffects().forEach(e -> this.instances.add(new SkillEffectInstance(this.skill, e)));
    }

    public List<SkillInstance> compileSubskills() {
        List<SkillInstance> subskills = new ArrayList<>();

        for (Skill subSkill : this.skill.getSubSkills()) {
            SkillInstance instance = subSkill.createInstance(this.player, true);

            subskills.add(instance);
        }

        this.subSkillInstances = subskills;

        return subskills;
    }

    public void register() {
        this.instances.forEach(SkillEffectInstance::register);
    }

    public void registerSubskills() {
        this.subSkillInstances.forEach(SkillInstance::register);
    }

}
