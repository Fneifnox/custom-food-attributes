package net.fneifnox.customfoodattributes.init.compat;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static net.fneifnox.customfoodattributes.AttributeUpdater.configureFoodAttributes;
import static net.fneifnox.customfoodattributes.CustomFoodAttributes.CONFIG;

public class BetterEndCompat {

    public static void initBetterEndAttributes() {
        Item blossomBerry = Registries.ITEM.get(Identifier.of("betterend", "blossom_berry"));
        Item blossomBerryJelly = Registries.ITEM.get(Identifier.of("betterend", "blossom_berry_jelly"));
        Item cavePumpkinPie = Registries.ITEM.get(Identifier.of("betterend", "cave_pumpkin_pie"));
        Item cookedBoluxMushroom = Registries.ITEM.get(Identifier.of("betterend", "bolux_mushroom_cooked"));
        Item cookedChorusMushroom = Registries.ITEM.get(Identifier.of("betterend", "chorus_mushroom_cooked"));
        Item cookedEndFish = Registries.ITEM.get(Identifier.of("betterend", "end_fish_cooked"));
        Item endFish = Registries.ITEM.get(Identifier.of("betterend", "end_fish_raw"));
        Item rawAmberRoot = Registries.ITEM.get(Identifier.of("betterend", "amber_root_raw"));
        Item rawChorusMushroom = Registries.ITEM.get(Identifier.of("betterend", "chorus_mushroom_raw"));
        Item shadowBerry = Registries.ITEM.get(Identifier.of("betterend", "shadow_berry_raw"));
        Item shadowBerryCooked = Registries.ITEM.get(Identifier.of("betterend", "shadow_berry_cooked"));
        Item shadowBerryJelly = Registries.ITEM.get(Identifier.of("betterend", "shadow_berry_jelly"));
        Item sweetBerryJelly = Registries.ITEM.get(Identifier.of("betterend", "sweet_berry_jelly"));
        Item umbrellaClusterJuice = Registries.ITEM.get(Identifier.of("betterend", "umbrella_cluster_juice"));

        configureFoodAttributes(blossomBerry, CONFIG.betterEnd.nutritionForBlossomBerry(), CONFIG.betterEnd.saturationForBlossomBerry(), CONFIG.betterEnd.eatSecondsForBlossomBerry(), CONFIG.betterEnd.alwaysEdibleForBlossomBerry());
        configureFoodAttributes(blossomBerryJelly, CONFIG.betterEnd.nutritionForBlossomBerryJelly(), CONFIG.betterEnd.saturationForBlossomBerryJelly(), CONFIG.betterEnd.eatSecondsForBlossomBerryJelly(), CONFIG.betterEnd.alwaysEdibleForBlossomBerryJelly());
        configureFoodAttributes(cavePumpkinPie, CONFIG.betterEnd.nutritionForCavePumpkinPie(), CONFIG.betterEnd.saturationForCavePumpkinPie(), CONFIG.betterEnd.eatSecondsForCavePumpkinPie(), CONFIG.betterEnd.alwaysEdibleForCavePumpkinPie());
        configureFoodAttributes(cookedBoluxMushroom, CONFIG.betterEnd.nutritionForCookedBoluxMushroom(), CONFIG.betterEnd.saturationForCookedBoluxMushroom(), CONFIG.betterEnd.eatSecondsForCookedBoluxMushroom(), CONFIG.betterEnd.alwaysEdibleForCookedBoluxMushroom());
        configureFoodAttributes(cookedChorusMushroom, CONFIG.betterEnd.nutritionForCookedChorusMushroom(), CONFIG.betterEnd.saturationForCookedChorusMushroom(), CONFIG.betterEnd.eatSecondsForCookedChorusMushroom(), CONFIG.betterEnd.alwaysEdibleForCookedChorusMushroom());
        configureFoodAttributes(cookedEndFish, CONFIG.betterEnd.nutritionForCookedEndFish(), CONFIG.betterEnd.saturationForCookedEndFish(), CONFIG.betterEnd.eatSecondsForCookedEndFish(), CONFIG.betterEnd.alwaysEdibleForCookedEndFish());
        configureFoodAttributes(endFish, CONFIG.betterEnd.nutritionForEndFish(), CONFIG.betterEnd.saturationForEndFish(), CONFIG.betterEnd.eatSecondsForEndFish(), CONFIG.betterEnd.alwaysEdibleForEndFish());
        configureFoodAttributes(rawAmberRoot, CONFIG.betterEnd.nutritionForRawAmberRoot(), CONFIG.betterEnd.saturationForRawAmberRoot(), CONFIG.betterEnd.eatSecondsForRawAmberRoot(), CONFIG.betterEnd.alwaysEdibleForRawAmberRoot());
        configureFoodAttributes(rawChorusMushroom, CONFIG.betterEnd.nutritionForRawChorusMushroom(), CONFIG.betterEnd.saturationForRawChorusMushroom(), CONFIG.betterEnd.eatSecondsForRawChorusMushroom(), CONFIG.betterEnd.alwaysEdibleForRawChorusMushroom());
        configureFoodAttributes(shadowBerry, CONFIG.betterEnd.nutritionForShadowBerry(), CONFIG.betterEnd.saturationForShadowBerry(), CONFIG.betterEnd.eatSecondsForShadowBerry(), CONFIG.betterEnd.alwaysEdibleForShadowBerry());
        configureFoodAttributes(shadowBerryCooked, CONFIG.betterEnd.nutritionForShadowBerryCooked(), CONFIG.betterEnd.saturationForShadowBerryCooked(), CONFIG.betterEnd.eatSecondsForShadowBerryCooked(), CONFIG.betterEnd.alwaysEdibleForShadowBerryCooked());
        configureFoodAttributes(shadowBerryJelly, CONFIG.betterEnd.nutritionForShadowBerryJelly(), CONFIG.betterEnd.saturationForShadowBerryJelly(), CONFIG.betterEnd.eatSecondsForShadowBerryJelly(), CONFIG.betterEnd.alwaysEdibleForShadowBerryJelly());
        configureFoodAttributes(sweetBerryJelly, CONFIG.betterEnd.nutritionForSweetBerryJelly(), CONFIG.betterEnd.saturationForSweetBerryJelly(), CONFIG.betterEnd.eatSecondsForSweetBerryJelly(), CONFIG.betterEnd.alwaysEdibleForSweetBerryJelly());
        configureFoodAttributes(umbrellaClusterJuice, CONFIG.betterEnd.nutritionForUmbrellaClusterJuice(), CONFIG.betterEnd.saturationForUmbrellaClusterJuice(), CONFIG.betterEnd.eatSecondsForUmbrellaClusterJuice(), CONFIG.betterEnd.alwaysEdibleForUmbrellaClusterJuice());
    }
}
