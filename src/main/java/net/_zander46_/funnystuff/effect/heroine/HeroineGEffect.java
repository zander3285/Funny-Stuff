package net._zander46_.funnystuff.effect.heroine;


import net._zander46_.funnystuff.effect.ModEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.resource.featuretoggle.FeatureFlag;

public class HeroineGEffect extends StatusEffect {
    private LivingEntity entity;
    public HeroineGEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }


    @Override
    public void onApplied(LivingEntity entity, int amplifier) {
        DamageSource damageSource = entity.getDamageSources().magic();
        entity.damage(damageSource, 2.0F);
        entity.removeStatusEffect(ModEffects.HEROINE_BAD);
        this.entity = entity;
        super.onApplied(entity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void onRemoved(AttributeContainer attributeContainer) {
        DamageSource damageSource = entity.getDamageSources().magic();
        entity.damage(damageSource, 2.0F);
        entity.addStatusEffect(new StatusEffectInstance(ModEffects.HEROINE_BAD, 120));
        super.onRemoved(attributeContainer);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        return super.applyUpdateEffect(entity, amplifier);
    }
}
