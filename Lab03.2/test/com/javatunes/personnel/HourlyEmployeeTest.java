package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class HourlyEmployeeTest {
    private HourlyEmployee emp;
    @Before
    public void setUp() {
        emp = new HourlyEmployee("Susan", Date.valueOf("2010-01-01"), 25.0, 30.0);
    }

    @Test
    public void testPay() {

    }

    @Test
    public void testPayTaxes() {
//        assertEquals();
    }
}