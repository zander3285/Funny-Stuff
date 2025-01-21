package net._zander46_.funnystuff.effect.heroine;

import net._zander46_.funnystuff.effect.ModEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.resource.featuretoggle.FeatureFlag;

public class HeroineBEffect extends StatusEffect {
    public HeroineBEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }



    @Override
    public StatusEffect requires(FeatureFlag... requiredFeatures) {
        return super.requires(requiredFeatures);
    }

    @Override
    public void onRemoved(AttributeContainer attributeContainer) {
        super.onRemoved(attributeContainer);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity.hasStatusEffect(ModEffects.HEROINE_GOOD)) {
            entity.removeStatusEffect(ModEffects.HEROINE_BAD);
        }
        return super.applyUpdateEffect(entity, amplifier);
    }
}
