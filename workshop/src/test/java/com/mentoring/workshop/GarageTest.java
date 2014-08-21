package com.mentoring.workshop;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GarageTest {

    private Garage[] garage;
    private Car[] car;
    private int size = 5;

    @Before
    public void setUp() {
        car = new Car[size];
        garage = new Garage[size];
        for (int i = 0; i < size; i++) {
            car[i] = new Car();
            garage[i] = new Garage();
        }

    }

    @Test
    public void returnEmptyGarageTest() {
        for (Garage g : garage) {
            Assert.assertTrue(g.getGarageEmptiness());
        }
    }

    @Test
    public void returnNotEmptyGarageTest() {
            garage[0].receiveCar(car[0]);
            Assert.assertFalse(garage[0].getGarageEmptiness());
    }

    @Test (expected = IllegalStateException.class)
    public void carAlreadyInGarageTest() {
        garage[0].receiveCar(car[0]);
        garage[0].receiveCar(car[1]);
    }

    @Test
    public void returnCar() {
        garage[0].receiveCar(car[0]);
        Assert.assertNotNull(garage[0].getCar());
        Assert.assertNull(garage[1].getCar());
    }

}
