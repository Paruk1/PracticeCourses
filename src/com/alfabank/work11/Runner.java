package com.alfabank.work11;

import java.util.Scanner;

public class Runner {
    public void run(){
        Scanner author = new Scanner(System.in);
        Scanner publish = new Scanner(System.in);
        Scanner year = new Scanner(System.in);

        System.out.println("Введите имя автора: ");
        findAuthor(createMassive(),author.nextLine());
        System.out.println("Введите издательство: ");
        findPublish(createMassive(),publish.nextLine());
        System.out.println("Введите год: ");
        findYear(createMassive(),year.nextInt());
    }

    private void findAuthor(Book[] array,String name){
        int count = 0;
        for (Book b : array) {
            if(b.getAuthor().equals(name)){
                b.view();
                count++;
            }
        }
        if(count == 0) System.out.println("Автора с этим именем не найдено");
    }
    private void findPublish(Book[] array,String name){
        int count = 0;
        for (Book b : array) {
            if(b.getPublish().equals(name)){
                b.view();
                count++;
            }
        }
        if(count == 0) System.out.println("Издевательство не найдено");
    }
    private void findYear(Book[] array,int year){
        int count = 0;
        for (Book b : array) {
            if(b.getYear() > year){
                b.view();
                count++;
            }
        }
        if(count == 0) System.out.println("Нет выпуска после указанного года");
    }


    private Book[] addInterestToBook(Book[] array, double interest){
        for (Book b : array) {
            b.setCost((b.getCost() * interest / 100) + b.getCost());
        }
        return array;
    }
    private Book[] createMassive(){
        return new Book[]{
                new Book(1, "Parail", "Privetos", "Kiev", 1, 356, 150.50),
                new Book(2, "Parail1", "Privetos1", "Kiev1", 100, 123, 100),
                new Book(3, "Parail2", "Privetos2", "Kiev2", 1000, 3434, 22222),
                new Book(4, "Parail3", "Privetos3", "Kiev3", 1500, 33456, 232.2),
                new Book(5, "Parail4", "Privetos4", "Kiev4", 2000, 3356, 150.50),
                new Book(6, "Parail5", "Privetos5", "Kiev6", 2001, 35446, 765.52),
                new Book(7, "Parail6", "Privetos6", "Kiev7", 3000, 35336, 150.50)
        };
    }
    private void outInfo(Book[] array){
        for (Book b : array) {
            b.view();
        }
    }

}
