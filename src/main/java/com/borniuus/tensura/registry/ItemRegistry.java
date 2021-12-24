package com.borniuus.tensura.registry;

import com.borniuus.tensura.item.ModTiers;
import com.borniuus.tensura.item.TensuraCreativeTab;
import com.borniuus.tensura.item.custom.IceBladeItem;
import com.borniuus.tensura.item.custom.SickleItem;
import com.borniuus.tensura.item.custom.ThatchItem;
import com.borniuus.tensura.item.templates.MusicDiscItem;
import com.borniuus.tensura.item.templates.SimpleAxeItem;
import com.borniuus.tensura.item.templates.SimpleFoodItem;
import com.borniuus.tensura.item.templates.SimpleHoeItem;
import com.borniuus.tensura.item.templates.SimplePickaxeItem;
import com.borniuus.tensura.item.templates.SimpleShovelItem;
import com.borniuus.tensura.item.templates.SimpleSwordItem;
import com.borniuus.tensura.sound.TensuraSounds;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

class ItemRegistry {
    /**
     * This Method will register all Items to Forge.
     * It is called though the {@link TensuraRegistry#register(IEventBus)} Method.
     */
    static void register(DeferredRegister<Item> registry) {
        //misc
        registry.register("silver_ingot", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("raw_silver", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("silver_nugget", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("magisteel_ingot", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("thatch", () -> new ThatchItem(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("scroll_of_slimes", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("like_flames_music_disc", () -> new MusicDiscItem(() -> TensuraSounds.LIKE_FLAMES));

        //food
        registry.register("raw_ant_leg", () -> new SimpleFoodItem(builder -> builder.nutrition(3).saturationMod(1F).meat()));
        registry.register("cooked_ant_leg", () -> new SimpleFoodItem(builder -> builder.nutrition(6).saturationMod(4F).meat()));
        registry.register("raw_knight_spider_meat", () -> new SimpleFoodItem(builder -> builder.nutrition(3).saturationMod(1F).meat()));
        registry.register("cooked_knight_spider_meat", () -> new SimpleFoodItem(builder -> builder.nutrition(7).saturationMod(4F).meat()));

        //swords by tiers
        registry.register("magisteel_sword", () -> new SimpleSwordItem(ModTiers.MAGISTEEL, 8, 1f));
        registry.register("ice_blade", () -> new IceBladeItem(ModTiers.UNIQUE, 9, 1f));

        //tools by tiers
        registry.register("magisteel_pickaxe", () -> new SimplePickaxeItem(ModTiers.MAGISTEEL, 0, 1f));

        registry.register("magisteel_hoe", () -> new SimpleHoeItem(ModTiers.MAGISTEEL, 0, 1f));

        registry.register("magisteel_shovel", () -> new SimpleShovelItem(ModTiers.MAGISTEEL, 0, 1f));

        registry.register("magisteel_axe", () -> new SimpleAxeItem(ModTiers.MAGISTEEL, 4, -2f));

        registry.register("diamond_sickle", () -> new SickleItem(780));
        registry.register("iron_sickle", () -> new SickleItem(250));
        registry.register("stone_sickle", () -> new SickleItem(131));
    }
}
