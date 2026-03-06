package net.fneifnox.customfoodattributes.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.Consumable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.customfoodattributes.AttributeUpdater.foods;

@Mixin(Consumable.class)
public class ConsumableComponentMixin {

    // AlwaysEdible
    @WrapOperation(method = "canConsume", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;"))
    private Object modifyAlwaysEdible(ItemStack itemStack, DataComponentType componentType, Operation<Object> original) {
        if (foods.get(itemStack.getItem()) != null) {
            return foods.get((itemStack.getItem())).foodComponent();
        }
        return original.call(itemStack, componentType);
    }
}
