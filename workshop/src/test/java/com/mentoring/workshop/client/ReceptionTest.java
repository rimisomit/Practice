package com.mentoring.workshop.client;

import com.mentoring.workshop.car.CarStatus;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Thread.sleep;

public class ReceptionTest {
    private final static int INTERVAL = 1100;
    private Client client0;
    private Client client1;
    private Client client2;
    private Client client3;
    private Client client4;
    private Client client5;
    private Client client6;
    private Reception reception0;
    private Reception reception1;

    @Before
    public void setUp() throws Exception { //TODO why I shud throw this?
        client0 = new Client();
        client1 = new Client();
        client2 = new Client();
        client3 = new Client();
        client4 = new Client();
        client5 = new Client();
        client6 = new Client();
        reception0 = new Reception();
        reception1 = new Reception();
    }

    @Test
    public void getRepairmentTest() {
        Assert.assertNotNull(reception0.getWorkroom());
    }

    @Test
    public void getClientTest() {
        reception0.receiveOrder(client0, true);
        Assert.assertNotNull(reception0.getClient());
        Assert.assertEquals(reception0.getClient().getCar(), reception0.getWorkroom().getCar());
    }

    @Test
    public void clientGetCarTest() {
        reception0.receiveOrder(client0, true);
        reception1.receiveOrder(client1, false);
        Assert.assertNotEquals(reception0.getClient().getCar().getCarStatus(), CarStatus.PARKED);
        Assert.assertEquals(reception1.getClient().getCar().getCarStatus(), CarStatus.PARKED);
    }

    @Test
    public void repairmentGetCarTest() {
        reception0.receiveOrder(client0, true);
        reception1.receiveOrder(client1, false);
        Assert.assertNotEquals(reception0.getWorkroom().getCar().getCarStatus(), CarStatus.PARKED);
        Assert.assertEquals(reception1.getWorkroom().getCar().getCarStatus(), CarStatus.PARKED);
    }

    @Test(expected = IllegalArgumentException.class)
    public void receiveOderNullTest() {
        reception0.receiveOrder(null, true);
        reception0.receiveOrder(null, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void placeTwoEqualsCarsToParkingTest() {
        reception0.receiveOrder(client0, false);
        reception0.receiveOrder(client1, false);
        reception0.receiveOrder(client2, false);
        reception0.receiveOrder(client2, false);
    }

    @Test
    public void placeSixCarsToParkingTest() {
        reception0.receiveOrder(client0, false);
        reception0.receiveOrder(client1, false);
        reception0.receiveOrder(client2, false);
        reception0.receiveOrder(client3, false);
        reception0.receiveOrder(client4, false);
        reception0.receiveOrder(client5, false);
        Assert.assertEquals(reception0.getWorkroom().getParking().getParkingLoad(), 6);
    }

    @Test
    public void placeSixCarsToGaragesTest() {
        reception0.receiveOrder(client0, true);
        System.out.println("-----------------");
        reception0.receiveOrder(client1, true);
        System.out.println("-----------------");
        reception0.receiveOrder(client2, true);
        System.out.println("-----------------");
        reception0.receiveOrder(client3, true);
        reception0.receiveOrder(client4, true);
        reception0.receiveOrder(client5, true);
        Assert.assertEquals(client0.getCar().getCarStatus(), CarStatus.REPAIRING);
        Assert.assertEquals(client1.getCar().getCarStatus(), CarStatus.REPAIRING);
        Assert.assertEquals(client2.getCar().getCarStatus(), CarStatus.REPAIRING);
        Assert.assertEquals(client3.getCar().getCarStatus(), CarStatus.REPAIRING);
        Assert.assertEquals(client4.getCar().getCarStatus(), CarStatus.REPAIRING);
        Assert.assertEquals(client5.getCar().getCarStatus(), CarStatus.WAITING_FOR_REPAIR);
    }

    @Test
    public void repairCarsFromParkingTest() throws InterruptedException {
        System.out.println(client0.getCar().toString());
        System.out.println(client1.getCar().toString());
        System.out.println(client2.getCar().toString());
        System.out.println(client3.getCar().toString());
        System.out.println(client4.getCar().toString());
        System.out.println(client5.getCar().toString());
        System.out.println(client6.getCar().toString());

        reception0.receiveOrder(client0, true);
        reception0.receiveOrder(client1, true);
        reception0.receiveOrder(client2, true);
        reception0.receiveOrder(client3, true);
        reception0.receiveOrder(client4, true);
        //out of capacity
        reception0.receiveOrder(client5, true); //will go to parking
        sleep(INTERVAL);
        reception0.receiveOrder(client6, true);
        //Client1..4 REPAIR_COMPLETE
        Assert.assertEquals(client4.getCar().getCarStatus(), CarStatus.REPAIR_COMPLETE);
        Assert.assertEquals(client5.getCar().getCarStatus(), CarStatus.REPAIRING);
        Assert.assertEquals(client6.getCar().getCarStatus(), CarStatus.REPAIRING);
        sleep(INTERVAL);
        //Assert.assertEquals(client5.getCar().getCarStatus(), CarStatus.REPAIR_COMPLETE);
    }

    @Test
    public void repairOneCarTest() throws InterruptedException {
        reception0.receiveOrder(client0, true);
        sleep(INTERVAL);
        reception0.receiveOrder(client1, true);
        Assert.assertEquals(client0.getCar().getCarStatus(), CarStatus.REPAIR_COMPLETE);
    }
}
