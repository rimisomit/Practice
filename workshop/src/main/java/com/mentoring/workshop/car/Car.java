package com.mentoring.workshop.car;

import java.util.Date;

/**
 * Car class
 */
public class Car {

    private CarStatus carStatus = CarStatus.WAITING_FOR_REPAIR;
    private Date carRepairStartDate;
    private int carId;

    public Car(int carId) {
        this.carId = carId;
    }

    public Car() {
        this((int) (Math.random() * 1000));
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (carId != car.carId) return false;
        return carStatus == car.carStatus;

    }

    @Override
    public int hashCode() {
        int result = carStatus.hashCode();
        result = 31 * result + carId;
        return result;
    }

    @Override
    public String toString() {
        return "[CAR ID: " + carId + ", " + carStatus + "]";
    }
}