package com.github.manasmods.tensura.item.templates;

import com.github.manasmods.tensura.item.TensuraCreativeTab;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Tier;

public class SimpleHoeItem extends HoeItem {
    /**
     * Eas to use {@link HoeItem}.
     *
     * @param pTier                 {@link Tier} of this object.
     * @param pAttackDamageModifier Additional attack damage caused by this Item.
     * @param pAttackSpeedModifier  Additional attack speed / cooldown of this Item.
     */
    public SimpleHoeItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, new Properties().tab(TensuraCreativeTab.TOOLS));
    }

    /**
     * Easy to use {@link HoeItem}.
     *
     * @param pTier       {@link Tier} of this object.
     * @param hoeModifier Vanilla tool modifier reference.
     */
    public SimpleHoeItem(Tier pTier, HoeModifier hoeModifier) {
        this(pTier, hoeModifier.getAttackDamageModifier(), hoeModifier.getAttackSpeedModifier());
    }

    @AllArgsConstructor
    public enum HoeModifier {
        WOOD(0, -3F),
        STONE(-1, -2F),
        IRON(-2, -1F),
        GOLD(0, -3F),
        DIAMOND(-3, -0F),
        NETHERITE(-4, -2.8F);

        @Getter
        private final int attackDamageModifier;
        @Getter
        private final float attackSpeedModifier;
    }
}
