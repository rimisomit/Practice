package com.mentoring.workshop.backend;

import com.mentoring.workshop.data.Car;
import com.mentoring.workshop.data.CarStatus;
import org.junit.*;

/**
 * Created by user on 7/29/14.
 */
public class RepairmentTest {

    private Repairment repairment;
    private Parking parking;
    private Car car;

    @Before
    public void setUp() {
        car = new Car();
        repairment = new Repairment();
        parking = new Parking();
    }

    @Test
    public void receiveNewCarStatusTest(){
        repairment.receiveCar(car);
        Assert.assertEquals(CarStatus.REPAIRING, car.getCarStatus());
    }

    @Test(expected = NullPointerException.class)
    public void receiveNewCarStatusNullTest(){
        repairment.receiveCar(null);
    }

    @Test
    public void receiveNewCarStatusToClientTest(){
        repairment.receiveCar(car);
        Assert.assertEquals(CarStatus.REPAIRING, repairment.getCarStatus(car));
    }

    @Test(expected = NullPointerException.class)
    public void receiveNewCarStatusToClientNullTest(){
        repairment.getCarStatus(null);
    }



    @Test(expected = NullPointerException.class)
    public void takeOutCarNullTest(){
        repairment.releaseCar(null);
    }

    @Test
    public void returnGaragesCountTest(){
        Assert.assertEquals(repairment.garagesCount(), 5);
    }



}
