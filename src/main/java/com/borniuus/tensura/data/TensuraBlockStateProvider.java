package com.borniuus.tensura.data;

import com.borniuus.tensura.Tensura;
import com.borniuus.tensura.block.TensuraBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TensuraBlockStateProvider extends BlockStateProvider {
    public TensuraBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Tensura.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        //BLOCKS WITH DIFFERENT TOP + BOTTOM TO THE SIDES

        log((RotatedPillarBlock) TensuraBlocks.PALM_LOG);
        log((RotatedPillarBlock) TensuraBlocks.SAKURA_LOG);
        log((RotatedPillarBlock) TensuraBlocks.THATCH_BLOCK);
        log((RotatedPillarBlock) TensuraBlocks.DEEPSLATE_SILVER_ORE);

        //BLOCKS WITH SAME TEXTURE ON ALL SIDES

        //defaultBlock(TensuraBlocks.BLOCK_OF_ADAMANTITE);
        //defaultBlock(TensuraBlocks.BLOCK_OF_HIHIIROKANE);
        defaultBlock(TensuraBlocks.BLOCK_OF_MAGISTEEL);
        //defaultBlock(TensuraBlocks.BLOCK_OF_MITHRIL);
        //defaultBlock(TensuraBlocks.BLOCK_OF_RAW_SILVER);
        defaultBlock(TensuraBlocks.BLOCK_OF_SILVER);
        //defaultBlock(TensuraBlocks.MAGIC_ENGINE);
        defaultBlock(TensuraBlocks.PALM_LEAVES);
        //defaultBlock(TensuraBlocks.PALM_PLANKS);
        defaultBlock(TensuraBlocks.SAKURA_LEAVES);
        defaultBlock(TensuraBlocks.SAKURA_PLANKS);
        //defaultBlock(TensuraBlocks.SARASA_SAND);
        defaultBlock(TensuraBlocks.SILVER_ORE);

        //STAIRS

        //stairsBlock((StairBlock) TensuraBlocks.PALM_STAIRS, TensuraBlocks.PALM_PLANKS);
        stairsBlock((StairBlock) TensuraBlocks.SAKURA_STAIRS, TensuraBlocks.SAKURA_PLANKS);
        stairsBlock((StairBlock) TensuraBlocks.THATCH_STAIRS, TensuraBlocks.THATCH_BLOCK);

        //SLABS

        //slabBlock((SlabBlock) TensuraBlocks.PALM_SLAB, TensuraBlocks.PALM_PLANKS);
        slabBlock((SlabBlock) TensuraBlocks.SAKURA_SLAB, TensuraBlocks.SAKURA_PLANKS);
        slabBlock((SlabBlock) TensuraBlocks.THATCH_SLAB, TensuraBlocks.THATCH_BLOCK);

        //OTHER

        //paneBlock(TensuraBlocks.EXAMPLE_WINDOW, new ResourceLocation("minecraft:block/glass"), new ResourceLocation("minecraft:block/glass_pane_top"));

    }

    private void defaultBlock(Block block) {
        getVariantBuilder(block).forAllStates(state -> ConfiguredModel.builder().modelFile(cubeAll(block)).build());
        itemModels().getBuilder(block.getRegistryName().getPath())
                .parent(new ModelFile.UncheckedModelFile(new ResourceLocation(Tensura.MOD_ID, "block/" + block.getRegistryName().getPath())));
    }
    /**
     * Generates blockstate, block and item model json file.
     *
     * @param stairBlock   the {@link StairBlock} Object
     * @param textureBlock the {@link Block} you want to use as texture
     */
    private void stairsBlock(Block stairBlock, Block textureBlock) {
        if (!(stairBlock instanceof StairBlock block)) {
            throw new IllegalArgumentException(stairBlock.getRegistryName().toString() + " is not a instance of StairBlock.");
        } else {
            stairsBlock(block, new ResourceLocation(Tensura.MOD_ID, "block/" + textureBlock.getRegistryName().getPath()));
            itemModels().getBuilder(block.getRegistryName().getPath())
                    .parent(new ModelFile.UncheckedModelFile(new ResourceLocation(Tensura.MOD_ID, "block/" + block.getRegistryName().getPath())));
        }
    }
    private void slabBlock(Block slabBlock, Block textureBlock) {
        if (!(slabBlock instanceof SlabBlock block)) {
            throw new IllegalArgumentException(slabBlock.getRegistryName().toString() + " is not a instance of StairBlock.");
        } else {
            slabBlock(block, new ResourceLocation(Tensura.MOD_ID, "block/" + textureBlock.getRegistryName().getPath()), new ResourceLocation(Tensura.MOD_ID, "block/" + textureBlock.getRegistryName().getPath()));
            itemModels().getBuilder(block.getRegistryName().getPath())
                    .parent(new ModelFile.UncheckedModelFile(new ResourceLocation(Tensura.MOD_ID, "block/" + block.getRegistryName().getPath())));
        }
    }
    private void log(Block block) {
        if (!(block instanceof RotatedPillarBlock rotatedPillarBlock)) {
            throw new IllegalArgumentException(block.getRegistryName().toString() + " is not a instance of RotatedPillarBlock.");
        } else {
            logBlock(rotatedPillarBlock);
            itemModels().getBuilder(block.getRegistryName().getPath())
                    .parent(new ModelFile.UncheckedModelFile(new ResourceLocation(Tensura.MOD_ID, "block/" + block.getRegistryName().getPath())));
        }
    }
}

