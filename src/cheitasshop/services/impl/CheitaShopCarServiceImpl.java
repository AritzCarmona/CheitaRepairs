package cheitasshop.services.impl;

import cheitasshop.entities.Car;
import cheitasshop.entities.valueobject.BodyColor;
import cheitasshop.entities.valueobject.Brand;
import cheitasshop.entities.valueobject.CarParts;
import cheitasshop.services.CheitaShopCarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CheitaShopCarServiceImpl implements CheitaShopCarService {

    private final static List<Brand> validBrands = List.of(Brand.FORD, Brand.SUZUKI, Brand.RENAULT, Brand.VOLKSWAGEN, Brand.NOT_VALID);
    private final static List<BodyColor> validBodyColors = List.of(BodyColor.BLUE, BodyColor.RED, BodyColor.YELLOW, BodyColor.NOT_VALID);

    public Car repair(Car car) {
        boolean carBrandMatch = carBrandIsValid(car);
        if (carBrandMatch) {
            List<CarParts> brokenParts = checkCarIssues(car);
            if (brokenParts.isEmpty()) {
                System.out.println("Nothing to repair, you car is OK.");

            }
           return carReparation(car,brokenParts);

        } else {
            System.out.println("Sorry, we don't repair your car brand.");
            return car;
            //Throw something
        }
    }

    private List<CarParts> checkCarIssues(Car car) {
        List<CarParts> brokenParts = new ArrayList<>();
        for (Map.Entry<CarParts, Boolean> entry : car.getCarPartsMap().entrySet()) {
            if (entry.getValue()) {
                brokenParts.add(entry.getKey());
            }
        }
        return brokenParts;
    }
		/*
		if (car.isBody()) { brokenParts.add(CarParts.BODY); }
		else if (car.isFrontTires()) { brokenParts.add(CarParts.FRONT_TIRES); }
		else if (car.isRearTires()) { brokenParts.add(CarParts.REAR_TIRES); }
		else if (car.isMotor()) { brokenParts.add(CarParts.MOTOR); }
		else if (car.isLeftDoor()) { brokenParts.add(CarParts.LEFT_DOOR); }
		else if (car.isRightDoor()) { brokenParts.add(CarParts.RIGHT_DOOR); }
		else if (car.isLights()) { brokenParts.add(CarParts.LIGHTS); }
		else if (car.isWindows()) { brokenParts.add(CarParts.WINDOWS);
		return  brokenParts; }
		return null;*/


    //Motors, tires, windows, and doors(righ-left,back)

    //    private Car carReparation(Car car, List<CarParts> brokenParts) {
//        Map<CarParts, Boolean> repairingMap = car.getCarPartsMap();
//        for (CarParts brokenPart : brokenParts) {
//            carPartReparation(car, repairingMap, brokenPart);
//        }
//        System.out.println("The car is repaired.");
//        car.setCarPartsMap(repairingMap);
//        return car;
//    }
    private Car carReparation(Car car, List<CarParts> brokenParts) {
        for (CarParts brokenPart : brokenParts) {
            car.getCarPartsMap().put(brokenPart, false);
        }
        return car;

//        System.out.println("Stop");
//        if (car.isBody()) {
//            car.setBody(false);
//        }
//        if (car.isFrontTires()) {
//            car.setFrontTires(false);
//        }if (car.isRearTires()) {
//            car.setRearTires(false);
//        } else if (car.isMotor()) {
//            car.setMotor(false);
//        } else if (car.isLeftDoor()) {
//            car.setLeftDoor(false);
//        } else if (car.isRightDoor()) {
//            car.setRightDoor(false);
//        } else if (car.isLights()) {
//            car.setLights(true);
//        } else if (car.isWindows()) {
//            car.setWindows(false);
//        } else {
//            //Throw nothing to repair?
//        }
//        return car;
    }

//    private void carPartReparation(Car car, Map<CarParts, Boolean> reparingMap, CarParts brokenPart) {
//        if (car.getCarPartsMap().containsKey(brokenPart)) {
//            reparingMap.put(brokenPart, false);
//        }
//    }


    private boolean carBrandIsValid(Car car) {
        if (Brand.NOT_VALID.equals(car.getCarBrand())) {
            return false;
        }
        for (Brand validBrand : validBrands) {
            if (validBrand.equals(car.getCarBrand())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Car customize(Car car, BodyColor desiredBodyColor) {

        boolean desiredColorMatch = desiredColorIsValid(desiredBodyColor);
        if (desiredColorMatch) {
            car.setCarBodyColor(desiredBodyColor);
        } else {
            System.out.println("Sorry, that color is not available.");
        }
        return car;

    }

    private boolean desiredColorIsValid(BodyColor desiredBodyColor) {
        if (BodyColor.NOT_VALID.equals(desiredBodyColor)) {
            return false;
        }
        for (BodyColor validBodyColor : validBodyColors) {
            if (validBodyColor.equals(desiredBodyColor)) {
                return true;
            }
        }
        return false;
    }

}


