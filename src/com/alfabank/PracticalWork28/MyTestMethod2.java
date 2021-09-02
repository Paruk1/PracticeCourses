package com.alfabank.PracticalWork28;

public class MyTestMethod2 {
    public static <N extends Number> double calcNum(N[] array, N maxValue) {
        double result = 0;
        for (N element : array){
            if (element.doubleValue() > maxValue.doubleValue())
            {
                result += element.doubleValue();
            }
        }
        return result;
    }
}
