package pseudonimm795.foodstuffsmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.minecraft.server.command.CommandManager.literal;

public class NimmsFoodStuffs implements ModInitializer {
	public static final String MOD_ID = "nimms-foodstuffs";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		System.out.println("Initializing Nimm's FoodStuffs 1.21.11");

		ModItems.registerModItems();

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries->entries.add(ModItems.SODA1_ITEM));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries->entries.add(ModItems.COKE_ITEM));

//		CommandRegistrationCallback.EVENT.register(((commandDispatcher, commandRegistryAccess, registrationEnvironment) ->
//		{
//			commandDispatcher.register(
//					literal("hello").executes(commandContext -> {
//						commandContext.getSource().sendMessage(Text.literal("world!").formatted(Formatting.DARK_PURPLE));
//						return 1;
//					})
//			);
//		}));
	}

//	private static void addItemToCreativeTab (Item item, String tab) {
//
//		switch(tab) {
//			case "food":
//				ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries->entries.add(item));
//				break;
//			case "ingredients":
//				break;
//			case "tools":
//				break;
//		}
//
//	}
}