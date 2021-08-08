package com.alfabank.work133;

abstract class Shape implements Drawable,Comparable,Cloneable {
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
    public void draw() {
        //System.out.println("class=" + getClass().getSimpleName() + ", color=" + color + ", area=" + calcArea());
        System.out.println(this + ", area=" + calcArea());
    }

    @Override
    public int compareTo(Object o) {
        if(this.calcArea() > ((Shape)o).calcArea()) return 1;
        if(this.calcArea() < ((Shape)o).calcArea()) return -1;
        return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Shape shape = (Shape)super.clone();
        //shape.color = new String(color);
        shape.color = color;
        return shape;
    }

    @Override
    public String toString() {
        return "class=" + getClass().getSimpleName() + ", color=" + color;
    }

    abstract double calcArea();

}
