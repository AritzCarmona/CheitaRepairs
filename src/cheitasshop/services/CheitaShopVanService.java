package cheitasshop.services;

import cheitasshop.entities.Van;

public interface CheitaShopVanService <T> {
    T repair(T genericVan);
    T camperize(T genericVan);
}
