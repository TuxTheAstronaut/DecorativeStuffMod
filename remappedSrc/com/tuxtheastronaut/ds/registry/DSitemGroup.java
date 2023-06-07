package com.tuxtheastronaut.ds.registry;

import com.tuxtheastronaut.ds.DS;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class DSitemGroup {
    public static ItemGroup DS_GROUP = FabricItemGroup.builder().displayName(Text.literal("Decorative Stuff")).icon(() -> new ItemStack(DSblocks.Globe)).build();
}
