package com.mentoring.workshop.car;

import com.mentoring.workshop.garageshop.Garage;
import com.mentoring.workshop.garageshop.Parking;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static java.lang.Thread.sleep;

/**
 *
 */
public class CarTest {

    //public static final String REPAIRING = "Repairing";
    private Car car;
    private Garage garage;
    private Parking parking;

    @Before
    public void setUp() {
        car = new Car();
        garage = new Garage();
        parking = new Parking();
    }

    @Test
    public void showCarDefaultStatusTest() {
        Assert.assertEquals(CarStatus.WAITING_FOR_REPAIR, car.getCarStatus());
    }

    @Test
    public void showCarRepairingStatusTest() {
        car.setCarStatus(CarStatus.REPAIRING);
        Assert.assertEquals(CarStatus.REPAIRING, car.getCarStatus());
    }

    @Test
    public void showCarStatusInGarageTest() {
        garage.receiveCar(car);
        Assert.assertEquals(CarStatus.REPAIRING, car.getCarStatus());
    }

    @Test(expected = NullPointerException.class)
    public void showCarStatusInGarageNullTest() {
        garage.receiveCar(null);
        Assert.assertTrue(garage.getGarageEmptiness());
    }

    @Test
    public void showCarStatusInParkingAfterRepairTest() {
        parking.receiveCar(car, true);
        Assert.assertEquals(CarStatus.REPAIR_COMPLETE, car.getCarStatus());
    }

    @Test
    public void showCarStatusInParkingBeforeRepairTest() {
        parking.receiveCar(car, false);
        Assert.assertEquals(CarStatus.WAITING_FOR_REPAIR, car.getCarStatus());
    }

    @Test
    public void showCarId() {
        Assert.assertNotNull(car.getCarId());
    }

    @Test
    public void returnDefaultCarRepairStartDateTest() {
        Assert.assertNull(car.getCarRepairStartDate());
    }

    @Test
    public void returnCarRepairStartDateInGarageTest() throws InterruptedException {
        garage.receiveCar(car);
        sleep(1100);
        Date date = new Date();
        Assert.assertNotNull(car.getCarRepairStartDate());
        Assert.assertTrue(car.getCarRepairStartDate().getTime() < date.getTime());
    }
}
