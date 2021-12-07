package cheitasshop.entities;

import cheitasshop.entities.valueobject.BodyColor;
import cheitasshop.entities.valueobject.Brand;

public class Vehicle {
    protected Brand vehicleBrand;
    protected BodyColor vehicleBodyColor;
    protected boolean tires = true;
    protected boolean lights = true;
    protected boolean motor = true;
    protected boolean windows = true;
    protected boolean frontParts = true;

    public Brand getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(Brand vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public BodyColor getVehicleBodyColor() {
        return vehicleBodyColor;
    }

    public void setVehicleBodyColor(BodyColor vehicleBodyColor) {
        this.vehicleBodyColor = vehicleBodyColor;
    }

    public boolean isTires() {
        return tires;
    }

    public void setTires(boolean tires) {
        this.tires = tires;
    }

    public boolean isLights() {
        return lights;
    }

    public void setLights(boolean lights) {
        this.lights = lights;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public boolean isWindows() {
        return windows;
    }

    public void setWindows(boolean windows) {
        this.windows = windows;
    }

    public boolean isFrontParts() {
        return frontParts;
    }

    public void setFrontParts(boolean frontParts) {
        this.frontParts = frontParts;
    }
}
