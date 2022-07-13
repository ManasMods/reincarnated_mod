package com.github.manasmods.tensura.gui.screen;

import com.github.manasmods.manascore.client.gui.widget.ImagePredicateButton;
import com.github.manasmods.tensura.Tensura;
import com.github.manasmods.unordinary_basics.utils.Translation;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.Widget;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.renderer.texture.MissingTextureAtlasSprite;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import org.lwjgl.opengl.GL11;

import javax.annotation.ParametersAreNonnullByDefault;

public class Chapter1Screen extends Screen {

    private static final ResourceLocation ARROW_LEFT = new ResourceLocation(Tensura.MOD_ID, "textures/gui/manga/arrow_left.png");
    private static final ResourceLocation ARROW_RIGHT = new ResourceLocation(Tensura.MOD_ID, "textures/gui/manga/arrow_right.png");

    private int page = 1; //Store the current page in the screen
    private final int maxPage = 51; //store the max amount of pages in the screen
    private ResourceLocation currentPageRL; //cache the current resource location

    private ImagePredicateButton backButton;
    private ImagePredicateButton forwardButton;

    public Chapter1Screen(Component pTitle) {
        super(pTitle);

        this.currentPageRL = this.getCurrentPageRL();
    }

    @Override
    protected void init() {
        super.init();

        this.backButton = new ImagePredicateButton(0, 0, 32, 16, ARROW_LEFT, this::OnPressBack, (pButton, pPoseStack, pMouseX, pMouseY) -> {}, () -> true);
        this.forwardButton = new ImagePredicateButton(0, 0, 32, 16, ARROW_RIGHT, this::OnPressForward, (pButton, pPoseStack, pMouseX, pMouseY) -> {}, () -> true);

        this.addRenderableWidget(this.backButton);
        this.addRenderableWidget(this.forwardButton);
    }

    private ResourceLocation getPrevPageRL() {
        return new ResourceLocation(Tensura.MOD_ID, String.format("textures/gui/manga/0001-%03d.png", page));
    }

    public void OnPressBack(Button button) {
        if(this.page > 1) {
            this.page--;

            this.currentPageRL = this.getCurrentPageRL();
        }
    }

    private ResourceLocation getNextPageRL() {
        return new ResourceLocation(Tensura.MOD_ID, String.format("textures/gui/manga/0001-%03d.png", page));
    }

    public void OnPressForward(Button button) {
        if(this.page < this.maxPage) {
            this.page++;

            this.currentPageRL = this.getCurrentPageRL();
        }
    }

    private ResourceLocation getCurrentPageRL(){
        return new ResourceLocation(Tensura.MOD_ID, String.format("textures/gui/manga/0001-%03d.png", page));
    }

    @Override
    public void render(PoseStack pPoseStack, int pMouseX, int pMouseY, float pPartialTick) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderTexture(0, this.currentPageRL);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

        this.forwardButton.x = (this.width) / 2 ;
        this.forwardButton.y = (this.height + 196) / 2 + 2;
        this.forwardButton.visible = this.page < this.maxPage;

        this.backButton.x = (this.width) / 2 - 40;
        this.backButton.y = (this.height + 196) / 2 + 2;
        this.backButton.visible = this.page > 1;

        this.blit(pPoseStack, (this.width - 135) / 2, (this.height - 196) / 2, 0, 0, 135, 196, 135, 196);

        for(Widget widget : this.renderables) {
            widget.render(pPoseStack, pMouseX, pMouseY, pPartialTick);
        }
    }

    @Override
    public boolean keyPressed(int pKeyCode, int pScanCode, int pModifiers) {
        //KEY_ENTER
        if(pKeyCode == 256) {
            Minecraft.getInstance().setScreen(null);

            return true;
        }

        return super.keyPressed(pKeyCode, pScanCode, pModifiers);
    }
}
