package com;

import com.parts.EnergySource;
import com.parts.Engine;
import com.parts.Gear;
import com.vehicle.Direction;
import com.vehicle.Vehicle;

/**
 * Created by Вадимка on 17.10.2015.
 */
public class Boat extends Vehicle {

    public Boat(EnergySource energySource, Engine engine, Gear gear) {
        super(energySource, engine, gear);
    }

    @Override
    public void accelerate() {
        System.out.println("Boat starts to move ");
        super.accelerate();
    }

    @Override
    public void turn(Direction direction) {
        System.out.println("Boat starts to turn");
        super.turn(direction);
    }

    @Override
    public void brake() {
        System.out.println("Boat starts to brake");
        super.brake();

    }
}
