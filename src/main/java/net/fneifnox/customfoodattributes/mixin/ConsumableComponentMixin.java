package net.fneifnox.customfoodattributes.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.component.ComponentType;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.customfoodattributes.AttributeUpdater.foods;

@Mixin(ConsumableComponent.class)
public class ConsumableComponentMixin {

    // AlwaysEdible
    @WrapOperation(method = "canConsume", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;get(Lnet/minecraft/component/ComponentType;)Ljava/lang/Object;"))
    private Object modifyAlwaysEdible(ItemStack itemStack, ComponentType componentType, Operation<Object> original) {
        if (foods.get(itemStack.getItem()) != null) {
            return foods.get((itemStack.getItem())).foodComponent();
        }
        return original.call(itemStack, componentType);
    }
}
