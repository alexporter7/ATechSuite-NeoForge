package com.github.alexporter7.api.material;

import com.github.alexporter7.api.temperature.TemperatureManager;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.function.Consumer;

public class MaterialItem extends Item {
    
    private final ATMaterial material;
    private final TemperatureManager temperatureManager;
    
    
    public MaterialItem(ATMaterial material) {
        super(new Item.Properties());
        this.material = material;
        this.temperatureManager = new TemperatureManager();
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
        super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
    }
}
