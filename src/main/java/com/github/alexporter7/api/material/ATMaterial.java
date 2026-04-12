package com.github.alexporter7.api.material;

public class ATMaterial {
    
    private final String materialName;
    private final String chemicalSymbol;
    private final MaterialStateManager stateManager;

    public ATMaterial(String materialName, String chemicalSymbol, MaterialStateManager stateManager) {
        this.materialName = materialName;
        this.chemicalSymbol = chemicalSymbol;
        this.stateManager = stateManager;
    }
    
    public MaterialStateManager getStateManager() {
        return stateManager;
    }
    
    public String getMaterialName() {
        return materialName;
    }

    public String getChemicalSymbol() {
        return chemicalSymbol;
    }
}
