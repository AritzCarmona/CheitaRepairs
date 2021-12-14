package cheitasshop.entities;

import cheitasshop.entities.valueobject.MotorbikeParts;
import cheitasshop.entities.valueobject.MotorbikeParts;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Motorbike {

    private final String id;
    private Map<MotorbikeParts, Boolean> motorbikePartsMap = new HashMap<>();

    public Motorbike() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public Map<MotorbikeParts, Boolean> getMotorbikePartsMap() {
        return motorbikePartsMap;
    }

    public void setMotorbikePartsMap(Map<MotorbikeParts, Boolean> motorbikePartsMap) {
        this.motorbikePartsMap = motorbikePartsMap;
    }

    public void breakPart (MotorbikeParts motorbikePart) {
        this.getMotorbikePartsMap().put(motorbikePart, true);
    }

    public boolean isLights() {
        return motorbikePartsMap.get(MotorbikeParts.LIGHTS);
    }

    public boolean isFrontTire() {
        return motorbikePartsMap.get(MotorbikeParts.FRONT_TIRE);
    }
    public boolean isRearTire() {
        return motorbikePartsMap.get(MotorbikeParts.REAR_TIRE);
    }
}
