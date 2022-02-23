package com.ShapeOfThings;

public class Sphere extends Shape{

    public double radius;
    public double sa;
    public double vol;


    public Sphere(double radius)
    {
        this.radius = radius;
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
        sa = (4 * Math.PI * radius * radius);
    }

    public void volume()
    {
        vol = ((4.0/3) * Math.PI * radius * radius * radius); // This is off.
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Sphere{");
        sb.append("radius: ").append(radius);
        sb.append(", Surface Area: ").append(sa);
        sb.append(", Volume: ").append(vol);
        sb.append('}');
        return sb.toString();
    }
}
