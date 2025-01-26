package aurailus.nofoodstack;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.item.Items;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class NoFoodStack implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
	public static final String MOD_ID = "no-food-stack";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	
	@Override public void onInitialize() {
		LOGGER.info("[no-food-stack] Initialized.");
	}

	@Override public void afterGameStart() {
		Items.FOOD_APPLE.setMaxStackSize(1);
		Items.FOOD_STEW_MUSHROOM.setMaxStackSize(1);
		Items.FOOD_BREAD.setMaxStackSize(1);
		Items.FOOD_PORKCHOP_RAW.setMaxStackSize(1);
		Items.FOOD_PORKCHOP_COOKED.setMaxStackSize(1);
		Items.FOOD_APPLE_GOLD.setMaxStackSize(1);
		Items.FOOD_FISH_RAW.setMaxStackSize(4);
		Items.FOOD_FISH_COOKED.setMaxStackSize(4);
		Items.FOOD_COOKIE.setMaxStackSize(8);
		Items.FOOD_CHERRY.setMaxStackSize(2);
		Items.BUCKET_ICECREAM.setMaxStackSize(1);
		Items.FOOD_PUMPKIN_PIE.setMaxStackSize(1);
		Items.FOOD_CAKE.setMaxStackSize(1);
	}

	@Override	public void beforeGameStart() {}
	@Override public void onRecipesReady() {}
	@Override public void initNamespaces() {}
}
