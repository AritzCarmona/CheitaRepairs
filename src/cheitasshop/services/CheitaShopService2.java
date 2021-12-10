package cheitasshop.services;

import cheitasshop.entities.Vehicle;
import cheitasshop.entities.valueobject.BodyColor;

public interface CheitaShopService2 {

    boolean repair(Vehicle vehicle);
    boolean customize (Vehicle vehicle, BodyColor bodyColor);
    boolean camperize (Vehicle vehicle);
}
