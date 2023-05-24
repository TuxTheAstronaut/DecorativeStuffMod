package com.tuxtheastronaut.ds.registry;

import com.tuxtheastronaut.ds.DS;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DSitems {
    // logs item registration
    public static void registerItems() { DS.LOGGER.info("Registered items for " + DS.MOD_ID); }

    // registers inventory items
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DS.MOD_ID, name), item);
    }

    // registers block items
    public static void registerBlockItem(String name, Block block) {
        Item item = registerItem(name, new BlockItem(block, new FabricItemSettings().group(DSitemGroup.DS_GROUP)));
    }
}
