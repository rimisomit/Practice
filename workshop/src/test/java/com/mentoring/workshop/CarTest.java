package com.mentoring.workshop;

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
    public Car car;
    public Garage garage;
    public Parking parking;
    public Date date;

    @Before
    public void setUp(){
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
        garage.placeCarToGarage(car);
        Assert.assertEquals(CarStatus.REPAIRING, car.getCarStatus());
    }

    @Test
    public void showCarStatusInParkingAfterRepairTest() {
        parking.placeCarToParking(car, true);
        Assert.assertEquals(CarStatus.REPAIR_COMPLETE, car.getCarStatus());
    }

    @Test
    public void showCarStatusInParkingBeforeRepairTest() {
        parking.placeCarToParking(car, false);
        Assert.assertEquals(CarStatus.WAITING_FOR_REPAIR, car.getCarStatus());
    }

    @Test
    public void showCarId(){
        Assert.assertNotNull(car.getCarId());
    }

    @Test
    public void returnDefaultCarRepairStartDateTest() {
        Assert.assertNull(car.getCarRepairStartDate());
    }

    @Test
    public void returnCarRepairStartDateInGarageTest() throws InterruptedException {
        garage.placeCarToGarage(car);
        sleep(4000); // TODO OK not OK?
        date = new Date();
        Assert.assertNotNull(car.getCarRepairStartDate());
        Assert.assertTrue(car.getCarRepairStartDate().getTime() < date.getTime());
    }

}
