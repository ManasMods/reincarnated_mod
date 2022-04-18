package com.borniuus.tensura.registry;

import com.borniuus.tensura.Tensura;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/** Class with all registries which are used in this Mod */
public class TensuraRegistry {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Tensura.MOD_ID);
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Tensura.MOD_ID);
    private static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Tensura.MOD_ID);
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Tensura.MOD_ID);
    private static final DeferredRegister<Motive> MOTIVE = DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, Tensura.MOD_ID);

    /**
     * Registers all registries.
     * This needs to be called in the Mod Constructor.
     *
     * @param modEventBus needs to be the modEventbus!
     */
    public static void register(IEventBus modEventBus) {
        BlockRegistry.register(ITEMS, BLOCKS); //Register Blocks with their BlockItems
        ItemRegistry.register(ITEMS); //Register Items to our Registry
        BlockEntityTypeRegistry.register(ITEMS, BLOCKS, BLOCK_ENTITY_TYPES); //Registers Block Entities including their Blocks and Items
        SoundEventRegistry.register(SOUND_EVENTS); //Register Sound Events
        MotiveRegistry.register(MOTIVE); //Register Motives for custom paintings

        // Add our Registries to Forge
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        BLOCK_ENTITY_TYPES.register(modEventBus);
        SOUND_EVENTS.register(modEventBus);
        MOTIVE.register(modEventBus);
    }
}
