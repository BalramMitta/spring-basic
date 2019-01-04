package com.balram.springCoreTesting;

public class A {
    B b1;
    A(){System.out.println("a is created");}

    public B getB1() {
        return b1;
    }
    public void setB1(B b1) {
        this.b1 = b1;
    }
    void print(){System.out.println("hello from a");}

    B b2;

    public B getB2() {
        return b2;
    }
    public void setB2(B b2) {
        this.b2 = b2;
    }
    void display(){
        print();
        b1.print();
        b2.print();
    }
}
