package com.mentoring.workshop.car;

/**
 * Test interface
 */
public interface CarService {
    public void receiveCar(Car car); //TODO WHY NEVER USED

    public void receiveCar(Car car, boolean repairComplete);

    public void releaseCar(Car car);

    public Car getCar();
}
