package cheitasshop.services.impl;

import cheitasshop.entities.Vehicle;
import cheitasshop.services.CheitaShopService2;

public class CheitaShopService2Impl implements CheitaShopService2 {
    @Override
    public void repair(Vehicle vehicle) {
        System.out.println("The vehicle is repaired");
    }
}
