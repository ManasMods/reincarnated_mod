package com.borniuus.tensura.item;

import com.borniuus.tensura.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TENSURA_TAB = new CreativeModeTab("tensuraTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MAGISTEEL_INGOT.get());
        }

    };


    public static final CreativeModeTab TENSURA_TAB2 = new CreativeModeTab("tensuraTab2") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.MAGISTEEL_BLOCK.get());
        }

    };


    public static final CreativeModeTab TENSURA_TAB3 = new CreativeModeTab("tensuraTab3") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_ANT_LEG.get());
        }

    };

    public static final CreativeModeTab TENSURA_TAB4 = new CreativeModeTab("tensuraTab4") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MAGISTEEL_PICKAXE.get());
        }
    };


    public static final CreativeModeTab TENSURA_TAB5 = new CreativeModeTab("tensuraTab5") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MAGISTEEL_SWORD.get());
        }

    };

    public static final CreativeModeTab TENSURA_TAB6 = new CreativeModeTab("tensuraTab6") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_ANT_LEG.get());
        }

    };
}


//Wearables, Weapons, Consumables, Blocks, Miscellaneous