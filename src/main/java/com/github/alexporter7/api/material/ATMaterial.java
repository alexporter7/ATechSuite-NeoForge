package com.github.alexporter7.api.material;

import com.github.alexporter7.util.TemperatureArray;

public class ATMaterial {
    
    private final String materialName;
    private final String chemicalSymbol;
    private final TemperatureArray temperatureArray;
    
    private final int tintIndex;

    public ATMaterial(String materialName, String chemicalSymbol, TemperatureArray temperatureArray, int tintIndex) {
        this.materialName = materialName;
        this.chemicalSymbol = chemicalSymbol;
        this.temperatureArray = temperatureArray;
        this.tintIndex = tintIndex;
    }
    
    public String getMaterialName() {
        return materialName;
    }

    public String getChemicalSymbol() {
        return chemicalSymbol;
    }

    public TemperatureArray getTemperatureArray() {
        return temperatureArray;
    }
}
