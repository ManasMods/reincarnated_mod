package com.github.manasmods.tensura.skills.common;

import com.github.manasmods.tensura.skills.Skill;
import com.github.manasmods.tensura.skills.SkillInstance;
import com.github.manasmods.tensura.skills.targetselectors.SelfEventTargetSelector;
import com.github.manasmods.tensura.skills.targetselectors.TargetSelectorExecutor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.TickEvent;

public class SelfRegenerationSkill extends Skill implements TargetSelectorExecutor<TickEvent.PlayerTickEvent> {

    public SelfRegenerationSkill(String name) {
        super(name);

        this.effect("main").setActivationCost(0).setBaseStrength(1.0D).setTargetSelector(() -> SelfEventTargetSelector.create(this));
    }

    @Override
    public void execute(Level level, SkillInstance instance, TickEvent.PlayerTickEvent playerTickEvent) {
        //Access test
        ((Instance)instance).test = 0;

        //Put variable test into storage
        instance.getData().putInt("test", 0);

        if(playerTickEvent.player.tickCount % 20 == 0) {
            Player player = playerTickEvent.player;

            if(player.getHealth() < player.getMaxHealth()) {
                if(player.getMaxHealth() - player.getHealth() < 1) {
                    player.setHealth(player.getMaxHealth());
                } else {
                    player.setHealth(player.getHealth() + 1);
                }
            }
        }
    }

    //When created as a standalone skill
    @Override
    public SkillInstance createInstance(Player player) {
        return new SelfRegenerationSkill.Instance(this, player);
    }

    //When created as a subskill
    @Override
    public SkillInstance crateSubSkillInstance(SkillInstance instance, Player player) {
        return new SelfRegenerationSkill.Instance(this, player, instance);
    }

    /**
     * Override skill instance to store data inside the Instance for fast data access
     */
    public class Instance extends SkillInstance {

        private int test;

        public Instance(Skill skill, Player player) {
            super(skill, player);
        }

        public Instance(Skill skill, Player player, SkillInstance parent) {
            super(skill, player, parent);
        }
    }
}
