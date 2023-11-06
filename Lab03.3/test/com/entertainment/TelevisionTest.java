package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionTest {
    private Television tv1;
    private Television tv2;

    @Before
    public void setUp() {
        tv1 = new Television("SONY", 32);
        tv2 = new Television("SONY", 22);
    }

    @Test
    public void hashTest_shouldBeTrue() {
        assertNotEquals(tv1.hashCode(), tv2.hashCode());
    }

    @Test
    public void compareTo_shouldReturnTrue() {
        assertEquals(0, tv1.compareTo(tv2));
    }

    @Test
    public void tvs_shouldEqual_returnTrue() {
        tv2.setVolume(32);
        assertEquals(tv1, tv2);
    }

    @Test
    public void equals_brand_ShouldReturnFalse() {
        tv1.setBrand("brand");
        assertNotEquals(tv2.getBrand(), tv1.getBrand());
    }

    @Test
    public void equalShouldReturnRalse_whenVolumeNotEqual() {
        assertNotEquals(tv1.getVolume(), tv2.getVolume());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setVoulume_shouldTriggerException_whenInvalid_upperBound() {
        tv1.setVolume(101);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setVolume_shouldThrowIllegalArgumentException_whenInvalid_lowerBound() {
        tv1.setVolume(-1);
    }

    @Test
    public void setVolume_shouldStoreValue_when_valid_upperBound() {
        tv1.setVolume(100);
        assertEquals(100, tv1.getVolume());
    }

    @Test
    public void setVolume_shoudStoreValue_whenValidLowerBound() {
        tv1.setVolume(0);
        assertEquals(0, tv1.getVolume());
    }
}