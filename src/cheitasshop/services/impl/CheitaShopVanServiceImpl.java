package cheitasshop.services.impl;

import cheitasshop.entities.CommercialVan;
import cheitasshop.entities.Motorbike;
import cheitasshop.entities.Van;
import cheitasshop.entities.Vehicle;
import cheitasshop.entities.valueobject.MotorbikeParts;
import cheitasshop.entities.valueobject.VanParts;
import cheitasshop.services.CheitaShopMotorbikeService;
import cheitasshop.services.CheitaShopVanService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CheitaShopVanServiceImpl<T, P> implements CheitaShopVanService <T> {


    @Override
    public T repair(T genericVan) {

        if (genericVan instanceof Van || genericVan instanceof CommercialVan) {
            List<P> brokenParts = checkGenericVanIssues(genericVan);
            if (brokenParts.isEmpty()) {
                System.out.println("Nothing to repair, your van is OK.");
                return genericVan;
            }
            return genericVanReparation(genericVan, brokenParts);
        } else {
            System.out.println("Sorry, this is not a van.");
            return genericVan;
        }
    }

    private List<VanParts> checkGenericVanIssuesIssues(T genericVan) {
        List<P> brokenParts = new ArrayList<>();
        for (Map.Entry<P, Boolean> entry : genericVan.WTF.entrySet()) {
            if (entry.getValue()) {
                brokenParts.add(entry.getKey());
            }
        }
        return brokenParts;
    }

    @Override
    public T camperize(T genericVan) {
        return null;
    }
}
