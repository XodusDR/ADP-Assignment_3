package org.example;

public class Rectangle extends Shapes {

    public Rectangle()
    {

    }

    public Rectangle(String name, double width, double lenght, int corners) {
        super(name, width, lenght, corners);
    }

    @Override
    public String shapeSounds(){return "Rectangle";}
}
