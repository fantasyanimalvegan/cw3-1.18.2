package net.fantasyanimalveg.cw3;

import net.fabricmc.api.ModInitializer;
import net.fantasyanimalveg.cw3.block.ModBlocks;
import net.fantasyanimalveg.cw3.item.ModItems;

public class CW3 implements ModInitializer {

	public static final String MOD_ID = "cw3";
	//public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
