package com.github.manasmods.tensura.example;

import com.github.manasmods.tensura.Tensura;
import com.github.manasmods.tensura.TestBatches;
import com.github.manasmods.tensura.item.TensuraCreativeTab;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.gametest.GameTestHolder;
import net.minecraftforge.gametest.PrefixGameTestTemplate;

import java.util.List;

@PrefixGameTestTemplate(false)
@GameTestHolder(Tensura.MOD_ID)
public class ExampleCreativeTabTest {
    @GameTest(template = "empty_1x1", batch = TestBatches.CREATIVE_TAB_ICONS)
    public static void checkCreativeTabIcon(final GameTestHelper helper) {
        List<CreativeModeTab> tabs = List.of(
            TensuraCreativeTab.BLOCKS,
            TensuraCreativeTab.CONSUMABLES,
            TensuraCreativeTab.GEAR,
            TensuraCreativeTab.MISCELLANEOUS,
            TensuraCreativeTab.TOOLS,
            TensuraCreativeTab.WEAPONS
        );


        tabs.forEach(creativeModeTab -> {
            try {
                ItemStack icon = creativeModeTab.makeIcon();
                if (icon.isEmpty()) {
                    String message = "Creative Tab %s has returned an empty ItemStack on icon creation. The Icon item might be wrong!";
                    helper.fail(String.format(message, creativeModeTab.getDisplayName().getString()));
                }
            } catch (Exception e) {
                String message = "Creative Tab %s has returned null on icon creation.";
                helper.fail(String.format(message, creativeModeTab.getDisplayName().getString()));
            }
        });

        helper.succeed();
    }
}
