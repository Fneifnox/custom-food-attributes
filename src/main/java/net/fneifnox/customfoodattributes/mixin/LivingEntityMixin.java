package net.fneifnox.customfoodattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.customfoodattributes.AttributeUpdater.foods;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {

    // EatSeconds
    @ModifyExpressionValue(method = "setCurrentHand", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;getMaxUseTime()I"))
    private int changeEatingSpeed(int original, Hand hand) {
        LivingEntity entity = (LivingEntity)(Object)this;
        if (foods.get(entity.getStackInHand(hand).getItem()) == null) return original;
        return Math.max(1, Math.round(foods.get(entity.getStackInHand(hand).getItem()).eatSeconds() * 20));
    }
}
