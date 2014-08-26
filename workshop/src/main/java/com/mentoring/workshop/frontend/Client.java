package com.mentoring.workshop.frontend;


import com.mentoring.workshop.data.Car;

/**
 * Class can interact with Workshop
 */
public class Client {
    private Car car;

    public Client() {
        car = new Car();
    }

    public Car getCar() {
        return car;
    }

}
