package edu.weber.cs3230.ObjectOrientedDesign.Interfaces.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuizTest {
    @Test
    void testGetScore() {
        Quiz quiz = new Quiz(90.5, "A");
        assertEquals(90.5, quiz.getScore());
    }

    @Test
    void testGetGrade() {
        Quiz quiz = new Quiz(90.5, "A");
        assertEquals("A", quiz.getGrade());
    }

    @Test
    void testGetMeasure() {
        Quiz quiz = new Quiz(80.0, "B");
        assertEquals(80.0, quiz.getMeasure());
    }

    @Test
    void testQuizWithZeroScore() {
        Quiz quiz = new Quiz(0.0, "F");
        assertEquals(0.0, quiz.getMeasure());
    }
}