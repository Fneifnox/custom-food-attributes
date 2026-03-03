package net.fneifnox.customfoodattributes.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.component.ComponentType;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.customfoodattributes.AttributeUpdater.foods;

@Mixin(Item.class)
public class ItemMixin {

    // Nutrition & Saturation
    @WrapOperation(method = "finishUsing", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;eatFood(Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;Lnet/minecraft/component/type/FoodComponent;)Lnet/minecraft/item/ItemStack;"))
    private ItemStack modifyNutritionAndSaturation(LivingEntity user, World world, ItemStack stack, FoodComponent foodComponent, Operation<ItemStack> original) {

        if (foodComponent != null) {
            if (foods.get(stack.getItem()) != null) {
                return original.call(user, world, stack, foods.get(stack.getItem()).foodComponent());
            }
            return original.call(user, world, stack, foodComponent);
        }

        return stack;
    }

    // AlwaysEdible
    @WrapOperation(method = "use", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;get(Lnet/minecraft/component/ComponentType;)Ljava/lang/Object;"))
    private Object modifyAlwaysEdible(ItemStack itemStack, ComponentType componentType, Operation<Object> original) {
        if (foods.get(itemStack.getItem()) != null) {
            return foods.get((itemStack.getItem())).foodComponent();
        }
        return original.call(itemStack, componentType);
    }
}
