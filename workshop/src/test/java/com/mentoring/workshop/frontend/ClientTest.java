package com.mentoring.workshop.frontend;

import com.mentoring.workshop.data.Car;
import com.mentoring.workshop.backend.Repairment;
import com.mentoring.workshop.frontend.Client;
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
