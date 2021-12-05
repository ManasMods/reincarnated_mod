package com.borniuus.tensura.item;

import com.borniuus.Tensura;
import com.borniuus.tensura.item.custom.SickleItem;
import com.borniuus.tensura.item.custom.ThatchItem;
import com.borniuus.tensura.util.ModSoundEvents;
import net.minecraft.sounds.Music;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Tensura.MOD_ID);
//misc
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TENSURA_TAB)));

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TENSURA_TAB)));

    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TENSURA_TAB)));

    public static final RegistryObject<Item> MAGISTEEL_INGOT = ITEMS.register("magisteel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TENSURA_TAB)));

    public static final RegistryObject<Item> THATCH = ITEMS.register("thatch",
            () -> new ThatchItem(new Item.Properties().tab(ModCreativeModeTab.TENSURA_TAB)));

    public static final RegistryObject<Item> LIKE_FLAMES_MUSIC_DISC = ITEMS.register("like_flames_music_disc",
            () -> new RecordItem(1, ModSoundEvents.LIKE_FLAMES,
                    (new Item.Properties()).stacksTo(1).tab((ModCreativeModeTab.TENSURA_TAB))));

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

    //swords by tiers
    public static final RegistryObject<Item> MAGISTEEL_SWORD = ITEMS.register("magisteel_sword",
            () -> new SwordItem(ModTiers.MAGISTEEL, 9, 1.6f,
                    new Item.Properties().tab(ModCreativeModeTab.TENSURA_TAB5)));

    //tools by tiers
    public static final RegistryObject<Item> MAGISTEEL_PICKAXE = ITEMS.register("magisteel_pickaxe",
            () -> new PickaxeItem(ModTiers.MAGISTEEL, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TENSURA_TAB4)));

    public static final RegistryObject<Item> MAGISTEEL_HOE = ITEMS.register("magisteel_hoe",
            () -> new HoeItem(ModTiers.MAGISTEEL,0, 1f,
                   new Item.Properties().tab(ModCreativeModeTab.TENSURA_TAB4)));

    public static final RegistryObject<Item> MAGISTEEL_SHOVEL = ITEMS.register("magisteel_shovel",
            () -> new ShovelItem(ModTiers.MAGISTEEL,0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TENSURA_TAB4)));

    public static final RegistryObject<Item> MAGISTEEL_AXE = ITEMS.register("magisteel_axe",
            () -> new AxeItem(ModTiers.MAGISTEEL, 4, -2f,
                    new Item.Properties().tab(ModCreativeModeTab.TENSURA_TAB4)));

    public static final RegistryObject<Item> DIAMOND_SICKLE = ITEMS.register("diamond_sickle",
            () -> new SickleItem(new Item.Properties().tab(ModCreativeModeTab.TENSURA_TAB4).durability(780)));

    public static final RegistryObject<Item> IRON_SICKLE = ITEMS.register("iron_sickle",
            () -> new SickleItem(new Item.Properties().tab(ModCreativeModeTab.TENSURA_TAB4).durability(250)));

    public static final RegistryObject<Item> STONE_SICKLE = ITEMS.register("stone_sickle",
            () -> new SickleItem(new Item.Properties().tab(ModCreativeModeTab.TENSURA_TAB4).durability(131)));


    private static <T extends Item> RegistryObject<T> registerItem(String registryId, Supplier<T> item) {
        return ITEMS.register(registryId, item);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
