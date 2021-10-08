package com.alfabank.PracticalWork35.controller;

import com.alfabank.PracticalWork35.model.ServiceBooks;
import com.alfabank.PracticalWork35.model.entity.Book;
import com.alfabank.PracticalWork35.view.BooksView;
import com.alfabank.PracticalWork35.view.ViewConstants;

import javax.swing.text.View;
import java.util.List;

public class BooksController {
    private BooksView booksView;
    private ServiceBooks serviceBooks;

    public BooksController() {
        booksView = new BooksView();
        serviceBooks = new ServiceBooks();
    }

    public void execute() {
        while (true) {
            booksView.menu();
            String command = booksView.getCommand();
            switch (command) {
                case "view":
                    booksView.printBooksByText(serviceBooks.getBooks());
                    break;
                case "add":
                    //andriy;parail;dadaya;2012;123;222.0
                    controllerAddBook();
                    break;
                case "edit":
                    editBooks();
                    break;
                case "author":
                    findAuthor();
                    break;
                case "publisher":
                    findPublisher();
                    break;
                case "year":
                    findYear();
                    break;
                case "exit":
                    System.exit(1);
                default:
                    booksView.printMessage(ViewConstants.ERROR);
            }
            booksView.printMessage(ViewConstants.LINE);
        }
    }

    private void controllerAddBook(){
        String book = booksView.addBook();
        String[] bookSplit = book.split(";");
        System.out.println(bookSplit.length);
        try{
            Validation.checkAddBookFormat(bookSplit);
            int year = Validation.checkYear(bookSplit[3]);
            int pages = Validation.checkYear(bookSplit[4]);
            double price = Validation.checkPrice(bookSplit[5]);
            serviceBooks.addBook(bookSplit[0],bookSplit[1],bookSplit[2],year,pages,price);
        }catch (IllegalArgumentException | NullPointerException ex){
            booksView.printMessage(ViewConstants.VALIDATION_ERROR);
        }
    }
    private void editBooks(){
        Double price = booksView.upPrice();
        serviceBooks.upCost(price);
    }
    private void findAuthor(){
        String authorName = booksView.findAuthor();
        booksView.printSearchList(serviceBooks.findAuthor(authorName));
    }
    private void findPublisher(){
        String publish = booksView.findPublisher();
        booksView.printSearchList(serviceBooks.findPublisher(publish));
    }
    private void findYear(){
        int year = booksView.findYear();
        booksView.printSearchList(serviceBooks.findYear(year));
    }


}
