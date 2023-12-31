package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class EmployeeTest {
    private Employee emp1;
    private Employee emp2;

    @Before
    public void setUp() {
        emp1 = new SalariedEmployee("Jim", Date.valueOf("1999-01-01"));
        emp2 = new SalariedEmployee("Jim", Date.valueOf("1999-01-01"));
    }

    @Test
    public void equals_shouldReturnFalse_sameName_differentHireDate() {
        emp2.setHireDate(Date.valueOf("2000-02-02"));
        assertNotEquals(emp1, emp2);
    }
}