package com.alfabank.work133;

public class Circle extends Shape implements Cloneable{

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle() {
        radius = 0;
    }

    public Circle(String color,int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius=" + radius;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public double calcArea() {
        return Math.PI * (radius * radius);
    }
}