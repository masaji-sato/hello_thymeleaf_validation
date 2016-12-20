package com.example.model.hasgetter;

public class C {

    public String getValue() {
        return value;
    }

    private String value = "c";

    public C() {
        System.out.println("c");
    }
}
