package com.github.manasmods.tensura.item.templates;

import com.github.manasmods.tensura.item.TensuraCreativeTab;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class SimplePickaxeItem extends PickaxeItem {
    /**
     * Easy to use {@link PickaxeItem}.
     *
     * @param pTier                 {@link Tier} of this object.
     * @param pAttackDamageModifier Additional attack damage caused by this Item.
     * @param pAttackSpeedModifier  Additional attack speed / cooldown of this Item.
     */
    public SimplePickaxeItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, new Item.Properties().tab(TensuraCreativeTab.TOOLS));
    }

    /**
     * Easy to use {@link PickaxeItem}.
     *
     * @param pTier           {@link Tier} of this object.
     * @param pickaxeModifier Vanilla tool modifier reference.
     */
    public SimplePickaxeItem(Tier pTier, PickaxeModifier pickaxeModifier) {
        this(pTier, pickaxeModifier.getAttackDamageModifier(), pickaxeModifier.getAttackSpeedModifier());
    }

    @AllArgsConstructor
    public enum PickaxeModifier {
        WOOD(1, -2.8F),
        STONE(1, -2.8F),
        IRON(1, -2.8F),
        GOLD(1, -2.8F),
        DIAMOND(1, -2.8F),
        NETHERITE(1, -2.8F);

        @Getter
        private final int attackDamageModifier;
        @Getter
        private final float attackSpeedModifier;
    }
}
