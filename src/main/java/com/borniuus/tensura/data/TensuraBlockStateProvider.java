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
    protected void registerStatesAndModels() {
        // Log Blocks
        log(TensuraBlocks.PALM_LOG);
        log(TensuraBlocks.SAKURA_LOG);
        log(TensuraBlocks.THATCH_BLOCK);
        log(TensuraBlocks.DEEPSLATE_SILVER_ORE);

        // Blocks
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
        //paneBlock(TensuraBlocks.EXAMPLE_WINDOW, new ResourceLocation("minecraft:block/glass"), new ResourceLocation("minecraft:block/glass_pane_top"));
    }

    /**
     * Generates blockstate, block and item model json file.
     * This Method can be used to for {@link Block} objects with only one texture.
     */
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
