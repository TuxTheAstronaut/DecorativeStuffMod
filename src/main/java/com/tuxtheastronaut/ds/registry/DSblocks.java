package com.tuxtheastronaut.ds.registry;

import com.tuxtheastronaut.ds.DS;
import com.tuxtheastronaut.ds.blocks.globe;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DSblocks {
    // globe decoration
    public static final Block Globe = registerBlock("globe", new globe(FabricBlockSettings.of(Material.METAL, MapColor.GOLD)
            .sounds(BlockSoundGroup.COPPER)
            .strength(0.1f,0.1f)
            .hardness(0.1f)
    ));

    // logs block registration
    public static void registerBlocks() { DS.LOGGER.info("Registered blocks for " + DS.MOD_ID); }

    // registers the block
    public static Block registerBlock(String name, Block block) {
        DSitems.registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(DS.MOD_ID, name), block);
    }

}
