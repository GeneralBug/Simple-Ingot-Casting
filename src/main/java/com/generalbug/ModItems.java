package com.generalbug;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item INGOT_MOULD = register( new Item(new FabricItemSettings()), "ingot_mould");
    public static final Item FILLED_INGOT_MOULD = register( new Item(new FabricItemSettings()), "filled_ingot_mould");

    public static void initialize()
    {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(ModItems.INGOT_MOULD));
    }

    public static Item register(Item item, String id)
    {
        // Create the identifier for the item.
        Identifier itemID = new Identifier(SimpleIngotCasting.MOD_ID, id);

        // Register the item.
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        // Return the registered item!
        return registeredItem;
    }

}
