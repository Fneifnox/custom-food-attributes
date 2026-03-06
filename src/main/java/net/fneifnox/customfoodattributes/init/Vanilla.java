package net.fneifnox.customfoodattributes.init;

import net.minecraft.world.item.Items;

import static net.fneifnox.customfoodattributes.AttributeUpdater.configureFoodAttributes;
import static net.fneifnox.customfoodattributes.CustomFoodAttributes.CONFIG;

public class Vanilla {

    public static void initVanillaAttributes() {
        configureFoodAttributes(Items.APPLE, CONFIG.nutritionForApple(), CONFIG.saturationForApple(), CONFIG.eatSecondsForApple(), CONFIG.alwaysEdibleForApple());
        configureFoodAttributes(Items.BAKED_POTATO, CONFIG.nutritionForBakedPotato(), CONFIG.saturationForBakedPotato(), CONFIG.eatSecondsForBakedPotato(), CONFIG.alwaysEdibleForBakedPotato());
        configureFoodAttributes(Items.BEEF, CONFIG.nutritionForBeef(), CONFIG.saturationForBeef(), CONFIG.eatSecondsForBeef(), CONFIG.alwaysEdibleForBeef());
        configureFoodAttributes(Items.BEETROOT, CONFIG.nutritionForBeetroot(), CONFIG.saturationForBeetroot(), CONFIG.eatSecondsForBeetroot(), CONFIG.alwaysEdibleForBeetroot());
        configureFoodAttributes(Items.BEETROOT_SOUP, CONFIG.nutritionForBeetrootSoup(), CONFIG.saturationForBeetrootSoup(), CONFIG.eatSecondsForBeetrootSoup(), CONFIG.alwaysEdibleForBeetrootSoup());
        configureFoodAttributes(Items.BREAD, CONFIG.nutritionForBread(), CONFIG.saturationForBread(), CONFIG.eatSecondsForBread(), CONFIG.alwaysEdibleForBread());
        configureFoodAttributes(Items.CARROT, CONFIG.nutritionForCarrot(), CONFIG.saturationForCarrot(), CONFIG.eatSecondsForCarrot(), CONFIG.alwaysEdibleForCarrot());
        configureFoodAttributes(Items.CHICKEN, CONFIG.nutritionForChicken(), CONFIG.saturationForChicken(), CONFIG.eatSecondsForChicken(), CONFIG.alwaysEdibleForChicken());
        configureFoodAttributes(Items.CHORUS_FRUIT, CONFIG.nutritionForChorusFruit(), CONFIG.saturationForChorusFruit(), CONFIG.eatSecondsForChorusFruit(), CONFIG.alwaysEdibleForChorusFruit());
        configureFoodAttributes(Items.COD, CONFIG.nutritionForCod(), CONFIG.saturationForCod(), CONFIG.eatSecondsForCod(), CONFIG.alwaysEdibleForCod());
        configureFoodAttributes(Items.COOKED_BEEF, CONFIG.nutritionForCookedBeef(), CONFIG.saturationForCookedBeef(), CONFIG.eatSecondsForCookedBeef(), CONFIG.alwaysEdibleForCookedBeef());
        configureFoodAttributes(Items.COOKED_CHICKEN, CONFIG.nutritionForCookedChicken(), CONFIG.saturationForCookedChicken(), CONFIG.eatSecondsForCookedChicken(), CONFIG.alwaysEdibleForCookedChicken());
        configureFoodAttributes(Items.COOKED_COD, CONFIG.nutritionForCookedCod(), CONFIG.saturationForCookedCod(), CONFIG.eatSecondsForCookedCod(), CONFIG.alwaysEdibleForCookedCod());
        configureFoodAttributes(Items.COOKED_MUTTON, CONFIG.nutritionForCookedMutton(), CONFIG.saturationForCookedMutton(), CONFIG.eatSecondsForCookedMutton(), CONFIG.alwaysEdibleForCookedMutton());
        configureFoodAttributes(Items.COOKED_PORKCHOP, CONFIG.nutritionForCookedPorkchop(), CONFIG.saturationForCookedPorkchop(), CONFIG.eatSecondsForCookedPorkchop(), CONFIG.alwaysEdibleForCookedPorkchop());
        configureFoodAttributes(Items.COOKED_RABBIT, CONFIG.nutritionForCookedRabbit(), CONFIG.saturationForCookedRabbit(), CONFIG.eatSecondsForCookedRabbit(), CONFIG.alwaysEdibleForCookedRabbit());
        configureFoodAttributes(Items.COOKED_SALMON, CONFIG.nutritionForCookedSalmon(), CONFIG.saturationForCookedSalmon(), CONFIG.eatSecondsForCookedSalmon(), CONFIG.alwaysEdibleForCookedSalmon());
        configureFoodAttributes(Items.COOKIE, CONFIG.nutritionForCookie(), CONFIG.saturationForCookie(), CONFIG.eatSecondsForCookie(), CONFIG.alwaysEdibleForCookie());
        configureFoodAttributes(Items.DRIED_KELP, CONFIG.nutritionForDriedKelp(), CONFIG.saturationForDriedKelp(), CONFIG.eatSecondsForDriedKelp(), CONFIG.alwaysEdibleForDriedKelp());
        configureFoodAttributes(Items.ENCHANTED_GOLDEN_APPLE, CONFIG.nutritionForEnchantedGoldenApple(), CONFIG.saturationForEnchantedGoldenApple(), CONFIG.eatSecondsForEnchantedGoldenApple(), CONFIG.alwaysEdibleForEnchantedGoldenApple());
        configureFoodAttributes(Items.GLOW_BERRIES, CONFIG.nutritionForGlowBerries(), CONFIG.saturationForGlowBerries(), CONFIG.eatSecondsForGlowBerries(), CONFIG.alwaysEdibleForGlowBerries());
        configureFoodAttributes(Items.GOLDEN_APPLE, CONFIG.nutritionForGoldenApple(), CONFIG.saturationForGoldenApple(), CONFIG.eatSecondsForGoldenApple(), CONFIG.alwaysEdibleForGoldenApple());
        configureFoodAttributes(Items.GOLDEN_CARROT, CONFIG.nutritionForGoldenCarrot(), CONFIG.saturationForGoldenCarrot(), CONFIG.eatSecondsForGoldenCarrot(), CONFIG.alwaysEdibleForGoldenCarrot());
        configureFoodAttributes(Items.HONEY_BOTTLE, CONFIG.nutritionForHoneyBottle(), CONFIG.saturationForHoneyBottle(), CONFIG.eatSecondsForHoneyBottle(), CONFIG.alwaysEdibleForHoneyBottle());
        configureFoodAttributes(Items.MELON_SLICE, CONFIG.nutritionForMelonSlice(), CONFIG.saturationForMelonSlice(), CONFIG.eatSecondsForMelonSlice(), CONFIG.alwaysEdibleForMelonSlice());
        configureFoodAttributes(Items.MUSHROOM_STEW, CONFIG.nutritionForMushroomStew(), CONFIG.saturationForMushroomStew(), CONFIG.eatSecondsForMushroomStew(), CONFIG.alwaysEdibleForMushroomStew());
        configureFoodAttributes(Items.MUTTON, CONFIG.nutritionForMutton(), CONFIG.saturationForMutton(), CONFIG.eatSecondsForMutton(), CONFIG.alwaysEdibleForMutton());
        configureFoodAttributes(Items.OMINOUS_BOTTLE, CONFIG.nutritionForOminousBottle(), CONFIG.saturationForOminousBottle(), CONFIG.eatSecondsForOminousBottle(), CONFIG.alwaysEdibleForOminousBottle());
        configureFoodAttributes(Items.POISONOUS_POTATO, CONFIG.nutritionForPoisonousPotato(), CONFIG.saturationForPoisonousPotato(), CONFIG.eatSecondsForPoisonousPotato(), CONFIG.alwaysEdibleForPoisonousPotato());
        configureFoodAttributes(Items.PORKCHOP, CONFIG.nutritionForPorkchop(), CONFIG.saturationForPorkchop(), CONFIG.eatSecondsForPorkchop(), CONFIG.alwaysEdibleForPorkchop());
        configureFoodAttributes(Items.POTATO, CONFIG.nutritionForPotato(), CONFIG.saturationForPotato(), CONFIG.eatSecondsForPotato(), CONFIG.alwaysEdibleForPotato());
        configureFoodAttributes(Items.PUFFERFISH, CONFIG.nutritionForPufferfish(), CONFIG.saturationForPufferfish(), CONFIG.eatSecondsForPufferfish(), CONFIG.alwaysEdibleForPufferfish());
        configureFoodAttributes(Items.PUMPKIN_PIE, CONFIG.nutritionForPumpkinPie(), CONFIG.saturationForPumpkinPie(), CONFIG.eatSecondsForPumpkinPie(), CONFIG.alwaysEdibleForPumpkinPie());
        configureFoodAttributes(Items.RABBIT, CONFIG.nutritionForRabbit(), CONFIG.saturationForRabbit(), CONFIG.eatSecondsForRabbit(), CONFIG.alwaysEdibleForRabbit());
        configureFoodAttributes(Items.RABBIT_STEW, CONFIG.nutritionForRabbitStew(), CONFIG.saturationForRabbitStew(), CONFIG.eatSecondsForRabbitStew(), CONFIG.alwaysEdibleForRabbitStew());
        configureFoodAttributes(Items.ROTTEN_FLESH, CONFIG.nutritionForRottenFlesh(), CONFIG.saturationForRottenFlesh(), CONFIG.eatSecondsForRottenFlesh(), CONFIG.alwaysEdibleForRottenFlesh());
        configureFoodAttributes(Items.SALMON, CONFIG.nutritionForSalmon(), CONFIG.saturationForSalmon(), CONFIG.eatSecondsForSalmon(), CONFIG.alwaysEdibleForSalmon());
        configureFoodAttributes(Items.SPIDER_EYE, CONFIG.nutritionForSpiderEye(), CONFIG.saturationForSpiderEye(), CONFIG.eatSecondsForSpiderEye(), CONFIG.alwaysEdibleForSpiderEye());
        configureFoodAttributes(Items.SUSPICIOUS_STEW, CONFIG.nutritionForSuspiciousStew(), CONFIG.saturationForSuspiciousStew(), CONFIG.eatSecondsForSuspiciousStew(), CONFIG.alwaysEdibleForSuspiciousStew());
        configureFoodAttributes(Items.SWEET_BERRIES, CONFIG.nutritionForSweetBerries(), CONFIG.saturationForSweetBerries(), CONFIG.eatSecondsForSweetBerries(), CONFIG.alwaysEdibleForSweetBerries());
        configureFoodAttributes(Items.TROPICAL_FISH, CONFIG.nutritionForTropicalFish(), CONFIG.saturationForTropicalFish(), CONFIG.eatSecondsForTropicalFish(), CONFIG.alwaysEdibleForTropicalFish());
    }
}
