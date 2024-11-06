/*
package net.astro_00_.basicmod.item;

import net.astro_00_.basicmod.BasicMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final  Item PINK_GARNET = registerItem("pink_garnet",new Item(new Item.Settings()));
    private  static Item  registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(BasicMod.MOD_ID,name),item);
    }
    public static void registerModItems(){
        BasicMod.LOGGER.info("Registering Mod Items For "+ BasicMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(PINK_GARNET);
        });
    }
}
*/
package net.astro_00_.basicmod.item;

import net.astro_00_.basicmod.BasicMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public final class ModItems {
    private ModItems() {
    }

    public static final Item PINK_GARNET = register("pink_garnet", Item::new, new Item.Settings());

    private static Item register(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM,
                Identifier.of(BasicMod.MOD_ID, path));
        return Items.register(registryKey, factory, settings);
    }

    public static void registerModItems() {
        BasicMod.LOGGER.info("Registering Mod Items for " + BasicMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
        });
    }
}