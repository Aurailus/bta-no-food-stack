package aurailus.nofoodstack;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.HalpLibe;
import turniplabs.halplibe.event.defs.CommonEvents;
import turniplabs.halplibe.util.dependency.Key;

public class NoFoodStack implements ModInitializer {
	public static final String MOD_ID = HalpLibe.registerMod("no-food-stack", true);
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CommonEvents.AFTER_GAME_START.listen(Key.of(MOD_ID), this::afterGameStart);
		LOGGER.info("[no-food-stack] Initialized.");
	}

	public void afterGameStart() {
		Items.FOOD_APPLE.setMaxStackSize(1);
		Items.FOOD_STEW_MUSHROOM.setMaxStackSize(1);
		Items.FOOD_BREAD.setMaxStackSize(1);
		Items.FOOD_PORKCHOP_RAW.setMaxStackSize(1);
		Items.FOOD_PORKCHOP_COOKED.setMaxStackSize(1);
		Items.FOOD_VENISON_RAW.setMaxStackSize(1);
		Items.FOOD_VENISON_COOKED.setMaxStackSize(1);
		Items.FOOD_APPLE_GOLD.setMaxStackSize(1);
		Items.FOOD_FISH_RAW.setMaxStackSize(4);
		Items.FOOD_FISH_COOKED.setMaxStackSize(4);
		Items.FOOD_COOKIE.setMaxStackSize(8);
		Items.FOOD_CHERRY.setMaxStackSize(2);
		Items.FOOD_PUMPKIN_PIE.setMaxStackSize(1);
		Items.FOOD_CAKE.setMaxStackSize(1);
	}
}
