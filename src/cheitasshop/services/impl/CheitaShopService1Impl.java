package cheitasshop.services.impl;

import cheitasshop.entities.Car1;
import cheitasshop.entities.Motorbike1;
import cheitasshop.entities.Van1;
import cheitasshop.entities.valueobject.CarBrand;
import cheitasshop.services.CheitaShopService1;

public class CheitaShopService1Impl implements CheitaShopService1 {

    @java.lang.Override
    public void repair(Car1 car1) {
        boolean carBrandMatch=false;
        for (CarBrand carBrand: CarBrand.values()) {
            if (CarBrand.toString(carBrand)==car1.getCarBrand()) {
                carBrandMatch=true;
                break;
            } else {
                carBrandMatch=false;
            }

        }
        if (carBrandMatch) {
            car1.setMotor(true);
            System.out.println("The motor is repaired.");
        } else {
            System.out.println("Sorry, we don't repair your car brand.");
        }

    }

    public void repair(Motorbike1 moto1) {
        System.out.println("Motorbike repaired");

    }

    @Override
    public void repair(Van1 van1) {
        System.out.println("Van repaired");

    }

}
