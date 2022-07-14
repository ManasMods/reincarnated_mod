package com.github.manasmods.tensura.skills;

import com.github.manasmods.tensura.Tensura;
import com.github.manasmods.tensura.registry.SkillRegistry;
import com.github.manasmods.tensura.skills.targetselectors.SelfEventTargetSelector;
import com.github.manasmods.tensura.skills.targetselectors.SingleBlockTargetSelector;
import com.github.manasmods.tensura.skills.targetselectors.TargetSelectorExecutor;
import lombok.Getter;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.registries.IForgeRegistryEntry;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Skill implements IForgeRegistryEntry<Skill>
{
    private final String name;
    private ResourceLocation location;

    @Getter
    private SkillType type;

    @Getter
    private List<SkillEffect> effects;

    @Getter
    private List<Skill> subSkills;

    public Skill(String name) {
        this.name = name;
        this.location = new ResourceLocation(Tensura.MOD_ID, this.name);
        this.effects = new ArrayList<>();
    }

    //Whether a skill is a standalone or skill or comes only in a Unique Skill or higher
    public boolean isStandalone() {
        return true;
    }

    public SkillEffect effect(String name) {
        SkillEffect effect = new SkillEffect(name);

        this.effects.add(effect);

        return effect;
    }

    public Skill addSubskill(Skill skill) {
        this.subSkills.add(skill);

        return this;
    }

    public SkillInstance createInstance(Player player, boolean isSubSkill) {
        return new SkillInstance(this, player, isSubSkill);
    }

    public void serializeToNBT(CompoundTag tag) {
        tag.putString("name", this.location.toString());
        tag.putInt("type", this.type.getType());
    }

    public Skill deserializeFromNBT(CompoundTag tag) {
        String name = tag.getString("name");

        ResourceLocation location = ResourceLocation.tryParse(name);

        //Pretty dirty way
        return (Skill) RegistryObject.create(location, SkillRegistry.SKILLS_REGISTRY_NAME, Tensura.MOD_ID).get();
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
        SkillInstance instance = skill.createInstance(null, false);
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

    public enum SkillType {
        COMMON(1), EXTRA(2), INTRINSIC(3), UNIQUE(4), ULTIMATE(5);

        @Getter
        private int type;

        SkillType(int type) {
            this.type = type;
        }
    }
}
