package com.alfabank.work11;

public class Runner {
    public void run(){
        outInfo(addInterestToBook(createMassive(),10));
    }

    public Book[] addInterestToBook(Book[] array, double interest){
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
