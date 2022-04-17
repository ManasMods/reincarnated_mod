package com.borniuus.tensura.item;

import com.borniuus.tensura.block.TensuraBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TensuraCreativeTab {

    public static final CreativeModeTab WEAPONS = new CreativeModeTab("tensuratab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TensuraItems.LOW_MAGISTEEL_SWORD);
        }
    };

    public static final CreativeModeTab TOOLS = new CreativeModeTab("tensuratab2") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TensuraItems.LOW_MAGISTEEL_PICKAXE);
        }
    };

    public static final CreativeModeTab GEAR = new CreativeModeTab("tensuratab3") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TensuraItems.GIANT_ANT_LEG);
        }
    };

    public static final CreativeModeTab BLOCKS = new CreativeModeTab("tensuratab4") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TensuraBlocks.BLOCK_OF_MAGISTEEL);
        }
    };

    public static final CreativeModeTab CONSUMABLES = new CreativeModeTab("tensuratab5") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TensuraItems.BULLDEER_STEAK);
        }
    };

    public static final CreativeModeTab MISCELLANEOUS = new CreativeModeTab("tensuratab6") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TensuraItems.MAGISTEEL_INGOT);
        }
    };
}