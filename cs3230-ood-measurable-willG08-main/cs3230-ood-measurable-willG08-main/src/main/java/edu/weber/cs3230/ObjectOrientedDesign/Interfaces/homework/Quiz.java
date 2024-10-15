package edu.weber.cs3230.ObjectOrientedDesign.Interfaces.homework;

/**
   This class represents a quiz score and grade
*/
public class Quiz implements Measurable
{
    // TODO: Implement a class Quiz that implements the Measurable interface.
   //  The class should have a score of double type and a grade of string type
   //  as its instance variables. The grade represents a letter grade such as "B+".
   //  In this class, add a constructor public Quiz(double score, String grade);
   //  also add getters and setters for the two instance variables.

    // quiz grade
    private String grade;
    // quiz score
    private double score;

    public Quiz(double score, String grade){
        this.score = score;
        this.grade = grade;
    }

    public String getGrade(){
        return grade;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }

    public double getScore(){
        return score;
    }

    public void setScore(double score){
        this.score = score;
    }

    @Override
    public double getMeasure() {
        return score;
    }

}

