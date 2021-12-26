package com.borniuus.tensura.registry;

import com.borniuus.tensura.block.LoomBlock;
import com.borniuus.tensura.block.LowerSlopedRoofBlock;
import com.borniuus.tensura.block.TensuraBlocks;
import com.borniuus.tensura.block.WindowBlock;
import com.borniuus.tensura.item.templates.SimpleBlock;
import com.borniuus.tensura.item.templates.SimpleBlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.SmithingTableBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import java.util.Collection;

class BlockRegistry {
    /**
     * This Method will register all Blocks with their BlockItems to Forge.
     * It is called though the {@link TensuraRegistry#register(IEventBus)} Method.
     */
    static void register(DeferredRegister<Item> itemRegistry, DeferredRegister<Block> blockRegistry) {
        registerBlocks(blockRegistry); // Registers all Blocks
        registerItems(itemRegistry); // Registers our custom BlockItems

        //Loads a list of all BlockItems which already exist
        Collection<ResourceLocation> registeredItems = itemRegistry.getEntries()
            .stream()
            .map(RegistryObject::getId)
            .toList();
        //Creates a SimpleBlockItems for all Block which didn't get a BlockItem yet
        blockRegistry.getEntries().forEach(registryObject -> {
            if (!registeredItems.contains(registryObject.getId())) {
                itemRegistry.register(registryObject.getId().getPath(), () -> new SimpleBlockItem(registryObject.get()));
            }
        });
    }

    /**
     * This Method will register all custom {@link Block} object to Forge.
     * This is also the place to add new Blocks.
     */
    private static void registerBlocks(DeferredRegister<Block> registry) {
        registry.register("silver_block", () -> new SimpleBlock(Material.METAL, properties -> properties
            .strength(4F)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()));

        registry.register("thatch_block", () -> new SimpleBlock(Material.WOOL, properties -> properties
            .strength(1.2F)
            .sound(SoundType.WOOL)));

        registry.register("magisteel_block", () -> new SimpleBlock(Material.METAL, properties -> properties
            .strength(9F)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()));

        registry.register("silver_ore_stone", () -> new SimpleBlock(Material.STONE, properties -> properties
            .strength(6F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));

        registry.register("silver_ore_deepslate", () -> new SimpleBlock(Material.STONE, properties -> properties
            .strength(6F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));

        registry.register("warp_pad", () -> new SimpleBlock(Material.STONE, properties -> properties
            .strength(8F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));

        registry.register("smithing_bench", () -> new SmithingTableBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(3.5f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
            .noOcclusion()));

        registry.register("loom", () -> new LoomBlock(BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.5F)
            .sound(SoundType.WOOD)
            .noOcclusion()));

        registry.register("cooking_pot", () -> new CampfireBlock(true, 1, BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2F)
            .sound(SoundType.WOOD)
            .noOcclusion()));

        //stairs
        registry.register("thatch_lower_sloped_roof", () -> new LowerSlopedRoofBlock(Blocks.STRIPPED_OAK_WOOD));

        registry.register("thatch_upper_sloped_roof", () -> new StairBlock(() -> TensuraBlocks.THATCH_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.4F)
            .sound(SoundType.WOOD)
            .noOcclusion()));

        registry.register("thatch_lower_steep_roof", () -> new StairBlock(() -> TensuraBlocks.THATCH_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.4F)
            .sound(SoundType.WOOD)
            .noOcclusion()));

        registry.register("thatch_upper_steep_roof", () -> new StairBlock(() -> TensuraBlocks.THATCH_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.4F)
            .sound(SoundType.WOOD)
            .noOcclusion()));

        registry.register("example_window", WindowBlock::new);
    }

    /**
     * This Method allows to create {@link BlockItem} objects with non-default settings.
     * They will be loaded before the defaulted {@link BlockItem} object will be initialized.
     */
    private static void registerItems(DeferredRegister<Item> registry) {
        //Custom BlockItems here
    }
}
