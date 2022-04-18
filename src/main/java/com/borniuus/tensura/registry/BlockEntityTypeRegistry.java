package com.borniuus.tensura.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

class BlockEntityTypeRegistry {
    /**
     * This Method will register all Block Entities with their Blocks and BlockItems to Forge.
     * It is called though the {@link TensuraRegistry#register(IEventBus)} Method.
     */
    static void register(DeferredRegister<Item> itemRegistry, DeferredRegister<Block> blockRegistry, DeferredRegister<BlockEntityType<?>> blockEntityTypeRegistry) {
        registerBlockEntityType(blockEntityTypeRegistry);
        registerBlocks(blockRegistry);
        registerItems(itemRegistry);
    }

    /**
     * This Method is used to register all {@link BlockEntity} Objects to Forge.
     * You need to create a {@link BlockEntityType} using the {@link BlockEntityType.Builder#of(BlockEntityType.BlockEntitySupplier, Block...)} Method.
     */

    private static void registerBlockEntityType(DeferredRegister<BlockEntityType<?>> blockEntityTypeRegistry) {}

    /**
     * This Method is used to register the {@link Block} Object for a {@link BlockEntity}.
     * This has to be done for every created {@link BlockEntity}!
     */
    private static void registerBlocks(DeferredRegister<Block> registry) {}

    /**
     * This Method is used to register the {@link BlockItem} Object for a {@link BlockEntity}.
     * This has to be done for every created {@link BlockEntity}!
     */
    private static void registerItems(DeferredRegister<Item> registry) {}
}