package com.mentoring.workshop.frontend;

import com.mentoring.workshop.data.CarStatus;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 8/25/14.
 */
public class ReceptionTest {
    private Client client0;
    private Client client1;
    private Client client2;
    private Client client3;
    private Client client4;
    private Client client5;
    private Reception reception0;
    private Reception reception1;

    @Before
    public void setUp() {
        client0 = new Client();
        client1 = new Client();
        client2 = new Client();
        client3 = new Client();
        client4 = new Client();
        client5 = new Client();
        reception0 = new Reception();
        reception1 = new Reception();
    }

    @Test
    public void getRepairmentTest() {
        Assert.assertNotNull(reception0.getRepairment());
    }

    @Test
    public void getClientTest() {
        reception0.receiveOrder(client0);
        Assert.assertNotNull(reception0.getClient());
        Assert.assertEquals(reception0.getClient().getCar(), reception0.getRepairment().getCar());
    }

    @Test
    public void clientGetCarTest() {
        reception0.receiveOrder(client0);
        reception1.receiveOrder(client1, false);
        Assert.assertNotEquals(reception0.getClient().getCar().getCarStatus(), CarStatus.PARKED);
        Assert.assertEquals(reception1.getClient().getCar().getCarStatus(), CarStatus.PARKED);
    }

    @Test
    public void repairmentGetCarTest() {
        reception0.receiveOrder(client0);
        reception1.receiveOrder(client1, false);
        Assert.assertNotEquals(reception0.getRepairment().getCar().getCarStatus(), CarStatus.PARKED);
        Assert.assertEquals(reception1.getRepairment().getCar().getCarStatus(), CarStatus.PARKED);
    }

    @Test(expected = IllegalArgumentException.class)
    public void receiveOderNullTest() {
        reception0.receiveOrder(null);
        reception0.receiveOrder(null, false);
    }

    @Test
    public void sixCarTest() {
        reception0.receiveOrder(client0);
        reception0.receiveOrder(client1); //TODO WHY FAILED?
        System.out.println(reception0.getRepairment().getParking().getParkingLoad());
        reception0.receiveOrder(client2);
        reception0.receiveOrder(client3);
        reception0.receiveOrder(client4);
        reception0.receiveOrder(client5);
        Assert.assertEquals(reception0.getRepairment().getCar().getCarStatus(), CarStatus.WAITING_FOR_REPAIR);
    }
}
