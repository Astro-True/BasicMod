package net.astro_00_.basicmod;

import net.astro_00_.basicmod.block.ModBlocks;
import net.astro_00_.basicmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicMod implements ModInitializer {
	public static final String MOD_ID = "basicmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}