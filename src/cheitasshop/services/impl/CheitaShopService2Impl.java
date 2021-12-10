package cheitasshop.services.impl;

import cheitasshop.entities.*;
import cheitasshop.entities.valueobject.BodyColor;
import cheitasshop.entities.valueobject.Brand;
import cheitasshop.services.CheitaShopService2;

import java.util.List;

public class CheitaShopService2Impl implements CheitaShopService2 {

    private final static List<Brand> validBrands = List.of(Brand.FORD, Brand.SUZUKI, Brand.RENAULT, Brand.VOLKSWAGEN);
    private final static List<BodyColor> validBodyColors = List.of(BodyColor.BLUE, BodyColor.RED, BodyColor.YELLOW);

    @Override
    public boolean repair(Vehicle vehicle) {
        if (vehicle instanceof Car2){
            boolean carBrandMatch = false;
            for (Brand validBrand : validBrands) {
                if (validBrand.equals(vehicle.getVehicleBrand())) {
                    carBrandMatch = true;
                    break;
                }
            }

            if (carBrandMatch) {
                vehicle.setMotor(true);
                System.out.println("The motor is repaired.");
                return true;
            } else {
                System.out.println("Sorry, we don't repair your car brand.");
                return false;
            }

        } else if (vehicle instanceof Motorbike2) {
            vehicle.setLights(true);
            vehicle.setTires(true);
            System.out.println("Motorbike fully repaired");
            return true;

        } else if (vehicle instanceof Van2) {
            if(vehicle instanceof CommercialVan2) {
                vehicle.setFrontParts(true);
                vehicle.setWindows(true);
                vehicle.setTires(true);
                vehicle.setMotor(true);
                System.out.println("Van fully repaired");
                return true;
            } else {
                vehicle.setFrontParts(true);
                vehicle.setWindows(true);
                System.out.println("Commercial van fully repaired");
                return true;
            }
        } else {
            System.out.println("Not possible to repair!!");
            return false;
        }
    }

    @Override
    public boolean customize(Vehicle vehicle, BodyColor desiredBodyColor) {
        if (vehicle instanceof Car2) {
            boolean desiredColorMatch=false;
            for (BodyColor validBodyColor : validBodyColors) {
                if (validBodyColor.equals(desiredBodyColor)) {
                    desiredColorMatch = true;
                    break;
                }
            }
            if (desiredColorMatch) {
                vehicle.setVehicleBodyColor(desiredBodyColor);
                return true;
            } else {
                System.out.println("Sorry, not possible tu use that color.");
                return false;
            }
            } else {
            System.out.println("Sorry, not possible to customize that vehicle.");
            return false;
        }
    }

    @Override
    public boolean camperize(Vehicle vehicle) {
        if (vehicle instanceof CommercialVan2) {
            ((Van2) vehicle).setCamperized(false);
            System.out.println("NOT possible to camperize, sorry");
            return false;
        } else if (vehicle instanceof Van2) {
            System.out.println("Van camperized");
            ((Van2) vehicle).setCamperized(true);
            return true;
        } else {
            System.out.println("X cannot be camperized");
            return false;
        }
    }
}
