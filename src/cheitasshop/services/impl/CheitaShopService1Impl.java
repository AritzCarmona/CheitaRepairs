package cheitasshop.services.impl;

import cheitasshop.entities.Car1;
import cheitasshop.entities.CommercialVan1;
import cheitasshop.entities.Motorbike1;
import cheitasshop.entities.Van1;
import cheitasshop.entities.valueobject.BodyColor;
import cheitasshop.entities.valueobject.Brand;
import cheitasshop.services.CheitaShopService1;

import java.util.List;

public class CheitaShopService1Impl implements CheitaShopService1 {


    private final static List<Brand> validBrands = List.of(Brand.FORD, Brand.SUZUKI, Brand.RENAULT, Brand.VOLKSWAGEN);
    private final static List<BodyColor> validBodyColors = List.of(BodyColor.BLUE, BodyColor.RED, BodyColor.YELLOW);

    @java.lang.Override
    public boolean repair(Car1 car1) {
        boolean carBrandMatch = false;
        for (Brand validBrand : validBrands) {
            if (validBrand.equals(car1.getCarBrand())) {
                carBrandMatch = true;
                break;
            }
        }

        if (carBrandMatch) {
            car1.setMotor(true);
            System.out.println("The motor is repaired.");
            return true;
        } else {
            System.out.println("Sorry, we don't repair your car brand.");
            return false;
        }
    }

    @Override
    public boolean customize(Car1 car1, BodyColor desiredBodyColor) {
        boolean desiredColorMatch=false;
        for (BodyColor validBodyColor : validBodyColors) {
            if (validBodyColor.equals(desiredBodyColor)) {
                desiredColorMatch = true;
                break;
            }
        }
            if (desiredColorMatch) {
                car1.setCarBodyColor(desiredBodyColor);
                return true;
            } else {
                System.out.println("Sorry, not possible tu use that color.");
                return false;
            }
        }


    public void repair(Motorbike1 moto1) {
        System.out.println("Motorbike repaired");

    }

    @Override
    public void repair(Van1 van1) {
        System.out.println("Van repaired");

    }

    @Override
    public boolean camperize(Object van1) {
        System.out.println("Class name: " + van1.getClass().getCanonicalName());
        if (van1 instanceof CommercialVan1) {
            ((Van1) van1).setCamperized(false);
            System.out.println("NOT possible to camperize, sorry");
            return false;
        } else if (van1 instanceof Van1) {
            System.out.println("Van camperized");
            ((Van1) van1).setCamperized(true);
            return true;
        } else {
            System.out.println("X cannot be camperized");
            return false;
        }
    }
}
