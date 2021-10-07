package com.alfabank.PracticalWork35.model;

import com.alfabank.PracticalWork35.model.entity.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SourceBooks {
    public static List<Book> getBooks(){
        List<Book> bookList = new ArrayList<>();
        bookList.add( new Book("Morozov", "Title1", "BHV", 2000, 345, 200.0));
        bookList.add( new Book("Shevchenko", "Title2", "Word", 2010, 1000, 760.0));
        bookList.add(new Book("Nerus", "Title3", "AL", 2017, 505, 444.0));
        bookList.add(  new Book("Morozov", "Title4", "Word", 1987, 120, 120.0));
        bookList.add(  new Book("Grushin", "Title5", "BHV", 1999, 765, 555.0));
        return bookList;
    }
}
