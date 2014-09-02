package com.mentoring.workshop.garageshop;

import com.mentoring.workshop.car.Car;
import com.mentoring.workshop.car.CarLocation;
import com.mentoring.workshop.car.CarStatus;

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
     *
     * @param car            client's car
     * @param repairComplete was car repaired or just came
     */
    public void receiveCar(Car car, boolean repairComplete) {
        if (car == null) {
            throw new IllegalArgumentException("Cannot receive car as null");
        }

        for (Car c : list) { //TODO WHY 2nd and 3rd cars are the same
            if (c.equals(car)) {
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
        System.out.println("CAR in LIST: " + list);
    }

    public void receiveCar(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("Cannot receive car as null");
        }
        System.out.println("CAR in LIST: " + list);
        for (Car c : list) { //TODO WHY 2nd and 3rd cars are the same
            if (c.equals(car)) {
                throw new IllegalArgumentException("The car is already in parking");
            }
        }
        if (list.add(car)) {
            car.setCarStatus(CarStatus.PARKED);
        } else {
            throw new IllegalArgumentException("Cannot place car to parking"); //TODO IS THIS OK?
        }
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

    public ArrayList<Car> releaseWaitingCars() {
        ArrayList<Car> list = new ArrayList<Car>();
        for (Car car : this.list) {
            if (car.getCarStatus() == CarStatus.WAITING_FOR_REPAIR) {
                list.add(car);
            }
        }
        return list;
    }
}
