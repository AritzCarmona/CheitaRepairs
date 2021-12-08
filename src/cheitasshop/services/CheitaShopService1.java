package cheitasshop.services;

import cheitasshop.entities.Car1;
import cheitasshop.entities.Motorbike1;
import cheitasshop.entities.Van1;
import cheitasshop.entities.valueobject.BodyColor;

public interface CheitaShopService1 {
    boolean repair(Car1 car1); //Boolean means repaired or not
    boolean customize(Car1 car1, BodyColor bodyColor);
    void repair(Motorbike1 moto1);
    void repair(Van1 van1);
    boolean camperize(Object van);
}
