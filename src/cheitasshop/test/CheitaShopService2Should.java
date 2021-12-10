package cheitasshop.test;

import cheitasshop.entities.*;
import cheitasshop.entities.valueobject.BodyColor;
import cheitasshop.entities.valueobject.Brand;
import cheitasshop.services.CheitaShopService2;
import cheitasshop.services.impl.CheitaShopService2Impl;

public class CheitaShopService2Should {
    private CheitaShopService2 sut = new CheitaShopService2Impl();

    //@Test
    public static void main(String[] args) {
        CheitaShopService2Should test = new CheitaShopService2Should();
        test.repair_a_car_with_valid_broken_motor();
        test.repair_a_car_with_invalid_broken_motor();
        test.customize_car_bodyColor_with_valid_color();
        test.repair_the_tires_of_a_motorbike();
//        test.repair_the_lights_of_a_motorbike();
//        test.repair_the_windows_of_a_regular_van();
//        test.repair_the_windows_of_a_commercial_van();
//        test.repair_the_front_parts_of_a_regular_van();
//        test.repair_the_front_parts_of_a_commercial_van();
//        test.repair_the_tires_of_a_commercial_van();
        test.camperize_a_regular_van();
        test.camperize_a_car();
        test.camperize_a_commercial_van();

    }

    private void camperize_a_regular_van() {
        Van2 van2 = new Van2();
        if(!sut.camperize(van2)) {
            throw new RuntimeException("Van not customized!!");
        }
    }

    private void camperize_a_car() {
        Car2 car2=new Car2(Brand.NOT_VALID);
        if(sut.camperize(car2)) {
            throw new RuntimeException("Car camperized????");
        }
    }

    private void camperize_a_commercial_van() {
        CommercialVan2 commercialVan2 = new CommercialVan2();
        if(sut.camperize(commercialVan2)) {
            throw new RuntimeException("Commercial Van customized!!");
        }

    }

    private void repair_the_tires_of_a_motorbike() {
        Motorbike1 motorbike1=new Motorbike1();
    }

    private void customize_car_bodyColor_with_valid_color() {
        Car2 car2=new Car2(Brand.NOT_VALID);
        if(!sut.customize(car2, BodyColor.BLUE)) {
            throw new RuntimeException("Body color not customized!!");
        }
    }

    private void repair_a_car_with_valid_broken_motor() {
        Car2 car2 = new Car2(Brand.SUZUKI);
        if(sut.repair(car2)==false){
            throw new RuntimeException("Car not repaired!!");
        }
    }
    private void repair_a_car_with_invalid_broken_motor() {
        Car2 car2 = new Car2(Brand.NOT_VALID);
        if(sut.repair(car2)==true){
            throw new RuntimeException("OOOPs, Car repaired!!");
        }
    }
}

