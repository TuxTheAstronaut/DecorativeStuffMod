package com.tuxtheastronaut.ds;

import com.tuxtheastronaut.ds.registry.DSblocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class DSClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(DSblocks.DeskLamp, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DSblocks.Globe, RenderLayer.getCutout());
    }
}
