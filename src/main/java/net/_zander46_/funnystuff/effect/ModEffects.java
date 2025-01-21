package net._zander46_.funnystuff.effect;

import net._zander46_.funnystuff.FunnyStuff;
import net._zander46_.funnystuff.effect.cocaine.CocaineBEffect;
import net._zander46_.funnystuff.effect.cocaine.CocaineGEffect;
import net._zander46_.funnystuff.effect.heroine.HeroineBEffect;
import net._zander46_.funnystuff.effect.heroine.HeroineGEffect;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> COCAINE_GOOD = registerStatusEffect("cocaine_good",
            new CocaineGEffect(StatusEffectCategory.BENEFICIAL,3402751)
                    .requires()
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, Identifier.of(FunnyStuff.MOD_ID, "cocaine_good"), 0.7F,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));


    public static final RegistryEntry<StatusEffect> COCAINE_BAD = registerStatusEffect("cocaine_bad",
            new CocaineBEffect(StatusEffectCategory.HARMFUL,3402751)
                    .requires()
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, Identifier.of(FunnyStuff.MOD_ID, "cocaine_bad"), -0.7F,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> HEROINE_GOOD = registerStatusEffect("heroine_good",
            new HeroineGEffect(StatusEffectCategory.BENEFICIAL,3402751)
                    .requires()
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED, Identifier.of(FunnyStuff.MOD_ID, "heroine_good"), 50.0F,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));


    public static final RegistryEntry<StatusEffect> HEROINE_BAD = registerStatusEffect("heroine_bad",
            new HeroineBEffect(StatusEffectCategory.HARMFUL,3402751)
                    .requires()
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED, Identifier.of(FunnyStuff.MOD_ID, "heroine_bad"), -20.7F,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));


    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(FunnyStuff.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        FunnyStuff.LOGGER.info("Registering Mod Effects for "+ FunnyStuff.MOD_ID);
    }
}
