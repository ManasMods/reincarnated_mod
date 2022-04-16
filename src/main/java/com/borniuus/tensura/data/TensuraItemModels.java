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
        singleTextureTool(TensuraItems.ADAMANTITE_SWORD);

        //tools
        singleTextureTool(TensuraItems.ADAMANTITE_AXE);

        //consumables
        singleTexture(TensuraItems.BULLDEER_BEEF);

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
