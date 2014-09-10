package com.mentoring.workshop.garageshop;

import com.mentoring.workshop.car.Car;
import com.mentoring.workshop.car.CarLocation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GarageTest {

    private Garage[] garage;
    private Car[] car;

    @Before
    public void setUp() {
        int size = 5;
        car = new Car[size];
        garage = new Garage[size];
        for (int i = 0; i < size; i++) {
            car[i] = new Car();
            garage[i] = new Garage();
        }

    }

    @Test
    public void checkInstanceOfTest() {
        Assert.assertTrue(garage[0] instanceof CarLocation);
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

    @Test(expected = IllegalStateException.class)
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
