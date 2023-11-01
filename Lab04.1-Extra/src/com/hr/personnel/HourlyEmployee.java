package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{
    double rate;
    double hours;

    //CTORs
    public HourlyEmployee() {}

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
        setRate(rate);
        setHours(hours);
    }

    // Business methods
    @Override
    public void pay() {
        System.out.println(super.getName() + " is paid hourly " + (getRate() * getHours()));
    }

    @Override
    public void payTaxes() {
        System.out.println(getName() + " paid " + ((getHours() * getRate()) * TaxPayer.HOURLY_TAX_RATE));
    }

    // Getters and Setters
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }


    @Override
    public String toString() {
        return super.toString() + " hours = " + getHours() + " rate = " + getRate();
    }
}
