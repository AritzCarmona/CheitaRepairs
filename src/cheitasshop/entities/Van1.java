package cheitasshop.entities;

public class Van1 {
    private boolean camperized;
    protected boolean windows, frontParts;

    public boolean isCamperized() {
        return camperized;
    }

    public void setCamperized(boolean camperized) {
        this.camperized = camperized;
    }

    public boolean isWindows() {
        return windows;
    }

    public void setWindows(boolean windows) {
        this.windows = windows;
    }

    public boolean isFrontParts() {
        return frontParts;
    }

    public void setFrontParts(boolean frontParts) {
        this.frontParts = frontParts;
    }
}
