package com.template.controller;

import com.template.model.City;
import com.template.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JpaController {

    @Autowired
    private CityRepository cityRepository;

    @RequestMapping("/add")
    public City add(City city){
        City cityData = cityRepository.save(city);
        return cityData;
    }

    @RequestMapping("/all")
    public List<City> list(Model model){
        List<City> cityList = new ArrayList<>();
        cityRepository.findAll().forEach(cityList::add);
        return cityList;
    }
}
