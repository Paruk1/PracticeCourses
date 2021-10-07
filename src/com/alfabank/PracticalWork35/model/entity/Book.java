package com.alfabank.PracticalWork35.model.entity;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private double costs;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", costs=" + costs +
                '}';
    }

    public Book(String name, String author, String publisher, int year, int pages, double costs) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.costs = costs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getCosts() {
        return costs;
    }

    public void setCosts(double costs) {
        this.costs = costs;
    }
}
