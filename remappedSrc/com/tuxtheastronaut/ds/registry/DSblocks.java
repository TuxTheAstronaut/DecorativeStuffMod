package com.tuxtheastronaut.ds.registry;

import com.tuxtheastronaut.ds.DS;
import com.tuxtheastronaut.ds.blocks.desk_lamp;
import com.tuxtheastronaut.ds.blocks.globe;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class DSblocks {
    // globe decoration
    public static final Block Globe = registerBlock("globe", new globe(FabricBlockSettings.of(Material.METAL, MapColor.GOLD)
            .sounds(BlockSoundGroup.COPPER)
            .strength(0.1f,0.1f)
            .hardness(0.1f)
    ));

    // desk lamp decoration
    public static Block DeskLamp = registerBlock("desk_lamp", new desk_lamp(FabricBlockSettings.of(Material.METAL, MapColor.BROWN)
            .sounds(BlockSoundGroup.LANTERN)
            .strength(0.2f,0.2f)
            .hardness(0.2f)
            .luminance(10)
    ));

    // logs block registration
    public static void registerBlocks() { DS.LOGGER.info("Registered blocks for " + DS.MOD_ID); }

    // registers the block
    public static Block registerBlock(String name, Block block) {
        DSitems.registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(DS.MOD_ID, name), block);
    }

}
