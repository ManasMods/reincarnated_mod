package com.borniuus.tensura.item.templates;

import com.borniuus.tensura.item.TensuraCreativeTab;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;

public class SimpleShovelItem extends ShovelItem {
    public SimpleShovelItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, new Properties().tab(TensuraCreativeTab.TENSURA_TAB4));
    }
}
