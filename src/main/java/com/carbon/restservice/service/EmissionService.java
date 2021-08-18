package com.carbon.restservice.service;

import com.carbon.restservice.domain.CoEmissions;

import java.util.List;

public interface EmissionService {

    /*
    service to parse the json responce and convert it to a desired model class
     */

    Object parse(String url);
    List<Object> parser (String url);
    CoEmissions buildingData(String url);
}
