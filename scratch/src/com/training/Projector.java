package com.training;

public class Projector {

    public Projector() {
        System.out.println("CTOR CALLED");
    }

    static {
        System.out.println("Proj.class Loaded into memory");
    }
}