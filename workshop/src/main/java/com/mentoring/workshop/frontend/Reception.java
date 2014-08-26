package com.mentoring.workshop.frontend;

import com.mentoring.workshop.backend.Repairment;
import com.mentoring.workshop.data.Car;

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
        repairment.receiveCar(car);
    }

    public void receiveOrder(Client client, boolean toRepair) {
        if (client == null) {
            throw new IllegalArgumentException("Received null client");
        }
        this.client = client;
        this.car = client.getCar();
        if (toRepair) {
            repairment.receiveCar(car);
        } else {
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
