package com.github.manasmods.tensura.item.custom;

import com.github.manasmods.tensura.gui.screen.Chapter1Screen;
import lombok.NonNull;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Chapter1Item extends Item {

    public Chapter1Item(Properties pProperties) {
        super(pProperties);
    }

    @NonNull
    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pHand);
        pPlayer.openItemGui(itemstack, pHand);
        pPlayer.awardStat(Stats.ITEM_USED.get(this));

        if (pLevel.isClientSide) {
            Minecraft.getInstance().setScreen(new Chapter1Screen(new TextComponent("chapter1ItemGui")));
        }
        return InteractionResultHolder.success(pPlayer.getItemInHand(pHand));
    }
}