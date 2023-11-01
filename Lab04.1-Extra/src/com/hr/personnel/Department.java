/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The Department class manages employees.
 * <p>
 * Properties:
 * String name
 * String location
 * Employee[] employees  the Employees in this department.
 * int currentIndex      internal counter for number of employees in the department.
 * <p>
 * Methods (excluding get/set methods):
 * void listEmployees()  print info on all employees in the department.
 * void workEmployees()  make all employees in the department work.
 * String toString()     self-explanatory.
 */
public class Department {
    // fields
    private String name;
    private String location;
    private final Collection<Employee> employees = new ArrayList<>();

    // constructors
    public Department() {
    }

    public Department(String name, String location) {
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees() {
        for(Employee e : employees) {
            System.out.println(e);
        }
    }

    public void workEmployees() {
       for(Employee e : employees) {
           e.work();
       }
    }

    public void payEmployees() {
        for(Employee e : employees) {
            e.pay();
        }
    }

    public void holidayBreak() {
        for (Employee e : employees) {
            // Check if employee is an instance of Salaried employee class
            if (e instanceof SalariedEmployee) {
                ((SalariedEmployee) e).takeVacation(); // Down cast salaried employee and call takeVacation, If you only call 1 method
                /* We can also use this method
                 *
                 * SalariedEmployee emp = (SalariedEmployee) e;
                 * emp.takeVacation()
                 */

            }
        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String toString() {
        return String.format("Department: name=" + getName() + ", location=" + getLocation());
    }
}