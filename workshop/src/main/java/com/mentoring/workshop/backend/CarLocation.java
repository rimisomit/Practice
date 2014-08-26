package com.mentoring.workshop.backend;

import com.mentoring.workshop.data.Car;

/**
 * Abstract for Garage and Parking
 */

public abstract class CarLocation implements CarService {
    protected Car car;

    public Car getCar() {
        return car;
    }
}
