package com.alfabank.to26.work12;

import java.util.Random;

public class ID {
    private int id;
    private static final int nextId;

    static{
        Random rnd = new Random();
        nextId = rnd.nextInt(100);
    }

    ID(){
        this.id = nextId;
        id++;
    }


    public int getId() {
        return id;
    }
    public static int getNextId() {
        return nextId;
    }
}
