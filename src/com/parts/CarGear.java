package com.parts;

import com.Force;

/**
 * Created by Вадимка on 18.10.2015.
 */
public class CarGear implements Gear {
    @Override
    public void consume(Force force) {
        System.out.println("Gone!");
    }
}
