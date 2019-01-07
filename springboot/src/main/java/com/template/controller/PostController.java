package com.template.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @PostMapping(value = "post")
    public String resopnse(@RequestBody String payload) { // JSON 타입으로 바로 변환하면 오류가 가끔 남
        System.out.println(payload);
        Gson gson = new Gson();
        JsonObject res = new JsonObject();
        res.addProperty("text", "ddd");
        res.addProperty("statue", "good");
        res.addProperty("todo", "wod");
        return gson.toJson(res);
    }
}
