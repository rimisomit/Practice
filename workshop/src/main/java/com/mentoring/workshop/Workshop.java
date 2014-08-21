package com.mentoring.workshop;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by user on 7/29/14.
 */
public class Workshop {

    private ArrayList<Garage> garage;
    //private Garage garage;
    private Parking parking;

    public Workshop(Car car, boolean toRepair) {
        garage = new ArrayList<Garage>();
        //garage = new Garage();
        parking = new Parking();
        garage.add(new Garage());
        garage.add(new Garage());
        garage.add(new Garage());
        garage.add(new Garage());
        garage.add(new Garage());
        if (toRepair) {
            receiveNewCar(car);
        } else {
            parking.receiveCar(car);
        }

    }

    final public int garagesCount() {
        return garage.size();
    }

    /**
     * @param car a car
     * @return
     * 1. Check car not null
     * 2. For every garage check if empty and place car
     */
    public void receiveNewCar(Car car) {
        removeRepairedCarsFromGarages();
        if (car == null) {
            throw new NullPointerException("Car is null");
        }
        for (Garage g : garage) {
            if (g.getGarageEmptiness()) {
                g.receiveCar(car);
                break;
            } else {
                parking.receiveCar(car, false);
            }
        }
    }

    public void takeOutCar(Car car) {
        if(car == null) {
            throw new NullPointerException();
        }
        parking.releaseCar(car);
    }

    /**
     * 1. For each garage check emptiness
     * 2. Check if car repair time > 10
     * 3. Place car to parting
     * 4. change garage status to empty
     */
    public void removeRepairedCarsFromGarages() {
        Car car;
        long timeNow = new Date().getTime();    //TODO OK not OK?
        for (Garage g : garage) {
            if (!g.getGarageEmptiness()) {
                car = g.getCar();
                if (car != null) {
                    if ((timeNow - car.getCarRepairStartDate().getTime()) > 10) {
                        parking.receiveCar(car, true);
                        g.setGarageEmptiness(true);
                    }
                }
            }
        }
    }

    public CarStatus getCarStatus(Car car) {
        if (car == null) {
            throw new NullPointerException("Cannot get status for null");
        }
        return car.getCarStatus();
    }

}
