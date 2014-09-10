package com.mentoring.workshop.client;


import com.mentoring.workshop.car.Car;

/**
 * Class can interact with Workshop
 */
public class Client {
    private final Car car;

    public Client() {
        car = new Car();
    }

    public Car getCar() {
        return car;
    }

}
