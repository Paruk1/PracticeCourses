package com.alfabank.PracticalWork35.model;

import com.alfabank.PracticalWork35.model.entity.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceBooks {
    private List<Book> bookList;

    public ServiceBooks(){
        bookList = SourceBooks.getBooks();
    }

    public void addBook(String name, String author, String publisher, int year, int pages, double costs){
        bookList.add(new Book(name,author,publisher,year,pages,costs));
    }

    public List<Book> getBooks(){
        return new ArrayList<>(bookList);
    }
//
    public void upCost(double procents){
        bookList.forEach(el -> el.setCosts((el.getCosts() * (procents/100)) + el.getCosts()));
    }
    public List<Book> findAuthor(String authorName){
        List<Book> temp = new ArrayList<>();
        bookList.forEach(el->{
            if(el.getAuthor().equalsIgnoreCase(authorName))
            {
                temp.add(el);
            }
        });
        return temp;
    }
    public List<Book> findPublisher(String publisherName){
        List<Book> temp = new ArrayList<>();
        bookList.forEach(el->{
            if(el.getPublisher().equalsIgnoreCase(publisherName))
            {
                temp.add(el);
            }
        });
        return temp;
    }
    public List<Book> findYear(int year){
        List<Book> temp = new ArrayList<>();
        bookList.forEach(el->{
            if(el.getYear() > year)
            {
                temp.add(el);
            }
        });
        return temp;
    }

}
