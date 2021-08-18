package com.carbon.restservice.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties
//annotation used to indicate that the properties that do not match the json resonse should be ignored
//@JsonFormat(shape = JsonFormat.Shape.ARRAY)
//@JsonPropertyOrder({ "department", "source_type", "fiscal_year", "quarter", "emissions_mtco2e", "consumption", "consumption_units" })
public class BuildingEmissions {

    private String department;
    private String source_type;
    private String fiscal_year;
    private String quarter;
    private float emissions_mtco2e;
    private int consumption;
    private String consumption_units;



    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSource_type() {
        return source_type;
    }

    public void setSource_type(String source_type) {
        this.source_type = source_type;
    }

    public String getFiscal_year() {
        return fiscal_year;
    }

    public void setFiscal_year(String fiscal_year) {
        this.fiscal_year = fiscal_year;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public float getEmissions_mtco2e() {
        return emissions_mtco2e;
    }

    public void setEmissions_mtco2e(float emissions_mtco2e) {
        this.emissions_mtco2e = emissions_mtco2e;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public String getConsumption_units() {
        return consumption_units;
    }

    public void setConsumption_units(String consumption_units) {
        this.consumption_units = consumption_units;
    }

}
