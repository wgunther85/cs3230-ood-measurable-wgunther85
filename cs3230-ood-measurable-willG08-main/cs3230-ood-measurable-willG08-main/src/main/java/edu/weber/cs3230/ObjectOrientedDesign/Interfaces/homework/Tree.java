package edu.weber.cs3230.ObjectOrientedDesign.Interfaces.homework;

/**
   This class represents a person with name and height
*/
public class Tree implements Measurable
{
    // TODO: Implement a class Tree that implements the Measurable interface.
   //  The class should have a height of double type and a type of string type
   //  as its instance variables. The type represents the type of a tree,
   //  such as "Willow". In this class, add a constructor public Tree(String type, double height);
   //  also add getters and setters for the two instance variables.

    private double height;
    private String type;

    public Tree(String type, double height){
        this.height = height;
        this.type = type;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    @Override
    public double getMeasure() {
        return height;
    }


}

