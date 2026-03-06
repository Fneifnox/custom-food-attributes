package net.fneifnox.customfoodattributes.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.world.food.FoodData;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.customfoodattributes.AttributeUpdater.foods;

@Mixin(FoodProperties.class)
public class FoodComponentMixin {

    // Nutrition & Saturation
    @WrapOperation(method = "onConsume", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/food/FoodData;eat(Lnet/minecraft/world/food/FoodProperties;)V"))
    private void modifyNutritionAndSaturation(FoodData hungerManager, FoodProperties foodComponent, Operation<Void> original, @Local(argsOnly = true) ItemStack stack) {

        if (foodComponent != null) {
            if (foods.get(stack.getItem()) != null) {
                original.call(hungerManager, foods.get(stack.getItem()).foodComponent());
                return;
            }
            original.call(hungerManager, foodComponent);
        }
    }
}
