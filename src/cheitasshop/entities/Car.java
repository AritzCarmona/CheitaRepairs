package cheitasshop.entities;

import cheitasshop.entities.valueobject.BodyColor;
import cheitasshop.entities.valueobject.Brand;
import cheitasshop.entities.valueobject.CarParts;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class Car {

    protected BodyColor carBodyColor;
    protected Brand carBrand;
    private String id;
    protected Map<CarParts, Boolean> carPartsMap = new HashMap<>();

    //true means NOT REPAIRED
    //false means REPAIRED

    public Car() {
        this.id = UUID.randomUUID().toString();
    }

    public Car(Brand carBrand, boolean isBroken) {
        this.id = UUID.randomUUID().toString();
        this.carBrand = carBrand;
        carPartsMap.put(CarParts.BODY, isBroken);
        carPartsMap.put(CarParts.WINDOWS, isBroken);
        carPartsMap.put(CarParts.FRONT_TIRES, isBroken);
        carPartsMap.put(CarParts.REAR_TIRES, isBroken);
        carPartsMap.put(CarParts.LIGHTS, isBroken);
        carPartsMap.put(CarParts.LEFT_DOOR, isBroken);
        carPartsMap.put(CarParts.RIGHT_DOOR, isBroken);
        carPartsMap.put(CarParts.MOTOR, isBroken);
    }

    private Car(String id, BodyColor carBodyColor, Brand carBrand, Map<CarParts, Boolean> carPartsMap) {
        this.id = id;
        this.carBodyColor = carBodyColor;
        this.carBrand = carBrand;
        this.carPartsMap = carPartsMap;
    }

    public BodyColor getCarBodyColor() {
        return carBodyColor;
    }

    public void setCarBodyColor(BodyColor carBodyColor) {
        this.carBodyColor = carBodyColor;
    }

    public Brand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(Brand carBrand) {
        this.carBrand = carBrand;
    }

    public Map<CarParts, Boolean> getCarPartsMap() {
        return carPartsMap;
    }

    public void setCarPartsMap(Map<CarParts, Boolean> carPartsMap) {
        this.carPartsMap = carPartsMap;
    }


//    public void setWindows(boolean windows) {
//        this.carPartsMap.put(CarParts.WINDOWS, windows);
//    }

    public boolean isWindows() {
        return carPartsMap.get(CarParts.WINDOWS);
    }

    public boolean isFrontTires() {
        return carPartsMap.get(CarParts.FRONT_TIRES);
    }

    public boolean isRearTires() {
        return carPartsMap.get(CarParts.REAR_TIRES);
    }

    public boolean isLeftDoor() {
        return carPartsMap.get(CarParts.LEFT_DOOR);
    }

    public boolean isRightDoor() {
        return carPartsMap.get(CarParts.RIGHT_DOOR);
    }

	public boolean isLights() {
		return carPartsMap.get(CarParts.LIGHTS);
	}

	public boolean isBody() {
		return carPartsMap.get(CarParts.BODY);
	}

	public boolean isMotor() {
		return carPartsMap.get(CarParts.MOTOR);
	}


    public void breakPart(CarParts carPart) {
        this.getCarPartsMap().put(carPart, true);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public Car clone() {
        return new Car(this.id, this.carBodyColor, this.carBrand, this.carPartsMap);
    }
}

