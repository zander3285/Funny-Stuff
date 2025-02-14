package net._zander46_.funnystuff.block;

import net._zander46_.funnystuff.FunnyStuff;
//import net._zander46_.funnystuff.block.entity.VarilkaBlockEntity;
import net._zander46_.funnystuff.block.custom.VarilkaBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block VARILKA = registerBlock("varilka",
            new VarilkaBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(FunnyStuff.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(FunnyStuff.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        FunnyStuff.LOGGER.info("Registering Mod Blocks for " + FunnyStuff.MOD_ID);
    }
}
