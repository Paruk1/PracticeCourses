package com.alfabank.PracticalWork28;

public class MyTestMethod {
    public static <N extends Number> int calcNum(N[] array,N maxValue){
        int count = 0;
        for(N element : array){
            if (element.doubleValue() > maxValue.doubleValue()){
                count++;
            }
        }
        return count;
    }
}
