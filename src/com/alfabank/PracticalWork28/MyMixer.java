package com.alfabank.PracticalWork28;

import java.util.Random;

public class MyMixer <T>{
    private T[] array;

    MyMixer(T[] array){
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }
    public void setArray(T[] array) {
        this.array = array;
    }

    public void shuffle(){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            int index = random.nextInt(array.length);
            T temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

    }
}


