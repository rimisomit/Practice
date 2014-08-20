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
        workshop = new Workshop(car, true);
        car = new Car();
        parking = new Parking();
    }

    @Test
    public void receiveNewCarStatusTest(){
        workshop.receiveNewCar(car);
        Assert.assertEquals(CarStatus.REPAIRING, car.getCarStatus());
    }

    @Test
    public void returnGaragesCountTest(){
        Assert.assertEquals(workshop.garagesCount(), 5);
    }

    @Test
    public void returnCarRepairTimeTest() {


    }


}
