package cheitasshop.test;

import cheitasshop.entities.Car1;
import cheitasshop.entities.Motorbike1;
import cheitasshop.entities.valueobject.BodyColor;
import cheitasshop.entities.valueobject.Brand;
import cheitasshop.services.CheitaShopService1;
import cheitasshop.services.impl.CheitaShopService1Impl;

public class CheitaShopService1Should {
    private CheitaShopService1 sut = new CheitaShopService1Impl();

    //@Test
    public static void main(String[] args) {
        CheitaShopService1Should test = new CheitaShopService1Should();
        test.repair_a_car_with_valid_broken_motor();
        test.repair_a_car_with_invalid_broken_motor();
        test.customize_car_bodycolor_with_valid_color();
        test.repair_the_tires_of_a_motorbike();
        test.repair_the_lights_of_a_motorbike();
        test.repair_the_windows_of_a_regular_van();
        test.repair_the_windows_of_a_commercial_van();
        test.repair_the_front_parts_of_a_regular_van();
        test.repair_the_front_parts_of_a_commercial_van();
        test.repair_the_tires_of_a_commercial_van();
        test.camperize_a_regular_van();

    }

    private void repair_the_tires_of_a_motorbike() {
        Motorbike1 motorbike1=new Motorbike1();
    }

    private void customize_car_bodycolor_with_valid_color() {
        Car1 car1=new Car1(Brand.NOT_VALID, false);
        if(!sut.customize(car1, BodyColor.BLUE)) {
            throw new RuntimeException("Body color not customized!!");
        }
    }

    private void repair_a_car_with_valid_broken_motor() {
        Car1 car1 = new Car1(Brand.SUZUKI,false);
        if(sut.repair(car1)==false){
            throw new RuntimeException("Car not repaired!!");
        }
    }
    private void repair_a_car_with_invalid_broken_motor() {
        Car1 car1 = new Car1(Brand.NOT_VALID,false);
        if(sut.repair(car1)==true){
            throw new RuntimeException("OOOPs, Car repaired!!");
        }
    }
}
