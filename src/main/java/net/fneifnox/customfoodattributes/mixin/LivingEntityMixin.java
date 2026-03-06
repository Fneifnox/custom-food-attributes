package net.fneifnox.customfoodattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.customfoodattributes.AttributeUpdater.foods;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {

    // EatSeconds
    @ModifyExpressionValue(method = "startUsingItem", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;getUseDuration(Lnet/minecraft/world/entity/LivingEntity;)I"))
    private int changeEatingSpeed(int original, InteractionHand hand) {
        LivingEntity entity = (LivingEntity)(Object)this;
        if (foods.get(entity.getItemInHand(hand).getItem()) == null) return original;
        return Math.max(1, Math.round(foods.get(entity.getItemInHand(hand).getItem()).eatSeconds() * 20));
    }
}
