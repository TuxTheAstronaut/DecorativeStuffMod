package com.tuxtheastronaut.ds.registry;

import com.tuxtheastronaut.ds.DS;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class DSitemGroup {
    public static ItemGroup DS_GROUP = FabricItemGroupBuilder.build(new Identifier(DS.MOD_ID, "ds"),
            () -> new ItemStack(DSblocks.Globe));
}
