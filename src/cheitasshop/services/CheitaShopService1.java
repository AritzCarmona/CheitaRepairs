package cheitasshop.services;

import cheitasshop.entities.Car1;
import cheitasshop.entities.Motorbike1;
import cheitasshop.entities.Truck;
import cheitasshop.entities.Van1;
import cheitasshop.entities.valueobject.BodyColor;

public interface CheitaShopService1 {
    boolean repair(Car1 car1); //Boolean means repaired or not
    void repair(Motorbike1 moto1);
    void repair(Van1 van1);
    void repair(Truck truck);
    boolean customize(Car1 car1, BodyColor bodyColor);
    boolean camperize(Object van);
}
