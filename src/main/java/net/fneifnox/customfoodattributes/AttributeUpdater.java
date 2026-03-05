package net.fneifnox.customfoodattributes;

import io.wispforest.owo.config.Option;
import net.fneifnox.customfoodattributes.util.FoodData;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Objects;

import static net.fneifnox.customfoodattributes.CustomFoodAttributes.CONFIG;

public class AttributeUpdater {

    public static HashMap<Item, FoodData> foods = new HashMap<>();

    public static void observeAllConfigChanges(Runnable callback) {
        for (Field field : CONFIG.getClass().getDeclaredFields()) {
            if (!Option.class.isAssignableFrom(field.getType())) continue;
            field.setAccessible(true);
            try {
                @SuppressWarnings("unchecked")
                Option<Object> option = (Option<Object>) field.get(CONFIG);
                option.observe(val -> callback.run());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static void configureFoodAttributes(Item item, int nutrition, float saturation, float eatSeconds, boolean alwaysEdible) {
        if (item.getComponents().get(DataComponentTypes.FOOD) == null) return;

        FoodComponent.Builder builder = new FoodComponent.Builder()
                .nutrition((int) Math.round(nutrition * CONFIG.nutritionMultiplierForAll()))
                .saturationModifier((float) (saturation * CONFIG.saturationMultiplierForAll()));

        if (alwaysEdible) {
            builder.alwaysEdible();
        }

        foods.put(item, new FoodData(builder.build(), (float) (eatSeconds * CONFIG.eatSecondsMultiplierForAll())));
    }

    public static void configureNonListedFoodAttributes() {
        for (Item item : Registries.ITEM) {
            if (item.getComponents().get(DataComponentTypes.FOOD) == null) continue;
            FoodComponent.Builder builder = new FoodComponent.Builder()
                    .nutrition((int) Math.round(Objects.requireNonNull(item.getComponents().get(DataComponentTypes.FOOD)).nutrition() * CONFIG.nutritionMultiplierForAll()))
                    .saturationModifier((float) (Objects.requireNonNull(item.getComponents().get(DataComponentTypes.FOOD)).saturation() * CONFIG.saturationMultiplierForAll()));

            if (Objects.requireNonNull(item.getComponents().get(DataComponentTypes.FOOD)).canAlwaysEat()) {
                builder.alwaysEdible();
            }

            foods.put(item, new FoodData(builder.build(), (float) (Objects.requireNonNull(item.getComponents().get(DataComponentTypes.CONSUMABLE)).consumeSeconds() * CONFIG.eatSecondsMultiplierForAll())));
        }
    }
}
