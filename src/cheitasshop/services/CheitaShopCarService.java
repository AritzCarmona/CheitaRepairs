package cheitasshop.services;

import cheitasshop.entities.Car;
import cheitasshop.entities.valueobject.CarBodyColor;

public interface CheitaShopCarService {

	void repair(Car car, boolean itemToBeRepaired);

	void customize(Car car, CarBodyColor desiredBodyColor);

}
