package com.mentoring.workshop.garageshop;

import com.mentoring.workshop.car.Car;
import com.mentoring.workshop.car.CarService;
import com.mentoring.workshop.car.CarStatus;

import java.util.ArrayList;

/**
 * Created by user on 7/29/14.
 */
public final class Repairment implements CarService {

    private final static int INTERVAL = 1000;
    private ArrayList<Garage> garage;
    private Car car;
    private Parking parking;

    /*
        public Repairment(Car car, boolean toRepair) {
            if (car == null) {
                throw new IllegalArgumentException("Received null car from reception");
            }
            this.car = car;
            garage = new ArrayList<Garage>();
            parking = new Parking();
            garage.add(new Garage());
            garage.add(new Garage());
            garage.add(new Garage());
            garage.add(new Garage());
            garage.add(new Garage());
            if (toRepair) {
                receiveCar(car);
            } else {
                parking.receiveCar(car);
            }
        }
    */
    public Repairment() {
        garage = new ArrayList<Garage>();
        parking = new Parking();
        garage.add(new Garage());
        garage.add(new Garage());
        garage.add(new Garage());
        garage.add(new Garage());
        garage.add(new Garage());
    }

    final public int garagesCount() {
        return garage.size();
    }

    public void receiveCar(Car car, boolean toRepair) {
        this.car = car;
        if (toRepair) {
            receiveCar(car);
        } else {
            parking.receiveCar(car);
        }
    }

    /**
     * 1. check car not null
     * 2. remove repaired cars from garages
     * 3. if first found garage is empty - place car
     * if all garages are occupied - place to parking
     *
     * @param car a car
     */
    public void receiveCar(Car car) {
        removeRepaired();
        if (car == null) {
            throw new NullPointerException("Car is null");
        }
        this.car = car;
        System.out.println("REPAIRMENT CAR = " + car.getCarId());

        //TODO Difference BREAK and RETURN and
        if (findEmptyGarage() != null ) {
            findEmptyGarage().receiveCar(car);
        } else {
            parking.receiveCar(car, false);
        }
    }

    public Garage findEmptyGarage() {
        for (Garage g : garage) {
            if (g.getGarageEmptiness()) {
                return g;
            }
        }
        return null;
    }

    public void releaseCar(Car car) {
        if (car == null) {
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
    public void removeRepaired() {
        Car car;
        long timeNow = System.currentTimeMillis();
        for (Garage g : garage) {
            if (!g.getGarageEmptiness()) {
                car = g.getCar();
                if (car != null) {
                    //System.out.println(timeNow - car.getCarRepairStartDate().getTime());
                    if ((timeNow - car.getCarRepairStartDate().getTime()) > INTERVAL) {
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

    public Car getCar() {
        return car;
    }

    public Parking getParking() {
        return parking;
    }

}
