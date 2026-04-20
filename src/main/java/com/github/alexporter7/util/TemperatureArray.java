package com.github.alexporter7.util;

public class TemperatureArray {
    
    private final int solidThreshold;
    private final int liquidThreshold;
    private final int gasThreshold;

    public TemperatureArray(int solidThreshold, int liquidThreshold, int gasThreshold) {
        this.solidThreshold = solidThreshold;
        this.liquidThreshold = liquidThreshold;
        this.gasThreshold = gasThreshold;
    }

    public int getSolidThreshold() {
        return solidThreshold;
    }

    public int getLiquidThreshold() {
        return liquidThreshold;
    }

    public int getGasThreshold() {
        return gasThreshold;
    }
}
