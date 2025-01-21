package net._zander46_.funnystuff.item;

import net._zander46_.funnystuff.FunnyStuff;
import net._zander46_.funnystuff.item.custom.DrugItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item COCAINE = registerItem("cocaine", new Item(new Item.Settings().food(ModFoodComponents.COCAINE)));
    public static final Item HEROINE = registerItem("heroine", new DrugItem(new Item.Settings().food(ModFoodComponents.HEROINE)));
    public static final Item METH = registerItem("meth", new Item(new Item.Settings()));
    public static final Item NEEDLE = registerItem("needle", new Item(new Item.Settings()));
    public static final Item ZIPLOC = registerItem("ziploc", new Item(new Item.Settings()));
    public static final Item BLUE_CRYSTAL = registerItem("blue_crystal", new Item(new Item.Settings()));
    public static final Item IROPPER = registerItem("iropper", new Item(new Item.Settings()));
    public static final Item DIROPPER = registerItem("diropper", new Item(new Item.Settings()));
    public static final Item PLASTIC = registerItem("plastic", new Item(new Item.Settings()));
    public static final Item RESIN = registerItem("resin", new Item(new Item.Settings()));
    public static final Item LIQUID_GOLD = registerItem("liquid_gold", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(FunnyStuff.MOD_ID, name), item);
    }

    public static void registerModItems(){
        FunnyStuff.LOGGER.info("Registering Mod Items for" + FunnyStuff.MOD_ID);
    }
}
