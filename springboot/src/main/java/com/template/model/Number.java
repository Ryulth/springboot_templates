package com.template.model;

import lombok.Data;


@Data
public class Number{
    public Number(){
    }
    private int num;
    public int check(Num n){
        return n.check();
    }
}