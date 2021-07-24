package com.alfabank.work12;

public class MyCalculate {
    private static double Pi;


    public static double calcPi(int n) {
        double num = 3;
        double expression;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) expression = 4 / num;
            else expression = -(4 / num);

            if(i == 0) Pi = 4 - expression;
            else Pi = Pi - expression;
            num += 2;
        }

        return Pi;
    }
}
