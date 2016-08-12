package com.parts;

import com.Energy;
import com.Force;

/**
 * Created by Вадимка on 18.10.2015.
 */
public class DieselEngine implements Engine {
    @Override
    public Force transform(Energy energy) {
        return new Force(energy.getAmount());
    }
}
