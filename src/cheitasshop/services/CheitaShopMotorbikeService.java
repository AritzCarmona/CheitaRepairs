package cheitasshop.services;

import cheitasshop.entities.Vehicle;

public interface CheitaShopMotorbikeService {

	void repair(Vehicle vehicle, boolean itemToBeRepaired);

	void customize(Vehicle vehicle);

}
