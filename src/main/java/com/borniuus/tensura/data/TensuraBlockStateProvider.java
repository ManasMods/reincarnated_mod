package com.borniuus.tensura.data;

import com.borniuus.tensura.Tensura;
import com.borniuus.tensura.block.TensuraBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TensuraBlockStateProvider extends BlockStateProvider {
    public TensuraBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Tensura.MOD_ID, exFileHelper);
    }

    @Override
    //log blocks
    protected void registerStatesAndModels() {
        logBlock((RotatedPillarBlock) TensuraBlocks.PALM_LOG);
        logBlock((RotatedPillarBlock) TensuraBlocks.SAKURA_LOG);
        logBlock((RotatedPillarBlock) TensuraBlocks.THATCH_BLOCK);
        logBlock((RotatedPillarBlock) TensuraBlocks.DEEPSLATE_SILVER_ORE);
        //simpleBlock(TensuraBlocks.BLOCK_OF_ADAMANTITE);
        //simpleBlock(TensuraBlocks.BLOCK_OF_HIHIIROKANE);
        simpleBlock(TensuraBlocks.BLOCK_OF_MAGISTEEL);
        //simpleBlock(TensuraBlocks.BLOCK_OF_MITHRIL);
        //simpleBlock(TensuraBlocks.BLOCK_OF_RAW_SILVER);
        simpleBlock(TensuraBlocks.BLOCK_OF_SILVER);
        //simpleBlock(TensuraBlocks.MAGIC_ENGINE);
        simpleBlock(TensuraBlocks.PALM_LEAVES);
        //simpleBlock(TensuraBlocks.PALM_PLANKS);
        simpleBlock(TensuraBlocks.SAKURA_LEAVES);
        simpleBlock(TensuraBlocks.SAKURA_PLANKS);
        //simpleBlock(TensuraBlocks.SARASA_SAND);
        simpleBlock(TensuraBlocks.SILVER_ORE);
        //paneBlock(TensuraBlocks.EXAMPLE_WINDOW, new ResourceLocation("minecraft:block/glass"), new ResourceLocation("minecraft:block/glass_pane_top"));

    }

    private void defaultBlock(Block block) {
        getVariantBuilder(block).forAllStates(state -> ConfiguredModel.builder().modelFile(cubeAll(block)).build());
        itemModels().getBuilder(block.getRegistryName().getPath())
                .parent(new ModelFile.UncheckedModelFile(new ResourceLocation(Tensura.MOD_ID, "block/" + block.getRegistryName().getPath())));

    }

    /**
     * Generates blockstate, block and item model json file.
     * This Method can be used to for {@link Block} objects with different top and side textures.
     *
     * @param block has to be an instance of the {@link RotatedPillarBlock} class
     */
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
