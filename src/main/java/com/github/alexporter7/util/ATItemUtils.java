package com.github.alexporter7.util;

import com.github.alexporter7.ATech;
import com.github.alexporter7.api.enums.MaterialItemForm;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class ATItemUtils {
    
    public static ResourceKey<Item> getItemId(String itemName) {
        return ResourceKey.create(BuiltInRegistries.ITEM.key(), Identifier.fromNamespaceAndPath(ATech.MODID, itemName));
    }
    
    public static String getItemNameWithForm(String itemName, MaterialItemForm materialItemForm) {
        return itemName + "_" + materialItemForm.toString().toLowerCase();
    }
    
}
