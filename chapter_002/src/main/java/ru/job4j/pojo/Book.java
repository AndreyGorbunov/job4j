package ru.job4j.pojo;

public class Book {
    private String name;
    private int sumOfPages;

    public Book(String name, int sumOfPages) {
        this.name = name;
        this.sumOfPages = sumOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSumOfPages() {
        return sumOfPages;
    }

    public void setSumOfPages(int sumOfPages) {
        this.sumOfPages = sumOfPages;
    }
}
