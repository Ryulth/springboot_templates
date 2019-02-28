package com.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HtmlController {

    @RequestMapping("/docs")
    @ResponseBody
    public String welcome() {
        return "static/index.html";
    }

}
