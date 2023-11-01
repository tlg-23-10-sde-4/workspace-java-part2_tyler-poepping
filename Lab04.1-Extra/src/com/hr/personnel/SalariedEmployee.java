package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    double salary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
        setSalary(salary);
    }

    // Business Methods
    public void pay() {
        System.out.println(super.getName() + " is paid salary  of " + getSalary());
    }

    @Override
    public void payTaxes(){
        System.out.println(getName() + " paid " + (getSalary() * TaxPayer.SALARIED_TAX_RATE));
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation");
    }

    // Getters and Setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return super.toString() + " salary= " + getSalary();
    }
}
