package com.alfabank.work122;

import com.alfabank.work122.calcarea.Calculate;

import java.util.Scanner;

public class Runner {
    public void run(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите радиус ");
        System.out.println(Calculate.areaCircle(scanner.nextDouble()));

        System.out.println("Введите сторону ");
        System.out.println(Calculate.areaSquare(scanner.nextDouble()));

    }
}
