package com.mentoring.workshop.garageshop;

import com.mentoring.workshop.car.Car;
import com.mentoring.workshop.car.CarLocation;
import com.mentoring.workshop.car.CarStatus;

import java.util.ArrayList;

public class Parking extends CarLocation {

    private final ArrayList<Car> parkingList;
    //private ArrayList<Car> parkingWaitingList;

    public Parking() {
        parkingList = new ArrayList<Car>();
        //parkingWaitingList = new ArrayList<Car>();
    }

    public int getParkingLoad() {
        return parkingList.size();
    }

    /**
     * 1. check car not null
     * 2. check if car already in parking
     * 3. place car to parking
     *
     * @param car            client's car
     * @param repairComplete was car repaired or just came
     */
    public void receiveCar(Car car, boolean repairComplete) {
        releaseWaiting();  //TODO ConcurrentModificationException
        if (car == null) {
            throw new IllegalArgumentException("Cannot receive car as null");
        }

        for (Car c : parkingList) {
            if (c.equals(car)) {
                throw new IllegalArgumentException("The car is already in parking");
            }
        }
        if (parkingList.add(car)) {
            if (repairComplete) {
                car.setCarStatus(CarStatus.REPAIR_COMPLETE);
            } else {
                car.setCarStatus(CarStatus.WAITING_FOR_REPAIR);
            }
        }
        //System.out.println("CAR in LIST: " + parkingList);
    }

    public void receiveCar(Car car) {
        releaseWaiting();
        if (car == null) {
            throw new IllegalArgumentException("Cannot receive car as null");
        }
        //System.out.println("CAR in LIST: " + parkingList);
        for (Car c : parkingList) { //TODO WHY 2nd and 3rd cars are the same
            if (c.equals(car)) {
                throw new IllegalArgumentException("The car is already in parking");
            }
        }
        if (parkingList.add(car)) {
            car.setCarStatus(CarStatus.PARKED);
        } else {
            throw new IllegalArgumentException("Cannot place car to parking"); //TODO IS THIS OK?
        }
    }

    public void releaseCar(Car car) {
        if (car == null) {
            throw new NullPointerException("Cannot release car as null");
        }
        parkingList.remove(car);
        /*if (CarStatus.REPAIR_COMPLETE.equals(car.getCarStatus()) || CarStatus.PARKED.equals(car.getCarStatus())) {
            parkingList.remove(car);
        } else {
            throw new IllegalStateException("Cannot take out broken car to client");
        }*/
    }

    public Car releaseWaiting() {
        for (Car car : parkingList) {  //TODO ConcurrentModificationException
            //System.out.println(1);
            if (car.getCarStatus() == CarStatus.WAITING_FOR_REPAIR) {
                System.out.println("Returned" + car.toString());
                //parkingList.remove(car);
                return car;
            }
        }
        return null;
    }
}
