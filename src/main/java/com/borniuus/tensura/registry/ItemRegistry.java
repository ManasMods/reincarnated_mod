package com.borniuus.tensura.registry;

import com.borniuus.tensura.item.TensuraToolTiers;
import com.borniuus.tensura.item.TensuraCreativeTab;
import com.borniuus.tensura.item.custom.IceBladeItem;
import com.borniuus.tensura.item.templates.MusicDiscItem;
import com.borniuus.tensura.item.templates.SimpleAxeItem;
import com.borniuus.tensura.item.templates.SimpleFoodItem;
import com.borniuus.tensura.item.templates.SimpleHoeItem;
import com.borniuus.tensura.item.templates.SimplePickaxeItem;
import com.borniuus.tensura.item.templates.SimpleShovelItem;
import com.borniuus.tensura.item.templates.SimpleSwordItem;
import com.borniuus.tensura.sound.TensuraSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

class ItemRegistry {
    /**
     * This Method will register all Items to Forge.
     * It is called though the {@link TensuraRegistry#register(IEventBus)} Method.
     */
    static void register(DeferredRegister<Item> registry) {
        registerMisc(registry);
        registerFood(registry);
        registerWeapons(registry);
        registerTools(registry);
    }

    /** Method to register tool {@link Item} objects */
    private static void registerTools(DeferredRegister<Item> registry) {
        registry.register("wooden_sickle", () -> new SimpleHoeItem(Tiers.WOOD, 1, 1));
        registry.register("golden_sickle", () -> new SimpleHoeItem(Tiers.GOLD, 1, 1));
        registry.register("flint_pickaxe", () -> new SimplePickaxeItem(TensuraToolTiers.FLINT, 1, 1));
        registry.register("flint_axe", () -> new SimpleAxeItem(TensuraToolTiers.FLINT, 1, 1));
        registry.register("flint_shovel", () -> new SimpleShovelItem(TensuraToolTiers.FLINT, 1, 1));
        registry.register("flint_hoe", () -> new SimpleHoeItem(TensuraToolTiers.FLINT, 1, 1));
        registry.register("flint_sickle", () -> new SimpleHoeItem(TensuraToolTiers.FLINT, 1, 1));
        registry.register("silver_pickaxe", () -> new SimplePickaxeItem(TensuraToolTiers.SILVER, 1, 1));
        registry.register("silver_axe", () -> new SimpleAxeItem(TensuraToolTiers.SILVER, 1, 1));
        registry.register("silver_shovel", () -> new SimpleShovelItem(TensuraToolTiers.SILVER, 1, 1));
        registry.register("silver_hoe", () -> new SimpleHoeItem(TensuraToolTiers.SILVER, 1, 1));
        registry.register("silver_sickle", () -> new SimpleHoeItem(TensuraToolTiers.SILVER, 1, 1));
        registry.register("iron_sickle", () -> new SimplePickaxeItem(Tiers.IRON, 1, 1));
        registry.register("diamond_sickle", () -> new SimpleHoeItem(Tiers.DIAMOND, 1, 1));
        registry.register("low_magisteel_pickaxe", () -> new SimplePickaxeItem(TensuraToolTiers.LOW_MAGISTEEL, 1, 1));
        registry.register("low_magisteel_axe", () -> new SimpleAxeItem(TensuraToolTiers.LOW_MAGISTEEL, 1, 1));
        registry.register("low_magisteel_shovel", () -> new SimpleShovelItem(TensuraToolTiers.LOW_MAGISTEEL, 1, 1));
        registry.register("low_magisteel_hoe", () -> new SimpleHoeItem(TensuraToolTiers.LOW_MAGISTEEL, 1, 1));
        registry.register("low_magisteel_sickle", () -> new SimpleHoeItem(TensuraToolTiers.LOW_MAGISTEEL, 1, 1));
        registry.register("netherite_sickle", () -> new SimpleHoeItem(Tiers.NETHERITE, 1, 1));
        registry.register("high_magisteel_pickaxe", () -> new SimplePickaxeItem(TensuraToolTiers.HIGH_MAGISTEEL, 1, 1));
        registry.register("high_magisteel_axe", () -> new SimpleAxeItem(TensuraToolTiers.HIGH_MAGISTEEL, 1, 1));
        registry.register("high_magisteel_shovel", () -> new SimpleShovelItem(TensuraToolTiers.HIGH_MAGISTEEL, 1, 1));
        registry.register("high_magisteel_hoe", () -> new SimpleHoeItem(TensuraToolTiers.HIGH_MAGISTEEL, 1, 1));
        registry.register("high_magisteel_sickle", () -> new SimpleHoeItem(TensuraToolTiers.HIGH_MAGISTEEL, 1, 1));
        registry.register("mithril_pickaxe", () -> new SimplePickaxeItem(TensuraToolTiers.MITHRIL, 1, 1));
        registry.register("mithril_axe", () -> new SimpleAxeItem(TensuraToolTiers.MITHRIL, 1, 1));
        registry.register("mithril_shovel", () -> new SimpleShovelItem(TensuraToolTiers.MITHRIL, 1, 1));
        registry.register("mithril_hoe", () -> new SimpleHoeItem(TensuraToolTiers.MITHRIL, 1, 1));
        registry.register("mithril_sickle", () -> new SimpleHoeItem(TensuraToolTiers.MITHRIL, 1, 1));
        registry.register("orichalcum_pickaxe", () -> new SimplePickaxeItem(TensuraToolTiers.ORICHALCUM, 1, 1));
        registry.register("orichalcum_axe", () -> new SimpleAxeItem(TensuraToolTiers.ORICHALCUM, 1, 1));
        registry.register("orichalcum_shovel", () -> new SimpleShovelItem(TensuraToolTiers.ORICHALCUM, 1, 1));
        registry.register("orichalcum_hoe", () -> new SimpleHoeItem(TensuraToolTiers.ORICHALCUM, 1, 1));
        registry.register("orichalcum_sickle", () -> new SimpleHoeItem(TensuraToolTiers.ORICHALCUM, 1, 1));
        registry.register("pure_magisteel_pickaxe", () -> new SimplePickaxeItem(TensuraToolTiers.PURE_MAGISTEEL, 1, 1));
        registry.register("pure_magisteel_axe", () -> new SimpleAxeItem(TensuraToolTiers.PURE_MAGISTEEL, 1, 1));
        registry.register("pure_magisteel_shovel", () -> new SimpleShovelItem(TensuraToolTiers.PURE_MAGISTEEL, 1, 1));
        registry.register("pure_magisteel_hoe", () -> new SimpleHoeItem(TensuraToolTiers.PURE_MAGISTEEL, 1, 1));
        registry.register("pure_magisteel_sickle", () -> new SimpleHoeItem(TensuraToolTiers.PURE_MAGISTEEL, 1, 1));
        registry.register("adamantite_pickaxe", () -> new SimplePickaxeItem(TensuraToolTiers.ADAMANTITE, 1, 1));
        registry.register("adamantite_axe", () -> new SimpleAxeItem(TensuraToolTiers.ADAMANTITE, 1, 1));
        registry.register("adamantite_shovel", () -> new SimpleShovelItem(TensuraToolTiers.ADAMANTITE, 1, 1));
        registry.register("adamantite_hoe", () -> new SimpleHoeItem(TensuraToolTiers.ADAMANTITE, 1, 1));
        registry.register("adamantite_sickle", () -> new SimpleHoeItem(TensuraToolTiers.ADAMANTITE, 1, 1));
        registry.register("hihiirokane_pickaxe", () -> new SimplePickaxeItem(TensuraToolTiers.HIHIIROKANE, 1, 1));
        registry.register("hihiirokane_axe", () -> new SimpleAxeItem(TensuraToolTiers.HIHIIROKANE, 1, 1));
        registry.register("hihiirokane_shovel", () -> new SimpleShovelItem(TensuraToolTiers.HIHIIROKANE, 1, 1));
        registry.register("hihiirokane_hoe", () -> new SimpleHoeItem(TensuraToolTiers.HIHIIROKANE, 1, 1));
        registry.register("hihiirokane_sickle", () -> new SimpleHoeItem(TensuraToolTiers.HIHIIROKANE, 1, 1));
    }

    /** Method to register weapon {@link Item} objects */
    private static void registerWeapons(DeferredRegister<Item> registry) {
        //unqiue weapons
        registry.register("ice_blade", () -> new IceBladeItem(TensuraToolTiers.UNIQUE, 9, 1));

        //weapons by tiers
        registry.register("flint_sword", () -> new SimpleSwordItem(TensuraToolTiers.FLINT, 1, 1));
        registry.register("silver_sword", () -> new SimpleSwordItem(TensuraToolTiers.SILVER, 1, 1));
        registry.register("low_magisteel_sword", () -> new SimpleSwordItem(TensuraToolTiers.LOW_MAGISTEEL, 1, 1));
        registry.register("high_magisteel_sword", () -> new SimpleSwordItem(TensuraToolTiers.HIGH_MAGISTEEL, 1, 1));
        registry.register("mithril_sword", () -> new SimpleSwordItem(TensuraToolTiers.MITHRIL, 1, 1));
        registry.register("orichalcum_sword", () -> new SimpleSwordItem(TensuraToolTiers.ORICHALCUM, 1, 1));
        registry.register("pure_magisteel_sword", () -> new SimpleSwordItem(TensuraToolTiers.PURE_MAGISTEEL, 1, 1));
        registry.register("adamantite_sword", () -> new SimpleSwordItem(TensuraToolTiers.ADAMANTITE, 1, 1));
        registry.register("hihiirokane_sword", () -> new SimpleSwordItem(TensuraToolTiers.HIHIIROKANE, 1, 1));
    }

    /** Method to register misc {@link Item} objects */
    private static void registerMisc(DeferredRegister<Item> registry) {
        registry.register("adamantite_ingot", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("armoursaurus_scale", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("bronze_coin", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("charybdis_scale", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("direwolf_pelt", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("gehenna_moth_silk", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("giant_ant_carapace", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("giant_ant_leg", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("giant_bat_wing", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("gold_coin", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("hell_moth_silk", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("high_quality_magic_crystal", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("hihiirokane_ingot", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("insectar_carapace", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("knight_spider_carapace", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("knight_spider_leg", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("large_wooden_bowl", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("like_flames_music_disc", () -> new MusicDiscItem(() -> TensuraSounds.LIKE_FLAMES));
        registry.register("low_quality_magic_crystal", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("magic_stone", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("magisteel_ingot", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("medium_quality_magic_crystal", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("mithril_ingot", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("orichalcum_ingot", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("raw_silver", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("scroll_of_slimes", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("serpent_scale", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("silver_coin", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("silver_ingot", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("silver_nugget", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("sissie_fin", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("spider_fang", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("spirit_core", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("stella_gold_coin", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
        registry.register("thatch", () -> new Item(new Item.Properties().tab(TensuraCreativeTab.MISCELLANEOUS)));
    }

    /** Method to register eatable {@link Item} objects */
    private static void registerFood(DeferredRegister<Item> registry) {
        registry.register("bulldeer_beef", () -> new SimpleFoodItem(builder -> builder.nutrition(5).saturationMod(0.4F).meat()));
        registry.register("bulldeer_steak", () -> new SimpleFoodItem(builder -> builder.nutrition(10).saturationMod(0.9F).meat()));
        registry.register("bulldeer_shish_kebab", () -> new SimpleFoodItem(builder -> builder.nutrition(16).saturationMod(1F).meat()));
        registry.register("raw_giant_ant_meat", () -> new SimpleFoodItem(builder -> builder.nutrition(3).saturationMod(0.4F).meat()));
        registry.register("cooked_giant_ant_meat", () -> new SimpleFoodItem(builder -> builder.nutrition(8).saturationMod(0.9F).meat()));
        registry.register("raw_giant_bat_meat", () -> new SimpleFoodItem(builder -> builder.nutrition(3).saturationMod(0.4F).meat()));
        registry.register("cooked_giant_bat_meat", () -> new SimpleFoodItem(builder -> builder.nutrition(8).saturationMod(0.9F).meat()));
        registry.register("raw_knight_spider_meat", () -> new SimpleFoodItem(builder -> builder.nutrition(4).saturationMod(0.4F).meat()));
        registry.register("cooked_knight_spider_meat", () -> new SimpleFoodItem(builder -> builder.nutrition(9).saturationMod(0.9F).meat()));
        registry.register("raw_armoursaurus_meat", () -> new SimpleFoodItem(builder -> builder.nutrition(4).saturationMod(0.4F).meat()));
        registry.register("cooked_armoursaurus_meat", () -> new SimpleFoodItem(builder -> builder.nutrition(9).saturationMod(0.9F).meat()));
        registry.register("raw_charybdis_meat", () -> new SimpleFoodItem(builder -> builder.nutrition(9).saturationMod(0.5F).meat()));
        registry.register("charybdis_sashimi", () -> new SimpleFoodItem(builder -> builder.nutrition(16).saturationMod(1.2F).meat()));
        registry.register("cooked_charybdis_meat", () -> new SimpleFoodItem(builder -> builder.nutrition(18).saturationMod(1F).meat()));
        registry.register("raw_serpent_meat", () -> new SimpleFoodItem(builder -> builder.nutrition(4).saturationMod(0.4F).meat()));
        registry.register("cooked_serpent_meat", () -> new SimpleFoodItem(builder -> builder.nutrition(9).saturationMod(0.9F).meat()));
        registry.register("raw_spear_toro_meat", () -> new SimpleFoodItem(builder -> builder.nutrition(5).saturationMod(0.4F).meat()));
        registry.register("spear_toro_sashimi", () -> new SimpleFoodItem(builder -> builder.nutrition(10).saturationMod(1F).meat()));
        registry.register("cooked_spear_toro_meat", () -> new SimpleFoodItem(builder -> builder.nutrition(12).saturationMod(0.9F).meat()));
        registry.register("raw_megalodon_meat", () -> new SimpleFoodItem(builder -> builder.nutrition(8).saturationMod(0.4F).meat()));
        registry.register("megalodon_sashimi", () -> new SimpleFoodItem(builder -> builder.nutrition(10).saturationMod(1F).meat()));
        registry.register("cooked_megalodon_meat", () -> new SimpleFoodItem(builder -> builder.nutrition(14).saturationMod(0.9F).meat()));
        registry.register("rice", () -> new SimpleFoodItem(builder -> builder.nutrition(2).saturationMod(0.3F)));
        registry.register("black_rice", () -> new SimpleFoodItem(builder -> builder.nutrition(5).saturationMod(0.4F)));
        registry.register("sweet_potato", () -> new SimpleFoodItem(builder -> builder.nutrition(2).saturationMod(0.3F)));
        registry.register("large_sweet_potato", () -> new SimpleFoodItem(builder -> builder.nutrition(4).saturationMod(0.5F)));
        registry.register("baked_sweet_potato", () -> new SimpleFoodItem(builder -> builder.nutrition(6).saturationMod(0.5F)));
        registry.register("large_baked_sweet_potato", () -> new SimpleFoodItem(builder -> builder.nutrition(12).saturationMod(0.7F)));
        registry.register("large_potato", () -> new SimpleFoodItem(builder -> builder.nutrition(4).saturationMod(0.5F)));
        registry.register("large_baked_potato", () -> new SimpleFoodItem(builder -> builder.nutrition(12).saturationMod(0.7F)));
        registry.register("onigiri", () -> new SimpleFoodItem(builder -> builder.nutrition(3).saturationMod(0.3F)));
        registry.register("black_onigiri", () -> new SimpleFoodItem(builder -> builder.nutrition(10).saturationMod(0.3F)));
        registry.register("sushi", () -> new SimpleFoodItem(builder -> builder.nutrition(4).saturationMod(0.3F).meat()));
        registry.register("sissie_fin_soup", () -> new SimpleFoodItem(builder -> builder.nutrition(15).saturationMod(0.3F).meat()));
        registry.register("dubious_food", () -> new SimpleFoodItem(builder -> builder.nutrition(0).saturationMod(0.1F)));
        registry.register("bowl_of_ramen", () -> new SimpleFoodItem(builder -> builder.nutrition(15).saturationMod(0.8F)));

        registry.register("black_coffee", () -> new SimpleFoodItem(builder -> builder.nutrition(0).saturationMod(1)));
        registry.register("black_tea", () -> new SimpleFoodItem(builder -> builder.nutrition(0).saturationMod(1)));
        registry.register("coffee_with_milk", () -> new SimpleFoodItem(builder -> builder.nutrition(0).saturationMod(1)));
        registry.register("tea_with_milk", () -> new SimpleFoodItem(builder -> builder.nutrition(0).saturationMod(1)));
        registry.register("green_tea", () -> new SimpleFoodItem(builder -> builder.nutrition(0).saturationMod(1)));
        registry.register("herbal_tea", () -> new SimpleFoodItem(builder -> builder.nutrition(0).saturationMod(1)));

        registry.register("low_potion", () -> new SimpleFoodItem(builder -> builder.nutrition(0).saturationMod(0)));
        registry.register("high_potion", () -> new SimpleFoodItem(builder -> builder.nutrition(0).saturationMod(0)));
        registry.register("full_potion", () -> new SimpleFoodItem(builder -> builder.nutrition(0).saturationMod(0)));
        registry.register("revival_elixer", () -> new SimpleFoodItem(builder -> builder.nutrition(0).saturationMod(0)));
    }
}
