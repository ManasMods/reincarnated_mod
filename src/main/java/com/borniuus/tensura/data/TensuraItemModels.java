package com.borniuus.tensura.data;

import com.borniuus.tensura.Tensura;
import com.borniuus.tensura.item.TensuraItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TensuraItemModels extends ItemModelProvider {
    public TensuraItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Tensura.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //weapons
        handheldSingleTexture(TensuraItems.FLINT_SWORD);
        handheldSingleTexture(TensuraItems.SILVER_SWORD);
        handheldSingleTexture(TensuraItems.LOW_MAGISTEEL_SWORD);
        //singleTextureTool(TensuraItems.HIGH_MAGISTEEL_SWORD);
        handheldSingleTexture(TensuraItems.MITHRIL_SWORD);
        //singleTextureTool(TensuraItems.ORICHALCUM_SWORD);
        //singleTextureTool(TensuraItems.PURE_MAGISTEEL_SWORD);
        //singleTextureTool(TensuraItems.ADAMANTITE_SWORD);
        handheldSingleTexture(TensuraItems.HIHIIROKANE_SWORD);

        //tools
        handheldSingleTexture(TensuraItems.WOODEN_SICKLE);
        handheldSingleTexture(TensuraItems.GOLDEN_SICKLE);
        handheldSingleTexture(TensuraItems.FLINT_PICKAXE);
        handheldSingleTexture(TensuraItems.FLINT_AXE);
        handheldSingleTexture(TensuraItems.FLINT_SHOVEL);
        handheldSingleTexture(TensuraItems.FLINT_HOE);
        handheldSingleTexture(TensuraItems.FLINT_SICKLE);
        handheldSingleTexture(TensuraItems.SILVER_PICKAXE);
        handheldSingleTexture(TensuraItems.SILVER_AXE);
        handheldSingleTexture(TensuraItems.SILVER_SHOVEL);
        handheldSingleTexture(TensuraItems.SILVER_HOE);
        handheldSingleTexture(TensuraItems.SILVER_SICKLE);
        handheldSingleTexture(TensuraItems.IRON_SICKLE);
        handheldSingleTexture(TensuraItems.DIAMOND_SICKLE);
        handheldSingleTexture(TensuraItems.LOW_MAGISTEEL_PICKAXE);
        handheldSingleTexture(TensuraItems.LOW_MAGISTEEL_AXE);
        handheldSingleTexture(TensuraItems.LOW_MAGISTEEL_SHOVEL);
        handheldSingleTexture(TensuraItems.LOW_MAGISTEEL_HOE);
        handheldSingleTexture(TensuraItems.LOW_MAGISTEEL_SICKLE);
        handheldSingleTexture(TensuraItems.NETHERITE_SICKLE);
        //singleTextureTool(TensuraItems.HIGH_MAGISTEEL_PICKAXE);
        //singleTextureTool(TensuraItems.HIGH_MAGISTEEL_AXE);
        //singleTextureTool(TensuraItems.HIGH_MAGISTEEL_SHOVEL);
        //singleTextureTool(TensuraItems.HIGH_MAGISTEEL_HOE);
        //singleTextureTool(TensuraItems.HIGH_MAGISTEEL_SICKLE);
        handheldSingleTexture(TensuraItems.MITHRIL_PICKAXE);
        handheldSingleTexture(TensuraItems.MITHRIL_AXE);
        handheldSingleTexture(TensuraItems.MITHRIL_SHOVEL);
        handheldSingleTexture(TensuraItems.MITHRIL_HOE);
        handheldSingleTexture(TensuraItems.MITHRIL_SICKLE);
        //singleTextureTool(TensuraItems.ORICHALCUM_PICKAXE);
        //singleTextureTool(TensuraItems.ORICHALCUM_AXE);
        //singleTextureTool(TensuraItems.ORICHALCUM_SHOVEL);
        //singleTextureTool(TensuraItems.ORICHALCUM_HOE);
        //singleTextureTool(TensuraItems.ORICHALCUM_SICKLE);
        //singleTextureTool(TensuraItems.PURE_MAGISTEEL_PICKAXE);
        //singleTextureTool(TensuraItems.PURE_MAGISTEEL_AXE);
        //singleTextureTool(TensuraItems.PURE_MAGISTEEL_SHOVEL);
        //singleTextureTool(TensuraItems.PURE_MAGISTEEL_HOE);
        //singleTextureTool(TensuraItems.PURE_MAGISTEEL_SICKLE);
        //singleTextureTool(TensuraItems.ADAMANTITE_PICKAXE);
        //singleTextureTool(TensuraItems.ADAMANTITE_AXE);
        //singleTextureTool(TensuraItems.ADAMANTITE_SHOVEL);
        //singleTextureTool(TensuraItems.ADAMANTITE_HOE);
        //singleTextureTool(TensuraItems.ADAMANTITE_SICKLE);
        handheldSingleTexture(TensuraItems.HIHIIROKANE_PICKAXE);
        handheldSingleTexture(TensuraItems.HIHIIROKANE_AXE);
        handheldSingleTexture(TensuraItems.HIHIIROKANE_SHOVEL);
        handheldSingleTexture(TensuraItems.HIHIIROKANE_HOE);
        handheldSingleTexture(TensuraItems.HIHIIROKANE_SICKLE);

        //consumables
        //singleTexture(TensuraItems.BULLDEER_BEEF);
        //singleTexture(TensuraItems.BULLDEER_STEAK);
        //singleTexture(TensuraItems.BULLDEER_SHISH_KEBAB);
        //singleTexture(TensuraItems.RAW_GIANT_ANT_MEAT);
        //singleTexture(TensuraItems.COOKED_GIANT_ANT_MEAT);
        //singleTexture(TensuraItems.RAW_GIANT_BAT_MEAT);
        //singleTexture(TensuraItems.COOKED_GIANT_BAT_MEAT);
        singleTexture(TensuraItems.RAW_KNIGHT_SPIDER_MEAT);
        singleTexture(TensuraItems.COOKED_KNIGHT_SPIDER_MEAT);
        //singleTexture(TensuraItems.RAW_ARMOURSAURUS_MEAT);
        //singleTexture(TensuraItems.COOKED_ARMOURSAURUS_MEAT);
        //singleTexture(TensuraItems.RAW_CHARYBDIS_MEAT);
        //singleTexture(TensuraItems.CHARYBDIS_SASHIMI);
        //singleTexture(TensuraItems.COOKED_CHARYBDIS_MEAT);
        //singleTexture(TensuraItems.RAW_SERPENT_MEAT);
        //singleTexture(TensuraItems.COOKED_SERPENT_MEAT);
        //singleTexture(TensuraItems.RAW_SPEAR_TORO_MEAT);
        //singleTexture(TensuraItems.SPEAR_TORO_SASHIMI);
        //singleTexture(TensuraItems.COOKED_SPEAR_TORO_MEAT);
        //singleTexture(TensuraItems.RAW_MEGALODON_MEAT);
        //singleTexture(TensuraItems.MEGALODON_SASHIMI);
        //singleTexture(TensuraItems.COOKED_MEGALODON_MEAT);
        //singleTexture(TensuraItems.RICE);
        //singleTexture(TensuraItems.BLACK_RICE);
        //singleTexture(TensuraItems.SWEET_POTATO);
        //singleTexture(TensuraItems.LARGE_SWEET_POTATO);
        //singleTexture(TensuraItems.BAKED_SWEET_POTATO);
        //singleTexture(TensuraItems.LARGE_BAKED_SWEET_POTATO);
        //singleTexture(TensuraItems.LARGE_POTATO);
        //singleTexture(TensuraItems.LARGE_BAKED_POTATO);
        //singleTexture(TensuraItems.ONIGIRI);
        //singleTexture(TensuraItems.BLACK_ONIGIRI);
        //singleTexture(TensuraItems.SUSHI);
        //singleTexture(TensuraItems.SISSIE_FIN_SOUP);
        //singleTexture(TensuraItems.DUBIOUS_FOOD);
        //singleTexture(TensuraItems.BOWL_OF_RAMEN);
        //singleTexture(TensuraItems.BLACK_COFFEE);
        //singleTexture(TensuraItems.BLACK_TEA);
        //singleTexture(TensuraItems.COFFEE_WITH_MILK);
        //singleTexture(TensuraItems.TEA_WITH_MILK);
        //singleTexture(TensuraItems.GREEN_TEA);
        //singleTexture(TensuraItems.HERBAL_TEA);
        //singleTexture(TensuraItems.LOW_POTION);
        //singleTexture(TensuraItems.HIGH_POTION);
        //singleTexture(TensuraItems.FULL_POTION);
        //singleTexture(TensuraItems.REVIVAL_ELIXER);

        //misc
        singleTexture(TensuraItems.ADAMANTITE_INGOT);
        //singleTexture(TensuraItems.BRONZE_COIN);
        //singleTexture(TensuraItems.GOLD_COIN);
        singleTexture(TensuraItems.HIHIIROKANE_INGOT);
        //singleTexture(TensuraItems.LARGE_WOODEN_BOWL);
        singleTexture(TensuraItems.LIKE_FLAMES_MUSIC_DISC);
        //singleTexture(TensuraItems.MAGIC_STONE);
        singleTexture(TensuraItems.MAGISTEEL_INGOT);
        singleTexture(TensuraItems.MITHRIL_INGOT);
        singleTexture(TensuraItems.ORICHALCUM_INGOT);
        singleTexture(TensuraItems.RAW_SILVER);
        singleTexture(TensuraItems.SCROLL_OF_SLIMES);
        //singleTexture(TensuraItems.SILVER_COIN);
        singleTexture(TensuraItems.SILVER_INGOT);
        singleTexture(TensuraItems.SILVER_NUGGET);
        //singleTexture(TensuraItems.SPIRIT_CORE);
        //singleTexture(TensuraItems.STELLA_GOLD_COIN);
        singleTexture(TensuraItems.THATCH);
    }

    /**
     * Generates the item model json file.
     * Can be used for any default rendered {@link Item} object.
     */
    private void singleTexture(Item item) {
        getBuilder(item.getRegistryName().getPath())
            .parent(new ModelFile.UncheckedModelFile(mcLoc("item/generated")))
            .texture("layer0", modLoc("item/" + item.getRegistryName().getPath()));
    }

    /**
     * Generates the item model json file.
     * Can be used for any handheld rendered {@link Item} like Tools and Torches.
     */
    private void handheldSingleTexture(Item item) {
        getBuilder(item.getRegistryName().getPath())
            .parent(new ModelFile.UncheckedModelFile(mcLoc("item/handheld")))
            .texture("layer0", modLoc("item/" + item.getRegistryName().getPath()));
    }
}
