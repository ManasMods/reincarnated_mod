package com.borniuus.tensura.item.templates;

import com.borniuus.tensura.item.TensuraCreativeTab;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class SimpleSwordItem extends SwordItem {
    public SimpleSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, new Properties().tab(TensuraCreativeTab.TENSURA_TAB5));
    }
}
