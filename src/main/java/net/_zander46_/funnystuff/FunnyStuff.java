package net._zander46_.funnystuff;

import net._zander46_.funnystuff.block.ModBlocks;
import net._zander46_.funnystuff.block.entity.ModBlockEntities;
import net._zander46_.funnystuff.effect.ModEffects;
import net._zander46_.funnystuff.item.ModItemGroups;
import net._zander46_.funnystuff.item.ModItems;
import net._zander46_.funnystuff.screen.ModScreenHandlers;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FunnyStuff implements ModInitializer {
	public static final String MOD_ID = "funny_stuff";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModEffects.registerEffects();

		ModItems.registerModItems();

		ModBlocks.registerModBlocks();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}