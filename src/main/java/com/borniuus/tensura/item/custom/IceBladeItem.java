package com.borniuus.tensura.item.custom;


import com.borniuus.tensura.item.templates.SimpleSwordItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;


public class IceBladeItem extends SimpleSwordItem {
    public IceBladeItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        attacker.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 30, 2));
        target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 50, 2));
        target.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 30, 1));
        return super.hurtEnemy(stack, target, attacker);
    }
}



