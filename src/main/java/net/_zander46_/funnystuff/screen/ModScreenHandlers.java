package net._zander46_.funnystuff.screen;


import net._zander46_.funnystuff.FunnyStuff;
import net._zander46_.funnystuff.network.BlockPosPayload;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
//    public static final ScreenHandlerType<VarilkaScreenHandler> VARILKA_SCREEN_HANDLER =
//            register("varinging", VarilkaScreenHandler::new, BlockPosPayload.PACKET_CODEC);
//
//
//
//    public static <T extends ScreenHandler, D extends CustomPayload> ExtendedScreenHandlerType<T, D>
//    register(String name,
//             ExtendedScreenHandlerType.ExtendedFactory<T, D> factory,
//             PacketCodec<? super RegistryByteBuf, D> codec) {
//        return Registry.register(Registries.SCREEN_HANDLER, FunnyStuff.MOD_ID, new ExtendedScreenHandlerType<>(factory, codec));
//    }


    public static final ScreenHandlerType<VarilkaScreenHandler> VARILKA_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(FunnyStuff.MOD_ID, "gem_polishing"),
                    new ExtendedScreenHandlerType<>(VarilkaScreenHandler::new, BlockPosPayload.PACKET_CODEC));



    public static void registerScreenHandlers() {
        FunnyStuff.LOGGER.info("Registering Screen Handlers for " + FunnyStuff.MOD_ID);
    }
}
