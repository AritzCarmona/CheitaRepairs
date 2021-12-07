package cheitasshop.entities;

import cheitasshop.entities.valueobject.CarBodyColor;
import cheitasshop.entities.valueobject.CarBrand;

public class Car1 {
private String carBrand;
private String carBodyColor;
private boolean motor;

public Car1 (String carBrand, boolean motor) {
    this.carBrand=carBrand;
    this.motor=motor;
}

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarBodyColor() {
        return carBodyColor;
    }

    public void setCarBodyColor(String carBodyColor) {
        this.carBodyColor = carBodyColor;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }
}
