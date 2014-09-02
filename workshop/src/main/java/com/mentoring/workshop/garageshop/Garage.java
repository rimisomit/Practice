package com.mentoring.workshop.garageshop;

import com.mentoring.workshop.car.Car;
import com.mentoring.workshop.car.CarLocation;
import com.mentoring.workshop.car.CarStatus;

import java.util.Date;


public class Garage extends CarLocation {
    private boolean garageEmptiness = true;
    //private ArrayList<Garage> list;
    private int garageId;

//TODO how to implement Arraylist here

    public Garage() {
        this((int) (Math.random() * 1000));
    }

    @Override
    public String toString() {
        return "[Garage" + garageId + "-" + garageEmptiness + ']';
    }

    public Garage(int garageId) {
        this.garageId = garageId;
    }

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
        if (car.getCarStatus() == CarStatus.REPAIRING) {
            throw new IllegalArgumentException("Car is already repairing");
        }
        if (!garageEmptiness) {
            throw new IllegalStateException("Garage is occupied");
        }

        //System.out.println("GARAGE CAR = " + car.getCarId());
        Date carRepairStartDate = new Date();
        this.car = car;
        if (car.getCarStatus() != CarStatus.REPAIRING) {
            if (garageEmptiness) {
                garageEmptiness = false;
                car.setCarStatus(CarStatus.REPAIRING);
                car.setCarRepairStartDate(carRepairStartDate);
                //garageId = car.getCarId();
            }
        }
    }

    public void releaseCar(Car car) {
        //TODO Empty, OK?
    }
}
