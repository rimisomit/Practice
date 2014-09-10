package com.mentoring.workshop.client;

import com.mentoring.workshop.garageshop.Workroom;
import com.mentoring.workshop.car.Car;

/**
 * Created by user on 8/22/14.
 */
public final class Reception implements ClientService {
    private Client client;
    private Reception reception;
    private Workroom workroom;
    private Car car;

    public Reception() {
        workroom = new Workroom();
    }

    public void receiveOrder(Client client) {
        if (client == null) {
            throw new IllegalArgumentException("Received null client");
        }
        this.client = client;
        this.car = client.getCar();
        workroom.receiveCar(car);
    }

    public void receiveOrder(Client client, boolean toRepair) {
        if (client == null) {
            throw new IllegalArgumentException("Received null client");
        }
        this.client = client;
        this.car = client.getCar();
        if (toRepair) {
            System.out.println("RECEPTION to garage = " + car.toString());
            workroom.receiveCar(car);
        } else {
            System.out.println("RECEPTION to parking = " + car.toString());
            workroom.receiveCar(car, false);
        }
    }

    public Client getClient() {
        return client;
    }

    public void releaseOrder(Client client) {
        getWorkroom().releaseCar(client.getCar());
    }

    public Workroom getWorkroom() {
        return workroom;
    }

}
