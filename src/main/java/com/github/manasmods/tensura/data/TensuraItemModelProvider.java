package com.github.manasmods.tensura.data;

import com.github.manasmods.tensura.Tensura;
import com.github.manasmods.tensura.item.TensuraItems;
import com.github.manasmods.manascore.data.gen.ItemModelProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

public class TensuraItemModelProvider extends ItemModelProvider {
    public TensuraItemModelProvider(GatherDataEvent gatherDataEvent) {
        super(gatherDataEvent, Tensura.MOD_ID);
    }

    @Override
    protected void generate() {
        /** ==============================      WEAPONS     ============================== */
        //handheldSingleTexture(TensuraItems.ADAMANTITE_SWORD);
        handheldSingleTexture(TensuraItems.FLINT_SWORD);
        //handheldSingleTexture(TensuraItems.HIGH_MAGISTEEL_SWORD);
        handheldSingleTexture(TensuraItems.HIHIIROKANE_SWORD);
        handheldSingleTexture(TensuraItems.LOW_MAGISTEEL_SWORD);
        handheldSingleTexture(TensuraItems.MITHRIL_SWORD);
        //handheldSingleTexture(TensuraItems.ORICHALCUM_SWORD);
        //handheldSingleTexture(TensuraItems.PURE_MAGISTEEL_SWORD);
        handheldSingleTexture(TensuraItems.SILVER_SWORD);

        /** ==============================      TOOLS     ============================== */
        //handheldSingleTexture(TensuraItems.ADAMANTITE_AXE);
        //handheldSingleTexture(TensuraItems.ADAMANTITE_HOE);
        //handheldSingleTexture(TensuraItems.ADAMANTITE_PICKAXE);
        //handheldSingleTexture(TensuraItems.ADAMANTITE_SHOVEL);
        //handheldSingleTexture(TensuraItems.ADAMANTITE_SICKLE);
        handheldSingleTexture(TensuraItems.DIAMOND_SICKLE);
        handheldSingleTexture(TensuraItems.FLINT_AXE);
        handheldSingleTexture(TensuraItems.FLINT_HOE);
        handheldSingleTexture(TensuraItems.FLINT_PICKAXE);
        handheldSingleTexture(TensuraItems.FLINT_SHOVEL);
        handheldSingleTexture(TensuraItems.FLINT_SICKLE);
        handheldSingleTexture(TensuraItems.GOLDEN_SICKLE);
        //handheldSingleTexture(TensuraItems.HIGH_MAGISTEEL_AXE);
        //handheldSingleTexture(TensuraItems.HIGH_MAGISTEEL_HOE);
        //handheldSingleTexture(TensuraItems.HIGH_MAGISTEEL_PICKAXE);
        //handheldSingleTexture(TensuraItems.HIGH_MAGISTEEL_SHOVEL);
        //handheldSingleTexture(TensuraItems.HIGH_MAGISTEEL_SICKLE);
        handheldSingleTexture(TensuraItems.HIHIIROKANE_AXE);
        handheldSingleTexture(TensuraItems.HIHIIROKANE_HOE);
        handheldSingleTexture(TensuraItems.HIHIIROKANE_PICKAXE);
        handheldSingleTexture(TensuraItems.HIHIIROKANE_SHOVEL);
        handheldSingleTexture(TensuraItems.HIHIIROKANE_SICKLE);
        handheldSingleTexture(TensuraItems.IRON_SICKLE);
        handheldSingleTexture(TensuraItems.LOW_MAGISTEEL_AXE);
        handheldSingleTexture(TensuraItems.LOW_MAGISTEEL_HOE);
        handheldSingleTexture(TensuraItems.LOW_MAGISTEEL_PICKAXE);
        handheldSingleTexture(TensuraItems.LOW_MAGISTEEL_SHOVEL);
        handheldSingleTexture(TensuraItems.LOW_MAGISTEEL_SICKLE);
        handheldSingleTexture(TensuraItems.MITHRIL_AXE);
        handheldSingleTexture(TensuraItems.MITHRIL_HOE);
        handheldSingleTexture(TensuraItems.MITHRIL_PICKAXE);
        handheldSingleTexture(TensuraItems.MITHRIL_SHOVEL);
        handheldSingleTexture(TensuraItems.MITHRIL_SICKLE);
        handheldSingleTexture(TensuraItems.NETHERITE_SICKLE);
        //handheldSingleTexture(TensuraItems.ORICHALCUM_AXE);
        //handheldSingleTexture(TensuraItems.ORICHALCUM_HOE);
        //handheldSingleTexture(TensuraItems.ORICHALCUM_PICKAXE);
        //handheldSingleTexture(TensuraItems.ORICHALCUM_SHOVEL);
        //handheldSingleTexture(TensuraItems.ORICHALCUM_SICKLE);
        //handheldSingleTexture(TensuraItems.PURE_MAGISTEEL_AXE);
        //handheldSingleTexture(TensuraItems.PURE_MAGISTEEL_HOE);
        //handheldSingleTexture(TensuraItems.PURE_MAGISTEEL_PICKAXE);
        //handheldSingleTexture(TensuraItems.PURE_MAGISTEEL_SHOVEL);
        //handheldSingleTexture(TensuraItems.PURE_MAGISTEEL_SICKLE);
        handheldSingleTexture(TensuraItems.SILVER_AXE);
        handheldSingleTexture(TensuraItems.SILVER_HOE);
        handheldSingleTexture(TensuraItems.SILVER_PICKAXE);
        handheldSingleTexture(TensuraItems.SILVER_SHOVEL);
        handheldSingleTexture(TensuraItems.SILVER_SICKLE);
        handheldSingleTexture(TensuraItems.WOODEN_SICKLE);

        /** ==============================      CONSUMABLES     ============================== */
        //singleTexture(TensuraItems.BAKED_SWEET_POTATO);
        //singleTexture(TensuraItems.BLACK_COFFEE);
        //singleTexture(TensuraItems.BLACK_ONIGIRI);
        //singleTexture(TensuraItems.BLACK_RICE);
        //singleTexture(TensuraItems.BLACK_TEA);
        //singleTexture(TensuraItems.BOWL_OF_RAMEN);
        singleTexture(TensuraItems.BULLDEER_BEEF);
        singleTexture(TensuraItems.BULLDEER_SHISH_KEBAB);
        singleTexture(TensuraItems.BULLDEER_STEAK);
        //singleTexture(TensuraItems.CHARYBDIS_SASHIMI);
        //singleTexture(TensuraItems.COFFEE_WITH_MILK);
        //singleTexture(TensuraItems.COOKED_ARMOURSAURUS_MEAT);
        //singleTexture(TensuraItems.COOKED_CHARYBDIS_MEAT);
        //singleTexture(TensuraItems.COOKED_GIANT_ANT_MEAT);
        //singleTexture(TensuraItems.COOKED_GIANT_BAT_MEAT);
        //singleTexture(TensuraItems.COOKED_KNIGHT_SPIDER_MEAT);
        //singleTexture(TensuraItems.COOKED_MEGALODON_MEAT);
        //singleTexture(TensuraItems.COOKED_SERPENT_MEAT);
        //singleTexture(TensuraItems.COOKED_SPEAR_TORO_MEAT);
        //singleTexture(TensuraItems.DUBIOUS_FOOD);
        singleTexture(TensuraItems.FULL_POTION);
        //singleTexture(TensuraItems.GREEN_TEA);
        //singleTexture(TensuraItems.HERBAL_TEA);
        singleTexture(TensuraItems.HIGH_POTION);
        //singleTexture(TensuraItems.LARGE_BAKED_POTATO);
        //singleTexture(TensuraItems.LARGE_BAKED_SWEET_POTATO);
        //singleTexture(TensuraItems.LARGE_POTATO);
        //singleTexture(TensuraItems.LARGE_SWEET_POTATO);
        singleTexture(TensuraItems.LOW_POTION);
        //singleTexture(TensuraItems.MEGALODON_SASHIMI);
        //singleTexture(TensuraItems.ONIGIRI);
        //singleTexture(TensuraItems.RAW_ARMOURSAURUS_MEAT);
        //singleTexture(TensuraItems.RAW_CHARYBDIS_MEAT);
        //singleTexture(TensuraItems.RAW_GIANT_ANT_MEAT);
        //singleTexture(TensuraItems.RAW_GIANT_BAT_MEAT);
        //singleTexture(TensuraItems.RAW_KNIGHT_SPIDER_MEAT);
        //singleTexture(TensuraItems.RAW_MEGALODON_MEAT);
        //singleTexture(TensuraItems.RAW_SERPENT_MEAT);
        //singleTexture(TensuraItems.RAW_SPEAR_TORO_MEAT);
        //singleTexture(TensuraItems.REVIVAL_ELIXER);
        //singleTexture(TensuraItems.RICE);
        //singleTexture(TensuraItems.SISSIE_FIN_SOUP);
        //singleTexture(TensuraItems.SPEAR_TORO_SASHIMI);
        //singleTexture(TensuraItems.SUSHI);
        //singleTexture(TensuraItems.SWEET_POTATO);
        //singleTexture(TensuraItems.TEA_WITH_MILK);

        /** ==============================      MISC ITEMS     ============================== */
        singleTexture(TensuraItems.ADAMANTITE_INGOT);
        //singleTexture(TensuraItems.ARMOURSAURUS_SCALE);
        //singleTexture(TensuraItems.ARMOURSAURUS_SHELL);
        singleTexture(TensuraItems.BRONZE_COIN);
        singleTexture(TensuraItems.CHAPTER_1);
        //singleTexture(TensuraItems.CHARYBDIS_SCALE);
        //singleTexture(TensuraItems.DIREWOLF_PELT);
        //singleTexture(TensuraItems.GEHENNA_MOTH_SILK);
        //singleTexture(TensuraItems.GIANT_ANT_CARAPACE);
        //singleTexture(TensuraItems.GIANT_ANT_LEG);
        //singleTexture(TensuraItems.GIANT_BAT_WING);
        singleTexture(TensuraItems.GOLD_COIN);
        //singleTexture(TensuraItems.HELL_MOTH_SILK);
        //singleTexture(TensuraItems.HIGH_QUALITY_MAGIC_CRYSTAL);
        singleTexture(TensuraItems.HIHIIROKANE_INGOT);
        //singleTexture(TensuraItems.INSECTAR_CARAPACE);
        //singleTexture(TensuraItems.KNIGHT_SPIDER_CARAPACE);
        //singleTexture(TensuraItems.KNIGHT_SPIDER_LEG);
        singleTexture(TensuraItems.LARGE_WOODEN_BOWL);
        singleTexture(TensuraItems.LIKE_FLAMES_MUSIC_DISC);
        //singleTexture(TensuraItems.LOW_QUALITY_MAGIC_CRYSTAL);
        //singleTexture(TensuraItems.MAGIC_STONE);
        singleTexture(TensuraItems.MAGISTEEL_INGOT);
        singleTexture(TensuraItems.MAGISTEEL_NUGGET);
        //singleTexture(TensuraItems.MEDIUM_QUALITY_MAGIC_CRYSTAL);
        singleTexture(TensuraItems.MITHRIL_INGOT);
        singleTexture(TensuraItems.ORICHALCUM_INGOT);
        singleTexture(TensuraItems.RAW_SILVER);
        singleTexture(TensuraItems.SCROLL_OF_SLIMES);
        //singleTexture(TensuraItems.SERPENT_SCALE);
        singleTexture(TensuraItems.SILVER_COIN);
        singleTexture(TensuraItems.SILVER_INGOT);
        singleTexture(TensuraItems.SILVER_NUGGET);
        //singleTexture(TensuraItems.SISSIE_FIN);
        //singleTexture(TensuraItems.SPIDER_FANG);
        //singleTexture(TensuraItems.SPIRIT_CORE);
        singleTexture(TensuraItems.STELLAR_GOLD_COIN);
        singleTexture(TensuraItems.THATCH);

    }

}
