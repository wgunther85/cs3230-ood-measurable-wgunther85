package edu.weber.cs3230.ObjectOrientedDesign.Interfaces.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountryTest {
    @Test
    void testGetMeasure() {
        Country country = new Country("TestCountry", 100.0);
        assertEquals(100.0, country.getMeasure());
    }

    @Test
    void testGetName() {
        Country country = new Country("TestCountry", 100.0);
        assertEquals("TestCountry", country.getName());
    }

    @Test
    void testGetArea() {
        Country country = new Country("TestCountry", 100.0);
        assertEquals(100.0, country.getArea());
    }

    @Test
    void testCountryWithZeroArea() {
        Country country = new Country("ZeroAreaCountry", 0.0);
        assertEquals(0.0, country.getMeasure());
    }
}