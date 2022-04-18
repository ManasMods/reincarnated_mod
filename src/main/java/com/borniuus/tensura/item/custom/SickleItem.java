package com.borniuus.tensura.item.custom;

import com.borniuus.tensura.Tensura;
import com.borniuus.tensura.item.TensuraCreativeTab;
import com.borniuus.tensura.item.TensuraItems;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;


public class SickleItem extends Item {
    private static final TagKey<Block> SICKLE_BLOCK = BlockTags.create(new ResourceLocation(Tensura.MOD_ID, "sickle_blocks"));

    public SickleItem(Properties pProperties) {
        super(pProperties);
    }

    public SickleItem(int durability) {
        this(new Properties().tab(TensuraCreativeTab.TOOLS).durability(durability));
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if (!pContext.getLevel().isClientSide()) {
            Level level = pContext.getLevel();
            BlockPos positionClicked = pContext.getClickedPos();
            BlockState blockClicked = level.getBlockState(positionClicked);

            if (blockClicked.is(SICKLE_BLOCK)) {
                ItemEntity entityItem = new ItemEntity(level,
                    positionClicked.getX(), positionClicked.getY(), positionClicked.getZ(),
                    new ItemStack(TensuraItems.THATCH, 1));

                level.destroyBlock(positionClicked, false);
                level.addFreshEntity(entityItem);
                pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(), p -> {
                    p.broadcastBreakEvent(pContext.getHand());
                });
            }
        }
        return InteractionResult.SUCCESS;
    }
}
