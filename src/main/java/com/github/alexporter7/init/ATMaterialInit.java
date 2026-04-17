package com.github.alexporter7.init;

import com.github.alexporter7.ATech;
import com.github.alexporter7.api.enums.MaterialItemForm;
import com.github.alexporter7.api.material.ATMaterial;
import com.github.alexporter7.api.material.MaterialItem;
import com.github.alexporter7.api.material.MaterialStateManager;
import com.github.alexporter7.util.ATItemUtils;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ATMaterialInit {
    
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ATech.MODID);
    
    public static final ATMaterial TEST_MATERIAL = new ATMaterial("test_material", "te", 
            new MaterialStateManager(10, 20, 30), 0);
    
    public static final DeferredItem<Item> TEST_ITEM = ITEMS.register("test_item", 
            () -> new MaterialItem(TEST_MATERIAL, ATItemUtils.getItemId("test_item")));
    
    public static final HashMap<String, ATMaterial> MATERIALS = new HashMap<>();
    public static final HashMap<String, MaterialItem> MATERIAL_ITEMS = new HashMap<>();
    public static void registerItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
    
    public static void registerMaterialItems(IEventBus eventBus) {
        
        List<MaterialItemForm> allItemForms = Arrays.asList(MaterialItemForm.INGOT, MaterialItemForm.PLATE, 
                MaterialItemForm.ROD, MaterialItemForm.RING, MaterialItemForm.BLOCK, MaterialItemForm.DUST);
        for(MaterialItemForm form : allItemForms) {
            
        }
            
    }
    
}
