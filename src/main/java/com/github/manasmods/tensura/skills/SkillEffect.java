package com.github.manasmods.tensura.skills;

import com.github.manasmods.tensura.skills.targetselectors.TargetSelector;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;

public class SkillEffect {

    private final String name;

    private TargetSelector targetSelector;

    private TargetSelector clientTargetSelector;

    private int activationCost;

    //Used for later
    private double baseStrength = 1.0D;

    public SkillEffect(String name) {
        this.name = name;
    }

    /**
     * Sets a target selector
     * @param targetSelector
     * @return the skill effect
     */
    public SkillEffect setTargetSelector(TargetSelector targetSelector) {
        this.targetSelector = targetSelector;

        return this;
    }

    /**
     * Sets a target selector only executed on client
     * @param targetSelector
     * @return the skill effect
     */
    public SkillEffect setClientTargetSelector(TargetSelector targetSelector) {
        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> () -> {this.clientTargetSelector = targetSelector;});

        return this;
    }

    public SkillEffect setActivationCost(int activationCost) {
        this.activationCost = activationCost;

        return this;
    }

    public SkillEffect setBaseStrength(double baseStrength) {
        this.baseStrength = baseStrength;

        return this;
    }

    protected void register() {
        if(this.targetSelector != null) {
            this.targetSelector.register();
        }

        if(this.clientTargetSelector != null) {
            this.clientTargetSelector.register();
        }
    }
}
