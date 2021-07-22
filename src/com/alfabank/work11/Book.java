package com.alfabank.work11;

public class Book {
    private int id;
    private String author;
    private String title;
    private String publish;
    private int year;
    private int page;
    private double cost;


    public Book() {
        id = 0;
        author = "";
        title = "";
        publish = "";
        year = 0;
        page = 0;
        cost = 0;
    }

    public Book(int id, String author, String title, String publish, int year, int page, double cost) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.publish = publish;
        this.year = year;
        this.page = page;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void view() {
        System.out.printf(" " + this.id + " " + this.author+ " " + this.title + " " + this.publish + " " +
                this.year + " " + this.page + " " + this.cost + "\n", "%d%s%n%s%n%s%n%d%d%f");

    }
}
