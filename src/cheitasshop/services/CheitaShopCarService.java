package cheitasshop.services;

import cheitasshop.entities.Car;
import cheitasshop.entities.valueobject.BodyColor;

public interface CheitaShopCarService {

	boolean repair(Car car);
	boolean customize(Car car, BodyColor desiredBodyColor);

}
