package com.alfabank.work133;

public class Shape {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape() {
        color = "unknown";
    }

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "class=" + getClass().getSimpleName() + ", color=" + color;
    }

    public double calcArea() {
        return 0.0;
    }
}
