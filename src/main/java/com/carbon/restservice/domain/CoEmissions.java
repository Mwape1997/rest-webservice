package com.carbon.restservice.domain;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "department",
        "source_type",
        "fiscal_year",
        "quarter",
        "emissions_mtco2e",
        "consumption",
        "consumption_units"
})
@Generated("jsonschema2pojo")
public class CoEmissions implements Serializable
{

    @JsonProperty("department")
    private String department;
    @JsonProperty("source_type")
    private String sourceType;
    @JsonProperty("fiscal_year")
    private String fiscalYear;
    @JsonProperty("quarter")
    private String quarter;
    @JsonProperty("emissions_mtco2e")
    private String emissionsMtco2e;
    @JsonProperty("consumption")
    private String consumption;
    @JsonProperty("consumption_units")
    private String consumptionUnits;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8471784410793653449L;

    /**
     * No args constructor for use in serialization
     *
     */
    public CoEmissions() {
    }

    /**
     *
     * @param emissionsMtco2e
     * @param sourceType
     * @param consumption
     * @param consumptionUnits
     * @param department
     * @param fiscalYear
     * @param quarter
     */
    public CoEmissions(String department, String sourceType, String fiscalYear, String quarter, String emissionsMtco2e, String consumption, String consumptionUnits) {
        super();
        this.department = department;
        this.sourceType = sourceType;
        this.fiscalYear = fiscalYear;
        this.quarter = quarter;
        this.emissionsMtco2e = emissionsMtco2e;
        this.consumption = consumption;
        this.consumptionUnits = consumptionUnits;
    }

    public CoEmissions (String department){
        this.department = department;
    }

    @JsonProperty("department")
    public String getDepartment() {
        return department;
    }

    @JsonProperty("department")
    public void setDepartment(String department) {
        this.department = department;
    }

    public CoEmissions withDepartment(String department) {
        this.department = department;
        return this;
    }

    @JsonProperty("source_type")
    public String getSourceType() {
        return sourceType;
    }

    @JsonProperty("source_type")
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public CoEmissions withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    @JsonProperty("fiscal_year")
    public String getFiscalYear() {
        return fiscalYear;
    }

    @JsonProperty("fiscal_year")
    public void setFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public CoEmissions withFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
        return this;
    }

    @JsonProperty("quarter")
    public String getQuarter() {
        return quarter;
    }

    @JsonProperty("quarter")
    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public CoEmissions withQuarter(String quarter) {
        this.quarter = quarter;
        return this;
    }

    @JsonProperty("emissions_mtco2e")
    public String getEmissionsMtco2e() {
        return emissionsMtco2e;
    }

    @JsonProperty("emissions_mtco2e")
    public void setEmissionsMtco2e(String emissionsMtco2e) {
        this.emissionsMtco2e = emissionsMtco2e;
    }

    public CoEmissions withEmissionsMtco2e(String emissionsMtco2e) {
        this.emissionsMtco2e = emissionsMtco2e;
        return this;
    }

    @JsonProperty("consumption")
    public String getConsumption() {
        return consumption;
    }

    @JsonProperty("consumption")
    public void setConsumption(String consumption) {
        this.consumption = consumption;
    }

    public CoEmissions withConsumption(String consumption) {
        this.consumption = consumption;
        return this;
    }

    @JsonProperty("consumption_units")
    public String getConsumptionUnits() {
        return consumptionUnits;
    }

    @JsonProperty("consumption_units")
    public void setConsumptionUnits(String consumptionUnits) {
        this.consumptionUnits = consumptionUnits;
    }

    public CoEmissions withConsumptionUnits(String consumptionUnits) {
        this.consumptionUnits = consumptionUnits;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public CoEmissions withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CoEmissions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("department");
        sb.append('=');
        sb.append(((this.department == null)?"<null>":this.department));
        sb.append(',');
        sb.append("sourceType");
        sb.append('=');
        sb.append(((this.sourceType == null)?"<null>":this.sourceType));
        sb.append(',');
        sb.append("fiscalYear");
        sb.append('=');
        sb.append(((this.fiscalYear == null)?"<null>":this.fiscalYear));
        sb.append(',');
        sb.append("quarter");
        sb.append('=');
        sb.append(((this.quarter == null)?"<null>":this.quarter));
        sb.append(',');
        sb.append("emissionsMtco2e");
        sb.append('=');
        sb.append(((this.emissionsMtco2e == null)?"<null>":this.emissionsMtco2e));
        sb.append(',');
        sb.append("consumption");
        sb.append('=');
        sb.append(((this.consumption == null)?"<null>":this.consumption));
        sb.append(',');
        sb.append("consumptionUnits");
        sb.append('=');
        sb.append(((this.consumptionUnits == null)?"<null>":this.consumptionUnits));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}