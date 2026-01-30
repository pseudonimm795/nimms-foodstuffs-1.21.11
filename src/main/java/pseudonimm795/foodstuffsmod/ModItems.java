package pseudonimm795.foodstuffsmod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys;
import net.fabricmc.fabric.mixin.itemgroup.CreativeModeTabAccessor;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PotionItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.awt.*;

public class ModItems {

    public static final Item SODA1_ITEM = registerItem("soda1", new Item.Settings()
            .food(new FoodComponent.Builder()
                    .nutrition(2)
                    .saturationModifier(0f)
                    .alwaysEdible()
                    .build()
            )
    );
    public static final Item COKE_ITEM = registerItem("cocacola", new Item.Settings().food(new FoodComponent.Builder()
                    .nutrition(2)
                    .saturationModifier(0f)
                    .alwaysEdible()
                    .build()
            )
    );


    private static Item registerItem(String name, Item.Settings settings) {

        Identifier id = Identifier.of("nimms-foodstuffs", name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        return Registry.register(Registries.ITEM, key, new Item(settings.registryKey(key)));

    }
//    private static Item registerPotion(String name, PotionItem.Settings settings) {
//
//        Identifier id = Identifier.of("nimms-foodstuffs", name);
//        RegistryKey<PotionItem> key = RegistryKey.of(RegistryKeys.POTION, id);
//        return Registry.register(Registries.POTION, key, new PotionItem(settings.registryKey(key)));
//
//    }



    public static void registerModItems() {
        //leave dis empty for the mome
    }
}
