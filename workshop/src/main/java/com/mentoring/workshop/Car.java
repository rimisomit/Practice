package com.mentoring.workshop;

import java.util.Date;

/**
 * Car class
 */
public class Car {

    private CarStatus carStatus = CarStatus.WAITING_FOR_REPAIR;
    //private String carLocation="na";
    private Date carRepairStartDate;
    private int carId;

    public Car(int carId) {
        this.carId = carId;
    }

    public Car() {
        this((int) (Math.random()*1000));
    }

    public int getCarId() {
        return carId;
    }

    public CarStatus getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(CarStatus carStatus) {
        this.carStatus = carStatus;
    }

    public Date getCarRepairStartDate() {
        return carRepairStartDate;
    }

    public void setCarRepairStartDate(Date carRepairStartDate) {
        this.carRepairStartDate = carRepairStartDate;
    }

}