package com.alfabank.to26.work133;

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

    // "Rectangle:RED:10,20", "Circle:BLACK:10", "Triangle:GREEN:9,7,12".

    public static Circle parseRectangle (String figure){
        if(figure == null) throw new InvalidShapeStringException("Input something");
        String[] tokens = figure.split(":");

        if (tokens.length != 3) throw new InvalidShapeStringException("Incorrect length!");
        if (!tokens[2].matches("[0-9]")) throw new InvalidShapeStringException("Input numbers!!");

        return new Circle(tokens[1],Integer.parseInt(tokens[2]));
    }


}
