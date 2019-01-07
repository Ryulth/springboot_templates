package com.template.controller;

import com.template.model.City;
import com.template.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
public class JpaController {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping("/all")
    public List<City> list(Model model) {
        List<City> cityList = new ArrayList<>();
        cityRepository.findAll().forEach(cityList::add); // repository 반환값이 이터레티어 임
        return cityList;
    }

    @GetMapping("/add")
    public City addGet(City city) {
        System.out.println(city);
        City cityData = cityRepository.save(city);
        return cityData;
    }

    @PostMapping("/add")
    public City addPost(@RequestBody City city) {
        System.out.println(city);
        City cityData = cityRepository.save(city);
        return cityData;
    }

    @PostMapping("/update")
    public City updatePost(@RequestParam(value = "id") Long id, @RequestBody City city) {
        System.out.println(city);
        City cityData = cityRepository.findById(id)
                .orElse(null);
        cityData.setName(city.getName());
        cityData.setState(city.getState());
        cityData.setUpdateTime(Calendar.getInstance());
        cityRepository.save(cityData);
        return cityData;
    }

    @GetMapping("/delete")
    public City deletePost(@RequestParam(value = "id") Long id) {
        System.out.println(id);
        City cityData = cityRepository.findById(id)
                .orElse(null);
        cityRepository.deleteById(id);
        return cityData;
    }

    @GetMapping("/findname")
    public List<City> findByName(@RequestParam(value = "name") String name){
        System.out.println(name);
        List<City> cityList = new ArrayList<>();
        cityList = cityRepository.findByName(name);
        return cityList;
    }

    @GetMapping("/findstate")
    public List<City> findByState(@RequestParam(value = "state") String state){
        System.out.println(state);
        List<City> cityList = new ArrayList<>();
        cityList = cityRepository.findByStateContaining(state);
        return cityList;
    }
}
