package com.alfabank.work133;

public class Rectangle extends Shape{
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
    public double calcArea() {
        return height * width;
    }


}
