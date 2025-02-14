package net._zander46_.funnystuff.effect.cocaine;

import net._zander46_.funnystuff.effect.ModEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class CocaineBEffect extends StatusEffect {
    public CocaineBEffect(StatusEffectCategory category, int color) {
        super(category, color);
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
        if (entity.hasStatusEffect(ModEffects.COCAINE_GOOD)) {
            entity.removeStatusEffect(ModEffects.COCAINE_BAD);
        }
        return super.applyUpdateEffect(entity, amplifier);
    }
}
