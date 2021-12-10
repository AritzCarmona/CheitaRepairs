package cheitasshop.services.impl;

import cheitasshop.entities.*;
import cheitasshop.entities.valueobject.BodyColor;
import cheitasshop.entities.valueobject.Brand;
import cheitasshop.entities.valueobject.CarParts;
import cheitasshop.services.CheitaShopCarService;
import cheitasshop.services.CheitaShopMotorbikeService;
import cheitasshop.services.CheitaShopService2;
import cheitasshop.services.CheitaShopVanService;

import java.util.List;

public class CheitaShopService2Impl implements CheitaShopService2 {

    private final static List<Brand> validBrands = List.of(Brand.FORD, Brand.SUZUKI, Brand.RENAULT, Brand.VOLKSWAGEN);
    private final static List<BodyColor> validBodyColors = List.of(BodyColor.BLUE, BodyColor.RED, BodyColor.YELLOW);

    @Override
    public boolean repair(Vehicle vehicle) {
        if (vehicle instanceof Car2){
            return repairCar(vehicle);
        } else if (vehicle instanceof Motorbike2) {
            return repairMotorbike(vehicle);
        } else if (vehicle instanceof Van2) {
            return repairVan(vehicle);
        }else if(vehicle instanceof Truck2){
            return repairTruck(vehicle);
        }else {
            System.out.println("Not possible to repair!!");
            return false;
        }
    }

    private boolean repairTruck(Vehicle vehicle) {
        System.out.println("Truck fully repaired");
        return true;
    }

    private boolean repairVan(Vehicle vehicle) {
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
    }

    private boolean repairMotorbike(Vehicle vehicle) {
        vehicle.setLights(true);
        vehicle.setTires(true);
        System.out.println("Motorbike fully repaired");
        return true;
    }

     private Car2 repairCar(Vehicle vehicle) {
        boolean carBrandMatch =  carBrandIsValid(vehicle);
         if (carBrandMatch) {
             List<CarParts> brokenParts= checkCarIssues((Car2)vehicle);
             carReparation(vehicle);
             return carRepared;
        } else {
            System.out.println("Sorry, we don't repair your car brand.");
           //Throw something
        }
    }

    //Motors, tires, windows, and doors(righ-left,back)
    private void carReparation(Vehicle vehicle) {
        vehicle.setMotor(true);
        System.out.println("The motor is repaired.");
    }

    private boolean carBrandIsValid(Vehicle vehicle) {
        for (Brand validBrand : validBrands) {
            if (validBrand.equals(vehicle.getVehicleBrand())) {
                return true;
            }
        }
        return false;
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
