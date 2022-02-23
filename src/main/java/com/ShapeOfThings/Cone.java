package com.ShapeOfThings;

public class Cone extends Shape{

    public double radius;
    public double height; // Slant Height of Cone
    public double sa;
    public double vol;
    public double length;


    public Cone(double radius, double height)
    {
        this.radius = radius;
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

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void surfaceArea()
    {
        length = (Math.sqrt(radius * radius + height * height));
        sa = (Math.PI * radius * (radius + length));
    }

    public void volume()
    {
        vol = (1.0/3) * (Math.PI * radius * radius * height);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone{");
        sb.append("radius: ").append(radius);
        sb.append(", slant: ").append(height);
        sb.append(", Surface Area: ").append(sa);
        sb.append(", volume: ").append(vol);
        sb.append('}');
        return sb.toString();
    }
}
