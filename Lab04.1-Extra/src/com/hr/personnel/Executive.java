package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {
    public Executive() {
    }

    public Executive(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is playing golf");
    }

    @Override
    public void fileReturn() {
        System.out.println("Filed Electronically");
    }

    @Override
    public double standardDeduction() {
        return 15000.00;
    }
}
