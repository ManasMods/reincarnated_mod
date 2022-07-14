package com.github.manasmods.tensura.skills;

import com.github.manasmods.tensura.Tensura;
import com.github.manasmods.tensura.skills.targetselectors.SelfEventTargetSelector;
import com.github.manasmods.tensura.skills.targetselectors.SingleBlockTargetSelector;
import com.github.manasmods.tensura.skills.targetselectors.TargetSelectorExecutor;
import lombok.Getter;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.registries.IForgeRegistryEntry;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Skill implements IForgeRegistryEntry<Skill>
{
    private final String name;
    private ResourceLocation location;

    @Getter
    private List<SkillEffect> effects;

    public Skill(String name) {
        this.name = name;
        this.location = new ResourceLocation(Tensura.MOD_ID, this.name);
        this.effects = new ArrayList<>();
    }

    public SkillEffect effect(String name) {
        SkillEffect effect = new SkillEffect(name);

        this.effects.add(effect);

        return effect;
    }

    public SkillInstance createInstance(Player player) {
        return new SkillInstance(this, player);
    }

    public static void testSkillCreate() {
        Skill skill = new Skill("Test");


        //Right click block
        skill.effect("Corrupt").setActivationCost(1).setBaseStrength(1.0).setTargetSelector(() -> SingleBlockTargetSelector.create((level, pos) ->
                {
                    if(!level.isClientSide) {
                        level.destroyBlock((BlockPos) pos, false);
                    }
                }
        ));

        //Right click anything to heal(for client events use setClientTargetSelector and set a PacketTargetSelector)
        TargetSelectorExecutor<PlayerInteractEvent> eventHandler = (level, event) -> event.getPlayer().setHealth(20.0F);

        skill.effect("Heal").setTargetSelector(() -> SelfEventTargetSelector.create(eventHandler));

        //Create new instance
        SkillInstance instance = skill.createInstance(null);
    }


    @Override
    public Skill setRegistryName(ResourceLocation name) {
        this.location = name;

        return this;
    }

    @Nullable
    @Override
    public ResourceLocation getRegistryName() {
        return this.location;
    }

    @Override
    public Class getRegistryType() {
        return Skill.class;
    }
}
