package com.tuxtheastronaut.ds.registry;

import com.tuxtheastronaut.ds.DS;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class DSitemGroup {

    private static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(DS.MOD_ID, "ds_group"));

    public static void registerGroup() {
        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("Decorative Stuff"))
                .icon(() -> new ItemStack(DSblocks.Globe))
                .entries((context, entries) -> {
                    entries.add(DSblocks.Globe);
                    entries.add(DSblocks.DeskLamp);
                })
                .build()
        );
    }

}
