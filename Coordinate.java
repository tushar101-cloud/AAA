package com.arin3.backend.model;

public class Coordinate {
    private Double x;
    private Double y;
    private Double z;
    private String locationName;
    private String description;
    private String markerType;

    public Coordinate() {
    }

    public Coordinate(Double x, Double y, Double z, String locationName, String description, String markerType) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.locationName = locationName;
        this.description = description;
        this.markerType = markerType;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMarkerType() {
        return markerType;
    }

    public void setMarkerType(String markerType) {
        this.markerType = markerType;
    }
}
