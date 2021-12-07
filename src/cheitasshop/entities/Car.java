package cheitasshop.entities;

import cheitasshop.entities.valueobject.CarBodyColor;
import cheitasshop.entities.valueobject.CarBrand;

public class Car extends Vehicle {

	private CarBodyColor vehicleBodyColor;
	private CarBrand vehicleBrand;

	Car(CarBrand vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}



}

