package cheitasshop.services;

import cheitasshop.entities.Car;
import cheitasshop.entities.valueobject.BodyColor;

public interface CheitaShopCarService {

	void repair(Car car, boolean itemToBeRepaired);

	void customize(Car car, BodyColor desiredBodyColor);

}
