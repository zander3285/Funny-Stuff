package net._zander46_.funnystuff;

import net._zander46_.funnystuff.block.ModBlocks;
import net._zander46_.funnystuff.block.entity.VarilkaBlockEntity;
import net._zander46_.funnystuff.network.BlockPosPayload;
import net._zander46_.funnystuff.screen.ModScreenHandlers;
import net._zander46_.funnystuff.screen.VarilkaScreen;
import net._zander46_.funnystuff.screen.VarilkaScreenHandler;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.util.math.BlockPos;

public class FunnyStuffClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        HandledScreens.register(ModScreenHandlers.VARILKA_SCREEN_HANDLER, VarilkaScreen::new);
        FunnyStuff.LOGGER.info("Client registered");

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VARILKA, RenderLayer.getTranslucent());

    }
}


//        HandledScreens.register(ModScreenHandlers.VARILKA_SCREEN_HANDLER, VarilkaScreenHandler::new);
//{
//            PlayerEntity player = playerInventory.player;
//            BlockPos playerPos = player.getBlockPos();
//            BlockPosPayload payload = new BlockPosPayload(playerPos);
//            return new VarilkaScreenHandler(syncId, playerInventory, payload);
//        });

//        HandledScreens.register(ModScreenHandlers.VARILKA_SCREEN_HANDLER, (syncId, playerInventory) -> {
//            BlockPosPayload payload = new BlockPosPayload(playerPos); // Set playerPos properly
//            return new VarilkaScreenHandler(syncId, playerInventory, payload);
//        });