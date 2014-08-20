package com.mentoring.workshop;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClientTest {
    private Car car;
    private Client client;
    private Workshop workshop;

    @Before
    public void setUp() {
        car = new Car();
        client = new Client(car);
        workshop = new Workshop(car, true);
    }

}
