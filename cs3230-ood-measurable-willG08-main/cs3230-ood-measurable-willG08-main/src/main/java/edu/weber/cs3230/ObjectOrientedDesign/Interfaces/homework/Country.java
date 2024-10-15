package edu.weber.cs3230.ObjectOrientedDesign.Interfaces.homework;

public class Country implements Measurable
{
    // TODO: Implement this class Country that implements the Measurable interface.
    //  The class should have two instance variables: country’s name of string type
    //  and total area of the country which is the double type. In this class, add
    //  a constructor public Country(String name, double area); also add getters and
    //  setters for the two instance variables.



    // country's Name
    private String name;
    // total area of the country
    private double area;

    public Country(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double getMeasure() {
        return area;
    }


}
