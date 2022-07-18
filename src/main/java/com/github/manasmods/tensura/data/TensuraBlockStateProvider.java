package com.github.manasmods.tensura.data;

import com.github.manasmods.tensura.Tensura;
import com.github.manasmods.tensura.block.TensuraBlocks;
import com.github.manasmods.manascore.data.gen.BlockStateProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ModelBuilder;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

import java.util.Objects;

import static net.minecraftforge.client.model.generators.ModelProvider.BLOCK_FOLDER;

public class TensuraBlockStateProvider extends BlockStateProvider{

    public TensuraBlockStateProvider(GatherDataEvent gatherDataEvent) {
        super(gatherDataEvent, Tensura.MOD_ID);
    }

    @Override
    protected void generate() {
        //BLOCKS WITH DIFFERENT TOP + BOTTOM TO THE SIDES

        pillar(TensuraBlocks.PALM_LOG);
        pillar(TensuraBlocks.SAKURA_LOG);
        pillar(TensuraBlocks.THATCH_BLOCK);

        //BLOCKS WITH SAME TEXTURE ON ALL SIDES

        defaultBlock(TensuraBlocks.BLOCK_OF_ADAMANTITE);
        defaultBlock(TensuraBlocks.BLOCK_OF_HIHIIROKANE);
        defaultBlock(TensuraBlocks.BLOCK_OF_ORICHALCUM);
        defaultBlock(TensuraBlocks.BLOCK_OF_MAGISTEEL);
        defaultBlock(TensuraBlocks.BLOCK_OF_MITHRIL);
        defaultBlock(TensuraBlocks.DEEPSLATE_SILVER_ORE);
        //defaultBlock(TensuraBlocks.BLOCK_OF_RAW_SILVER);
        defaultBlock(TensuraBlocks.BLOCK_OF_SILVER);
        //defaultBlock(TensuraBlocks.MAGIC_ENGINE);
        defaultBlock(TensuraBlocks.PALM_LEAVES);
        defaultBlock(TensuraBlocks.PALM_PLANKS);
        defaultBlock(TensuraBlocks.SAKURA_LEAVES);
        defaultBlock(TensuraBlocks.SAKURA_PLANKS);
        //defaultBlock(TensuraBlocks.SARASA_SAND);
        defaultBlock(TensuraBlocks.SILVER_ORE);

        defaultBlock(TensuraBlocks.LABYRINTH_BRICK_TL);
        defaultBlock(TensuraBlocks.LABYRINTH_BRICK_TR);
        defaultBlock(TensuraBlocks.LABYRINTH_BRICK_BL);
        defaultBlock(TensuraBlocks.LABYRINTH_BRICK_BR);
        defaultBlock(TensuraBlocks.LABYRINTH_STONE_TL);
        defaultBlock(TensuraBlocks.LABYRINTH_STONE_TR);
        defaultBlock(TensuraBlocks.LABYRINTH_STONE_BL);
        defaultBlock(TensuraBlocks.LABYRINTH_STONE_BR);
        
        // BLOCKS WITH DIFFERENT FACE

        //METHOD FROM KAUPEN SERVER//horizontalBlock(TensuraBlocks.LABYRINTH_LIT_LAMP_TL, models().orientableVertical(String.valueOf(TensuraBlocks.LABYRINTH_LIT_LAMP_TL), modLoc("block/labyrinth_lamp_tr"), modLoc("block/labyrinth_lit_lamp_tl")));
        //METHOD FROM PROFESSOR//orientableVertical(TensuraBlocks.LABYRINTH_LIT_LAMP_TL,modLoc("labyrinth_lamp_tr"),modLoc("labyrinth_lit_lamp_tl"));


        //STAIRS

        stairs(TensuraBlocks.PALM_STAIRS, TensuraBlocks.PALM_PLANKS);
        stairs(TensuraBlocks.SAKURA_STAIRS, TensuraBlocks.SAKURA_PLANKS);
        stairs(TensuraBlocks.THATCH_STAIRS, TensuraBlocks.THATCH_BLOCK);

        //SLABS

        slab(TensuraBlocks.PALM_SLAB, TensuraBlocks.PALM_PLANKS);
        slab(TensuraBlocks.SAKURA_SLAB, TensuraBlocks.SAKURA_PLANKS);
        slab(TensuraBlocks.THATCH_SLAB, TensuraBlocks.THATCH_BLOCK);

        //OTHER

        //paneBlock(TensuraBlocks.EXAMPLE_WINDOW, new ResourceLocation("minecraft:block/glass"), new ResourceLocation("minecraft:block/glass_pane_top"));
    }

    protected void orientableVertical(Block block, ResourceLocation side, ResourceLocation front) {
        getVariantBuilder(block).forAllStates(blockState -> ConfiguredModel.builder().modelFile(models().orientableVertical(Objects.requireNonNull(block.getRegistryName()).toString(), side, front)).build());
        itemModels().getBuilder(Objects.requireNonNull(block.getRegistryName()).getPath())
                .parent(new ModelFile.UncheckedModelFile(modLoc("block/" + block.getRegistryName().getPath())));
    }

}

