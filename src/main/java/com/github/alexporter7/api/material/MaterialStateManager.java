package com.github.alexporter7.api.material;

import com.github.alexporter7.api.enums.ActionStatus;
import com.github.alexporter7.api.enums.MaterialState;
import com.google.common.base.CaseFormat;

public class MaterialStateManager {
    
    private final int solidThreshold;
    private final int liquidThreshold;
    private final int gasThreshold;
    
    private MaterialState state;

    public MaterialStateManager(int solidThreshold, int liquidThreshold, int gasThreshold) {
        this(solidThreshold, liquidThreshold, gasThreshold, MaterialState.SOLID);
    }

    public MaterialStateManager(int solidThreshold, int liquidThreshold, int gasThreshold, MaterialState state) {
        this.solidThreshold = solidThreshold;
        this.liquidThreshold = liquidThreshold;
        this.gasThreshold = gasThreshold;
        this.state = state;
    }
    
    public void updateState(int temperature) {
        if(temperature > gasThreshold)
            updateState(MaterialState.PLASMA);
        else if(temperature > liquidThreshold)
            updateState(MaterialState.GAS);
        else if (temperature > solidThreshold)
            updateState(MaterialState.LIQUID);
        else
            updateState(MaterialState.SOLID);
    }
    
    private void updateState(MaterialState state) {
        this.state = state;
    }
}
