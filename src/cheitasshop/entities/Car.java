package cheitasshop.entities;

import cheitasshop.entities.valueobject.BodyColor;
import cheitasshop.entities.valueobject.Brand;
import cheitasshop.entities.valueobject.CarParts;

import java.util.HashMap;
import java.util.Map;

public class Car {

	protected BodyColor carBodyColor;
	protected Brand carBrand;

	Map<CarParts,Boolean> carPartsMap = new HashMap<>();

	//true means NOT REPAIRED
	//false means REPAIRED
/*	protected boolean windows;
	protected boolean frontTires;
	protected boolean rearTires;
	protected boolean leftDoor;
	protected boolean rightDoor;
	protected boolean lights;
	protected boolean body;
	protected boolean motor;*/

	public Car(Brand carBrand, boolean isBroken) {
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


/*	public void setWindows(boolean windows) {
		this.windows = windows;
	}

	public void setFrontTires(boolean frontTires) {
		this.frontTires = frontTires;
	}

	public void setRearTires(boolean rearTires) {
		this.rearTires = rearTires;
	}

	public void setLeftDoor(boolean leftDoor) {
		this.leftDoor = leftDoor;
	}

	public void setRightDoor(boolean rightDoor) {
		this.rightDoor = rightDoor;
	}

	public void setLights(boolean lights) {
		this.lights = lights;
	}

	public void setBody(boolean body) {
		this.body = body;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	public boolean isWindows() {
		return windows;
	}

	public boolean isFrontTires() {
		return frontTires;
	}

	public boolean isRearTires() {
		return rearTires;
	}

	public boolean isLeftDoor() {
		return leftDoor;
	}

	public boolean isRightDoor() {
		return rightDoor;
	}

	public boolean isLights() {
		return lights;
	}

	public boolean isBody() {
		return body;
	}

	public boolean isMotor() {
		return motor;
	}*/
}

