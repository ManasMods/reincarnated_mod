package com.borniuus.tensura.item;

import com.borniuus.tensura.block.TensuraBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TensuraCreativeTab {
    public static final CreativeModeTab TENSURA_TAB = new CreativeModeTab("tensuraTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TensuraItems.MAGISTEEL_INGOT);
        }
    };


    public static final CreativeModeTab TENSURA_TAB2 = new CreativeModeTab("tensuraTab2") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TensuraBlocks.MAGISTEEL_BLOCK);
        }
    };


    public static final CreativeModeTab TENSURA_TAB3 = new CreativeModeTab("tensuraTab3") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TensuraItems.RAW_ANT_LEG);
        }
    };

    public static final CreativeModeTab TENSURA_TAB4 = new CreativeModeTab("tensuraTab4") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TensuraItems.MAGISTEEL_PICKAXE);
        }
    };


    public static final CreativeModeTab TENSURA_TAB5 = new CreativeModeTab("tensuraTab5") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TensuraItems.MAGISTEEL_SWORD);
        }
    };

    public static final CreativeModeTab TENSURA_TAB6 = new CreativeModeTab("tensuraTab6") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TensuraItems.RAW_ANT_LEG);
        }
    };
}


//Wearables, Weapons, Consumables, Blocks, Miscellaneous