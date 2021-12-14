package cheitasshop.services;

import cheitasshop.entities.Car;
import cheitasshop.entities.valueobject.BodyColor;

public interface CheitaShopCarService {

	Car repair(Car car);
	Car customize(Car car, BodyColor desiredBodyColor);

}
