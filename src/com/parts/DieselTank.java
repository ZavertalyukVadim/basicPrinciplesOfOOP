package com.parts;

import com.Energy;

/**
 * Created by Вадимка on 18.10.2015.
 */
public class DieselTank implements EnergySource {
    @Override
    public Energy get() {
        return new Energy(60);
    }
}
