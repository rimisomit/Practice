package com.mentoring.workshop;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 8/5/14.
 */
public class GarageTest {

    private Garage[] garage;
    private Car[] car;
    private int size;

    @Before
    public void setUp() {
        size = new Workshop(car[0], true).garagesCount();
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
        for (int i = 0; i < size; i++) {
            garage[i].placeCarToGarage(car[i]);
            Assert.assertFalse(garage[i].getGarageEmptiness());
        }
    }

    @Test //(expected = IllegalStateException.class)
    public void carAlreadyInGarageTest() {
        garage[0].placeCarToGarage(car[0]);
        Assert.assertFalse(garage[0].placeCarToGarage(car[0]));
    }

    @Test
    public void returnCar() {
        garage[0].placeCarToGarage(car[0]);
        Assert.assertNotNull(garage[0].getCar());
        Assert.assertNull(garage[1].getCar());
    }

}
