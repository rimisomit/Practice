package com.mentoring.workshop;

/**
 * Test abstract class
 */

public abstract class Location implements CarReceiveService {
    private Car car;

    public Car getCar() {
        return car;
    }
}
