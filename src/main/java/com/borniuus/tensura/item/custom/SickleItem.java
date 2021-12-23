package com.borniuus.tensura.item.custom;

import com.borniuus.tensura.block.ModBlocks;
import com.borniuus.tensura.item.ModItems;
import com.google.common.collect.ImmutableMap;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;


public class SickleItem extends Item {
    private static final Map<Block, Item> SICKLE_ITEM_CRAFT =
        new ImmutableMap.Builder<Block, Item>()
            .put(Blocks.GRASS, ModItems.THATCH.get())
            .put(Blocks.TALL_GRASS, ModItems.THATCH.get())
            .build();


    public SickleItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if (!pContext.getLevel().isClientSide()) {
            Level level = pContext.getLevel();
            BlockPos positionClicked = pContext.getClickedPos();
            Block blockClicked = level.getBlockState(positionClicked).getBlock();

            if (canHarvest(blockClicked)) {
                ItemEntity entityItem = new ItemEntity(level,
                    positionClicked.getX(), positionClicked.getY(), positionClicked.getZ(),
                    new ItemStack(SICKLE_ITEM_CRAFT.get(blockClicked), 1));

                level.destroyBlock(positionClicked, false);
                level.addFreshEntity(entityItem);
                pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(), p -> {
                    p.broadcastBreakEvent(pContext.getHand());
                });
            }


        }
        return InteractionResult.SUCCESS;
    }

    private boolean canHarvest(Block block) {
        return SICKLE_ITEM_CRAFT.containsKey(block);

    }
}
