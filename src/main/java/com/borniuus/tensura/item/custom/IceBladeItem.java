package com.borniuus.tensura.item.custom;


import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.effect.MobEffectInstance;


public class IceBladeItem extends SwordItem {
    public IceBladeItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        attacker.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 30, 2));
        target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 50, 2));
        target.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 30, 1));
                return super.hurtEnemy(stack, target, attacker);


        }
    }



