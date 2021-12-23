package com.borniuus.tensura.item.templates;

import com.borniuus.tensura.item.TensuraCreativeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class SimplePickaxeItem extends PickaxeItem {
    public SimplePickaxeItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, new Item.Properties().tab(TensuraCreativeTab.TENSURA_TAB4));
    }
}
