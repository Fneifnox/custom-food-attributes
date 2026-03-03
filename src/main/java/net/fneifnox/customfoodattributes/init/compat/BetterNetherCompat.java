package net.fneifnox.customfoodattributes.init.compat;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static net.fneifnox.customfoodattributes.AttributeUpdater.configureFoodAttributes;
import static net.fneifnox.customfoodattributes.CustomFoodAttributes.CONFIG;

public class BetterNetherCompat {

    public static void initBetterNetherAttributes() {
        Item blackApple = Registries.ITEM.get(Identifier.of("betternether", "black_apple"));
        Item bowlWithBlackApple = Registries.ITEM.get(Identifier.of("betternether", "stalagnate_bowl_apple"));
        Item cookedHookMushroom = Registries.ITEM.get(Identifier.of("betternether", "hook_mushroom_cooked"));
        Item mushroomStew = Registries.ITEM.get(Identifier.of("betternether", "stalagnate_bowl_mushroom"));
        Item wartSoup = Registries.ITEM.get(Identifier.of("betternether", "stalagnate_bowl_wart"));

        configureFoodAttributes(blackApple, CONFIG.betterNether.nutritionForBlackApple(), CONFIG.betterNether.saturationForBlackApple(), CONFIG.betterNether.eatSecondsForBlackApple(), CONFIG.betterNether.alwaysEdibleForBlackApple());
        configureFoodAttributes(bowlWithBlackApple, CONFIG.betterNether.nutritionForBowlWithBlackApple(), CONFIG.betterNether.saturationForBowlWithBlackApple(), CONFIG.betterNether.eatSecondsForBowlWithBlackApple(), CONFIG.betterNether.alwaysEdibleForBowlWithBlackApple());
        configureFoodAttributes(cookedHookMushroom, CONFIG.betterNether.nutritionForCookedHookMushroom(), CONFIG.betterNether.saturationForCookedHookMushroom(), CONFIG.betterNether.eatSecondsForCookedHookMushroom(), CONFIG.betterNether.alwaysEdibleForCookedHookMushroom());
        configureFoodAttributes(mushroomStew, CONFIG.betterNether.nutritionForMushroomStew(), CONFIG.betterNether.saturationForMushroomStew(), CONFIG.betterNether.eatSecondsForMushroomStew(), CONFIG.betterNether.alwaysEdibleForMushroomStew());
        configureFoodAttributes(wartSoup, CONFIG.betterNether.nutritionForWartSoup(), CONFIG.betterNether.saturationForWartSoup(), CONFIG.betterNether.eatSecondsForWartSoup(), CONFIG.betterNether.alwaysEdibleForWartSoup());
    }
}
