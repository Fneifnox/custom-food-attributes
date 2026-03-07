package net.fneifnox.customfoodattributes.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.component.DataComponentType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.customfoodattributes.AttributeUpdater.foods;

@Mixin(Item.class)
public class ItemMixin {

    // AlwaysEdible
    @WrapOperation(method = "use", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;get(Lnet/minecraft/component/DataComponentType;)Ljava/lang/Object;"))
    private Object modifyAlwaysEdible(ItemStack itemStack, DataComponentType componentType, Operation<Object> original) {
        if (foods.get(itemStack.getItem()) != null) {
            return foods.get((itemStack.getItem())).foodComponent();
        }
        return original.call(itemStack, componentType);
    }
}
