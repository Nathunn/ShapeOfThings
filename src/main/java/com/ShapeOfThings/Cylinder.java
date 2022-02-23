package com.ShapeOfThings;

public class Cylinder extends Shape{

    public double height;
    public double radius;
    public double sa;
    public double vol;

    public Cylinder(double height, double radius)
    {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public void surfaceArea()
    {
        sa = (2 * Math.PI * radius * (radius + height));
    }

    public void volume()
    {
        vol = (Math.PI * radius * radius * height);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder{");
        sb.append("height: ").append(height);
        sb.append(", radius: ").append(radius);
        sb.append(", Surface Area: ").append(sa);
        sb.append(", Volume: ").append(vol);
        sb.append('}');
        return sb.toString();
    }
}
