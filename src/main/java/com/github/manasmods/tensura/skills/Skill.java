package com.github.manasmods.tensura.skills;

import com.github.manasmods.tensura.Tensura;
import com.github.manasmods.tensura.registry.SkillRegistry;
import com.github.manasmods.tensura.skills.targetselectors.SelfEventTargetSelector;
import com.github.manasmods.tensura.skills.targetselectors.SingleBlockTargetSelector;
import com.github.manasmods.tensura.skills.targetselectors.TargetSelectorExecutor;
import lombok.Getter;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.registries.IForgeRegistryEntry;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Base class for all skills. A skill can be of multiple types, including {@link SkillType#COMMON}, {@link SkillType#EXTRA},
 * {@link SkillType#INTRINSIC}, {@link SkillType#UNIQUE} and {@link SkillType#ULTIMATE}
 *
 * Every Unique and Ultimate Skill can have subskills. Every other Skill can be parented to a Unique or Ultimate Skill.
 * Every Skill can have multiple named effects including one not displayed "main" effect(Set by the identifier "main" or {@link SkillEffect#setRenderToolTip(boolean)})
 * A skill should implement at least one effect, but can have multiple effects.
 * A skill is unique and every entity should have only one instance. Subskills of greater Skills(Ultimate < Unique) therefore override duplicate Skills.
 */
public class Skill implements IForgeRegistryEntry<Skill>
{
    private final String name;
    private ResourceLocation location;

    @Getter
    private final SkillType type;

    @Getter
    private final List<SkillEffect> effects;

    @Getter
    private final List<Skill> subSkills;

    public Skill(String name, SkillType type) {
        this.name = name;
        this.location = new ResourceLocation(Tensura.MOD_ID, this.name);
        this.effects = new ArrayList<>();
        this.subSkills = new ArrayList<>();
        this.type = type;
    }

    /**
     * Serializes a skill instance to nbt
     * @return the compound tag to save
     */
    public CompoundTag serializeNBT() {
        CompoundTag tag = new CompoundTag();
        tag.putString("name" , this.getRegistryName().toString());
        tag.putInt("type", this.getType().getType());

        return tag;
    }

    /**
     * Deserializes a Skill from an NBT Tag, call {@link Skill#createInstance(Player)} and {@link SkillInstance#deserializeNBT(CompoundTag)} to initialize it.
     * @param tag the compound tag
     * @return the skill descriptor
     */
    //Can't use INBTSerializable, because this method is supposed to load the skill instance.
    public static Skill deserializeFromNBT(CompoundTag tag) {
        String name = tag.getString("name");

        ResourceLocation location = ResourceLocation.tryParse(name);

        //Pretty dirty way
        return (Skill) RegistryObject.create(location, SkillRegistry.SKILLS_REGISTRY_NAME, Tensura.MOD_ID).get();
    }

    public static Skill deserializeFromNBT(String name) {
        ResourceLocation location = ResourceLocation.tryParse(name);

        //Pretty dirty way
        return (Skill) RegistryObject.create(location, SkillRegistry.SKILLS_REGISTRY_NAME, Tensura.MOD_ID).get();
    }

    //Whether a skill is a standalone or skill or comes only in a Unique Skill or higher
    public boolean isStandalone() {
        return true;
    }

    public boolean isPersistData() {
        return false;
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

    public SkillInstance createInstance(Player player) {
        return new SkillInstance(this, player);
    }

    public SkillInstance createSubSkillInstance(SkillInstance instance, Player player) {
        return new SkillInstance(this, player, instance);
    }

    /**
     * Sets the skill for the instance up, use this to setup variables you need later
     * @param instance the instance
     */
    public void setupSkill(SkillInstance instance) {}

    public static void testSkillCreate() {
        Skill skill = new Skill("Test", SkillType.COMMON);


        //Right click block
        skill.effect("Corrupt").setActivationCost(1).setBaseStrength(1.0).setTargetSelector(() -> SingleBlockTargetSelector.create((level, instance, pos) ->
                {
                    if(!level.isClientSide) {
                        level.destroyBlock(pos, false);
                    }
                }
        ));

        //Right click anything to heal(for client events use setClientTargetSelector and set a PacketTargetSelector)
        TargetSelectorExecutor<PlayerInteractEvent> eventHandler = (level, instance, event) -> event.getPlayer().setHealth(20.0F);

        skill.effect("Heal").setTargetSelector(() -> SelfEventTargetSelector.create(eventHandler, PlayerInteractEvent.class));

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

    public enum SkillType {
        COMMON(1), EXTRA(2), INTRINSIC(3), UNIQUE(4), ULTIMATE(5);

        @Getter
        private final int type;

        SkillType(int type) {
            this.type = type;
        }
    }
}
