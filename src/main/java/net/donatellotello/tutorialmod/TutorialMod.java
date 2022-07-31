package net.donatellotello.tutorialmod;

import net.donatellotello.tutorialmod.item.ModItems;
import net.donatellotello.tutorialmod.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		ModLootTableModifiers.modifyLootTables();
	}
}
