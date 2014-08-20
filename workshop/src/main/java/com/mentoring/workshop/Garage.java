package com.mentoring.workshop;

import java.util.ArrayList;
import java.util.Date;


public class Garage extends Location{
    private boolean garageEmptiness = true;
    //private ArrayList<Garage> list;
    //private int carIdInGarage;
    private Car car;
//TODO how to implement Arraulist here
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

    /**
     *
     * @param garageStatus true = empty, false = has a car
     */
    public void setGarageEmptiness(boolean garageStatus) {
        this.garageEmptiness = garageStatus;
    }

    /**
     *
     * @param car A car
     * @return Status, placed or not
     * 1. check if car not repaired
     * 2. check if garage empty
     * 3. Write
     *      Garage not empty
     *      Car status repairing
     *      Car repair start time
     */
    public boolean placeCarToGarage(Car car) {
        Date carRepairStartDate = new Date();
        this.car = car;
        if (car.getCarStatus() == CarStatus.REPAIRING) {
            return false;
        } else {
            if (garageEmptiness) {
                garageEmptiness = false;
                car.setCarStatus(CarStatus.REPAIRING);
                car.setCarRepairStartDate(carRepairStartDate);
                //carIdInGarage = car.getCarId();
                return true;
            } else {
                return false;
            }
        }
    }

    public Car getCar() {
        return car;
    }
}
