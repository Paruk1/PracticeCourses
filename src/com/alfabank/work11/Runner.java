package com.alfabank.work11;

public class Runner {
    public void run(){
        Book book1 = new Book();
        Book book2 = new Book(1,"Parail","Privetos","Kiev",2001,356,150.50);

        book1.view();
        book2.view();
    }
}
