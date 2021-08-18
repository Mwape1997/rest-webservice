package com.carbon.restservice.controller;

import com.carbon.restservice.domain.BuildingDTO;
import com.carbon.restservice.domain.CoEmissions;
import com.carbon.restservice.service.EmissionsParsingService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class EmissionsController {

    private static final String API = "https://data.sfgov.org/resource/pxac-sadh.json";

    @Autowired
    private EmissionsParsingService emissionsParsingService;


    //used for viewing unmodified JSON data
    @ResponseBody
    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public List<Object> mp(){
        List<Object> objects = emissionsParsingService.parser(API);
        System.out.println(Arrays.asList(objects));
        return Arrays.asList(objects);

    }

    @ResponseBody
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main() throws IOException {
        String output;
        List<BuildingDTO> buildingDTOS = new ArrayList<BuildingDTO>();
        List<BuildingDTO> filteredDTO = new ArrayList<BuildingDTO>();
        ObjectMapper mapper = new ObjectMapper();
        CoEmissions[] jsonObj = mapper.readValue(new URL(API), CoEmissions[].class);
        for (CoEmissions attribute : jsonObj) {
            if (Float.parseFloat(attribute.getEmissionsMtco2e()) != 0){
                buildingDTOS.add(new BuildingDTO(attribute.getDepartment(), attribute.getSourceType(), Float.parseFloat(attribute.getEmissionsMtco2e())));
                System.out.println("Building: " + attribute.getDepartment() + "| Source: " + attribute.getSourceType() + "| Co2: " + attribute.getEmissionsMtco2e());
            }

        }


        ArrayList<Float> coValues = new ArrayList<>();

        for(int i=buildingDTOS.size()-1; i>0; i--) {
            for(int j=i-1; j>=0; j--) {
                if ((buildingDTOS.get(i).getBuilding().equals(buildingDTOS.get(j).getBuilding())) && (buildingDTOS.get(i).getSource().equals(buildingDTOS.get(j).getSource()))){
                    float temp = buildingDTOS.get(i).getCo2() + buildingDTOS.get(j).getCo2();
                    coValues.add(temp);
                    buildingDTOS.remove(i);
                    break;
                }
            }
        }

        for(int i=buildingDTOS.size()-1; i>0; i--) {
            buildingDTOS.get(i).setCo2(coValues.get(i));
        }




        System.out.println(buildingDTOS);
        output = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(buildingDTOS);
        return output;
    }

    @ResponseBody
    @RequestMapping(value = "/building", method = RequestMethod.GET)
    CoEmissions[] getBuilding(@RequestParam String name) throws IOException {
        List<BuildingDTO> buildingDTOS = new ArrayList<BuildingDTO>();
        ObjectMapper mapper = new ObjectMapper();
        CoEmissions[] jsonObj = mapper.readValue(new URL(API), CoEmissions[].class);
        for (CoEmissions attribute : jsonObj) {
            if ((Float.parseFloat(attribute.getEmissionsMtco2e()) != 0) && attribute.getDepartment().equals(name)){
                buildingDTOS.add(new BuildingDTO(attribute.getDepartment(), attribute.getSourceType(), Float.parseFloat(attribute.getEmissionsMtco2e())));
                System.out.println("Building: " + attribute.getDepartment() + "| Source: " + attribute.getSourceType() + "| Co2: " + attribute.getEmissionsMtco2e());
            }

        }

        return getBuilding(name);
    }

    @ResponseBody
    @RequestMapping(value = "/source", method = RequestMethod.GET)
    CoEmissions[] source(@RequestParam String name) throws IOException {
        List<BuildingDTO> buildingDTOS = new ArrayList<BuildingDTO>();
        ObjectMapper mapper = new ObjectMapper();
        CoEmissions[] jsonObj = mapper.readValue(new URL(API), CoEmissions[].class);
        for (CoEmissions attribute : jsonObj) {
            if ((Float.parseFloat(attribute.getEmissionsMtco2e()) != 0) && attribute.getSourceType().equals(name)){
                buildingDTOS.add(new BuildingDTO(attribute.getDepartment(), attribute.getSourceType(), Float.parseFloat(attribute.getEmissionsMtco2e())));
                System.out.println("Building: " + attribute.getDepartment() + "| Source: " + attribute.getSourceType() + "| Co2: " + attribute.getEmissionsMtco2e());
            }

        }

        return source(name);
    }


}
