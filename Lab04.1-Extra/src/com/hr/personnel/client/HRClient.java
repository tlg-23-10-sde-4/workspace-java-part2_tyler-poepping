/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 1555));
        dept.addEmployee(new SalariedEmployee("Julie", LocalDate.of(2000, 2, 2), 1555));

        dept.addEmployee(new SalariedEmployee("Bill", LocalDate.of(2014, 5, 21), 55000.99));
        dept.addEmployee(new HourlyEmployee("Tim", LocalDate.of(2012, 5, 8), 27.5, 40.0));
        dept.addEmployee(new Executive("Donny", LocalDate.of(1999,5,23), 175000));


        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // Pay its Employees
        System.out.println("\nPay employees:");
        dept.payEmployees();

        // Holiday Break
        System.out.println("\nForced holiday break");
        dept.holidayBreak();
    }
}