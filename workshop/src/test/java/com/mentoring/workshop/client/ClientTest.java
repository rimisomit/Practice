package com.mentoring.workshop.client;

import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
    //private Car car;
    private Client client;
    //private Repairment repairment;

    @Before
    public void setUp() {
        //car = new Car();
        client = new Client();
    }

    @Test
    public void getCarTest() {
        Assert.assertNotNull(client.getCar());
    }

}
