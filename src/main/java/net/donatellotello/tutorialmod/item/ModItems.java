package net.donatellotello.tutorialmod.item;

import net.donatellotello.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item HOGLIN_TUSK = registerItem("hoglin_tusk",
    new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item HARDENED_HOGLIN_TUSK = registerItem("hardened_hoglin_tusk",
    new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item CHAIN_BUNDLE = registerItem("chain_bundle",
    new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    public static final Item STEEL_INGOT = registerItem("steel_ingot",
    new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    public static final Item SCYTHE = registerItem("scythe",
    new SwordItem(ModToolMaterials.STEEL_INGOT, 5, 0.005f,
            new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item HOG_SCYTHE = registerItem("hog_scythe",
    new SwordItem(ModToolMaterials.STEEL_INGOT,8, 0.01f,
            new FabricItemSettings().group(ItemGroup.COMBAT)));



    private static Item registerItem(String name, Item item) {
       return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
