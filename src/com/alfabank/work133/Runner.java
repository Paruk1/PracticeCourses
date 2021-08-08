package com.alfabank.work133;

import java.util.Arrays;

public class Runner {
    public void run()  {
        Shape[] shapes = createMassive();
        outInfo(shapes);

        System.out.println("===================================");
        Arrays.sort(shapes);
        outInfo(shapes);
        System.out.println("===================================");

        Arrays.sort(shapes,new MyComparatorColor());
        outInfo(shapes);
        
    }

    public void outInfo(Shape[] shapes) {
        for (Shape element : shapes) {
            element.draw();
        }
    }

    public double sumArea(Shape[] shapes, String className){
        double result = 0.0;
            for (Shape element : shapes){
                if(element.getClass().getSimpleName().equalsIgnoreCase(className)){
                    result += element.calcArea();
                }
            }
        return result;
    }

    public void sumAreaClasses(Shape[] shapes) {
        double sumTriangle= 0.0;
        double sumCircle = 0.0;
        double sumRectangle = 0.0;
        for (Shape element : shapes) {
            if (element instanceof Triangle) {
                sumTriangle += element.calcArea();
            } else if (element instanceof Circle) {
                sumCircle += element.calcArea();
            } else if (element instanceof Rectangle) {
                sumRectangle += element.calcArea();
            }
        }
        System.out.printf("Circle = " + sumCircle + " Triangle = " + sumTriangle + " Rectangle = " + sumRectangle + "\n","%f%f%f");
    }

    public Shape[] createMassive(){
        return  new Shape[]{
                new Circle("Red", 4),
                new Circle("Black", 5),
                new Circle("Yellow", 6),
                new Rectangle("White", 1, 2),
                new Rectangle("Grey", 2, 4),
                new Rectangle("Brown", 3, 3),
                new Rectangle("Green", 4, 2),
                new Triangle("Purple", 3, 2, 3),
                new Triangle("White", 2, 3, 4)
        };
    }


}
