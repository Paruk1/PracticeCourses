package com.alfabank.to26.work133;

public class Triangle extends Shape implements Cloneable{
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public Triangle() {
        a = 0.0;
        b = 0.0;
        c = 0.0;
    }

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        return (Circle)super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + ", a=" + a + ", b=" + b + ", c=" + c;
    }

    @Override
    public double calcArea() {
        double p = (a+b+c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    // "Rectangle:RED:10,20", "Circle:BLACK:10", "Triangle:GREEN:9,7,12".
    public static Triangle parseRectangle (String figure){
        String[] tokens = figure.split(":,");
        return new Triangle(tokens[1],Double.parseDouble(tokens[2]),Double.parseDouble(tokens[3]),Double.parseDouble(tokens[4]));
    }
}
