package cheitasshop.entities;

import cheitasshop.entities.valueobject.BodyColor;
import cheitasshop.entities.valueobject.Brand;

public class Car extends Vehicle {

	private BodyColor vehicleBodyColor;
	private Brand vehicleBrand;

	public Car(BodyColor vehicleBodyColor, Brand vehicleBrand) {
		//super.vehicleBodyColor = vehicleBodyColor;
		this.vehicleBodyColor = vehicleBodyColor;
		this.vehicleBrand = vehicleBrand;
	}

//	@Override
//	public BodyColor getVehicleBodyColor() {
//		return vehicleBodyColor;
//	}
//
//	@Override
//	public void setVehicleBodyColor(BodyColor vehicleBodyColor) {
//		this.vehicleBodyColor = vehicleBodyColor;
//	}
//
//	@Override
//	public Brand getVehicleBrand() {
//		return vehicleBrand;
//	}
//
//	@Override
//	public void setVehicleBrand(Brand vehicleBrand) {
//		this.vehicleBrand = vehicleBrand;
//	}
}

