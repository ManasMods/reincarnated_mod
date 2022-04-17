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

        logBlock((RotatedPillarBlock) TensuraBlocks.PALM_LOG);
        logBlock((RotatedPillarBlock) TensuraBlocks.SAKURA_LOG);
        logBlock((RotatedPillarBlock) TensuraBlocks.THATCH_BLOCK);
        logBlock((RotatedPillarBlock) TensuraBlocks.DEEPSLATE_SILVER_ORE);

        //BLOCKS WITH SAME TEXTURE ON ALL SIDES

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

        //STAIRS

        //stairsBlock((StairBlock) TensuraBlocks.PALM_STAIRS, new ResourceLocation("tensura:block/palm_planks"));
        stairsBlock((StairBlock) TensuraBlocks.SAKURA_STAIRS, new ResourceLocation("tensura:block/sakura_planks"));

        //SLABS

        //slabBlock((SlabBlock) TensuraBlocks.PALM_SLAB, new ResourceLocation("tensura:block/palm_planks"));
        slabBlock((SlabBlock) TensuraBlocks.SAKURA_SLAB, new ResourceLocation("tensura:block/sakura_planks"));

        //OTHER

        //paneBlock(TensuraBlocks.EXAMPLE_WINDOW, new ResourceLocation("minecraft:block/glass"), new ResourceLocation("minecraft:block/glass_pane_top"));

    }

    private void defaultBlock(Block block) {
        getVariantBuilder(block).forAllStates(state -> ConfiguredModel.builder().modelFile(cubeAll(block)).build());
        itemModels().getBuilder(block.getRegistryName().getPath())
                .parent(new ModelFile.UncheckedModelFile(new ResourceLocation(Tensura.MOD_ID,"block/" + block.getRegistryName().getPath())));

    }

    private void stairsBlock(Block block) { // <-- Method which only need a Block
        if (!(block instanceof StairBlock stairBlock)) { // Stairs need to be an instance of the StairBlock Object
            throw new IllegalArgumentException(block.getRegistryName().toString() + " is not a instance of StairBlock."); // If the block isn't a StairBlock Object we'll throw an error
        } else {
            ResourceLocation textureLocation = new ResourceLocation(Tensura.MOD_ID, "block/" + block.getRegistryName().getPath()); // This is the path to the texture file
            stairsBlock(stairBlock, textureLocation); // We're using the Minecraft method since it'll create anything we need
            itemModels().getBuilder(block.getRegistryName().getPath()).parent(new ModelFile.UncheckedModelFile(new ResourceLocation(Tensura.MOD_ID, "block/" + block.getRegistryName().getPath()))); // This create the Item Model for the Block
        }
    }

    private void slabBlock(Block block, ResourceLocation resourceLocation) { // <-- Method with a parameter of the Block object. Now we just need to find a valid ResourceLocation for out method invocation
        //Since we need to pass the path to the texture of the slab to the slabBlock method, we just create a variable with the type ResourceLocation and the value of the path to the required texture file.
        ResourceLocation textureLocation = new ResourceLocation(Tensura.MOD_ID, "block/" + block.getRegistryName().getPath()); // This is the path to the texture file (that path shouldn't be changed since forge binds us to this convention)

        //Now we got a Block and ResourceLocation value. Let's invoke the slabBlock method with those values
        slabBlock((SlabBlock) block,textureLocation, textureLocation); // We're passing the textureLocation to both parameters of the slabBlock method since out slab uses the same texture for a full-block (2 slabs on top of each other) and for the half-block state
    }
}

