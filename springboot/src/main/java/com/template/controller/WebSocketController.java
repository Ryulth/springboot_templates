package com.template.controller;

import com.template.model.Greeting;
import com.template.model.Hello;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class WebSocketController{
    @MessageMapping("/hi") // 받아오는 곳
    @SendTo("/topic/greetings") // 이 주제에 전송 이주제를 구독하고 있는 사용자는 바로 받아볼 수 있음
    public Greeting greeting(Hello message) throws Exception{
        Thread.sleep(1000);
        System.out.println("message");
        return new Greeting("Hello, "+ HtmlUtils.htmlEscape(message.getName())+"!");
    }
}