/*package com.template.controller;

import com.template.model.City;
import com.template.repository.CityRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;
import java.lang.Iterable;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostControllerTest {

    @Autowired
    CityRepository cityRepository;

    @After // 테스트 코드가 끝난후 영향을 끼치지 않기 위해 cleanup 용도
    public void cleanup(){
        cityRepository.deleteAll();
    }

    @Test
    public void save_load(){
        //given 처음에 데이터를 세팅하기 위한 용도
        cityRepository.save(City.builder()
                .name("city_name")
                .state("state")
                .build());

        //when 테스트하는 액션 선언
        List<City> cities = cityRepository.findAll();

        //then 결과검증
        City city = cities.get(0);


        //then
    }
}
*/