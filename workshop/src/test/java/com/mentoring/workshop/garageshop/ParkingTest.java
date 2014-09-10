package com.mentoring.workshop.garageshop;

import com.mentoring.workshop.car.Car;
import com.mentoring.workshop.car.CarStatus;
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
    public void checkInstanceOfTest() {
        Assert.assertTrue(parking != null); //TODO WTF?
    }

    @Test
    public void returnParkingLoadTest() {
        Assert.assertTrue(parking.getParkingLoad() >= 0);
    }

    @Test
    public void placeCarToParkingAfterRepairTest() {
        parking.receiveCar(car, true);
        Assert.assertEquals(car.getCarStatus(), CarStatus.REPAIR_COMPLETE);
    }

    @Test
    public void placeCarToParkingBeforeRepairTest() {
        parking.receiveCar(car, false);
        Assert.assertNotEquals(car.getCarStatus(), CarStatus.REPAIRING);
    }

    @Test(expected = IllegalArgumentException.class)
    public void placeCarToParkingBeforeRepairNullTest() {
        parking.receiveCar(null, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void placeCarToParkingAfterRepairAgainTest() {
        parking.receiveCar(car, true);
        parking.receiveCar(car, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void placeCarToParkingBeforeRepairAgainTest() {
        parking.receiveCar(car, false);
        parking.receiveCar(car, false);
    }

    @Test
    public void releaseCarTest() {
        car.setCarStatus(CarStatus.WAITING_FOR_REPAIR);
        parking.releaseCar(car);
        Assert.assertEquals(parking.getParkingLoad(), 0);
    }

    @Test(expected = NullPointerException.class)
    public void releaseCarNullTest() {
        parking.releaseCar(null);
    }

    @Test
    public void releaseWaitingCarsTest() {
        Car car1 = new Car();
        parking.receiveCar(car);
        car.setCarStatus(CarStatus.WAITING_FOR_REPAIR);
        parking.receiveCar(car1);
        car1.setCarStatus(CarStatus.WAITING_FOR_REPAIR);
        Assert.assertEquals(parking.releaseWaiting(), car);
    }
}
