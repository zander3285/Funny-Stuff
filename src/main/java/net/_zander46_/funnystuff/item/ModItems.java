package net._zander46_.funnystuff.item;

import net._zander46_.funnystuff.FunnyStuff;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item COCAINE = registerItem("cocaine", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(FunnyStuff.MOD_ID, name), item);
    }

    public static void registerModItems(){
        FunnyStuff.LOGGER.info("Registering Mod Items for" + FunnyStuff.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(COCAINE);
        });
    }
}
