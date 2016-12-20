package com.example.model.hasgetter;

public class A {

    public B getB() {
        return b;
    }

    private B b = new B();
    private D d = new D();

    public A() {
        System.out.println("a");
    }
}
