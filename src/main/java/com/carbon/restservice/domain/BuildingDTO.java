package com.carbon.restservice.domain;

public class BuildingDTO {

    private String building;
    private String source;
    private float co2;

    @Override
    public String toString() {
        return "BuildingDTO{" +
                "building='" + building + '\'' +
                ", source='" + source + '\'' +
                ", co2='" + co2 + '\'' +
                '}';
    }

    public BuildingDTO(String building, String source, float co2) {
        this.building = building;
        this.source = source;
        this.co2 = co2;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public float getCo2() {
        return co2;
    }

    public void setCo2(float co2) {
        this.co2 = co2;
    }
}
