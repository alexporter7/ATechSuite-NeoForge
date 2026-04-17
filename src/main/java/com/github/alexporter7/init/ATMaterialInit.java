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
import java.util.function.Function;

public class ATMaterialInit {
    
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ATech.MODID);
    
    public static final HashMap<String, ATMaterial> MATERIALS = new HashMap<>();
    public static final HashMap<String, MaterialItem> MATERIAL_ITEMS = new HashMap<>();
    public static void init(IEventBus eventBus) {
        registerMaterials();
        registerMaterialItems();
        registerItems(eventBus);
    }
    
    public static void registerItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
    
    public static void registerMaterials() {
        registerMaterial("test_material", "te", 10, 20, 30, 0);
        registerMaterial("iron", "fe", 10, 20, 30, 0);
    }
    
    public static void registerMaterial(String materialName, String chemicalSymbol, int solidThreshold, 
                                        int liquidThreshold, int gasThreshold, int tintIndex) {
        MATERIALS.put(materialName, new ATMaterial(materialName, 
                chemicalSymbol, 
                new MaterialStateManager(solidThreshold, liquidThreshold, gasThreshold),
                tintIndex));
    }
    
    public static void registerMaterialItems() {
        
        List<MaterialItemForm> allItemForms = Arrays.asList(MaterialItemForm.INGOT, MaterialItemForm.PLATE, 
                MaterialItemForm.ROD, MaterialItemForm.RING, MaterialItemForm.BLOCK, MaterialItemForm.DUST);
        for(String materialName : MATERIALS.keySet()) {
            for(MaterialItemForm form : allItemForms) {
                String itemName = ATItemUtils.getItemNameWithForm(materialName, form);
                ITEMS.register(itemName, 
                        () -> new MaterialItem(MATERIALS.get(itemName), ATItemUtils.getItemId(itemName)));
            }   
        }
            
    }
    
}
