package com.github.manasmods.tensura.item.templates;

import com.github.manasmods.tensura.item.TensuraCreativeTab;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;

public class SimpleShovelItem extends ShovelItem {
    /**
     * Easy to use {@link ShovelItem}.
     *
     * @param pTier                 {@link Tier} of this object.
     * @param pAttackDamageModifier Additional attack damage caused by this Item.
     * @param pAttackSpeedModifier  Additional attack speed / cooldown of this Item.
     */
    public SimpleShovelItem(Tier pTier, float pAttackDamageModifier, float pAttackSpeedModifier) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, new Properties().tab(TensuraCreativeTab.TOOLS));
    }

    /**
     * Easy to use {@link ShovelItem}.
     *
     * @param pTier          {@link Tier} of this object.
     * @param shovelModifier Vanilla tool modifier reference.
     */
    public SimpleShovelItem(Tier pTier, ShovelModifier shovelModifier) {
        this(pTier, shovelModifier.getAttackDamageModifier(), shovelModifier.getAttackSpeedModifier());
    }

    @AllArgsConstructor
    public enum ShovelModifier {
        WOOD(1.5F, -3F),
        STONE(1.5F, -3F),
        IRON(1.5F, -3F),
        GOLD(1.5F, -3F),
        DIAMOND(1.5F, -3F),
        NETHERITE(1.5F, -3F);

        @Getter
        private final float attackDamageModifier, attackSpeedModifier;
    }
}
