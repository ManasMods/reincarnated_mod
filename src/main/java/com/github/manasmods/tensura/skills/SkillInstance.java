package com.github.manasmods.tensura.skills;

import com.github.manasmods.tensura.skills.targetselectors.TargetSelector;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;

import java.util.ArrayList;
import java.util.List;

public class SkillInstance {

    private Skill skill;

    private Player player;

    private List<SkillEffectInstance> instances;



    public SkillInstance(Skill skill, Player player) {
        this.skill = skill;
        this.player = player;

        this.instances = new ArrayList<>();

        this.skill.getEffects().forEach(e -> this.instances.add(new SkillEffectInstance(this.skill, e)));
    }

    public void register() {
        this.instances.forEach(SkillEffectInstance::register);
    }

}
