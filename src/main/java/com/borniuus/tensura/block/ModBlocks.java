package com.borniuus.tensura.block;

import com.borniuus.Tensura;
import com.borniuus.tensura.item.ModCreativeModeTab;
import com.borniuus.tensura.item.ModItems;
import com.borniuus.tensura.item.custom.LoomBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Tensura.MOD_ID);

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4f).sound(SoundType.METAL).
                    requiresCorrectToolForDrops()),ModCreativeModeTab.TENSURA_TAB2);

    public static final RegistryObject<Block> THATCH_BLOCK = registerBlock("thatch_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).strength(1.2f).
                    sound(SoundType.WOOL)),ModCreativeModeTab.TENSURA_TAB2);

    public static final RegistryObject<Block> MAGISTEEL_BLOCK = registerBlock("magisteel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).sound(SoundType.METAL).
                    requiresCorrectToolForDrops()),ModCreativeModeTab.TENSURA_TAB2);

    public static final RegistryObject<Block> SILVER_ORE_STONE = registerBlock("silver_ore_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).sound(SoundType.STONE).
                    requiresCorrectToolForDrops()),ModCreativeModeTab.TENSURA_TAB2);

    public static final RegistryObject<Block> SILVER_ORE_DEEPSLATE = registerBlock("silver_ore_deepslate",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).sound(SoundType.STONE).
                    requiresCorrectToolForDrops()), ModCreativeModeTab.TENSURA_TAB2);

    public static final RegistryObject<Block> WARP_PAD = registerBlock("warp_pad",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(8f).sound(SoundType.STONE).
                    requiresCorrectToolForDrops()), ModCreativeModeTab.TENSURA_TAB2);

    public static final RegistryObject<Block> SMITHING_BENCH = registerBlock("smithing_bench",
            () -> new SmithingTableBlock(BlockBehaviour.Properties.of(Material.STONE).strength(3.5f).sound(SoundType.STONE).
                    requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.TENSURA_TAB2);

    public static final RegistryObject<Block> LOOM = registerBlock("loom",
            () -> new LoomBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5F).
                    sound(SoundType.WOOD).noOcclusion()),ModCreativeModeTab.TENSURA_TAB2);

    public static final RegistryObject<Block> COOKING_POT = registerBlock("cooking_pot",
            () -> new CampfireBlock(true, 1, BlockBehaviour.
                    Properties.of(Material.WOOD).strength(2F).
                    sound(SoundType.WOOD).noOcclusion()),ModCreativeModeTab.TENSURA_TAB2);

    //stairs
    public static final RegistryObject<Block> THATCH_LOWER_SLOPED_ROOF = registerBlock("thatch_lower_sloped_roof",
            () -> new StairBlock(() -> THATCH_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(2.4F).
                    sound(SoundType.WOOD).noOcclusion()),ModCreativeModeTab.TENSURA_TAB2);

    public static final RegistryObject<Block> THATCH_UPPER_SLOPED_ROOF = registerBlock("thatch_upper_sloped_roof",
            () -> new StairBlock(() -> THATCH_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(2.4F).
                            sound(SoundType.WOOD).noOcclusion()),ModCreativeModeTab.TENSURA_TAB2);

    public static final RegistryObject<Block> THATCH_LOWER_STEEP_ROOF = registerBlock("thatch_lower_steep_roof",
            () -> new StairBlock(() -> THATCH_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(2.4F).
                            sound(SoundType.WOOD).noOcclusion()),ModCreativeModeTab.TENSURA_TAB2);

    public static final RegistryObject<Block> THATCH_UPPER_STEEP_ROOF = registerBlock("thatch_upper_steep_roof",
            () -> new StairBlock(() -> THATCH_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(2.4F).
                            sound(SoundType.WOOD).noOcclusion()),ModCreativeModeTab.TENSURA_TAB2);





    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTab.TENSURA_TAB2)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

