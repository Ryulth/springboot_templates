package com.template.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GetController {
    @GetMapping("/get")
    public List<String > response(@RequestParam(value = "arg1")String arg1,@RequestParam(value = "arg2")String arg2){
        List<String> list = new ArrayList<>();
        list.add(arg1);
        list.add(arg2);
        return list;
    }
}
