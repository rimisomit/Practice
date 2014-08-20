package com.mentoring.workshop;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Done
 */
public class ParkingTest {

    private Parking parking;
    private Car car;

    @Before
    public void setUp() {
        parking = new Parking();
        car = new Car();
    }

    @Test
    public void returnParkingLoadTest(){
        Assert.assertTrue(parking.getParkingLoad()>=0);
    }

    @Test
    public void placeCarToParkingAfterRepairTest() {
        Assert.assertTrue(parking.placeCarToParking(car, true));
    }

    @Test
    public void placeCarToParkingBeforeRepairTest() {
        Assert.assertTrue(parking.placeCarToParking(car, false));
    }

    @Test
    public void placeCarToParkingAfterRepairAgainTest() {
        Assert.assertTrue(parking.placeCarToParking(car, true));
    }

    @Test
    public void placeCarToParkingBeforeRepairAgainTest() {
        Assert.assertTrue(parking.placeCarToParking(car, false));
    }



}
