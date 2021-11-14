package com.borniuus.tensura.item;

import com.borniuus.Tensura;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Tensura.MOD_ID);
//misc
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TENSURA_TAB)));

    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TENSURA_TAB)));

    public static final RegistryObject<Item> MAGISTEEL_INGOT = ITEMS.register("magisteel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TENSURA_TAB)));

   //food
    public static final RegistryObject<Item> RAW_ANT_LEG = ITEMS.register("raw_ant_leg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TENSURA_TAB3)
                    .food(new FoodProperties.Builder().nutrition(3).saturationMod(1f).build())));

    public static final RegistryObject<Item> RAW_KNIGHT_SPIDER_MEAT = ITEMS.register("raw_knight_spider_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TENSURA_TAB3)
                    .food(new FoodProperties.Builder().nutrition(3).saturationMod(1f).build())));

    public static final RegistryObject<Item> COOKED_ANT_LEG = ITEMS.register("cooked_ant_leg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TENSURA_TAB3)
                    .food(new FoodProperties.Builder().nutrition(6).saturationMod(4f).build())));

    public static final RegistryObject<Item> COOKED_KNIGHT_SPIDER_MEAT = ITEMS.register("cooked_knight_spider_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TENSURA_TAB3)
                    .food(new FoodProperties.Builder().nutrition(7).saturationMod(4f).build())));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
