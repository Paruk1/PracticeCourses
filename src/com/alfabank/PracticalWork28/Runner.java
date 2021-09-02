package com.alfabank.PracticalWork28;

import java.util.Arrays;

public class Runner {
    public void run(){
        Integer[] array_int = {1,2,3,4,5};
        Double[] array_double = {1.7,2.5,111.1,50.9,1.5};

        System.out.println("Result = " + MyTestMethod.calcNum(array_int,2));
        System.out.println("Result = " + MyTestMethod.calcNum(array_double,2));

        System.out.println("=======================");

        System.out.println("Result = " + MyTestMethod2.calcNum(array_int,2));
        System.out.println("Result = " + MyTestMethod2.calcNum(array_double,2));

        System.out.println("=======================");

        MyMixer<Integer> myMixer = new MyMixer<>(array_int);
        myMixer.shuffle();
        System.out.println(Arrays.toString(myMixer.getArray()));
    }

}
