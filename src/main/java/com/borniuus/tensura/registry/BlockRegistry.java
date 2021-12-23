package com.borniuus.tensura.registry;

import com.borniuus.tensura.block.TensuraBlocks;
import com.borniuus.tensura.item.templates.SimpleBlock;
import com.borniuus.tensura.item.templates.SimpleBlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CampfireBlock;
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
        registerBlocks(blockRegistry);
        registerItems(itemRegistry);

        Collection<ResourceLocation> registeredItems = itemRegistry.getEntries().stream().map(RegistryObject::getId).toList();
        blockRegistry.getEntries()
            .stream()
            .forEach(registryObject -> {
                if (!registeredItems.contains(registryObject.getId())) {
                    itemRegistry.register(registryObject.getId().getPath(), () -> new SimpleBlockItem(registryObject.get()));
                }
            });
    }

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

        registry.register("smithing_bench", () -> new SimpleBlock(Material.STONE, properties -> properties
            .strength(3.5F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
            .noOcclusion()));

        registry.register("loom", () -> new SimpleBlock(Material.WOOD, properties -> properties
            .strength(1.2F)
            .sound(SoundType.WOOD)
            .noOcclusion()));

        registry.register("cooking_pot", () -> new CampfireBlock(true, 1, BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2F)
            .sound(SoundType.WOOD)
            .noOcclusion()));

        //stairs
        registry.register("thatch_lower_sloped_roof", () -> new StairBlock(() -> TensuraBlocks.THATCH_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.4F)
            .sound(SoundType.WOOD)
            .noOcclusion()));

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
    }

    private static void registerItems(DeferredRegister<Item> registry) {
        //Custom BlockItems here
    }
}
