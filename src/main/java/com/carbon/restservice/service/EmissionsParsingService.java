package com.carbon.restservice.service;

import com.carbon.restservice.domain.CoEmissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class EmissionsParsingService implements EmissionService{

    @Autowired
    private RestTemplate restTemplate;

    public List<Object> parser(String url){
        Object[] objects = restTemplate.getForObject(url, Object[].class);
        return Arrays.asList(objects);
    }

    @Deprecated
    @Override
    public Object parse(String url) {
        return restTemplate.getForObject(url, Object.class);
    }

    @Deprecated
    public CoEmissions buildingData(String url){
        return restTemplate.getForObject(url, CoEmissions.class);
    }
}
