package com.ShapeOfThings;

public class Cube extends Shape {

    public double width;
    public double sa;
    public double vol;


    public Cube(double width)
    {
        this.width = width;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public void surfaceArea()
    {
        sa = (6 * width * width);
    }

    public void volume()
    {
        vol = (width * width * width);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube{");
        sb.append("width: ").append(width);
        sb.append(", Surface Area: ").append(sa);
        sb.append(", Volume: ").append(vol);
        sb.append('}');
        return sb.toString();
    }
}
