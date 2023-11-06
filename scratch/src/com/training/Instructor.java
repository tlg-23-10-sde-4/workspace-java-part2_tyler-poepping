package com.training;

public class Instructor {
    private static final Projector projector = new Projector();


    private final String name;

    private final int yearsExperience;

    public Instructor(String name, int yearsExperience) {
        this.name = name;
        this.yearsExperience = yearsExperience;
    }

    public String getName() {
        return name;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    static {
        System.out.println("Instructor class loaded into memory");
    }
}