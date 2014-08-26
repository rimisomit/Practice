package com.mentoring.workshop.backend;

import com.mentoring.workshop.data.Car;
import com.mentoring.workshop.data.CarStatus;

import java.util.Date;


public class Garage extends CarLocation {
    private boolean garageEmptiness = true;
    //private ArrayList<Garage> list;
    //private int carIdInGarage;

//TODO how to implement Arraylist here
/*
    public Garage() {
        list = new ArrayList<Garage>();
        list.add(new Garage());
        list.add(new Garage());
        list.add(new Garage());
        list.add(new Garage());
        list.add(new Garage());
    }
*/
    /*public void setRepairTime(int repairTime) {
        this.repairTime = repairTime;
    }*/

    public boolean getGarageEmptiness() {
        return garageEmptiness;
    }

    public void setGarageEmptiness(boolean garageStatus) {
        this.garageEmptiness = garageStatus;
    }

    public void receiveCar(Car car, boolean repairComplete) {
        if (repairComplete) {
            throw new IllegalStateException("Placing repaired car to garage");
        } else {
            receiveCar(car);
        }
    }

    /**
     * @param car A car
     * @return Status, placed or not
     * 1. check if car not repaired
     * 2. check if garage empty
     * 3. Write
     * Garage not empty
     * Car status repairing
     * Car repair start time
     */
    public void receiveCar(Car car) {
        if (car == null) {
            throw new NullPointerException("Car is null");
        }
        Date carRepairStartDate = new Date();
        this.car = car;
        if (car.getCarStatus() == CarStatus.REPAIRING) {
            throw new IllegalArgumentException("Car is already repairing");
        } else {
            if (garageEmptiness) {
                garageEmptiness = false;
                car.setCarStatus(CarStatus.REPAIRING);
                car.setCarRepairStartDate(carRepairStartDate);
                //carIdInGarage = car.getCarId();
            } else {
                throw new IllegalStateException("Garage is occupied");
            }
        }
    }

    public void releaseCar(Car car) {
        //TODO Empty, OK?
    }
}
