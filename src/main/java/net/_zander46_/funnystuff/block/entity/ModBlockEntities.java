package net._zander46_.funnystuff.block.entity;


import net._zander46_.funnystuff.FunnyStuff;
import net._zander46_.funnystuff.block.ModBlocks;
import net._zander46_.funnystuff.block.custom.VarilkaBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<VarilkaBlockEntity> VARILKA_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(FunnyStuff.MOD_ID, "varilka_block_entity"),
                    FabricBlockEntityTypeBuilder.create(VarilkaBlockEntity::new, ModBlocks.VARILKA).build());

    public static void registerBlockEntities() {
        FunnyStuff.LOGGER.info("Registering block entities for " + FunnyStuff.MOD_ID);
    }
}
