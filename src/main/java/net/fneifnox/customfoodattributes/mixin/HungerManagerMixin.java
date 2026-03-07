package net.fneifnox.customfoodattributes.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.component.DataComponentType;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.player.HungerManager;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.customfoodattributes.AttributeUpdater.foods;

@Mixin(HungerManager.class)
public class HungerManagerMixin {

    // Nutrition & Saturation
    @WrapOperation(method = "eat", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;get(Lnet/minecraft/component/DataComponentType;)Ljava/lang/Object;"))
    private Object modifyNutritionAndSaturation(ItemStack itemStack, DataComponentType dataComponentType, Operation<Object> original) {

        if (foods.get(itemStack.getItem()) != null) {
            return foods.get(itemStack.getItem()).foodComponent();
        }
        return itemStack.get(DataComponentTypes.FOOD);
    }
}
