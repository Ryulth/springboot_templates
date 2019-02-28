package com.template.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.template.pojo.Request;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class PostController {
    @PostMapping(value = "post")
    public String response(@RequestBody String  request) throws IOException { // JSON 타입으로 바로 변환하면 오류가 가끔 남
        Request result = new ObjectMapper()
                .readValue(request, Request.class);
        System.out.println(result);
        System.out.println(result.getType());
        /*Gson gson = new Gson();
        JsonObject res = new JsonObject();
        res.addProperty("text", "ddd");
        res.addProperty("statue", "good");
        res.addProperty("todo", "wod");*/
        return result.getType();
    }
}
