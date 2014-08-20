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
    private final int GARAGE1_ID = 100;
    private final int GARAGE2_ID = 200;
    private final int GARAGE3_ID = 300;
    private final int GARAGE4_ID = 400;
    private final int GARAGE5_ID = 500;

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
            parking.placeCarToParking(car);
        }

    }

    final public int garagesCount() {
        return garage.size();
    }

    public void receiveNewCar(Car car) {
        removeRepairedCarsFromGarages();
        for (Garage g : garage) {
            if (g.getGarageEmptiness()) {
                g.placeCarToGarage(car);
            } else {
                parking.placeCarToParking(car, false);
            }
        }
    }

    public boolean takeOutCar(Car car) {
        if (parking.removeCarFromParking(car)){
            return true;
        } else {
            return false;
        }
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
                        parking.placeCarToParking(car, true);
                        g.setGarageEmptiness(true);
                    }
                }
            }
        }
    }

    public CarStatus returnCarStatus(Car car) {
        return car.getCarStatus();
    }

}
