package com.borniuus.tensura.item;

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
            return new ItemStack(ModItems.SILVER_INGOT.get());
        }

    };
}
