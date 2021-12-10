package cheitasshop.entities;


import cheitasshop.entities.valueobject.BodyColor;
import cheitasshop.entities.valueobject.Brand;

public class Car1 {
    private Brand carBrand;
    private BodyColor carBodyColor;
    private boolean motor;


    public Car1(Brand carBrand, boolean motor) {
        this.carBrand = carBrand;
        this.motor = motor;
    }

    public Brand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(Brand carBrand) {
        this.carBrand = carBrand;
    }

    public BodyColor getCarBodyColor() {
        return carBodyColor;
    }

    public void setCarBodyColor(BodyColor carBodyColor) {
        this.carBodyColor = carBodyColor;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }
}
