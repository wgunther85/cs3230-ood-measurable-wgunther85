package edu.weber.cs3230.ObjectOrientedDesign.Interfaces.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeTest {
    @Test
    void testGetHeight() {
        Tree tree = new Tree("Oak", 5.5);
        assertEquals(5.5, tree.getHeight());
    }

    @Test
    void testGetType() {
        Tree tree = new Tree("Maple", 8.0);
        assertEquals("Maple", tree.getType());
    }

    @Test
    void testGetMeasure() {
        Tree tree = new Tree("Pine", 7.2);
        assertEquals(7.2, tree.getMeasure());
    }

    @Test
    void testTreeWithZeroHeight() {
        Tree tree = new Tree("Birch", 0.0);
        assertEquals(0.0, tree.getMeasure());
    }
}