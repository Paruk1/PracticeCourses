package com.alfabank.PracticalWork35.view;

import com.alfabank.PracticalWork35.model.entity.Book;

import java.util.List;

public class BooksView {
    InputViewBooks inputViewBooks = new InputViewBooks();

    public void menu(){
        System.out.println(
                "1. Весь список книг (view)\n" +
                "2. Добавить книгу (add)\n" +
                "3. Изменить стоимость книг (edit)\n" +
                "4. Найти книги по автору (author)\n" +
                "5. Найти по издательству (publisher)\n" +
                "6. Найти выпущенные после введенного года (year)\n" +
                "0. Завершить работу (exit)\n"
        );
    }

    public String getCommand(){
        System.out.println(ViewConstants.INPUT_COMMAND);
        return inputViewBooks.inputCommand();
    }

    public void printMessage(String text){
        System.out.println(text);
    }

    public void printBooksByText(List<Book> bookList){
        bookList.forEach(System.out::println);
    }

    public String addBook(){
        System.out.println(ViewConstants.INPUT_BOOK);
        return inputViewBooks.inputBook();
    }
    public String findAuthor(){
        System.out.println(ViewConstants.FIND_AUTHOR);
        return inputViewBooks.findAuthor();
    }
    public String findPublisher(){
        System.out.println(ViewConstants.FIND_PUBLISHER);
        return inputViewBooks.findPublisher();
    }
    public int findYear(){
        System.out.println(ViewConstants.FIND_YEAR);
        return inputViewBooks.findYear();
    }
    public Double upPrice(){
        System.out.println(ViewConstants.CHANGE_PRICE);
        return inputViewBooks.inputProcents();
    }

    public void printSearchList(List<Book> bookList){
        if(bookList.size() == 0) System.out.println(ViewConstants.NOT_FOUND);
        else printBooksByText(bookList);
    }

}
