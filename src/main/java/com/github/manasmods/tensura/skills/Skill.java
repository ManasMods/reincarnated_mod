package com.github.manasmods.tensura.skills;

import com.github.manasmods.tensura.skills.targetselectors.SelfEventTargetSelector;
import com.github.manasmods.tensura.skills.targetselectors.SingleBlockTargetSelector;
import com.github.manasmods.tensura.skills.targetselectors.TargetSelectorExecutor;
import net.minecraft.core.BlockPos;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import java.util.List;

public class Skill
{

    private List<SkillEffect> effects;

    public SkillEffect effect(String name) {
        SkillEffect effect = new SkillEffect(name);

        this.effects.add(effect);

        return effect;
    }

    /**
     * Registers the skill with the client/server, enabling the events on target selectors.
     * @return the skill instance
     */
    public Skill register() {
        this.effects.forEach(sk -> sk.register());

        return this;
    }

    public static void testSkillCreate() {
        Skill skill = new Skill();


        //Right click block
        skill.effect("Corrupt").setActivationCost(1).setBaseStrength(1.0).setTargetSelector(SingleBlockTargetSelector.create((level, pos) ->
                {
                    if(!level.isClientSide) {
                        level.destroyBlock((BlockPos) pos, false);
                    }
                }
        ));

        //Right click anything to heal(for client events use setClientTargetSelector and set a PacketTargetSelector)
        TargetSelectorExecutor<PlayerInteractEvent> eventHandler = (level, event) -> event.getPlayer().setHealth(20.0F);

        skill.effect("Heal").setTargetSelector(SelfEventTargetSelector.create(eventHandler));
    }


}
