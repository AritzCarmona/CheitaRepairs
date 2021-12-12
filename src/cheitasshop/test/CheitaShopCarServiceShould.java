package cheitasshop.test;

import cheitasshop.entities.Car;
import cheitasshop.entities.valueobject.BodyColor;
import cheitasshop.entities.valueobject.Brand;
import cheitasshop.services.CheitaShopCarService;
import cheitasshop.services.impl.CheitaShopCarServiceImpl;


public class CheitaShopCarServiceShould {
    private CheitaShopCarService sut = new CheitaShopCarServiceImpl();

    //@Test
    public static void main(String[] args) {
        CheitaShopCarServiceShould test = new CheitaShopCarServiceShould();
        test.repair_a_car_with_valid_brand_and_broken_parts();
        test.repair_a_car_with_invalid_brand_and_broken_parts();
        test.repair_a_car_with_valid_brand_and_no_broken_parts();
        test.repair_a_car_with_invalid_brand_and_no_broken_parts();
        test.customize_car_bodyColor_with_valid_color();
        test.customize_car_bodyColor_with_invalid_color();

    }


    private void repair_a_car_with_invalid_brand_and_no_broken_parts() {
        Car car = new Car(Brand.NOT_VALID, false);
        sut.repair(car);
        if (car.getCarPartsMap().containsValue(true)) {
            throw new RuntimeException("Invalid car brand!!!");
        }
    }

    private void repair_a_car_with_valid_brand_and_no_broken_parts() {
        Car car = new Car(Brand.VOLKSWAGEN, false);
        sut.repair(car);
        if (car.getCarPartsMap().containsValue(true)) {
            throw new RuntimeException("Fuck! We broke the car in the garage!!");
        }
    }

    private void repair_a_car_with_invalid_brand_and_broken_parts() {
        Car car = new Car(Brand.NOT_VALID, true);
        sut.repair(car);
        if (car.getCarPartsMap().containsValue(false)) {
            throw new RuntimeException("Invalid car brand repaired!");
        }
    }

    private void repair_a_car_with_valid_brand_and_broken_parts() {
        Car car = new Car(Brand.FORD, true);
        sut.repair(car);
        if (car.getCarPartsMap().containsValue(true)) {
            throw new RuntimeException("Valid car with broken parts NOT repaired!!!");
        }
    }


    private void customize_car_bodyColor_with_valid_color() {
        Car car = new Car (Brand.SUZUKI, true);
        if(!sut.customize(car, BodyColor.BLUE)) {
            throw new RuntimeException("Body color not customized!!");
        }
    }
    private void customize_car_bodyColor_with_invalid_color() {
        Car car = new Car (Brand.SUZUKI, true);
        if(sut.customize(car, BodyColor.NOT_VALID)) {
            throw new RuntimeException("Customized with invalid color???");
    }

}
}


