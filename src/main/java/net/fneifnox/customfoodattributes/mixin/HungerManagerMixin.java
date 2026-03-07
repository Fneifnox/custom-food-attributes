package net.fneifnox.customfoodattributes.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.entity.player.HungerManager;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.customfoodattributes.AttributeUpdater.foods;

@Mixin(HungerManager.class)
public class HungerManagerMixin {

    // Nutrition & Saturation
    @WrapOperation(method = "eat", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item;getFoodComponent()Lnet/minecraft/item/FoodComponent;"))
    private FoodComponent modifyNutritionAndSaturation(Item item, Operation<FoodComponent> original) {

        if (foods.get(item) != null) {
            return foods.get(item).foodComponent();
        }
        return item.getFoodComponent();
    }

}
