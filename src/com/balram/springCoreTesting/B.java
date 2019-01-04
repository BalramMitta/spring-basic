package com.balram.springCoreTesting;

public class B {
    String name;

    B(String name){
        this.name=name;
        System.out.println(name+" b is created");
    }
    void print(){System.out.println("hello from "+name+" b");}
}
