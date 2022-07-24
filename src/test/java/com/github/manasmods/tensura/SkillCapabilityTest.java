package com.github.manasmods.tensura;

import com.github.manasmods.tensura.registry.SkillRegistry;
import com.github.manasmods.tensura.skills.Skill;
import com.github.manasmods.tensura.skills.SkillInstance;
import com.github.manasmods.tensura.skills.capability.ISkillCapability;
import com.github.manasmods.tensura.skills.capability.SkillCapability;
import com.github.manasmods.tensura.skills.capability.SkillCapabilityProvider;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.gametest.GameTestHolder;
import net.minecraftforge.gametest.PrefixGameTestTemplate;
import net.minecraftforge.registries.RegistryObject;

@GameTestHolder(Tensura.MOD_ID)
public class SkillCapabilityTest {

    @PrefixGameTestTemplate(false)
    @GameTest(template = "empty_1x1", batch = TestBatches.SKILL_CAPS)
    public void testSkillCapability(final GameTestHelper helper) {
        RegistryObject<Skill> skillObject = RegistryObject.create(new ResourceLocation(Tensura.MOD_ID, "self_regeneration"), SkillRegistry.SKILLS_REGISTRY_NAME, Tensura.MOD_ID);
        Skill skill = skillObject.get();

        Player player = helper.makeMockPlayer();
        SkillCapabilityProvider provider = new SkillCapabilityProvider(player);

        //Test add skill
        ISkillCapability capability = provider.getCapability(ISkillCapability.SKILL_CAPABILITY).resolve().get();
        capability.acquireSkill(skill);

        if (!capability.getSkills().contains(skill)) {
            helper.fail("Test Add Skill failed: No skill found");
        }

        Tensura.getLogger().info("SkillCapsTest: Test Add Skill COMPLETED");

        //Test enable skill
        capability.enableSkill(player, skill, true);

        if(capability.getSkillInstances().size() != 1) {
            helper.fail("Test Enable Skill failed: Less or more than 1 skill instance found");
        }

        Tensura.getLogger().info("SkillCapsTest: Test Enable Skill COMPLETED");

        SkillInstance instance = null;

        //Test disable skill
        for(SkillInstance sk : capability.getSkillInstances()) {
            if(sk.getSkill().equals(skill)) {
                instance = sk;
            }
        }

        if(instance == null) {
            helper.fail("Test Disable Skill failed: No skill instance found");
        }

        capability.disableSkill(instance);

        if(capability.getSkillInstances().size() > 0) {
            helper.fail("Test Disable Skill failed: More than 0 skill instances found");
        }

        Tensura.getLogger().info("SkillCapsTest: Test Disable Skill COMPLETED");

        //Test calculateSkills
        //Not much testable right now, will expand later
        capability.calculateSkills(player);

        if(capability.getSkillInstances().size() == 0) {
            helper.fail("Test Calculate Skills failed: No skill instances found");
        }

        Tensura.getLogger().info("SkillCapsTest: Test Calculate Skill COMPLETED");

        //Test disableSkills
        capability.disableSkills();

        if(capability.getSkillInstances().size() != 0) {
            helper.fail("Test Disable Skills failed: Skill Instances found");
        }

        Tensura.getLogger().info("SkillCapsTest: Test Disable Skills COMPLETED");

        //Test serializeNBT
        //Enable all skills first
        capability.calculateSkills(player);

        CompoundTag tag = capability.serializeNBT();

        Tensura.getLogger().info("SkillCapsTest: Serialized: " + tag.toString());
        Tensura.getLogger().info("SkillCapsTest: serializeNBT COMPLETED");

        SkillCapabilityProvider testProvider = new SkillCapabilityProvider(player);
        ISkillCapability testCapability = testProvider.getCapability(ISkillCapability.SKILL_CAPABILITY).resolve().get();
        testCapability.deserializeNBT(tag);

        if(capability.getSkillInstances().size() != testCapability.getSkillInstances().size()) {
            helper.fail("Test deserializeNBT failed: Skill instances mismatch {" + capability.getSkillInstances().size() + ":" + testCapability.getSkillInstances().size() + "}");
        }

        if(capability.getSkills().size() != testCapability.getSkills().size()) {
            helper.fail("Test deserializeNBT failed: Skill size mismatch {" + capability.getSkills().size() + ":" + testCapability.getSkills().size() + "}");
        }

        if(!capability.getSkills().get(0).equals(testCapability.getSkills().get(0))) {
            helper.fail("Test deserializeNBT failed: Skill mismatch");
        }

        Tensura.getLogger().info("SkillCapsTest: deserializeNBT COMPLETED");

        helper.succeed();
    }

}
