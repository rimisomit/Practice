package com.mentoring.workshop.client;

import com.mentoring.workshop.garageshop.Repairment;
import com.mentoring.workshop.car.Car;

/**
 * Created by user on 8/22/14.
 */
public final class Reception implements ClientService {
    private Client client;
    private Reception reception;
    private Repairment repairment;
    private Car car;

    public Reception() {
        repairment = new Repairment();
    }

    /*
        public Reception(Client client) {
            if (client.getCar() == null) {
                throw new IllegalArgumentException("Received null car from client");
            }
            this.client = client;
            this.car = client.getCar();
            repairment = new Repairment(car, true);
        }

        public Reception(Client client, boolean repair) {
            if (client.getCar() == null) {
                throw new IllegalArgumentException("Received null car from client");
            }
            this.client = client;
            this.car = client.getCar();
            if (repair) {
                repairment = new Repairment(car, true);
            } else {
                repairment = new Repairment(car, false);
            }
        }
    */
    public void receiveOrder(Client client) {
        if (client == null) {
            throw new IllegalArgumentException("Received null client");
        }
        this.client = client;
        this.car = client.getCar();
        //System.out.println("RECEPTION CAR = "+car.getCarId());
        repairment.receiveCar(car);
    }

    public void receiveOrder(Client client, boolean toRepair) {
        if (client == null) {
            throw new IllegalArgumentException("Received null client");
        }
        this.client = client;
        this.car = client.getCar();
        if (toRepair) {
            System.out.println("RECEPTION to garage = " + car.toString());
            repairment.receiveCar(car);
        } else {
            System.out.println("RECEPTION to parking = " + car.toString());
            repairment.receiveCar(car, false);
        }
    }

    public Client getClient() {
        return client;
    }

    public void releaseOrder(Client client) {
        getRepairment().releaseCar(client.getCar());
    }

    public Repairment getRepairment() {
        return repairment;
    }

}
