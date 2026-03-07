package net.fneifnox.customfoodattributes;

import com.mojang.datafixers.util.Pair;
import io.wispforest.owo.config.Option;
import net.fneifnox.customfoodattributes.util.FoodData;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;

import java.lang.reflect.Field;
import java.util.HashMap;

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
        if (item.getFoodComponent() == null) return;

        FoodComponent.Builder builder = new FoodComponent.Builder()
                .hunger((int) Math.round(nutrition * CONFIG.nutritionMultiplierForAll()))
                .saturationModifier((float) (saturation * CONFIG.saturationMultiplierForAll()));

        if (alwaysEdible) {
            builder.alwaysEdible();
        }

        if (item.getFoodComponent().isMeat()) {
            builder.meat();
        }

        if (!item.getFoodComponent().getStatusEffects().isEmpty()) {
            for (Pair<StatusEffectInstance, Float> statusEffectEntry : item.getFoodComponent().getStatusEffects()) {
                builder.statusEffect(statusEffectEntry.getFirst(), statusEffectEntry.getSecond());
            }
        }

        foods.put(item, new FoodData(builder.build(), (float) (eatSeconds * CONFIG.eatSecondsMultiplierForAll())));
    }

    public static void configureNonListedFoodAttributes() {
        for (Item item : Registries.ITEM) {
            if (item.getFoodComponent() == null) continue;
            FoodComponent.Builder builder = new FoodComponent.Builder()
                    .hunger((int) Math.round(item.getFoodComponent().getHunger() * CONFIG.nutritionMultiplierForAll()))
                    .saturationModifier((item.getFoodComponent().getSaturationModifier() * (float) CONFIG.saturationMultiplierForAll()));

            if (item.getFoodComponent().isAlwaysEdible()) {
                builder.alwaysEdible();
            }

            if (item.getFoodComponent().isMeat()) {
                builder.meat();
            }

            if (!item.getFoodComponent().getStatusEffects().isEmpty()) {
                for (Pair<StatusEffectInstance, Float> statusEffectEntry : item.getFoodComponent().getStatusEffects()) {
                    builder.statusEffect(statusEffectEntry.getFirst(), statusEffectEntry.getSecond());
                }
            }

            foods.put(item, new FoodData(builder.build(), (item.getMaxUseTime(item.getDefaultStack()) * (float) CONFIG.eatSecondsMultiplierForAll())));
        }
    }
}
