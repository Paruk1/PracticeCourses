package com.alfabank.PracticalWork35.controller;

public class Validation {

    public static void checkAddBookFormat(String[] array){
        if(array == null){
            throw new NullPointerException("Input something!");
        }
        if(array.length != 6){
            throw new IllegalArgumentException("Not correct format");
        }
    }

    public static int checkYear(String yearParam){
        int year = Integer.parseInt(yearParam);

        if(year < 0){
            throw new IllegalArgumentException("Uncorrect year, pls input year >= 0");
        }
        return year;
    }

    public static int checkPages(String pagesParam){
        int page = Integer.parseInt(pagesParam);

        if(page <= 0){
            throw new IllegalArgumentException("Uncorrect year, pls input pages > 0");
        }
        return page;
    }
    public static double checkPrice(String priceParam){
        double price = Double.parseDouble(priceParam);

        if(price < 0.0){
            throw new IllegalArgumentException("Uncorrect year, pls input correct price! >= 0.0");
        }
        return price;
    }

}
