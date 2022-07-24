package com.github.manasmods.tensura.registry;

import com.github.manasmods.tensura.Tensura;
import com.github.manasmods.tensura.skills.Skill;
import com.github.manasmods.tensura.skills.common.SelfRegenerationSkill;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryBuilder;

public class SkillRegistry {

    public static final ResourceLocation SKILLS_REGISTRY_NAME = new ResourceLocation(Tensura.MOD_ID, "skills");
    private static final DeferredRegister<Skill> skillRegister = DeferredRegister.create(SKILLS_REGISTRY_NAME, Tensura.MOD_ID);

    public static void registerRegistry(IEventBus eventBus) {
        skillRegister.makeRegistry(Skill.class, RegistryBuilder::new);
        skillRegister.register(eventBus);
    }

    static void register() {
        skillRegister.register("self_regeneration", () -> new SelfRegenerationSkill("self_regeneration"));
    }
}
