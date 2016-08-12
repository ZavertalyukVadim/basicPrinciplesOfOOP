package com.vehicle;

import com.Energy;
import com.Force;
import com.parts.EnergySource;
import com.parts.Engine;
import com.parts.Gear;

public abstract class Vehicle implements Driveable {

    private final EnergySource energySource;
    private final Engine engine;
    private final Gear gear;
    private int speed=0;

    public Vehicle(EnergySource energySource, Engine engine, Gear gear) {
        this.energySource = energySource;
        this.engine = engine;
        this.gear = gear;
    }

    public void accelerate(){
        Energy energy=energySource.get();
        Force force = engine.transform(energy);
        gear.consume(force);
        speed = speed +force.getAmount();
        System.out.println("Now speed = " + speed);
    }

    public void brake(){
        System.out.println("The vehicle starts to slow down");
        System.out.println("speed=" + speed);
        while (speed !=0) {
            speed = speed - 20;
            System.out.println("speed="+speed);
            if (speed ==0 ) {

            }
        }

    }
    public void turn(Direction direction){
//        System.out.print("Vehicle turns on ");
        switch (direction) {
            case RIGHT: System.out.println("on right");
            case LEFT: System.out.println("on left");
        }
    }

    public EnergySource getEnergySource() {
        return energySource;
    }

    public Engine getEngine() {
        return engine;
    }

    public Gear getGear() {
        return gear;
    }

}
