package edu.weber.cs3230.ObjectOrientedDesign.Interfaces.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DataTest {
    @Test
    void testAverageWithEmptyArray() {
        Measurable[] objects = {};
        assertEquals(0, Data.average(objects));
    }

    @Test
    void testAverageWithNonEmptyArray() {
        Measurable[] objects = {
                new MeasurableMock(10),
                new MeasurableMock(20),
                new MeasurableMock(30)
        };
        assertEquals(20, Data.average(objects));
    }

    @Test
    void testMaxWithEmptyArray() {
        Measurable[] objects = {};
        assertNull(Data.max(objects));
    }

    @Test
    void testMaxWithNonEmptyArray() {
        Measurable[] objects = {
                new MeasurableMock(10),
                new MeasurableMock(20),
                new MeasurableMock(30)
        };
        assertEquals(30, Data.max(objects).getMeasure());
    }

    private static class MeasurableMock implements Measurable {
        private final double measure;

        MeasurableMock(double measure) {
            this.measure = measure;
        }

        @Override
        public double getMeasure() {
            return measure;
        }
    }
}