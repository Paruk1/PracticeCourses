package com.alfabank.PracticalWork29;

import java.util.*;

public class MyNumGenerator {
    private int numOfElm;
    private int maxNumb;

    MyNumGenerator(int numOfElm,int maxNumb){
        this.maxNumb = maxNumb;
        this.numOfElm = numOfElm;
    }

    public List generateList(){
        List list = new ArrayList<>(numOfElm);
        Random random = new Random();
        for (int i = 0; i < numOfElm; i++){
            list.add(random.nextInt(maxNumb));
        }
        return list;
    }

    public Set generateSet(){
        Set set = new HashSet();
        Random random = new Random();
        for (int i = 0; i < numOfElm; i++){
            boolean isAdded = set.add(random.nextInt(maxNumb));
                while (!isAdded){
                    isAdded = set.add(random.nextInt(maxNumb));
                }
        }
        return set;
    }

    public int getNumOfElm() {
        return numOfElm;
    }
    public void setNumOfElm(int numOfElm) {
        this.numOfElm = numOfElm;
    }
    public int getMaxNumb() {
        return maxNumb;
    }
    public void setMaxNumb(int maxNumb) {
        this.maxNumb = maxNumb;
    }
}
