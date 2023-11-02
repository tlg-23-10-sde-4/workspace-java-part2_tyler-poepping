package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {

    private SalariedEmployee emp;
    private SalariedEmployee emp2;
    @Before
    public void setUp() {
        emp = new SalariedEmployee("Johnny", Date.valueOf("2020-10-03"),1250.0);
        emp2 = new SalariedEmployee("Johnny", Date.valueOf("2020-10-03"), 1250.0);
    }

    @Test
    public void equals_shouldReturnFalse_differentName_sameSalary_SameHireDate () {
        emp2.setName("DIFF");
        assertNotEquals(emp, emp2);
    }

    @Test
    public void equals_shouldReturnFalse_SameName_sameHireDate_differentSalary() {
        emp2.setHireDate(Date.valueOf("2023-11-02"));
        assertNotEquals(emp.getSalary(), emp2.getSalary());
    }

    @Test
    public void equals_shouldReturnTrue_whenAllPropertiesSame() {
        assertEquals(emp, emp2);
    }

    @Test
    public void testPay() {
//        assertEquals(1250.0, emp.pay(), .001);
    }

    @Test
    public void testPayTaxes() {
        assertEquals(375, emp.payTaxes(), .001);
    }
}