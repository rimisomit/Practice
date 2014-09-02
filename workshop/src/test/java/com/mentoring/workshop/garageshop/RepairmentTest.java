package com.mentoring.workshop.garageshop;

import com.mentoring.workshop.car.Car;
import com.mentoring.workshop.car.CarStatus;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 7/29/14.
 */
public class RepairmentTest {

    private Repairment repairment;
    private Car car;

    @Before
    public void setUp() {
        car = new Car();
        repairment = new Repairment();
        //Parking parking = new Parking();
    }

    @Test
    public void receiveNewCarStatusTest() {
        repairment.receiveCar(car);
        Assert.assertEquals(CarStatus.REPAIRING, car.getCarStatus());
    }

    @Test(expected = NullPointerException.class)
    public void receiveNewCarStatusNullTest() {
        repairment.receiveCar(null);
    }

    @Test
    public void receiveNewCarStatusToClientTest() {
        repairment.receiveCar(car);
        Assert.assertEquals(CarStatus.REPAIRING, repairment.getCarStatus(car));
    }

    @Test(expected = NullPointerException.class)
    public void receiveNewCarStatusToClientNullTest() {
        repairment.getCarStatus(null);
    }


    @Test(expected = NullPointerException.class)
    public void takeOutCarNullTest() {
        repairment.releaseCar(null);
    }

    @Test
    public void returnGaragesCountTest() {
        Assert.assertEquals(repairment.garagesCount(), 5);
    }

}
