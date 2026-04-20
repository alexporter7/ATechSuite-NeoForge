package com.github.alexporter7.api.material;

import com.github.alexporter7.api.temperature.TemperatureManager;
import com.github.alexporter7.util.TextFormatUtil;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.filefix.fixes.ResourcePackLocationFileFix;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.function.Consumer;

public class MaterialItem extends Item {
    
    private final ATMaterial material;
    private final TemperatureManager temperatureManager;
    private final MaterialStateManager stateManager;
    private int temperature;
    
    
    public MaterialItem(ATMaterial material, ResourceKey<Item> itemId) {
        super(new Item.Properties().setId(itemId));
        this.material = material;
        this.temperatureManager = new TemperatureManager();
        this.stateManager = new MaterialStateManager(material.getTemperatureArray().getSolidThreshold(), 
                material.getTemperatureArray().getLiquidThreshold(), material.getTemperatureArray().getGasThreshold());
        this.temperature = 63;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, 
                                Consumer<Component> builder, TooltipFlag tooltipFlag) {
        String chemicalSymbolText = new StringBuilder()
                .append(TextFormatUtil.GRAY)
                .append(TextFormatUtil.ITALIC)
                .append(material.getChemicalSymbol())
                .toString();
        
        String temperatureText = new StringBuilder()
                .append(TextFormatUtil.BLUE)
                .append("Temperature: ")
                .append(temperature)
                .toString();
                        
        builder.accept(Component.literal(chemicalSymbolText));
        builder.accept(Component.literal(temperatureText));
        
        super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
    }

    public MaterialStateManager getStateManager() {
        return stateManager;
    }
}
