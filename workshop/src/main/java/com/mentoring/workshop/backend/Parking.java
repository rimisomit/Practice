package com.mentoring.workshop.backend;

import com.mentoring.workshop.data.Car;
import com.mentoring.workshop.data.CarStatus;

import java.util.ArrayList;

public class Parking extends CarLocation {

    private ArrayList<Car> list;

    public Parking() {
        list = new ArrayList<Car>();
    }

    public int getParkingLoad() {
        return list.size();
    }

    /*public ArrayList<Car> getCarList() {
        return list;
    }*/

    /**
     * 1. check car not null
     * 2. check if car already in parking
     * 3. place car to parking
     * @param car client's car
     * @param repairComplete was car repaired or just came
     */
    public void receiveCar(Car car, boolean repairComplete) {
        if (car == null) {
            throw new IllegalArgumentException("Cannot receive car as null");
        }
        this.car = car;
        /*if (list.contains(car)) {
            throw new IllegalArgumentException("Car is already in parking");
        }*/
        /*
        for (Car c : list) {
            if(c.equals(car)) {
                throw new IllegalArgumentException("Car is already in parking");
            }
        }
        */
        for (Car c : list) { //TODO WHY 2nd and 3rd cars are the same
            if (c.getCarId() == car.getCarId()) {
                throw new IllegalArgumentException("The car is already in parking");
            }
        }

        if (list.add(car)) {
            if (repairComplete) {
                car.setCarStatus(CarStatus.REPAIR_COMPLETE);
            } else {
                car.setCarStatus(CarStatus.WAITING_FOR_REPAIR);
            }

        }
    }

    public void receiveCar(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("Cannot receive car as null");
        }
        car.setCarStatus(CarStatus.PARKED);
    }

    public void releaseCar(Car car) {
        if (car == null) {
            throw new NullPointerException("Cannot release car as null");
        }
        if (CarStatus.REPAIR_COMPLETE.equals(car.getCarStatus()) || CarStatus.PARKED.equals(car.getCarStatus())) {
            list.remove(car);
        } else {
            throw new IllegalStateException("Cannot take out broken car to client");
        }
    }

}
