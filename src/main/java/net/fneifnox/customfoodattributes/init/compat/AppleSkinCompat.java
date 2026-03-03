package net.fneifnox.customfoodattributes.init.compat;

import squeek.appleskin.api.event.FoodValuesEvent;

import static net.fneifnox.customfoodattributes.AttributeUpdater.foods;

public class AppleSkinCompat {

    public static void modifyAppleSkinValues() {
        FoodValuesEvent.EVENT.register((event) -> {
            if (foods.get(event.itemStack.getItem()) != null) {
                event.modifiedFoodComponent = foods.get(event.itemStack.getItem()).foodComponent();
            }
        });
    }
}
