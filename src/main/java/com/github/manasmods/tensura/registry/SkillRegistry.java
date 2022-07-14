package com.github.manasmods.tensura.registry;

import com.github.manasmods.tensura.Tensura;
import com.github.manasmods.tensura.skills.Skill;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryBuilder;

public class SkillRegistry {

    public static ResourceLocation SKILLS_REGISTRY_NAME = new ResourceLocation(Tensura.MOD_ID, "skills");
    private static DeferredRegister<Skill> skillRegister = DeferredRegister.create(SKILLS_REGISTRY_NAME, Tensura.MOD_ID);

    public static void registerRegistry() {
        skillRegister.makeRegistry(Skill.class, () -> new RegistryBuilder<Skill>().setType(Skill.class).setName(SKILLS_REGISTRY_NAME));
    }
}
