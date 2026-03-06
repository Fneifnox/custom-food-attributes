package net.fneifnox.customfoodattributes;

import io.wispforest.owo.config.Option;
import net.fneifnox.customfoodattributes.util.FoodData;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

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
        if (item.components().get(DataComponents.FOOD) == null) return;

        FoodProperties.Builder builder = new FoodProperties.Builder()
                .nutrition((int) Math.round(nutrition * CONFIG.nutritionMultiplierForAll()))
                .saturationModifier((float) (saturation * CONFIG.saturationMultiplierForAll()));

        if (alwaysEdible) {
            builder.alwaysEdible();
        }

        foods.put(item, new FoodData(builder.build(), (float) (eatSeconds * CONFIG.eatSecondsMultiplierForAll())));
    }

    public static void configureNonListedFoodAttributes() {
        for (Item item : BuiltInRegistries.ITEM) {
            if (item.components().get(DataComponents.FOOD) == null || item.components().get(DataComponents.CONSUMABLE) == null) continue;
            FoodProperties.Builder builder = new FoodProperties.Builder()
                    .nutrition((int) Math.round(Objects.requireNonNull(item.components().get(DataComponents.FOOD)).nutrition() * CONFIG.nutritionMultiplierForAll()))
                    .saturationModifier((float) (Objects.requireNonNull(item.components().get(DataComponents.FOOD)).saturation() * CONFIG.saturationMultiplierForAll()));

            if (Objects.requireNonNull(item.components().get(DataComponents.FOOD)).canAlwaysEat()) {
                builder.alwaysEdible();
            }

            foods.put(item, new FoodData(builder.build(), (float) (Objects.requireNonNull(item.components().get(DataComponents.CONSUMABLE)).consumeSeconds() * CONFIG.eatSecondsMultiplierForAll())));
        }
    }
}
