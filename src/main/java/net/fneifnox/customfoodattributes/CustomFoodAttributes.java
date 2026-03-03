package net.fneifnox.customfoodattributes;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.fneifnox.customfoodattributes.config.CustomFA;
import net.fneifnox.customfoodattributes.init.Vanilla;
import net.fneifnox.customfoodattributes.init.compat.AppleSkinCompat;
import net.fneifnox.customfoodattributes.init.compat.BetterEndCompat;
import net.fneifnox.customfoodattributes.init.compat.BetterNetherCompat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.fneifnox.customfoodattributes.AttributeUpdater.configureNonListedFoodAttributes;
import static net.fneifnox.customfoodattributes.AttributeUpdater.observeAllConfigChanges;
import static net.fneifnox.customfoodattributes.init.Vanilla.initVanillaAttributes;
import static net.fneifnox.customfoodattributes.init.compat.AppleSkinCompat.modifyAppleSkinValues;
import static net.fneifnox.customfoodattributes.init.compat.BetterEndCompat.initBetterEndAttributes;
import static net.fneifnox.customfoodattributes.init.compat.BetterNetherCompat.initBetterNetherAttributes;

public class CustomFoodAttributes implements ModInitializer {
	public static final String MOD_ID = "custom-food-attributes";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CONFIG.load();
		CONFIG.save();

		configureNonListedFoodAttributes();

		initVanillaAttributes();

		if (FabricLoader.getInstance().isModLoaded("appleskin")) {
			modifyAppleSkinValues();
		}

		if (FabricLoader.getInstance().isModLoaded("betterend")) {
			initBetterEndAttributes();
		}

		if (FabricLoader.getInstance().isModLoaded("betternether")) {
			initBetterNetherAttributes();
		}

		ServerTickEvents.START_SERVER_TICK.register(server -> {

			observeAllConfigChanges(AttributeUpdater::configureNonListedFoodAttributes);

			observeAllConfigChanges(Vanilla::initVanillaAttributes);

			if (FabricLoader.getInstance().isModLoaded("appleskin")) {
				observeAllConfigChanges(AppleSkinCompat::modifyAppleSkinValues);
			}

			if (FabricLoader.getInstance().isModLoaded("betterend")) {
				observeAllConfigChanges(BetterEndCompat::initBetterEndAttributes);
			}

			if (FabricLoader.getInstance().isModLoaded("betternether")) {
				observeAllConfigChanges(BetterNetherCompat::initBetterNetherAttributes);
			}
		});
	}

	public static final CustomFA CONFIG = CustomFA.createAndLoad();
}