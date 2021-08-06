package com.alfabank.work133;

import java.util.Scanner;

public class Runner {
    public void run(){
        double res;
        Scanner scanner = new Scanner(System.in);

        Shape[] shapes = createMassive();

        outArea(shapes);

        System.out.println("Введите желаемое название класса");
        res = sumArea(shapes,scanner.nextLine());
        System.out.println("Общая сумма площадей класса = " + res);

        System.out.println("Общая сумма площадей каждого типа класса");
        sumAreaClasses(shapes);

    }
    public void outArea(Shape[] shapes){
        for (Shape element: shapes) {
            System.out.println(element + "\nПлощадь фигуры = " + element.calcArea());
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
