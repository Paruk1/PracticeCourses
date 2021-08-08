package com.alfabank.work133;

import java.util.Arrays;

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
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
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
}
