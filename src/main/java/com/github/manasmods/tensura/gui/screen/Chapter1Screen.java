package com.github.manasmods.tensura.gui.screen;

import com.github.manasmods.tensura.Tensura;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Chapter1Screen extends Screen {

    private static final ResourceLocation PAGE_1 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-001.png");
    private static final ResourceLocation PAGE_2 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-002.png");
    private static final ResourceLocation PAGE_3 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-003.png");
    private static final ResourceLocation PAGE_4 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-004.png");
    private static final ResourceLocation PAGE_5 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-005.png");
    private static final ResourceLocation PAGE_6 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-006.png");
    private static final ResourceLocation PAGE_7 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-007.png");
    private static final ResourceLocation PAGE_8 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-008.png");
    private static final ResourceLocation PAGE_9 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-009.png");
    private static final ResourceLocation PAGE_10 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-010.png");
    private static final ResourceLocation PAGE_11 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-011.png");
    private static final ResourceLocation PAGE_12 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-012.png");
    private static final ResourceLocation PAGE_13 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-013.png");
    private static final ResourceLocation PAGE_14 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-014.png");
    private static final ResourceLocation PAGE_15 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-015.png");
    private static final ResourceLocation PAGE_16 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-016.png");
    private static final ResourceLocation PAGE_17 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-017.png");
    private static final ResourceLocation PAGE_18 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-018.png");
    private static final ResourceLocation PAGE_19 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-019.png");
    private static final ResourceLocation PAGE_20 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-020.png");
    private static final ResourceLocation PAGE_21 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-021.png");
    private static final ResourceLocation PAGE_22 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-022.png");
    private static final ResourceLocation PAGE_23 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-023.png");
    private static final ResourceLocation PAGE_24 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-024.png");
    private static final ResourceLocation PAGE_25 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-025.png");
    private static final ResourceLocation PAGE_26 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-026.png");
    private static final ResourceLocation PAGE_27 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-027.png");
    private static final ResourceLocation PAGE_28 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-028.png");
    private static final ResourceLocation PAGE_29 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-029.png");
    private static final ResourceLocation PAGE_30 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-030.png");
    private static final ResourceLocation PAGE_31 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-031.png");
    private static final ResourceLocation PAGE_32 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-032.png");
    private static final ResourceLocation PAGE_33 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-033.png");
    private static final ResourceLocation PAGE_34 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-034.png");
    private static final ResourceLocation PAGE_35 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-035.png");
    private static final ResourceLocation PAGE_36 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-036.png");
    private static final ResourceLocation PAGE_37 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-037.png");
    private static final ResourceLocation PAGE_38 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-038.png");
    private static final ResourceLocation PAGE_39 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-039.png");
    private static final ResourceLocation PAGE_40 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-040.png");
    private static final ResourceLocation PAGE_41 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-041.png");
    private static final ResourceLocation PAGE_42 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-042.png");
    private static final ResourceLocation PAGE_43 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-043.png");
    private static final ResourceLocation PAGE_44 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-044.png");
    private static final ResourceLocation PAGE_45 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-045.png");
    private static final ResourceLocation PAGE_46 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-046.png");
    private static final ResourceLocation PAGE_47 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-047.png");
    private static final ResourceLocation PAGE_48 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-048.png");
    private static final ResourceLocation PAGE_49 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-049.png");
    private static final ResourceLocation PAGE_50 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-050.png");
    private static final ResourceLocation PAGE_51 = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/0001-051.png");

    /* Better Method for pages?
        int page = 0;
        int maxPage = 51;
        ResourceLocation currentPageRL;

        private ResourceLocation getPrevRL(){
            return page-1 >= 0 ? new ResourceLocation("textures/gui/Manga/0001-001.png") : null;
        }

        private ResourceLocation getNextRL(){
            return page+1 < maxPage ? new ResourceLocation("textures/gui/Manga/0001-002.png") : null;
        }
    */
    private static final ResourceLocation ARROW_LEFT = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/arrow_left.png");
    private static final ResourceLocation ARROW_LEFT_HOVER = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/arrow_left_hover.png");
    private static final ResourceLocation ARROW_RIGHT = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/arrow_right.png");
    private static final ResourceLocation ARROW_RIGHT_HOVER = new ResourceLocation(Tensura.MOD_ID, "textures/gui/Manga/arrow_right_hover.png");

    public Chapter1Screen(TextComponent chapter1ItemGui, Player pPlayer) {
        super(chapter1ItemGui, pPlayer);
    }

    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pHand);
        pPlayer.openItemGui(itemstack, pHand);
        pPlayer.awardStat(Stats.ITEM_USED.get(this));
        return InteractionResultHolder.sidedSuccess(itemstack, pLevel.isClientSide());
        if (pLevel.isClientSide) {
            Minecraft.getInstance().setScreen(new Chapter1Screen(new TextComponent("chapter1ItemGui"), pPlayer));

        }
    }
}
