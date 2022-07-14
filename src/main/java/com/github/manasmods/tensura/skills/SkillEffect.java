package com.github.manasmods.tensura.skills;

import com.github.manasmods.tensura.skills.targetselectors.TargetSelector;
import lombok.Getter;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SkillEffect {

    private final String name;

    @Getter
    private Supplier<TargetSelector> targetSelector;

    @Getter
    private Supplier<TargetSelector> clientTargetSelector;

    private int activationCost;

    //Used for later
    private double baseStrength = 1.0D;
    private boolean renderToolTip = true;

    public SkillEffect(String name) {
        this.name = name;
    }

    /**
     * Sets a target selector
     * @param targetSelector
     * @return the skill effect
     */
    public SkillEffect setTargetSelector(Supplier<TargetSelector> targetSelector) {
        this.targetSelector = targetSelector;

        return this;
    }

    /**
     * Sets a target selector only executed on client
     * @param targetSelector
     * @return the skill effect
     */
    public SkillEffect setClientTargetSelector(Supplier<TargetSelector> targetSelector) {
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

    public SkillEffect setRenderToolTip(boolean renderToolTip) {
        this.renderToolTip = renderToolTip;

        return this;
    }

    /**
     * Whether the skill is a main effect and therefore should not be rendered to tooltips
     * @return skill is a main effect
     */
    public boolean isMainEffect() {
        return this.name.equalsIgnoreCase("main");
    }

    /**
     * Whether a tooltip should be rendered, {@link SkillEffect#isMainEffect()}
     * @return skill tooltip should be rendered
     */
    public boolean shouldRenderTooltip() {
        return this.isMainEffect() || this.renderToolTip;
    }
}
