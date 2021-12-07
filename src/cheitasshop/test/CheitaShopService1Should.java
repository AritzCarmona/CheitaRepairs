package cheitasshop.test;

import cheitasshop.entities.Car1;
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
