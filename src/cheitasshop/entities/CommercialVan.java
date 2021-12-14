package cheitasshop.entities;

import cheitasshop.entities.valueobject.VanParts;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CommercialVan {

    private final String id;
    private Map<VanParts, Boolean> partsMap = new HashMap<>();

    public CommercialVan() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public Map<VanParts, Boolean> getPartsMap() {
        return partsMap;
    }

    public void setpartsMap(Map<VanParts, Boolean> partsMap) {
        this.partsMap = partsMap;
    }

    public void breakPart (VanParts vanPart) {
        this.getPartsMap().put(vanPart, true);
    }
}
