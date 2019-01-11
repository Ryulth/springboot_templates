package com.template.model;

public interface Num {
    public int check();
}

class A implements Num{
    public int check(){
        //처리
        return 1;//결과
    }
}

class B implements Num{
    public int check(){
        return 2;
    }
}
