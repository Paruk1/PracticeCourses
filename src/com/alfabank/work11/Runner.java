package com.alfabank.work11;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Book[] createdMassive = createMassive();
        outInfo(createdMassive);

        System.out.println("\nВведите имя автора: ");

        Book[] authors = findAuthor(createdMassive, scanner.nextLine());
        if (authors.length == 0) {
            System.out.println("Автора с этим именем не найдено");
        } else{
            outInfo(authors);
        }

        System.out.println("\nВведите название издательства: ");

        Book[] publishes = findPublish(createdMassive, scanner.nextLine());
        if (publishes.length == 0) {
            System.out.println("Издательство не найдено");
        } else{
            outInfo(publishes);
        }

        System.out.println("\nВведите год: ");

        Book[] years = findYear(createdMassive, scanner.nextInt());
        if (years.length == 0) {
            System.out.println("Нет выпуска после указанного года");
        } else{
            outInfo(years);
        }


    }

    private Book[] findAuthor(Book[] array, String name) {
        int count = 0;
        Book[] temp = new Book[array.length];
        for (Book b : array) {
            if (b.getAuthor().equalsIgnoreCase(name)) {
                temp[count] = b;
                count++;
            }
        }
        return Arrays.copyOf(temp, count);
    }

    private Book[] findPublish(Book[] array, String name) {
        int count = 0;
        Book[] temp = new Book[array.length];
        for (Book b : array) {
            if (b.getPublish().equalsIgnoreCase(name)) {
                temp[count] = b;
                count++;
            }
        }
        return Arrays.copyOf(temp,count);
    }

    private Book[] findYear(Book[] array, int year) {
        int count = 0;
        Book[] temp = new Book[array.length];

        for (Book b : array) {
            if (b.getYear() > year) {
                temp[count] = b;
                count++;
            }
        }
        if (count == 0) System.out.println("Нет выпуска после указанного года");
        return Arrays.copyOf(temp,count);
    }


    private void addInterestToBook(Book[] array, double interest) {
        for (Book b : array) {
            b.setCost((b.getCost() * interest / 100) + b.getCost());
        }
    }

    private Book[] createMassive() {
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

    private void outInfo(Book[] array) {
        for (Book b : array) {
            b.view();
        }
    }

}
