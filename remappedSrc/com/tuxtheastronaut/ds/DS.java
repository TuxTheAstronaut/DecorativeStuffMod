package com.tuxtheastronaut.ds;

import com.tuxtheastronaut.ds.registry.DSblocks;
import com.tuxtheastronaut.ds.registry.DSitems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DS implements ModInitializer {
	public static final  String MOD_ID = "ds";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		DSblocks.registerBlocks();
		DSitems.registerItems();
	}
}
