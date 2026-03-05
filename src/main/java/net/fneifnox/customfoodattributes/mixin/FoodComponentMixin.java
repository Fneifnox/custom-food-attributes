package net.fneifnox.customfoodattributes.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.player.HungerManager;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.customfoodattributes.AttributeUpdater.foods;

@Mixin(FoodComponent.class)
public class FoodComponentMixin {

    // Nutrition & Saturation
    @WrapOperation(method = "onConsume", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/HungerManager;eat(Lnet/minecraft/component/type/FoodComponent;)V"))
    private void modifyNutritionAndSaturation(HungerManager hungerManager, FoodComponent foodComponent, Operation<Void> original, @Local(argsOnly = true) ItemStack stack) {

        if (foodComponent != null) {
            if (foods.get(stack.getItem()) != null) {
                original.call(hungerManager, foods.get(stack.getItem()).foodComponent());
                return;
            }
            original.call(hungerManager, foodComponent);
        }
    }
}
