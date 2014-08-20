package com.mentoring.workshop;

import java.util.ArrayList;

/**
 * Created by user on 7/29/14.
 */
public class Parking extends Location{

    public ArrayList<Car> list;

    public Parking() {
        list = new ArrayList<Car>();
    }

    public int getParkingLoad() {
        return list.size();
    }

    /**
     * @param car
     * @param repairComplete was car repaired or just came
     * @return placed or not
     */
    public boolean placeCarToParking(Car car, boolean repairComplete) {
        if (list.add(car)) {
            if (repairComplete) {
                car.setCarStatus(CarStatus.REPAIR_COMPLETE);
            } else {
                car.setCarStatus(CarStatus.WAITING_FOR_REPAIR);
            }
            return true;
        } else {
            return false;
        }
    }

    public void placeCarToParking(Car car) {
        car.setCarStatus(CarStatus.PARKED);
    }

    public boolean removeCarFromParking(Car car) {
        if (CarStatus.REPAIR_COMPLETE.equals(car.getCarStatus())) {
            list.remove(car);
            return true;
        } else {
            return false;
        }
    }

}
