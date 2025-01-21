package net._zander46_.funnystuff.item;

import net._zander46_.funnystuff.FunnyStuff;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FUNNY_STUFF_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FunnyStuff.MOD_ID, "funny_stuff_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack((ModItems.COCAINE)))
                    .displayName(Text.translatable("itemgroup.funny_stuff.funny_stuff_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ZIPLOC);
                        entries.add(ModItems.NEEDLE);
                        entries.add(ModItems.COCAINE);
                        entries.add(ModItems.METH);
                        entries.add(ModItems.HEROINE);
                        entries.add(ModItems.RESIN);
                        entries.add(ModItems.PLASTIC);
                        entries.add(ModItems.BLUE_CRYSTAL);
                        entries.add(ModItems.IROPPER);
                        entries.add(ModItems.DIROPPER);
                        entries.add(ModItems.LIQUID_GOLD);

                    })
                    .build());

    public static void registerItemGroups() {
        FunnyStuff.LOGGER.info("Registring Item Groups for " + FunnyStuff.MOD_ID);
    }
}
