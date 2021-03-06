package com.github.manasmods.tensura.registry;

import com.github.manasmods.tensura.item.templates.SimpleBlockItem;
import com.github.manasmods.tensura.block.CookingPotBlock;
import com.github.manasmods.tensura.block.LoomBlock;
import com.github.manasmods.tensura.block.SimpleLeaves;
import com.github.manasmods.tensura.block.SimpleLog;
import com.github.manasmods.tensura.block.SmithingBenchBlock;
import com.github.manasmods.tensura.block.TensuraBlocks;
import com.github.manasmods.tensura.block.TensuraSapling;
import com.github.manasmods.tensura.block.SimpleBlock;
import com.github.manasmods.tensura.world.tree.grower.PalmTreeGrower;
import com.github.manasmods.tensura.world.tree.grower.SakuraTreeGrower;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

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
     */
    private static void registerBlocks(DeferredRegister<Block> registry) {
        registerStorageBlocks(registry);
        registerOreBlocks(registry);
        registerTreeBlocks(registry);
        registerMiscBlocks(registry);
    }

    /**
     * Method to register tree {@link Block} objects.
     * Add all wooden and tree blocks here.
     */
    private static void registerTreeBlocks(DeferredRegister<Block> registry) {
        //Palm Tree Blocks
        registry.register("palm_leaves", SimpleLeaves::new);

        registry.register("palm_log", () -> new SimpleLog(MaterialColor.TERRACOTTA_WHITE, MaterialColor.COLOR_BROWN));

        registry.register("palm_planks", () -> new SimpleBlock(Material.WOOD, properties -> properties
            .strength(1F)
            .sound(SoundType.WOOD)));

        registry.register("palm_stairs", () -> new StairBlock(() -> TensuraBlocks.PALM_PLANKS.defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD)
                .strength(2F)
                .sound(SoundType.WOOD)));

        registry.register("palm_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2F)
            .sound(SoundType.WOOD)));

        registry.register("palm_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2F)
            .sound(SoundType.WOOD)));

        registry.register("palm_sapling", () -> new TensuraSapling(new PalmTreeGrower()));

        //Sakura Tree Blocks
        registry.register("sakura_leaves", SimpleLeaves::new);

        registry.register("sakura_log", () -> new SimpleLog(MaterialColor.TERRACOTTA_ORANGE, MaterialColor.COLOR_LIGHT_GRAY));

        registry.register("sakura_sapling", () -> new TensuraSapling(new SakuraTreeGrower()));

        registry.register("sakura_planks", () -> new SimpleBlock(Material.WOOD, properties -> properties
            .strength(1F)
            .sound(SoundType.WOOD)));

        registry.register("sakura_stairs", () -> new StairBlock(() -> TensuraBlocks.PALM_PLANKS.defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD)
                .strength(2F)
                .sound(SoundType.WOOD)));

        registry.register("sakura_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2F)
            .sound(SoundType.WOOD)));

        registry.register("sakura_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2F)
            .sound(SoundType.WOOD)));
    }

    /**
     * Method to register ore {@link Block} objects.
     * Add all Ores here.
     */
    private static void registerOreBlocks(DeferredRegister<Block> registry) {
        registry.register("silver_ore", () -> new SimpleBlock(Material.STONE, properties -> properties
            .strength(1F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()));

        registry.register("deepslate_silver_ore", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
            .strength(2)
            .sound(SoundType.STONE)));
    }

    /**
     * Method to register storage {@link Block} objects
     * Add all Storage Blocks here.
     */
    private static void registerStorageBlocks(DeferredRegister<Block> registry) {
        registry.register("block_of_adamantite", () -> new SimpleBlock(Material.METAL, properties -> properties
            .strength(1F)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()));

        registry.register("block_of_hihiirokane", () -> new SimpleBlock(Material.METAL, properties -> properties
            .strength(1F)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()));

        registry.register("block_of_magisteel", () -> new SimpleBlock(Material.METAL, properties -> properties
            .strength(1F)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()));

        registry.register("block_of_mithril", () -> new SimpleBlock(Material.METAL, properties -> properties
            .strength(1F)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()));

        registry.register("block_of_orichalcum", () -> new SimpleBlock(Material.METAL, properties -> properties
            .strength(1F)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()));

        registry.register("block_of_raw_silver", () -> new SimpleBlock(Material.METAL, properties -> properties
            .strength(1F)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()));

        registry.register("block_of_silver", () -> new SimpleBlock(Material.METAL, properties -> properties
            .strength(1F)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()));
    }

    /**
     * Method to register misc {@link Block} objects
     * If no other register method matches the {@link Block} category, add it here.
     */
    private static void registerMiscBlocks(DeferredRegister<Block> registry) {
        registry.register("cooking_pot", () -> new CookingPotBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(1F)
            .sound(SoundType.STONE)
            .noOcclusion()
            .requiresCorrectToolForDrops()));

        registry.register("loom", () -> new LoomBlock(Material.WOOD, properties -> properties
            .strength(1F)
            .sound(SoundType.WOOD)
            .noOcclusion()
            .requiresCorrectToolForDrops()));

        registry.register("magic_engine", () -> new SimpleBlock(Material.STONE, properties -> properties
            .strength(1F)
            .sound(SoundType.AMETHYST_CLUSTER)
            .requiresCorrectToolForDrops()));

        registry.register("smithing_bench", () -> new SmithingBenchBlock(Material.NETHER_WOOD, properties -> properties
            .strength(1F)
            .sound(SoundType.ANVIL)
            .noOcclusion()
            .requiresCorrectToolForDrops()));

        registry.register("sarasa_sand", () -> new SimpleBlock(Material.SAND, properties -> properties
            .strength(0.5F)
            .sound(SoundType.SAND)));

        registry.register("thatch_block", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
            .strength(2)
            .sound(SoundType.GRASS)));

        registry.register("thatch_stairs", () -> new StairBlock(() -> TensuraBlocks.PALM_PLANKS.defaultBlockState(),
            BlockBehaviour.Properties.of(Material.LEAVES)
                .strength(2F)
                .sound(SoundType.GRASS)));

        registry.register("thatch_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.LEAVES)
            .strength(2F)
            .sound(SoundType.GRASS)));

        registry.register("warp_pad", () -> new SimpleBlock(Material.STONE, properties -> properties
            .strength(1F)
            .sound(SoundType.STONE)
            .noOcclusion()
            .requiresCorrectToolForDrops()));

        /** Labyrinth Stuff **/

        registry.register("labyrinth_brick_tl", () -> new SimpleBlock(Material.STONE, properties -> properties
                .strength(-1.0F, 3600000.0F)
                .noDrops()));

        registry.register("labyrinth_brick_tr", () -> new SimpleBlock(Material.STONE, properties -> properties
                .strength(-1.0F, 3600000.0F)
                .noDrops()));

        registry.register("labyrinth_brick_bl", () -> new SimpleBlock(Material.STONE, properties -> properties
                .strength(-1.0F, 3600000.0F)
                .noDrops()));

        registry.register("labyrinth_brick_br", () -> new SimpleBlock(Material.STONE, properties -> properties
                .strength(-1.0F, 3600000.0F)
                .noDrops()));

        registry.register("labyrinth_stone_tl", () -> new SimpleBlock(Material.STONE, properties -> properties
                .strength(-1.0F, 3600000.0F)
                .noDrops()));

        registry.register("labyrinth_stone_tr", () -> new SimpleBlock(Material.STONE, properties -> properties
                .strength(-1.0F, 3600000.0F)
                .noDrops()));

        registry.register("labyrinth_stone_bl", () -> new SimpleBlock(Material.STONE, properties -> properties
                .strength(-1.0F, 3600000.0F)
                .noDrops()));

        registry.register("labyrinth_stone_br", () -> new SimpleBlock(Material.STONE, properties -> properties
                .strength(-1.0F, 3600000.0F)
                .noDrops()));
    }

    /**
     * This Method allows to create {@link BlockItem} objects with non-default settings.
     * They will be loaded before the defaulted {@link BlockItem} object will be initialized.
     */
    static void registerItems(DeferredRegister<Item> registry) {
        //Custom BlockItems here
    }
}
