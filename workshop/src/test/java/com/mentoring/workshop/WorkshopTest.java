package com.mentoring.workshop;

import org.junit.*;

/**
 * Created by user on 7/29/14.
 */
public class WorkshopTest {

    private Workshop workshop;
    private Parking parking;
    private Car car;

    @Before
    public void setUp() {
        car = new Car();
        workshop = new Workshop(car, false);
        parking = new Parking();
    }

    @Test
    public void receiveNewCarStatusTest(){
        workshop.receiveNewCar(car);
        Assert.assertEquals(CarStatus.REPAIRING, car.getCarStatus());
    }

    @Test(expected = NullPointerException.class)
    public void receiveNewCarStatusNullTest(){
        workshop.receiveNewCar(null); //TODO OK or not OK?
    }

    @Test
    public void receiveNewCarStatusToClientTest(){
        workshop.receiveNewCar(car);
        Assert.assertEquals(CarStatus.REPAIRING, workshop.getCarStatus(car));
    }

    @Test(expected = NullPointerException.class)
    public void receiveNewCarStatusToClientNullTest(){
        workshop.getCarStatus(null); //TODO OK or not OK?
    }



    @Test(expected = NullPointerException.class)
    public void takeOutCarNullTest(){
        workshop.takeOutCar(null); //TODO OK or not OK?
    }

    @Test
    public void returnGaragesCountTest(){
        Assert.assertEquals(workshop.garagesCount(), 5);
    }



}
