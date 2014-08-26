package com.mentoring.workshop.backend;

import com.mentoring.workshop.data.Car;

/**
 * Test interface
 */
public interface CarService {
    public void receiveCar(Car car);

    public void receiveCar(Car car, boolean repairComplete);

    public void releaseCar(Car car);

    public Car getCar();
}
