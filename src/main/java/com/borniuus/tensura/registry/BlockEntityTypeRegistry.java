package com.borniuus.tensura.registry;

import com.borniuus.tensura.block.PrimitiveBedBlock;
import com.borniuus.tensura.block.TensuraBlocks;
import com.borniuus.tensura.blockentity.PrimitiveBedBlockEntity;
import com.borniuus.tensura.item.templates.SimpleBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
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

    private static void registerItems(DeferredRegister<Item> registry) {
        registry.register("primitive_bed", () -> new SimpleBlockItem(TensuraBlocks.PRIMITIVE_BED_BLOCK));
    }

    private static void registerBlocks(DeferredRegister<Block> registry) {
        registry.register("primitive_bed", PrimitiveBedBlock::new);
    }

    private static void registerBlockEntityType(DeferredRegister<BlockEntityType<?>> registry) {
        registry.register("primitive_bed", () -> BlockEntityType.Builder.of((pPos, pState) -> new PrimitiveBedBlockEntity(pPos, pState), TensuraBlocks.PRIMITIVE_BED_BLOCK).build(null));
    }
}
