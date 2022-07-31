package com.github.manasmods.tensura.skills;

import com.github.manasmods.tensura.skills.targetselectors.TargetSelector;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SkillEffectInstance {

    private Skill skill;

    private SkillEffect effect;

    @Getter
    @Setter
    private boolean enabled;

    private TargetSelector targetSelector;
    private TargetSelector clientTargetSelector;

    public SkillEffectInstance(Skill skill, SkillEffect effect) {
        this.skill = skill;
        this.effect = effect;
    }

    public void register(SkillInstance instance) {
        if(this.effect.getTargetSelector() != null) {
            this.targetSelector = this.effect.getTargetSelector().get();
            this.targetSelector.register(instance);
        }

        if(this.effect.getClientTargetSelector() != null) {
            this.clientTargetSelector = this.effect.getClientTargetSelector().get();
            this.clientTargetSelector.register(instance);
        }
    }

    public void unregister() {
        if(this.targetSelector != null) {
            this.targetSelector.unregister();
        }

        if(this.clientTargetSelector != null) {
            this.clientTargetSelector.unregister();
        }
    }
}