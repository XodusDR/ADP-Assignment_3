package org.example;

public abstract class Shapes {

    private String shapeName;
    private double width;
    private double length;
    private double height;
    private int corners;

    public Shapes()
    {


    }

    public Shapes(String name, double width, double lenght, int corners ){
        this.shapeName = name;
        this.width = width;
        this.length = length;
        this.height = 0;
        this.corners = corners;

    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getCorners() {
        return corners;
    }

    public void setCorners(int corners) {
        this.corners = corners;
    }

    public String shapeSounds(){return "Shapes";}

    @Override
    public String toString() {
        return "Shapes{" +
                "shapeName='" + shapeName + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", height=" + height +
                ", corners=" + corners +
                '}';
    }
}

