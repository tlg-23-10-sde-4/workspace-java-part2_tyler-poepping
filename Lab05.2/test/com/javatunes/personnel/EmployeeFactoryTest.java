package com.javatunes.personnel;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class EmployeeFactoryTest {
    private Map<String, String> seMap;
    private Map<String, String> heMap;

    @Before
    public void init() {
        seMap = new HashMap<>();
        seMap.put("type", "SE");
        seMap.put("name", "Jackie");
        seMap.put("hireDate", "1990-08-24");
        seMap.put("salary", "50000.0");

        heMap = new HashMap<>();
        heMap.put("type", "HE");
        heMap.put("name", "Jackie");
        heMap.put("hireDate", "1990-08-24");
        heMap.put("rate", "50.0");
        heMap.put("hours", "40.0");
    }


    private static void verifyNameAndHireDate(Employee emp) {
        assertEquals("Jackie", emp.getName());
        assertEquals(Date.valueOf("1990-08-24"), emp.getHireDate());
    }

    @Test
    public void testCreateEmployeeSalaried() {
        Employee emp = EmployeeFactory.createEmployee(seMap);
        assertEquals(SalariedEmployee.class, emp.getClass());

        verifyNameAndHireDate(emp);

        SalariedEmployee semp = (SalariedEmployee) EmployeeFactory.createEmployee(seMap);
        assertEquals(50_000, semp.getSalary(), .001);
    }

    @Test
    public void testCreateEmployeeHourly() {
        Employee emp = EmployeeFactory.createEmployee(heMap);
        assertEquals(HourlyEmployee.class, emp.getClass());

        verifyNameAndHireDate(emp);

        HourlyEmployee hemp = (HourlyEmployee) emp;

        assertEquals(50.0, hemp.getRate(), .001);
        assertEquals(40.0, hemp.getHours(), .001);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateEmployeeInvalidTypeThrowsIllegalArgumentException() {
        seMap.put("type", "INVALID");
        EmployeeFactory.createEmployee(seMap);
    }
}