package com.template.model;

import lombok.Data;

@Data
public class Greeting {
    public Greeting() {
    }
    public Greeting(String content) {
        this.content = content;
    }
    private String content;
}
