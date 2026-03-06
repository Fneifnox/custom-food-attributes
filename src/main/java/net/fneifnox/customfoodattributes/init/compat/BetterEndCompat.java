package net.fneifnox.customfoodattributes.init.compat;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;

import static net.fneifnox.customfoodattributes.AttributeUpdater.configureFoodAttributes;
import static net.fneifnox.customfoodattributes.CustomFoodAttributes.CONFIG;

public class BetterEndCompat {

    public static void initBetterEndAttributes() {
        Item blossomBerry = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("betterend", "blossom_berry"));
        Item blossomBerryJelly = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("betterend", "blossom_berry_jelly"));
        Item cavePumpkinPie = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("betterend", "cave_pumpkin_pie"));
        Item cookedBoluxMushroom = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("betterend", "bolux_mushroom_cooked"));
        Item cookedChorusMushroom = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("betterend", "chorus_mushroom_cooked"));
        Item cookedEndFish = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("betterend", "end_fish_cooked"));
        Item endFish = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("betterend", "end_fish_raw"));
        Item rawAmberRoot = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("betterend", "amber_root_raw"));
        Item rawChorusMushroom = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("betterend", "chorus_mushroom_raw"));
        Item shadowBerry = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("betterend", "shadow_berry_raw"));
        Item shadowBerryCooked = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("betterend", "shadow_berry_cooked"));
        Item shadowBerryJelly = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("betterend", "shadow_berry_jelly"));
        Item sweetBerryJelly = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("betterend", "sweet_berry_jelly"));
        Item umbrellaClusterJuice = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("betterend", "umbrella_cluster_juice"));

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
