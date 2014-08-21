package com.mentoring.workshop;

import java.util.ArrayList;

/**
 * Created by user on 7/29/14.
 */
public class Parking extends Location implements CarReceiveService {

    private ArrayList<Car> list;
    private Car car;

    public Parking() {
        list = new ArrayList<Car>();
    }

    public int getParkingLoad() {
        return list.size();
    }

    public ArrayList<Car> getCarList() {
        return list;
    }

    /**
     * @param car
     * @param repairComplete was car repaired or just came
     * @return placed or not
     */
    public void receiveCar(Car car, boolean repairComplete) {
        if (car == null) { //TODO any point to throw this? JVM did the same
            throw new NullPointerException("Cannot receive car as null");
        }
        this.car = car;
        if (list.contains(car)) {
            throw new IllegalArgumentException("Car is already in parking");
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
            throw new NullPointerException("Cannot receive car as null");
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

    public Car getCar() {
        return car;
    }

}
