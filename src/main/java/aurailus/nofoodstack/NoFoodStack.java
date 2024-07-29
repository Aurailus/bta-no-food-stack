package aurailus.nofoodstack;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.item.Item;

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
		Item.foodApple.setMaxStackSize(1);
		Item.foodStewMushroom.setMaxStackSize(1);
		Item.foodBread.setMaxStackSize(1);
		Item.foodPorkchopRaw.setMaxStackSize(1);
		Item.foodPorkchopCooked.setMaxStackSize(1);
		Item.foodAppleGold.setMaxStackSize(1);
		Item.foodFishRaw.setMaxStackSize(4);
		Item.foodFishCooked.setMaxStackSize(4);
		Item.foodCookie.setMaxStackSize(8);
		Item.foodCherry.setMaxStackSize(2);
		Item.bucketIcecream.setMaxStackSize(1);
		Item.foodPumpkinPie.setMaxStackSize(1);
		Item.foodCake.setMaxStackSize(1);
	}

	@Override	public void beforeGameStart() {}
	@Override public void onRecipesReady() {}
	@Override public void initNamespaces() {}
}
