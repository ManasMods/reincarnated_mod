package com.borniuus.tensura.data;

import com.borniuus.tensura.Tensura;
import com.borniuus.tensura.item.TensuraItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class TensuraItemModels extends ItemModelProvider {
    public TensuraItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Tensura.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //weapons
        singleTextureTool(TensuraItems.FLINT_SWORD);
        singleTextureTool(TensuraItems.SILVER_SWORD);
        singleTextureTool(TensuraItems.LOW_MAGISTEEL_SWORD);
        singleTextureTool(TensuraItems.HIGH_MAGISTEEL_SWORD);
        singleTextureTool(TensuraItems.MITHRIL_SWORD);
        singleTextureTool(TensuraItems.ORICHALCUM_SWORD);
        singleTextureTool(TensuraItems.PURE_MAGISTEEL_SWORD);
        singleTextureTool(TensuraItems.ADAMANTITE_SWORD);
        singleTextureTool(TensuraItems.HIHIIROKANE_SWORD);

        //tools
        singleTextureTool(TensuraItems.WOODEN_SICKLE);
        singleTextureTool(TensuraItems.GOLDEN_SICKLE);
        singleTextureTool(TensuraItems.FLINT_PICKAXE);
        singleTextureTool(TensuraItems.FLINT_AXE);
        singleTextureTool(TensuraItems.FLINT_SHOVEL);
        singleTextureTool(TensuraItems.FLINT_HOE);
        singleTextureTool(TensuraItems.FLINT_SICKLE);
        singleTextureTool(TensuraItems.SILVER_PICKAXE);
        singleTextureTool(TensuraItems.SILVER_AXE);
        singleTextureTool(TensuraItems.SILVER_SHOVEL);
        singleTextureTool(TensuraItems.SILVER_HOE);
        singleTextureTool(TensuraItems.SILVER_SICKLE);
        singleTextureTool(TensuraItems.IRON_SICKLE);
        singleTextureTool(TensuraItems.DIAMOND_SICKLE);
        singleTextureTool(TensuraItems.LOW_MAGISTEEL_PICKAXE);
        singleTextureTool(TensuraItems.LOW_MAGISTEEL_AXE);
        singleTextureTool(TensuraItems.LOW_MAGISTEEL_SHOVEL);
        singleTextureTool(TensuraItems.LOW_MAGISTEEL_HOE);
        singleTextureTool(TensuraItems.LOW_MAGISTEEL_SICKLE);
        singleTextureTool(TensuraItems.NETHERITE_SICKLE);
        singleTextureTool(TensuraItems.HIGH_MAGISTEEL_PICKAXE);
        singleTextureTool(TensuraItems.HIGH_MAGISTEEL_AXE);
        singleTextureTool(TensuraItems.HIGH_MAGISTEEL_SHOVEL);
        singleTextureTool(TensuraItems.HIGH_MAGISTEEL_HOE);
        singleTextureTool(TensuraItems.HIGH_MAGISTEEL_SICKLE);
        singleTextureTool(TensuraItems.MITHRIL_PICKAXE);
        singleTextureTool(TensuraItems.MITHRIL_AXE);
        singleTextureTool(TensuraItems.MITHRIL_SHOVEL);
        singleTextureTool(TensuraItems.MITHRIL_HOE);
        singleTextureTool(TensuraItems.MITHRIL_SICKLE);
        singleTextureTool(TensuraItems.ORICHALCUM_PICKAXE);
        singleTextureTool(TensuraItems.ORICHALCUM_AXE);
        singleTextureTool(TensuraItems.ORICHALCUM_SHOVEL);
        singleTextureTool(TensuraItems.ORICHALCUM_HOE);
        singleTextureTool(TensuraItems.ORICHALCUM_SICKLE);
        singleTextureTool(TensuraItems.PURE_MAGISTEEL_PICKAXE);
        singleTextureTool(TensuraItems.PURE_MAGISTEEL_AXE);
        singleTextureTool(TensuraItems.PURE_MAGISTEEL_SHOVEL);
        singleTextureTool(TensuraItems.PURE_MAGISTEEL_HOE);
        singleTextureTool(TensuraItems.PURE_MAGISTEEL_SICKLE);
        singleTextureTool(TensuraItems.ADAMANTITE_PICKAXE);
        singleTextureTool(TensuraItems.ADAMANTITE_AXE);
        singleTextureTool(TensuraItems.ADAMANTITE_SHOVEL);
        singleTextureTool(TensuraItems.ADAMANTITE_HOE);
        singleTextureTool(TensuraItems.ADAMANTITE_SICKLE);
        singleTextureTool(TensuraItems.HIHIIROKANE_PICKAXE);
        singleTextureTool(TensuraItems.HIHIIROKANE_AXE);
        singleTextureTool(TensuraItems.HIHIIROKANE_SHOVEL);
        singleTextureTool(TensuraItems.HIHIIROKANE_HOE);
        singleTextureTool(TensuraItems.HIHIIROKANE_SICKLE);

        //consumables
        singleTexture(TensuraItems.BULLDEER_BEEF);
        singleTexture(TensuraItems.BULLDEER_STEAK);
        singleTexture(TensuraItems.BULLDEER_SHISH_KEBAB);
        singleTexture(TensuraItems.RAW_GIANT_ANT_MEAT);
        singleTexture(TensuraItems.COOKED_GIANT_ANT_MEAT);
        singleTexture(TensuraItems.RAW_GIANT_BAT_MEAT);
        singleTexture(TensuraItems.COOKED_GIANT_BAT_MEAT);
        singleTexture(TensuraItems.RAW_KNIGHT_SPIDER_MEAT);
        singleTexture(TensuraItems.COOKED_KNIGHT_SPIDER_MEAT);
        singleTexture(TensuraItems.RAW_ARMOURSAURUS_MEAT);
        singleTexture(TensuraItems.COOKED_ARMOURSAURUS_MEAT);
        singleTexture(TensuraItems.RAW_CHARYBDIS_MEAT);
        singleTexture(TensuraItems.CHARYBDIS_SASHIMI);
        singleTexture(TensuraItems.COOKED_CHARYBDIS_MEAT);
        singleTexture(TensuraItems.RAW_SERPENT_MEAT);
        singleTexture(TensuraItems.COOKED_SERPENT_MEAT);
        singleTexture(TensuraItems.RAW_SPEAR_TORO_MEAT);
        singleTexture(TensuraItems.SPEAR_TORO_SASHIMI);
        singleTexture(TensuraItems.COOKED_SPEAR_TORO_MEAT);
        singleTexture(TensuraItems.RAW_MEGALODON_MEAT);
        singleTexture(TensuraItems.MEGALODON_SASHIMI);
        singleTexture(TensuraItems.COOKED_MEGALODON_MEAT);
        singleTexture(TensuraItems.RICE);
        singleTexture(TensuraItems.BLACK_RICE);
        singleTexture(TensuraItems.SWEET_POTATO);
        singleTexture(TensuraItems.LARGE_SWEET_POTATO);
        singleTexture(TensuraItems.BAKED_SWEET_POTATO);
        singleTexture(TensuraItems.LARGE_BAKED_SWEET_POTATO);
        singleTexture(TensuraItems.LARGE_POTATO);
        singleTexture(TensuraItems.LARGE_BAKED_POTATO);
        singleTexture(TensuraItems.ONIGIRI);
        singleTexture(TensuraItems.BLACK_ONIGIRI);
        singleTexture(TensuraItems.SUSHI);
        singleTexture(TensuraItems.SISSIE_FIN_SOUP);
        singleTexture(TensuraItems.DUBIOUS_FOOD);
        singleTexture(TensuraItems.BOWL_OF_RAMEN);
        singleTexture(TensuraItems.BLACK_COFFEE);
        singleTexture(TensuraItems.BLACK_TEA);
        singleTexture(TensuraItems.COFFEE_WITH_MILK);
        singleTexture(TensuraItems.TEA_WITH_MILK);
        singleTexture(TensuraItems.GREEN_TEA);
        singleTexture(TensuraItems.HERBAL_TEA);
        singleTexture(TensuraItems.LOW_POTION);
        singleTexture(TensuraItems.HIGH_POTION);
        singleTexture(TensuraItems.FULL_POTION);
        singleTexture(TensuraItems.REVIVAL_ELIXER);


        //misc
        singleTexture(TensuraItems.ADAMANTITE_INGOT);

    }
    private void singleTexture(Item item) {
        getBuilder(item.getRegistryName().getPath())
                .parent(new ModelFile.UncheckedModelFile(mcLoc("item/generated")))
                .texture("layer0", modLoc("item/" + item.getRegistryName().getPath()));
    }
    private void singleTextureTool(Item item) {
        getBuilder(item.getRegistryName().getPath())
                .parent(new ModelFile.UncheckedModelFile(mcLoc("item/handheld")))
                .texture("layer0", modLoc("item/" + item.getRegistryName().getPath()));
    }
}
