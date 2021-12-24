package com.borniuus.tensura.item.templates;

import com.borniuus.tensura.item.TensuraCreativeTab;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class SimpleSwordItem extends SwordItem {
    /**
     * Easy to use {@link ShovelItem}.
     *
     * @param pTier                 {@link Tier} of this object.
     * @param pAttackDamageModifier Additional attack damage caused by this Item.
     * @param pAttackSpeedModifier  Additional attack speed / cooldown of this Item.
     */
    public SimpleSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, new Properties().tab(TensuraCreativeTab.WEAPONS));
    }

    /**
     * Easy to use {@link SwordItem}.
     *
     * @param pTier         {@link Tier} of this object.
     * @param swordModifier Vanilla tool modifier reference.
     */
    public SimpleSwordItem(Tier pTier, SwordModifier swordModifier) {
        this(pTier, swordModifier.getAttackDamageModifier(), swordModifier.getAttackSpeedModifier());
    }

    @AllArgsConstructor
    public enum SwordModifier {
        WOOD(3, -2.4F),
        STONE(3, -2.4F),
        IRON(3, -2.4F),
        GOLD(3, -2.4F),
        DIAMOND(3, -2.4F),
        NETHERITE(3, -2.4F);

        @Getter
        private final int attackDamageModifier;
        @Getter
        private final float attackSpeedModifier;
    }
}
