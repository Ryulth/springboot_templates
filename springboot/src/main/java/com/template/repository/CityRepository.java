package com.template.repository;

import com.template.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  CityRepository  extends CrudRepository<City,Long> {
    List<City> findByName(String name); // 오버라이딩 자동으로 가능
    List<City> findByStateContaining(String state);
}
