package com.mentoring.workshop.garageshop;

import com.mentoring.workshop.car.Car;
import com.mentoring.workshop.car.CarService;
import com.mentoring.workshop.car.CarStatus;

import java.util.ArrayList;

public final class Workroom implements CarService {

    private final static int INTERVAL = 1000;
    private final ArrayList<Garage> garage;
    private final Parking parking;
    private Car car;

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
    public Workroom() {
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
        releaseWaiting();
        if (car == null) {
            throw new NullPointerException("Car is null");
        }
        this.car = car;
        System.out.println("REPAIRMENT CAR = " + car.toString());

        //TODO Difference BREAK and RETURN and
        if (findEmptyGarage() != null) {
            findEmptyGarage().receiveCar(car);
        } else {
            parking.receiveCar(car, false);
        }
    }

    Garage findEmptyGarage() {
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
    void removeRepaired() {
        Car car;
        long timeNow = System.currentTimeMillis();
        for (Garage g : garage) {
            if (!g.getGarageEmptiness()) {
                car = g.getCar();
                if (car != null) {
                    if ((timeNow - car.getCarRepairStartDate().getTime()) > INTERVAL) {
                        parking.receiveCar(car, true);
                        g.setGarageEmptiness();
                        System.out.println("Repaired " + car.toString());
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

    void releaseWaiting() {
        car = parking.releaseWaiting();
        if (car != null) {
            parking.releaseCar(car);
            receiveCar(car);
        }
    }
/*
    public void releaseWaiting(ArrayList<Car> cars) {
        if (cars != null) {
            if (cars.size() > 0) {
                for (Car c : cars) {
                    receiveCar(c);
                }
            }
        }
    }
    */
}
