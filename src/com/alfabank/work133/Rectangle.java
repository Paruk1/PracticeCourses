package com.alfabank.work133;

public class Rectangle extends Shape implements Cloneable{
    private int height;
    private int width;


    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }


    public Rectangle(){
        height = 0;
        width = 0;
    }
    public Rectangle(String color,int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return super.toString() + ", height=" + height + ", width=" + width;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public double calcArea() {
        return height * width;
    }

    // "Rectangle:RED:10,20", "Circle:BLACK:10", "Triangle:GREEN:9,7,12".
    public static Rectangle parseRectangle (String figure){
        String[] tokens = figure.split(":,");
        return new Rectangle(tokens[1],Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3]));
    }

}
