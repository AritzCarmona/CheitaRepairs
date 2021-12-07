package cheitasshop.entities;

public class Vehicle {
	protected Object vehicleBrand;
	protected Object vehicleBodyColor;
	protected boolean tires = true;
	protected boolean lights = true;
	protected boolean motor = true;
	protected boolean windows = true;
	protected boolean frontParts = true;

	public Object getVehicleBrand() {
		return vehicleBrand;
	}

	public void setVehicleBrand(Object vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}

	public Object getVehicleBodyColor() {
		return vehicleBodyColor;
	}

	public void setVehicleBodyColor(Object vehicleBodyColor) {
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
