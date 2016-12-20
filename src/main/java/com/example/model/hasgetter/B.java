package com.example.model.hasgetter;

public class B {

    public C getC() {
        return c;
    }

    private C c = new C();

    public B() {
        System.out.println("b");
    }
}
