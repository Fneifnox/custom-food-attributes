package net.fneifnox.customfoodattributes.config;

import blue.endless.jankson.Comment;
import io.wispforest.owo.config.Option;
import io.wispforest.owo.config.annotation.Modmenu;
import io.wispforest.owo.config.annotation.Nest;
import io.wispforest.owo.config.annotation.SectionHeader;
import io.wispforest.owo.config.annotation.Sync;

@Sync(Option.SyncMode.OVERRIDE_CLIENT)
@Modmenu(modId = "custom-food-attributes")
@io.wispforest.owo.config.annotation.Config(name = "custom-food-attributes", wrapperName = "CustomFA")
public class Config {
    @SectionHeader("Multiplier for all food (including modded and unlisted one)")
    @Comment("Multiplier for all food (including modded and unlisted one)")
    public double nutritionMultiplierForAll = 1.0;
    public double saturationMultiplierForAll = 1.0;
    public double eatSecondsMultiplierForAll = 1.0;
    @SectionHeader("Apple")
    @Comment("Apple")
    public int nutritionForApple = 4;
    public float saturationForApple = 0.3f;
    public float eatSecondsForApple = 1.6f;
    public boolean alwaysEdibleForApple = false;
    @SectionHeader("Baked Potato")
    @Comment("Baked Potato")
    public int nutritionForBakedPotato = 5;
    public float saturationForBakedPotato = 0.6f;
    public float eatSecondsForBakedPotato = 1.6f;
    public boolean alwaysEdibleForBakedPotato = false;
    @SectionHeader("Beef")
    @Comment("Beef")
    public int nutritionForBeef = 3;
    public float saturationForBeef = 0.3f;
    public float eatSecondsForBeef = 1.6f;
    public boolean alwaysEdibleForBeef = false;
    @SectionHeader("Beetroot")
    @Comment("Beetroot")
    public int nutritionForBeetroot = 1;
    public float saturationForBeetroot = 0.6f;
    public float eatSecondsForBeetroot = 1.6f;
    public boolean alwaysEdibleForBeetroot = false;
    @SectionHeader("Beetroot Soup")
    @Comment("Beetroot Soup")
    public int nutritionForBeetrootSoup = 6;
    public float saturationForBeetrootSoup = 0.6f;
    public float eatSecondsForBeetrootSoup = 1.6f;
    public boolean alwaysEdibleForBeetrootSoup = false;
    @SectionHeader("Bread")
    @Comment("Bread")
    public int nutritionForBread = 5;
    public float saturationForBread = 0.6f;
    public float eatSecondsForBread = 1.6f;
    public boolean alwaysEdibleForBread = false;
    @SectionHeader("Carrot")
    @Comment("Carrot")
    public int nutritionForCarrot = 3;
    public float saturationForCarrot = 0.6f;
    public float eatSecondsForCarrot = 1.6f;
    public boolean alwaysEdibleForCarrot = false;
    @SectionHeader("Chicken")
    @Comment("Chicken")
    public int nutritionForChicken = 2;
    public float saturationForChicken = 0.3f;
    public float eatSecondsForChicken = 1.6f;
    public boolean alwaysEdibleForChicken = false;
    @SectionHeader("Chorus Fruit")
    @Comment("Chorus Fruit")
    public int nutritionForChorusFruit = 4;
    public float saturationForChorusFruit = 0.3f;
    public float eatSecondsForChorusFruit = 1.6f;
    public boolean alwaysEdibleForChorusFruit = true;
    @SectionHeader("Cod")
    @Comment("Cod")
    public int nutritionForCod = 2;
    public float saturationForCod = 0.1f;
    public float eatSecondsForCod = 1.6f;
    public boolean alwaysEdibleForCod = false;
    @SectionHeader("Cooked Beef")
    @Comment("Cooked Beef")
    public int nutritionForCookedBeef = 8;
    public float saturationForCookedBeef = 0.8f;
    public float eatSecondsForCookedBeef = 1.6f;
    public boolean alwaysEdibleForCookedBeef = false;
    @SectionHeader("Cooked Chicken")
    @Comment("Cooked Chicken")
    public int nutritionForCookedChicken = 6;
    public float saturationForCookedChicken = 0.6f;
    public float eatSecondsForCookedChicken = 1.6f;
    public boolean alwaysEdibleForCookedChicken = false;
    @SectionHeader("Cooked Cod")
    @Comment("Cooked Cod")
    public int nutritionForCookedCod = 5;
    public float saturationForCookedCod = 0.6f;
    public float eatSecondsForCookedCod = 1.6f;
    public boolean alwaysEdibleForCookedCod = false;
    @SectionHeader("Cooked Mutton")
    @Comment("Cooked Mutton")
    public int nutritionForCookedMutton = 6;
    public float saturationForCookedMutton = 0.8f;
    public float eatSecondsForCookedMutton = 1.6f;
    public boolean alwaysEdibleForCookedMutton = false;
    @SectionHeader("Cooked Porkchop")
    @Comment("Cooked Porkchop")
    public int nutritionForCookedPorkchop = 8;
    public float saturationForCookedPorkchop = 0.8f;
    public float eatSecondsForCookedPorkchop = 1.6f;
    public boolean alwaysEdibleForCookedPorkchop = false;
    @SectionHeader("Cooked Rabbit")
    @Comment("Cooked Rabbit")
    public int nutritionForCookedRabbit = 5;
    public float saturationForCookedRabbit = 0.6f;
    public float eatSecondsForCookedRabbit = 1.6f;
    public boolean alwaysEdibleForCookedRabbit = false;
    @SectionHeader("Cooked Salmon")
    @Comment("Cooked Salmon")
    public int nutritionForCookedSalmon = 6;
    public float saturationForCookedSalmon = 0.8f;
    public float eatSecondsForCookedSalmon = 1.6f;
    public boolean alwaysEdibleForCookedSalmon = false;
    @SectionHeader("Cookie")
    @Comment("Cookie")
    public int nutritionForCookie = 2;
    public float saturationForCookie = 0.1f;
    public float eatSecondsForCookie = 1.6f;
    public boolean alwaysEdibleForCookie = false;
    @SectionHeader("Dried Kelp")
    @Comment("Dried Kelp")
    public int nutritionForDriedKelp = 1;
    public float saturationForDriedKelp = 0.3f;
    public float eatSecondsForDriedKelp = 0.8f;
    public boolean alwaysEdibleForDriedKelp = false;
    @SectionHeader("Enchanted Golden Apple")
    @Comment("Enchanted Golden Apple")
    public int nutritionForEnchantedGoldenApple = 4;
    public float saturationForEnchantedGoldenApple = 1.2f;
    public float eatSecondsForEnchantedGoldenApple = 1.6f;
    public boolean alwaysEdibleForEnchantedGoldenApple = true;
    @SectionHeader("Glow Berries")
    @Comment("Glow Berries")
    public int nutritionForGlowBerries = 2;
    public float saturationForGlowBerries = 0.1f;
    public float eatSecondsForGlowBerries = 1.6f;
    public boolean alwaysEdibleForGlowBerries = false;
    @SectionHeader("Golden Apple")
    @Comment("Golden Apple")
    public int nutritionForGoldenApple = 4;
    public float saturationForGoldenApple = 1.2f;
    public float eatSecondsForGoldenApple = 1.6f;
    public boolean alwaysEdibleForGoldenApple = true;
    @SectionHeader("Golden Carrot")
    @Comment("Golden Carrot")
    public int nutritionForGoldenCarrot = 6;
    public float saturationForGoldenCarrot = 1.2f;
    public float eatSecondsForGoldenCarrot = 1.6f;
    public boolean alwaysEdibleForGoldenCarrot = false;
    @SectionHeader("Honey Bottle")
    @Comment("Honey Bottle")
    public int nutritionForHoneyBottle = 6;
    public float saturationForHoneyBottle = 0.1f;
    public float eatSecondsForHoneyBottle = 1.6f;
    public boolean alwaysEdibleForHoneyBottle = false;
    @SectionHeader("Melon Slice")
    @Comment("Melon Slice")
    public int nutritionForMelonSlice = 2;
    public float saturationForMelonSlice = 0.3f;
    public float eatSecondsForMelonSlice = 1.6f;
    public boolean alwaysEdibleForMelonSlice = false;
    @SectionHeader("Mushroom Stew")
    @Comment("Mushroom Stew")
    public int nutritionForMushroomStew = 6;
    public float saturationForMushroomStew = 0.6f;
    public float eatSecondsForMushroomStew = 1.6f;
    public boolean alwaysEdibleForMushroomStew = false;
    @SectionHeader("Mutton")
    @Comment("Mutton")
    public int nutritionForMutton = 2;
    public float saturationForMutton = 0.3f;
    public float eatSecondsForMutton = 1.6f;
    public boolean alwaysEdibleForMutton = false;
    @SectionHeader("Ominous Bottle")
    @Comment("Ominous Bottle")
    public int nutritionForOminousBottle = 1;
    public float saturationForOminousBottle = 0.1f;
    public float eatSecondsForOminousBottle = 1.6f;
    public boolean alwaysEdibleForOminousBottle = false;
    @SectionHeader("Poisonous Potato")
    @Comment("Poisonous Potato")
    public int nutritionForPoisonousPotato = 2;
    public float saturationForPoisonousPotato = 0.3f;
    public float eatSecondsForPoisonousPotato = 1.6f;
    public boolean alwaysEdibleForPoisonousPotato = false;
    @SectionHeader("Porkchop")
    @Comment("Porkchop")
    public int nutritionForPorkchop = 3;
    public float saturationForPorkchop = 0.3f;
    public float eatSecondsForPorkchop = 1.6f;
    public boolean alwaysEdibleForPorkchop = false;
    @SectionHeader("Potato")
    @Comment("Potato")
    public int nutritionForPotato = 1;
    public float saturationForPotato = 0.3f;
    public float eatSecondsForPotato = 1.6f;
    public boolean alwaysEdibleForPotato = false;
    @SectionHeader("Pufferfish")
    @Comment("Pufferfish")
    public int nutritionForPufferfish = 1;
    public float saturationForPufferfish = 0.1f;
    public float eatSecondsForPufferfish = 1.6f;
    public boolean alwaysEdibleForPufferfish = false;
    @SectionHeader("Pumpkin Pie")
    @Comment("Pumpkin Pie")
    public int nutritionForPumpkinPie = 8;
    public float saturationForPumpkinPie = 0.3f;
    public float eatSecondsForPumpkinPie = 1.6f;
    public boolean alwaysEdibleForPumpkinPie = false;
    @SectionHeader("Rabbit")
    @Comment("Rabbit")
    public int nutritionForRabbit = 3;
    public float saturationForRabbit = 0.3f;
    public float eatSecondsForRabbit = 1.6f;
    public boolean alwaysEdibleForRabbit = false;
    @SectionHeader("Rabbit Stew")
    @Comment("Rabbit Stew")
    public int nutritionForRabbitStew = 10;
    public float saturationForRabbitStew = 0.6f;
    public float eatSecondsForRabbitStew = 1.6f;
    public boolean alwaysEdibleForRabbitStew = false;
    @SectionHeader("Rotten Flesh")
    @Comment("Rotten Flesh")
    public int nutritionForRottenFlesh = 4;
    public float saturationForRottenFlesh = 0.1f;
    public float eatSecondsForRottenFlesh = 1.6f;
    public boolean alwaysEdibleForRottenFlesh = false;
    @SectionHeader("Salmon")
    @Comment("Salmon")
    public int nutritionForSalmon = 2;
    public float saturationForSalmon = 0.1f;
    public float eatSecondsForSalmon = 1.6f;
    public boolean alwaysEdibleForSalmon = false;
    @SectionHeader("Spider Eye")
    @Comment("Spider Eye")
    public int nutritionForSpiderEye = 2;
    public float saturationForSpiderEye = 0.8f;
    public float eatSecondsForSpiderEye = 1.6f;
    public boolean alwaysEdibleForSpiderEye = false;
    @SectionHeader("Suspicious Stew")
    @Comment("Suspicious Stew")
    public int nutritionForSuspiciousStew = 6;
    public float saturationForSuspiciousStew = 0.6f;
    public float eatSecondsForSuspiciousStew = 1.6f;
    public boolean alwaysEdibleForSuspiciousStew = true;
    @SectionHeader("Sweet Berries")
    @Comment("Sweet Berries")
    public int nutritionForSweetBerries = 2;
    public float saturationForSweetBerries = 0.1f;
    public float eatSecondsForSweetBerries = 1.6f;
    public boolean alwaysEdibleForSweetBerries = false;
    @SectionHeader("Tropical Fish")
    @Comment("Tropical Fish")
    public int nutritionForTropicalFish = 1;
    public float saturationForTropicalFish = 0.1f;
    public float eatSecondsForTropicalFish = 1.6f;
    public boolean alwaysEdibleForTropicalFish = false;

    @SectionHeader("Modded Food")
    @Comment("Modded Food")
    @Nest
    public BetterEnd betterEnd = new BetterEnd();
    public static class BetterEnd {
        @SectionHeader("Blossom Berry")
        @Comment("Blossom Berry")
        public int nutritionForBlossomBerry = 4;
        public float saturationForBlossomBerry = 0.3f;
        public float eatSecondsForBlossomBerry = 1.6f;
        public boolean alwaysEdibleForBlossomBerry = false;
        @SectionHeader("Blossom Berry Jelly")
        @Comment("Blossom Berry Jelly")
        public int nutritionForBlossomBerryJelly = 8;
        public float saturationForBlossomBerryJelly = 0.7f;
        public float eatSecondsForBlossomBerryJelly = 1.6f;
        public boolean alwaysEdibleForBlossomBerryJelly = false;
        @SectionHeader("Cave Pumpkin Pie")
        @Comment("Cave Pumpkin Pie")
        public int nutritionForCavePumpkinPie = 8;
        public float saturationForCavePumpkinPie = 0.3f;
        public float eatSecondsForCavePumpkinPie = 1.6f;
        public boolean alwaysEdibleForCavePumpkinPie = false;
        @SectionHeader("Cooked Bolux Mushroom")
        @Comment("Cooked Bolux Mushroom")
        public int nutritionForCookedBoluxMushroom = 6;
        public float saturationForCookedBoluxMushroom = 0.6f;
        public float eatSecondsForCookedBoluxMushroom = 1.6f;
        public boolean alwaysEdibleForCookedBoluxMushroom = false;
        @SectionHeader("Cooked Chorus Mushroom")
        @Comment("Cooked Chorus Mushroom")
        public int nutritionForCookedChorusMushroom = 6;
        public float saturationForCookedChorusMushroom = 0.6f;
        public float eatSecondsForCookedChorusMushroom = 1.6f;
        public boolean alwaysEdibleForCookedChorusMushroom = false;
        @SectionHeader("Cooked End Fish")
        @Comment("Cooked End Fish")
        public int nutritionForCookedEndFish = 6;
        public float saturationForCookedEndFish = 0.8f;
        public float eatSecondsForCookedEndFish = 1.6f;
        public boolean alwaysEdibleForCookedEndFish = false;
        @SectionHeader("End Fish")
        @Comment("End Fish")
        public int nutritionForEndFish = 2;
        public float saturationForEndFish = 0.1f;
        public float eatSecondsForEndFish = 1.6f;
        public boolean alwaysEdibleForEndFish = false;
        @SectionHeader("Raw Amber Root")
        @Comment("Raw Amber Root")
        public int nutritionForRawAmberRoot = 2;
        public float saturationForRawAmberRoot = 0.8f;
        public float eatSecondsForRawAmberRoot = 1.6f;
        public boolean alwaysEdibleForRawAmberRoot = false;
        @SectionHeader("Raw Chorus Mushroom")
        @Comment("Raw Chorus Mushroom")
        public int nutritionForRawChorusMushroom = 3;
        public float saturationForRawChorusMushroom = 0.5f;
        public float eatSecondsForRawChorusMushroom = 1.6f;
        public boolean alwaysEdibleForRawChorusMushroom = false;
        @SectionHeader("Shadow Berry")
        @Comment("Shadow Berry")
        public int nutritionForShadowBerry = 4;
        public float saturationForShadowBerry = 0.5f;
        public float eatSecondsForShadowBerry = 1.6f;
        public boolean alwaysEdibleForShadowBerry = false;
        @SectionHeader("Shadow Berry Cooked")
        @Comment("Shadow Berry Cooked")
        public int nutritionForShadowBerryCooked = 6;
        public float saturationForShadowBerryCooked = 0.7f;
        public float eatSecondsForShadowBerryCooked = 1.6f;
        public boolean alwaysEdibleForShadowBerryCooked = false;
        @SectionHeader("Shadow Berry Jelly")
        @Comment("Shadow Berry Jelly")
        public int nutritionForShadowBerryJelly = 6;
        public float saturationForShadowBerryJelly = 0.8f;
        public float eatSecondsForShadowBerryJelly = 1.6f;
        public boolean alwaysEdibleForShadowBerryJelly = false;
        @SectionHeader("Sweet Berry Jelly")
        @Comment("Sweet Berry Jelly")
        public int nutritionForSweetBerryJelly = 8;
        public float saturationForSweetBerryJelly = 0.7f;
        public float eatSecondsForSweetBerryJelly = 1.6f;
        public boolean alwaysEdibleForSweetBerryJelly = false;
        @SectionHeader("Umbrella Cluster Juice")
        @Comment("Umbrella Cluster Juice")
        public int nutritionForUmbrellaClusterJuice = 5;
        public float saturationForUmbrellaClusterJuice = 0.7f;
        public float eatSecondsForUmbrellaClusterJuice = 1.6f;
        public boolean alwaysEdibleForUmbrellaClusterJuice = false;
    }
    @Nest
    public BetterNether betterNether = new BetterNether();
    public static class BetterNether {
        @SectionHeader("Black Apple")
        @Comment("Black Apple")
        public int nutritionForBlackApple = 4;
        public float saturationForBlackApple = 0.3f;
        public float eatSecondsForBlackApple = 1.6f;
        public boolean alwaysEdibleForBlackApple = false;
        @SectionHeader("Bowl with Black Apple")
        @Comment("Bowl with Black Apple")
        public int nutritionForBowlWithBlackApple = 4;
        public float saturationForBowlWithBlackApple = 0.3f;
        public float eatSecondsForBowlWithBlackApple = 1.6f;
        public boolean alwaysEdibleForBowlWithBlackApple = false;
        @SectionHeader("Cooked Hook Mushroom")
        @Comment("Cooked Hook Mushroom")
        public int nutritionForCookedHookMushroom = 4;
        public float saturationForCookedHookMushroom = 0.4f;
        public float eatSecondsForCookedHookMushroom = 1.6f;
        public boolean alwaysEdibleForCookedHookMushroom = false;
        @SectionHeader("Mushroom Stew BetterNether")
        @Comment("Mushroom Stew")
        public int nutritionForMushroomStew = 6;
        public float saturationForMushroomStew = 0.6f;
        public float eatSecondsForMushroomStew = 1.6f;
        public boolean alwaysEdibleForMushroomStew = false;
        @SectionHeader("Wart Soup")
        @Comment("Wart Soup")
        public int nutritionForWartSoup = 6;
        public float saturationForWartSoup = 0.6f;
        public float eatSecondsForWartSoup = 1.6f;
        public boolean alwaysEdibleForWartSoup = false;
    }
}
