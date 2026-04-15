package com.github.alexporter7.api.temperature;

public class TemperatureManager {
    
    private int targetTemp;
    private int targetStep;
    //todo: add MaterialItem class reference to directly update temp

    public TemperatureManager() {
        this(0, 0);
    }
    
    public TemperatureManager(int targetTemp, int targetStep) {
        this.targetTemp = targetTemp;
        this.targetStep = targetStep;
    }
    
    public int updateTemperature(int currentTemp, int heat) {
        if(heat > currentTemp && heat > (currentTemp + targetStep))
            return currentTemp + heat;
        else if (heat > currentTemp && heat < (currentTemp + targetStep))
            return currentTemp + heat; //fix this when not drunk
        return -1;
    }
    
    public void setTargetTemp(int targetTemp) {
        this.targetTemp = targetTemp;
    }
    
    public void setTargetStep(int targetStep) {
        this.targetStep = targetStep;
    }
}
