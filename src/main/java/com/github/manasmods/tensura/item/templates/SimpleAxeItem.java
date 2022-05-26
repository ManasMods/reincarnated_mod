package com.github.manasmods.tensura.item.templates;

import com.github.manasmods.tensura.item.TensuraCreativeTab;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Tier;

public class SimpleAxeItem extends AxeItem {
    /**
     * Easy to use {@link AxeItem}.
     *
     * @param pTier                 {@link Tier} of this object.
     * @param pAttackDamageModifier Additional attack damage caused by this Item.
     * @param pAttackSpeedModifier  Additional attack speed / cooldown of this Item.
     */
    public SimpleAxeItem(Tier pTier, float pAttackDamageModifier, float pAttackSpeedModifier) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, new Properties().tab(TensuraCreativeTab.TOOLS));
    }

    /**
     * Easy to use {@link AxeItem}.
     *
     * @param pTier       {@link Tier} of this object.
     * @param axeModifier Vanilla tool modifier reference.
     */
    public SimpleAxeItem(Tier pTier, AxeModifier axeModifier) {
        this(pTier, axeModifier.getAttackDamageModifier(), axeModifier.getAttackSpeedModifier());
    }

    @AllArgsConstructor
    public enum AxeModifier {
        WOOD(6F, -3.2F),
        STONE(7F, -3.2F),
        IRON(6F, -3.1F),
        GOLD(6F, -3F),
        DIAMOND(5F, -3F),
        NETHERITE(5F, -3F);

        @Getter
        private final float attackDamageModifier, attackSpeedModifier;
    }
}
