package net._zander46_.funnystuff.item;

import net._zander46_.funnystuff.effect.ModEffects;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;

public class ModFoodComponents {
    public static final FoodComponent HEROINE = new FoodComponent.Builder().nutrition(2).saturationModifier(0.3f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(ModEffects.HEROINE_GOOD, 120), 1.0f).build();


    public static final FoodComponent COCAINE = new FoodComponent.Builder().nutrition(2).saturationModifier(0.3f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(ModEffects.COCAINE_GOOD, 1200), 1.0f).build();
}
