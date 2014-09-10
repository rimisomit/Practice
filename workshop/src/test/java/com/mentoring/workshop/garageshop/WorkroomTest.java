package com.mentoring.workshop.garageshop;

import com.mentoring.workshop.car.Car;
import com.mentoring.workshop.car.CarStatus;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 7/29/14.
 */
public class WorkroomTest {

    private Workroom workroom;
    private Car car;

    @Before
    public void setUp() {
        car = new Car();
        workroom = new Workroom();
        //Parking parking = new Parking();
    }

    @Test
    public void receiveNewCarStatusTest() {
        workroom.receiveCar(car);
        Assert.assertEquals(CarStatus.REPAIRING, car.getCarStatus());
    }

    @Test(expected = NullPointerException.class)
    public void receiveNewCarStatusNullTest() {
        workroom.receiveCar(null);
    }

    @Test
    public void receiveNewCarStatusToClientTest() {
        workroom.receiveCar(car);
        Assert.assertEquals(CarStatus.REPAIRING, workroom.getCarStatus(car));
    }

    @Test(expected = NullPointerException.class)
    public void receiveNewCarStatusToClientNullTest() {
        workroom.getCarStatus(null);
    }


    @Test(expected = NullPointerException.class)
    public void takeOutCarNullTest() {
        workroom.releaseCar(null);
    }

    @Test
    public void returnGaragesCountTest() {
        Assert.assertEquals(workroom.garagesCount(), 5);
    }

}
