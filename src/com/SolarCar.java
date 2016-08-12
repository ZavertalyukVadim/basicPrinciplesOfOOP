package com;

import com.parts.EnergySource;
import com.parts.Engine;
import com.parts.Gear;
import com.vehicle.Direction;

/**
 * Created by Вадимка on 17.10.2015.
 */
public class SolarCar extends Car {

    public SolarCar(EnergySource energySource, Engine engine, Gear gear) {
        super(energySource, engine, gear);
    }
    @Override
    public void accelerate() {
        System.out.println("Solar car starts to move ");
        super.accelerate();
    }

    @Override
    public void turn(Direction direction) {
        super.turn(direction);
    }

    @Override
    public void brake() {
        System.out.println("Solar car starts to brake");
        super.brake();
    }
}
